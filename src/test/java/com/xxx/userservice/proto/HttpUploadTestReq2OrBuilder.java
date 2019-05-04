// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

public interface HttpUploadTestReq2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:HttpUploadTestReq2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string httpContentType = 1;</code>
   */
  String getHttpContentType();
  /**
   * <code>string httpContentType = 1;</code>
   */
  com.google.protobuf.ByteString
      getHttpContentTypeBytes();

  /**
   * <code>string httpContent = 2;</code>
   */
  String getHttpContent();
  /**
   * <code>string httpContent = 2;</code>
   */
  com.google.protobuf.ByteString
      getHttpContentBytes();

  /**
   * <code>repeated string a = 3;</code>
   */
  java.util.List<String>
      getAList();
  /**
   * <code>repeated string a = 3;</code>
   */
  int getACount();
  /**
   * <code>repeated string a = 3;</code>
   */
  String getA(int index);
  /**
   * <code>repeated string a = 3;</code>
   */
  com.google.protobuf.ByteString
      getABytes(int index);

  /**
   * <code>string b = 4;</code>
   */
  String getB();
  /**
   * <code>string b = 4;</code>
   */
  com.google.protobuf.ByteString
      getBBytes();

  /**
   * <code>.UploadFile files = 5;</code>
   */
  boolean hasFiles();
  /**
   * <code>.UploadFile files = 5;</code>
   */
  UploadFile getFiles();
  /**
   * <code>.UploadFile files = 5;</code>
   */
  UploadFileOrBuilder getFilesOrBuilder();
}
