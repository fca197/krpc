// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

public interface HttpTestResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HttpTestRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 retCode = 1;</code>
   */
  int getRetCode();

  /**
   * <code>string retMsg = 2;</code>
   */
  String getRetMsg();
  /**
   * <code>string retMsg = 2;</code>
   */
  com.google.protobuf.ByteString
      getRetMsgBytes();

  /**
   * <code>string userId = 3;</code>
   */
  String getUserId();
  /**
   * <code>string userId = 3;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>.Session session = 4;</code>
   */
  boolean hasSession();
  /**
   * <code>.Session session = 4;</code>
   */
  Session getSession();
  /**
   * <code>.Session session = 4;</code>
   */
  SessionOrBuilder getSessionOrBuilder();

  /**
   * <code>int32 httpCode = 5;</code>
   */
  int getHttpCode();

  /**
   * <code>string httpContentType = 6;</code>
   */
  String getHttpContentType();
  /**
   * <code>string httpContentType = 6;</code>
   */
  com.google.protobuf.ByteString
      getHttpContentTypeBytes();

  /**
   * <code>string headerLocation = 7;</code>
   */
  String getHeaderLocation();
  /**
   * <code>string headerLocation = 7;</code>
   */
  com.google.protobuf.ByteString
      getHeaderLocationBytes();

  /**
   * <code>string headerXmmDddCcc = 8;</code>
   */
  String getHeaderXmmDddCcc();
  /**
   * <code>string headerXmmDddCcc = 8;</code>
   */
  com.google.protobuf.ByteString
      getHeaderXmmDddCccBytes();

  /**
   * <code>string cookieTnk = 9;</code>
   */
  String getCookieTnk();
  /**
   * <code>string cookieTnk = 9;</code>
   */
  com.google.protobuf.ByteString
      getCookieTnkBytes();

  /**
   * <code>int32 totalPrice = 10;</code>
   */
  int getTotalPrice();
}
