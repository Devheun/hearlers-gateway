// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.service;

public interface ConnectAuthChannelResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.ConnectAuthChannelResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
   * @return Whether the authUser field is set.
   */
  boolean hasAuthUser();
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
   * @return The authUser.
   */
  com.com.hearlers.v1.model.AuthUser getAuthUser();
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
   */
  com.com.hearlers.v1.model.AuthUserOrBuilder getAuthUserOrBuilder();
}