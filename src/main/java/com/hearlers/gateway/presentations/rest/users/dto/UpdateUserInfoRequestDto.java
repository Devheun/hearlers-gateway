package com.hearlers.gateway.presentations.rest.users.dto;

import com.hearlers.gateway.shared.enums.Gender;
import com.hearlers.gateway.shared.enums.Mbti;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Schema(description = "사용자 정보 수정 요청 DTO")
public class UpdateUserInfoRequestDto {
    @NotBlank(message = "닉네임은 필수 입력 항목입니다.")
    @Schema(description = "닉네임", example = "킹왕짱")
    private String nickname;

    @NotNull(message = "MBTI는 필수 입력 항목입니다.")
    @Schema(description = "MBTI", example = "MBTI_ENTP")
    private Mbti mbti;

    @NotNull(message = "성별은 필수 입력 항목입니다.")
    @Schema(description = "성별", example = "GENDER_MALE")
    private Gender gender;
}
