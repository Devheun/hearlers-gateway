// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/common/error.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.common;

public final class ErrorProto {
  private ErrorProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      ErrorProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_common_Error_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_common_Error_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025v1/common/error.proto\022\026com.hearlers.v1" +
      ".common\"M\n\005Error\022\026\n\006status\030\001 \001(\005R\006status" +
      "\022\022\n\004code\030\002 \001(\005R\004code\022\030\n\007details\030\003 \003(\tR\007d" +
      "etailsB\244\001\n\032com.com.hearlers.v1.commonB\nE" +
      "rrorProtoP\001\242\002\004CHVC\252\002\026Com.Hearlers.V1.Com" +
      "mon\312\002\026Com\\Hearlers\\V1\\Common\342\002\"Com\\Hearl" +
      "ers\\V1\\Common\\GPBMetadata\352\002\031Com::Hearler" +
      "s::V1::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hearlers_v1_common_Error_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_common_Error_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_common_Error_descriptor,
        new java.lang.String[] { "Status", "Code", "Details", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}