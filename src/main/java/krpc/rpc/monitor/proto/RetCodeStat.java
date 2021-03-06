// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

/**
 * Protobuf type {@code RetCodeStat}
 */
public  final class RetCodeStat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RetCodeStat)
    RetCodeStatOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RetCodeStat.newBuilder() to construct.
  private RetCodeStat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetCodeStat() {
    retCode_ = 0;
    count_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RetCodeStat(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            retCode_ = input.readInt32();
            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return krpc.rpc.monitor.proto.MonitorProtos.internal_static_RetCodeStat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return krpc.rpc.monitor.proto.MonitorProtos.internal_static_RetCodeStat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            krpc.rpc.monitor.proto.RetCodeStat.class, krpc.rpc.monitor.proto.RetCodeStat.Builder.class);
  }

  public static final int RETCODE_FIELD_NUMBER = 1;
  private int retCode_;
  /**
   * <pre>
   * 每个错误码，不包括0
   * </pre>
   *
   * <code>int32 retCode = 1;</code>
   */
  public int getRetCode() {
    return retCode_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <pre>
   * 该错误码的数量
   * </pre>
   *
   * <code>int32 count = 2;</code>
   */
  public int getCount() {
    return count_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (retCode_ != 0) {
      output.writeInt32(1, retCode_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, retCode_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof krpc.rpc.monitor.proto.RetCodeStat)) {
      return super.equals(obj);
    }
    krpc.rpc.monitor.proto.RetCodeStat other = (krpc.rpc.monitor.proto.RetCodeStat) obj;

    boolean result = true;
    result = result && (getRetCode()
        == other.getRetCode());
    result = result && (getCount()
        == other.getCount());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RETCODE_FIELD_NUMBER;
    hash = (53 * hash) + getRetCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static krpc.rpc.monitor.proto.RetCodeStat parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(krpc.rpc.monitor.proto.RetCodeStat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RetCodeStat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RetCodeStat)
      krpc.rpc.monitor.proto.RetCodeStatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return krpc.rpc.monitor.proto.MonitorProtos.internal_static_RetCodeStat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return krpc.rpc.monitor.proto.MonitorProtos.internal_static_RetCodeStat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              krpc.rpc.monitor.proto.RetCodeStat.class, krpc.rpc.monitor.proto.RetCodeStat.Builder.class);
    }

    // Construct using krpc.rpc.monitor.proto.RetCodeStat.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      retCode_ = 0;

      count_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return krpc.rpc.monitor.proto.MonitorProtos.internal_static_RetCodeStat_descriptor;
    }

    public krpc.rpc.monitor.proto.RetCodeStat getDefaultInstanceForType() {
      return krpc.rpc.monitor.proto.RetCodeStat.getDefaultInstance();
    }

    public krpc.rpc.monitor.proto.RetCodeStat build() {
      krpc.rpc.monitor.proto.RetCodeStat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public krpc.rpc.monitor.proto.RetCodeStat buildPartial() {
      krpc.rpc.monitor.proto.RetCodeStat result = new krpc.rpc.monitor.proto.RetCodeStat(this);
      result.retCode_ = retCode_;
      result.count_ = count_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof krpc.rpc.monitor.proto.RetCodeStat) {
        return mergeFrom((krpc.rpc.monitor.proto.RetCodeStat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(krpc.rpc.monitor.proto.RetCodeStat other) {
      if (other == krpc.rpc.monitor.proto.RetCodeStat.getDefaultInstance()) return this;
      if (other.getRetCode() != 0) {
        setRetCode(other.getRetCode());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      krpc.rpc.monitor.proto.RetCodeStat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (krpc.rpc.monitor.proto.RetCodeStat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int retCode_ ;
    /**
     * <pre>
     * 每个错误码，不包括0
     * </pre>
     *
     * <code>int32 retCode = 1;</code>
     */
    public int getRetCode() {
      return retCode_;
    }
    /**
     * <pre>
     * 每个错误码，不包括0
     * </pre>
     *
     * <code>int32 retCode = 1;</code>
     */
    public Builder setRetCode(int value) {
      
      retCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 每个错误码，不包括0
     * </pre>
     *
     * <code>int32 retCode = 1;</code>
     */
    public Builder clearRetCode() {
      
      retCode_ = 0;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     * 该错误码的数量
     * </pre>
     *
     * <code>int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * 该错误码的数量
     * </pre>
     *
     * <code>int32 count = 2;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 该错误码的数量
     * </pre>
     *
     * <code>int32 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RetCodeStat)
  }

  // @@protoc_insertion_point(class_scope:RetCodeStat)
  private static final krpc.rpc.monitor.proto.RetCodeStat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new krpc.rpc.monitor.proto.RetCodeStat();
  }

  public static krpc.rpc.monitor.proto.RetCodeStat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetCodeStat>
      PARSER = new com.google.protobuf.AbstractParser<RetCodeStat>() {
    @java.lang.Override
    public RetCodeStat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RetCodeStat(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RetCodeStat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetCodeStat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public krpc.rpc.monitor.proto.RetCodeStat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

