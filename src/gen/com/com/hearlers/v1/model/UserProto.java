// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/model/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.model;

public final class UserProto {
  private UserProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      UserProto.class.getName());
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
    internal_static_com_hearlers_v1_model_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_UserProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_UserProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_UserProgress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_UserProgress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_UserActivity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_UserActivity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023v1/model/user.proto\022\025com.hearlers.v1.m" +
      "odel\032\037google/protobuf/timestamp.proto\032\034g" +
      "oogle/protobuf/struct.proto\"\370\002\n\004User\022\016\n\002" +
      "id\030\001 \001(\005R\002id\022\032\n\010nickname\030\002 \001(\tR\010nickname" +
      "\022E\n\014user_profile\030\003 \001(\0132\".com.hearlers.v1" +
      ".model.UserProfileR\013userProfile\022L\n\017user_" +
      "progresses\030\004 \003(\0132#.com.hearlers.v1.model" +
      ".UserProgressR\016userProgresses\0229\n\ncreated" +
      "_at\030\005 \001(\0132\032.google.protobuf.TimestampR\tc" +
      "reatedAt\0229\n\nupdated_at\030\006 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\tupdatedAt\0229\n\ndeleted_a" +
      "t\030\007 \001(\0132\032.google.protobuf.TimestampR\tdel" +
      "etedAt\"\312\003\n\013UserProfile\022#\n\rprofile_image\030" +
      "\001 \001(\tR\014profileImage\022!\n\014phone_number\030\002 \001(" +
      "\tR\013phoneNumber\0225\n\006gender\030\003 \001(\0162\035.com.hea" +
      "rlers.v1.model.GenderR\006gender\0226\n\010birthda" +
      "y\030\004 \001(\0132\032.google.protobuf.TimestampR\010bir" +
      "thday\022\"\n\014introduction\030\005 \001(\tR\014introductio" +
      "n\022/\n\004mbti\030\006 \001(\0162\033.com.hearlers.v1.model." +
      "MbtiR\004mbti\0229\n\ncreated_at\030\007 \001(\0132\032.google." +
      "protobuf.TimestampR\tcreatedAt\0229\n\nupdated" +
      "_at\030\010 \001(\0132\032.google.protobuf.TimestampR\tu" +
      "pdatedAt\0229\n\ndeleted_at\030\t \001(\0132\032.google.pr" +
      "otobuf.TimestampR\tdeletedAt\"\207\003\n\014UserProg" +
      "ress\022H\n\rprogress_type\030\001 \001(\0162#.com.hearle" +
      "rs.v1.model.ProgressTypeR\014progressType\022=" +
      "\n\006status\030\002 \001(\0162%.com.hearlers.v1.model.P" +
      "rogressStatusR\006status\022=\n\014last_updated\030\003 " +
      "\001(\0132\032.google.protobuf.TimestampR\013lastUpd" +
      "ated\0229\n\ncreated_at\030\004 \001(\0132\032.google.protob" +
      "uf.TimestampR\tcreatedAt\0229\n\nupdated_at\030\005 " +
      "\001(\0132\032.google.protobuf.TimestampR\tupdated" +
      "At\0229\n\ndeleted_at\030\006 \001(\0132\032.google.protobuf" +
      ".TimestampR\tdeletedAt\"\363\003\n\014UserActivity\022H" +
      "\n\ractivity_type\030\001 \001(\0162#.com.hearlers.v1." +
      "model.ActivityTypeR\014activityType\022<\n\racti" +
      "vity_data\030\002 \001(\0132\027.google.protobuf.Struct" +
      "R\014activityData\022A\n\010platform\030\003 \001(\0162%.com.h" +
      "earlers.v1.model.DevicePlatformR\010platfor" +
      "m\022\035\n\nip_address\030\004 \001(\tR\tipAddress\022\035\n\nuser" +
      "_agent\030\005 \001(\tR\tuserAgent\022)\n\020duration_seco" +
      "nds\030\006 \001(\005R\017durationSeconds\0229\n\ncreated_at" +
      "\030\007 \001(\0132\032.google.protobuf.TimestampR\tcrea" +
      "tedAt\0229\n\nupdated_at\030\010 \001(\0132\032.google.proto" +
      "buf.TimestampR\tupdatedAt\0229\n\ndeleted_at\030\t" +
      " \001(\0132\032.google.protobuf.TimestampR\tdelete" +
      "dAt*D\n\006Gender\022\026\n\022GENDER_UNSPECIFIED\020\000\022\017\n" +
      "\013GENDER_MALE\020\001\022\021\n\rGENDER_FEMALE\020\002*\257\001\n\016Pr" +
      "ogressStatus\022\037\n\033PROGRESS_STATUS_UNSPECIF" +
      "IED\020\000\022\037\n\033PROGRESS_STATUS_NOT_STARTED\020\001\022\037" +
      "\n\033PROGRESS_STATUS_IN_PROGRESS\020\002\022\035\n\031PROGR" +
      "ESS_STATUS_COMPLETED\020\003\022\033\n\027PROGRESS_STATU" +
      "S_BLOCKED\020\004*k\n\014ProgressType\022\035\n\031PROGRESS_" +
      "TYPE_UNSPECIFIED\020\000\022\034\n\030PROGRESS_TYPE_ONBO" +
      "ARDING\020\001\022\036\n\032PROGRESS_TYPE_VERIFICATION\020\002" +
      "*\214\002\n\004Mbti\022\024\n\020MBTI_UNSPECIFIED\020\000\022\r\n\tMBTI_" +
      "ENTP\020\001\022\r\n\tMBTI_ENFP\020\002\022\r\n\tMBTI_ENTJ\020\003\022\r\n\t" +
      "MBTI_ENFJ\020\004\022\r\n\tMBTI_ESTP\020\005\022\r\n\tMBTI_ESTJ\020" +
      "\006\022\r\n\tMBTI_ESFP\020\007\022\r\n\tMBTI_ESFJ\020\010\022\r\n\tMBTI_" +
      "INTJ\020\t\022\r\n\tMBTI_INFJ\020\n\022\r\n\tMBTI_INTP\020\013\022\r\n\t" +
      "MBTI_INFP\020\014\022\r\n\tMBTI_ISTP\020\r\022\r\n\tMBTI_ISTJ\020" +
      "\016\022\r\n\tMBTI_ISFP\020\017\022\r\n\tMBTI_ISFJ\020\020*\235\001\n\016Devi" +
      "cePlatform\022\037\n\033DEVICE_PLATFORM_UNSPECIFIE" +
      "D\020\000\022\027\n\023DEVICE_PLATFORM_WEB\020\001\022\027\n\023DEVICE_P" +
      "LATFORM_IOS\020\002\022\033\n\027DEVICE_PLATFORM_ANDROID" +
      "\020\003\022\033\n\027DEVICE_PLATFORM_DESKTOP\020\004*\351\004\n\014Acti" +
      "vityType\022\035\n\031ACTIVITY_TYPE_UNSPECIFIED\020\000\022" +
      "\027\n\023ACTIVITY_TYPE_LOGIN\020\001\022\030\n\024ACTIVITY_TYP" +
      "E_LOGOUT\020\002\022)\n%ACTIVITY_TYPE_UNLOGINNED_U" +
      "SER_COME_IN\020\003\0224\n0ACTIVITY_TYPE_UNLOGINNE" +
      "D_USER_STARTED_COUNSELING\020\004\0225\n1ACTIVITY_" +
      "TYPE_UNLOGINNED_USER_FINISHED_COUNSELING" +
      "\020\005\022\"\n\036ACTIVITY_TYPE_ONBOARDING_START\020\006\022 " +
      "\n\034ACTIVITY_TYPE_ONBOARDING_END\020\007\022-\n)ACTI" +
      "VITY_TYPE_SET_CONVERSATION_PREFERENCE\020\010\022" +
      "\"\n\036ACTIVITY_TYPE_COUNSELING_START\020\t\022 \n\034A" +
      "CTIVITY_TYPE_COUNSELING_END\020\n\022 \n\034ACTIVIT" +
      "Y_TYPE_PROFILE_UPDATE\020\013\022!\n\035ACTIVITY_TYPE" +
      "_FEEDBACK_SUBMIT\020\014\022$\n ACTIVITY_TYPE_SUBS" +
      "CRIPTION_START\020\r\022%\n!ACTIVITY_TYPE_SUBSCR" +
      "IPTION_CANCEL\020\016\022\"\n\036ACTIVITY_TYPE_PAYMENT" +
      "_COMPLETE\020\017B\236\001\n\031com.com.hearlers.v1.mode" +
      "lB\tUserProtoP\001\242\002\004CHVM\252\002\025Com.Hearlers.V1." +
      "Model\312\002\025Com\\Hearlers\\V1\\Model\342\002!Com\\Hear" +
      "lers\\V1\\Model\\GPBMetadata\352\002\030Com::Hearler" +
      "s::V1::Modelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_com_hearlers_v1_model_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_model_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_User_descriptor,
        new java.lang.String[] { "Id", "Nickname", "UserProfile", "UserProgresses", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserProfile_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_model_UserProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserProfile_descriptor,
        new java.lang.String[] { "ProfileImage", "PhoneNumber", "Gender", "Birthday", "Introduction", "Mbti", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserProgress_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_model_UserProgress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserProgress_descriptor,
        new java.lang.String[] { "ProgressType", "Status", "LastUpdated", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserActivity_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_model_UserActivity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserActivity_descriptor,
        new java.lang.String[] { "ActivityType", "ActivityData", "Platform", "IpAddress", "UserAgent", "DurationSeconds", "CreatedAt", "UpdatedAt", "DeletedAt", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}