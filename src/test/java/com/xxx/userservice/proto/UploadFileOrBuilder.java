// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

public interface UploadFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UploadFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string file = 1;</code>
   */
  String getFile();
  /**
   * <code>string file = 1;</code>
   */
  com.google.protobuf.ByteString
      getFileBytes();

  /**
   * <code>string filename = 2;</code>
   */
  String getFilename();
  /**
   * <code>string filename = 2;</code>
   */
  com.google.protobuf.ByteString
      getFilenameBytes();

  /**
   * <code>int64 size = 3;</code>
   */
  long getSize();

  /**
   * <code>string ext = 4;</code>
   */
  String getExt();
  /**
   * <code>string ext = 4;</code>
   */
  com.google.protobuf.ByteString
      getExtBytes();

  /**
   * <code>string contentType = 5;</code>
   */
  String getContentType();
  /**
   * <code>string contentType = 5;</code>
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();
}
