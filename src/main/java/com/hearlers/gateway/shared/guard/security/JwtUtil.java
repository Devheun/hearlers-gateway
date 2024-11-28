package com.hearlers.gateway.shared.guard.security;

import com.hearlers.gateway.presentations.rest.auth.dto.CreateTokenRequestDto;
import com.hearlers.gateway.shared.guard.dto.TokenDto;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.time.ZonedDateTime;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private final Key key;
    private final long accessTokenExpTime;
    private final long refreshTokenExpTime;

    public JwtUtil(
            @Value("${jwt.secret}") String secretKey,
            @Value("${jwt.access_expiration_time}") long accessTokenExpTime,
            @Value("${jwt.refresh_expiration_time}") long refreshTokenExpTime
    ) {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.accessTokenExpTime = accessTokenExpTime;
        this.refreshTokenExpTime = refreshTokenExpTime;
    }

    /*
    TODO: 추후에 refreshToken 생성 및 반환
    * */

    // accessToken 생성 및 반환
    public TokenDto returnToken(CreateTokenRequestDto dto) {
        return createAccessToken(dto, accessTokenExpTime);
    }

    // accessToken 생성
    private TokenDto createAccessToken(CreateTokenRequestDto dto, long accessTokenExpTime) {
        Claims claims = Jwts.claims();
        claims.put("id", dto.getId());
        claims.put("auth_channel", dto.getAuthChannel());

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime accessTokenValidity = now.plusSeconds(accessTokenExpTime);

        // access token
        String accessToken = Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(accessTokenValidity.toInstant()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        return TokenDto.builder()
                .accessToken(accessToken)
                .refreshToken(null)
                .build();
    }
}