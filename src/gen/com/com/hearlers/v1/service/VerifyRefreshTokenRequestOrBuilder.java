// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.service;

public interface VerifyRefreshTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.VerifyRefreshTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
