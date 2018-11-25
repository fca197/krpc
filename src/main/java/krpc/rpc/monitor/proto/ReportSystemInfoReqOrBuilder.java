// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

public interface ReportSystemInfoReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReportSystemInfoReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 timestamp = 1;</code>
   */
  long getTimestamp();

  /**
   * <code>string host = 2;</code>
   */
  String getHost();
  /**
   * <code>string host = 2;</code>
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>string app = 3;</code>
   */
  String getApp();
  /**
   * <code>string app = 3;</code>
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  java.util.List<SystemInfoKV>
      getKvsList();
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  SystemInfoKV getKvs(int index);
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  int getKvsCount();
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  java.util.List<? extends SystemInfoKVOrBuilder>
      getKvsOrBuilderList();
  /**
   * <code>repeated .SystemInfoKV kvs = 4;</code>
   */
  SystemInfoKVOrBuilder getKvsOrBuilder(
          int index);

  /**
   * <code>int32 appServiceId = 5;</code>
   */
  int getAppServiceId();
}