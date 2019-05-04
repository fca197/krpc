// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

/**
 * Protobuf type {@code HttpDownloadStaticRes}
 */
public  final class HttpDownloadStaticRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HttpDownloadStaticRes)
    HttpDownloadStaticResOrBuilder {
private static final long serialVersionUID = 0L;
public static final HttpDownloadStaticRes ok() { return HttpDownloadStaticRes.newBuilder().build(); } ;
public static final HttpDownloadStaticRes failed(int retCode) { return HttpDownloadStaticRes.newBuilder().setRetCode(retCode).build(); } ;
public static final HttpDownloadStaticRes failed(int retCode,String retMsg) { return HttpDownloadStaticRes.newBuilder().setRetCode(retCode).setRetMsg(retMsg).build(); } ;
  // Use HttpDownloadStaticRes.newBuilder() to construct.
  private HttpDownloadStaticRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpDownloadStaticRes() {
    retCode_ = 0;
    retMsg_ = "";
    downloadFile_ = "";
    autoDelete_ = "";
    attachment_ = 0;
    expire_ = 0;
    downloadStream_ = com.google.protobuf.ByteString.EMPTY;
    filename_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HttpDownloadStaticRes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 18: {
            String s = input.readStringRequireUtf8();

            retMsg_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            downloadFile_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            autoDelete_ = s;
            break;
          }
          case 40: {

            attachment_ = input.readInt32();
            break;
          }
          case 48: {

            expire_ = input.readInt32();
            break;
          }
          case 58: {

            downloadStream_ = input.readBytes();
            break;
          }
          case 66: {
            String s = input.readStringRequireUtf8();

            filename_ = s;
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
    return UserServiceMetas.internal_static_HttpDownloadStaticRes_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return UserServiceMetas.internal_static_HttpDownloadStaticRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            HttpDownloadStaticRes.class, Builder.class);
  }

  public static final int RETCODE_FIELD_NUMBER = 1;
  private int retCode_;
  /**
   * <code>int32 retCode = 1;</code>
   */
  public int getRetCode() {
    return retCode_;
  }

  public static final int RETMSG_FIELD_NUMBER = 2;
  private volatile Object retMsg_;
  /**
   * <code>string retMsg = 2;</code>
   */
  public String getRetMsg() {
    Object ref = retMsg_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      retMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string retMsg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRetMsgBytes() {
    Object ref = retMsg_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      retMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOWNLOADFILE_FIELD_NUMBER = 3;
  private volatile Object downloadFile_;
  /**
   * <code>string downloadFile = 3;</code>
   */
  public String getDownloadFile() {
    Object ref = downloadFile_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      downloadFile_ = s;
      return s;
    }
  }
  /**
   * <code>string downloadFile = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDownloadFileBytes() {
    Object ref = downloadFile_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      downloadFile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTODELETE_FIELD_NUMBER = 4;
  private volatile Object autoDelete_;
  /**
   * <code>string autoDelete = 4;</code>
   */
  public String getAutoDelete() {
    Object ref = autoDelete_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      autoDelete_ = s;
      return s;
    }
  }
  /**
   * <code>string autoDelete = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAutoDeleteBytes() {
    Object ref = autoDelete_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      autoDelete_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTACHMENT_FIELD_NUMBER = 5;
  private int attachment_;
  /**
   * <code>int32 attachment = 5;</code>
   */
  public int getAttachment() {
    return attachment_;
  }

  public static final int EXPIRE_FIELD_NUMBER = 6;
  private int expire_;
  /**
   * <code>int32 expire = 6;</code>
   */
  public int getExpire() {
    return expire_;
  }

  public static final int DOWNLOADSTREAM_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString downloadStream_;
  /**
   * <code>bytes downloadStream = 7;</code>
   */
  public com.google.protobuf.ByteString getDownloadStream() {
    return downloadStream_;
  }

  public static final int FILENAME_FIELD_NUMBER = 8;
  private volatile Object filename_;
  /**
   * <code>string filename = 8;</code>
   */
  public String getFilename() {
    Object ref = filename_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      filename_ = s;
      return s;
    }
  }
  /**
   * <code>string filename = 8;</code>
   */
  public com.google.protobuf.ByteString
      getFilenameBytes() {
    Object ref = filename_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      filename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (retCode_ != 0) {
      output.writeInt32(1, retCode_);
    }
    if (!getRetMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, retMsg_);
    }
    if (!getDownloadFileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, downloadFile_);
    }
    if (!getAutoDeleteBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, autoDelete_);
    }
    if (attachment_ != 0) {
      output.writeInt32(5, attachment_);
    }
    if (expire_ != 0) {
      output.writeInt32(6, expire_);
    }
    if (!downloadStream_.isEmpty()) {
      output.writeBytes(7, downloadStream_);
    }
    if (!getFilenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, filename_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, retCode_);
    }
    if (!getRetMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, retMsg_);
    }
    if (!getDownloadFileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, downloadFile_);
    }
    if (!getAutoDeleteBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, autoDelete_);
    }
    if (attachment_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, attachment_);
    }
    if (expire_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, expire_);
    }
    if (!downloadStream_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, downloadStream_);
    }
    if (!getFilenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, filename_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof HttpDownloadStaticRes)) {
      return super.equals(obj);
    }
    HttpDownloadStaticRes other = (HttpDownloadStaticRes) obj;

    boolean result = true;
    result = result && (getRetCode()
        == other.getRetCode());
    result = result && getRetMsg()
        .equals(other.getRetMsg());
    result = result && getDownloadFile()
        .equals(other.getDownloadFile());
    result = result && getAutoDelete()
        .equals(other.getAutoDelete());
    result = result && (getAttachment()
        == other.getAttachment());
    result = result && (getExpire()
        == other.getExpire());
    result = result && getDownloadStream()
        .equals(other.getDownloadStream());
    result = result && getFilename()
        .equals(other.getFilename());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RETCODE_FIELD_NUMBER;
    hash = (53 * hash) + getRetCode();
    hash = (37 * hash) + RETMSG_FIELD_NUMBER;
    hash = (53 * hash) + getRetMsg().hashCode();
    hash = (37 * hash) + DOWNLOADFILE_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadFile().hashCode();
    hash = (37 * hash) + AUTODELETE_FIELD_NUMBER;
    hash = (53 * hash) + getAutoDelete().hashCode();
    hash = (37 * hash) + ATTACHMENT_FIELD_NUMBER;
    hash = (53 * hash) + getAttachment();
    hash = (37 * hash) + EXPIRE_FIELD_NUMBER;
    hash = (53 * hash) + getExpire();
    hash = (37 * hash) + DOWNLOADSTREAM_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadStream().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFilename().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static HttpDownloadStaticRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HttpDownloadStaticRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HttpDownloadStaticRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HttpDownloadStaticRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HttpDownloadStaticRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HttpDownloadStaticRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HttpDownloadStaticRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HttpDownloadStaticRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static HttpDownloadStaticRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static HttpDownloadStaticRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static HttpDownloadStaticRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HttpDownloadStaticRes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(HttpDownloadStaticRes prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code HttpDownloadStaticRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HttpDownloadStaticRes)
      HttpDownloadStaticResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserServiceMetas.internal_static_HttpDownloadStaticRes_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserServiceMetas.internal_static_HttpDownloadStaticRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HttpDownloadStaticRes.class, Builder.class);
    }

    // Construct using com.xxx.userservice.proto.HttpDownloadStaticRes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      retCode_ = 0;

      retMsg_ = "";

      downloadFile_ = "";

      autoDelete_ = "";

      attachment_ = 0;

      expire_ = 0;

      downloadStream_ = com.google.protobuf.ByteString.EMPTY;

      filename_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return UserServiceMetas.internal_static_HttpDownloadStaticRes_descriptor;
    }

    @Override
    public HttpDownloadStaticRes getDefaultInstanceForType() {
      return HttpDownloadStaticRes.getDefaultInstance();
    }

    @Override
    public HttpDownloadStaticRes build() {
      HttpDownloadStaticRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public HttpDownloadStaticRes buildPartial() {
      HttpDownloadStaticRes result = new HttpDownloadStaticRes(this);
      result.retCode_ = retCode_;
      result.retMsg_ = retMsg_;
      result.downloadFile_ = downloadFile_;
      result.autoDelete_ = autoDelete_;
      result.attachment_ = attachment_;
      result.expire_ = expire_;
      result.downloadStream_ = downloadStream_;
      result.filename_ = filename_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof HttpDownloadStaticRes) {
        return mergeFrom((HttpDownloadStaticRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(HttpDownloadStaticRes other) {
      if (other == HttpDownloadStaticRes.getDefaultInstance()) return this;
      if (other.getRetCode() != 0) {
        setRetCode(other.getRetCode());
      }
      if (!other.getRetMsg().isEmpty()) {
        retMsg_ = other.retMsg_;
        onChanged();
      }
      if (!other.getDownloadFile().isEmpty()) {
        downloadFile_ = other.downloadFile_;
        onChanged();
      }
      if (!other.getAutoDelete().isEmpty()) {
        autoDelete_ = other.autoDelete_;
        onChanged();
      }
      if (other.getAttachment() != 0) {
        setAttachment(other.getAttachment());
      }
      if (other.getExpire() != 0) {
        setExpire(other.getExpire());
      }
      if (other.getDownloadStream() != com.google.protobuf.ByteString.EMPTY) {
        setDownloadStream(other.getDownloadStream());
      }
      if (!other.getFilename().isEmpty()) {
        filename_ = other.filename_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      HttpDownloadStaticRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (HttpDownloadStaticRes) e.getUnfinishedMessage();
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
     * <code>int32 retCode = 1;</code>
     */
    public int getRetCode() {
      return retCode_;
    }
    /**
     * <code>int32 retCode = 1;</code>
     */
    public Builder setRetCode(int value) {
      
      retCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retCode = 1;</code>
     */
    public Builder clearRetCode() {
      
      retCode_ = 0;
      onChanged();
      return this;
    }

    private Object retMsg_ = "";
    /**
     * <code>string retMsg = 2;</code>
     */
    public String getRetMsg() {
      Object ref = retMsg_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        retMsg_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRetMsgBytes() {
      Object ref = retMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        retMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder setRetMsg(
        String value) {
      if (value == null) value = "";
  
      retMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder clearRetMsg() {
      
      retMsg_ = getDefaultInstance().getRetMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder setRetMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      retMsg_ = value;
      onChanged();
      return this;
    }

    private Object downloadFile_ = "";
    /**
     * <code>string downloadFile = 3;</code>
     */
    public String getDownloadFile() {
      Object ref = downloadFile_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        downloadFile_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string downloadFile = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDownloadFileBytes() {
      Object ref = downloadFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        downloadFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string downloadFile = 3;</code>
     */
    public Builder setDownloadFile(
        String value) {
      if (value == null) value = "";
  
      downloadFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string downloadFile = 3;</code>
     */
    public Builder clearDownloadFile() {
      
      downloadFile_ = getDefaultInstance().getDownloadFile();
      onChanged();
      return this;
    }
    /**
     * <code>string downloadFile = 3;</code>
     */
    public Builder setDownloadFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      downloadFile_ = value;
      onChanged();
      return this;
    }

    private Object autoDelete_ = "";
    /**
     * <code>string autoDelete = 4;</code>
     */
    public String getAutoDelete() {
      Object ref = autoDelete_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        autoDelete_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string autoDelete = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAutoDeleteBytes() {
      Object ref = autoDelete_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        autoDelete_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string autoDelete = 4;</code>
     */
    public Builder setAutoDelete(
        String value) {
      if (value == null) value = "";
  
      autoDelete_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string autoDelete = 4;</code>
     */
    public Builder clearAutoDelete() {
      
      autoDelete_ = getDefaultInstance().getAutoDelete();
      onChanged();
      return this;
    }
    /**
     * <code>string autoDelete = 4;</code>
     */
    public Builder setAutoDeleteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      autoDelete_ = value;
      onChanged();
      return this;
    }

    private int attachment_ ;
    /**
     * <code>int32 attachment = 5;</code>
     */
    public int getAttachment() {
      return attachment_;
    }
    /**
     * <code>int32 attachment = 5;</code>
     */
    public Builder setAttachment(int value) {
      
      attachment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 attachment = 5;</code>
     */
    public Builder clearAttachment() {
      
      attachment_ = 0;
      onChanged();
      return this;
    }

    private int expire_ ;
    /**
     * <code>int32 expire = 6;</code>
     */
    public int getExpire() {
      return expire_;
    }
    /**
     * <code>int32 expire = 6;</code>
     */
    public Builder setExpire(int value) {
      
      expire_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 expire = 6;</code>
     */
    public Builder clearExpire() {
      
      expire_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString downloadStream_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes downloadStream = 7;</code>
     */
    public com.google.protobuf.ByteString getDownloadStream() {
      return downloadStream_;
    }
    /**
     * <code>bytes downloadStream = 7;</code>
     */
    public Builder setDownloadStream(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      downloadStream_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes downloadStream = 7;</code>
     */
    public Builder clearDownloadStream() {
      
      downloadStream_ = getDefaultInstance().getDownloadStream();
      onChanged();
      return this;
    }

    private Object filename_ = "";
    /**
     * <code>string filename = 8;</code>
     */
    public String getFilename() {
      Object ref = filename_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        filename_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string filename = 8;</code>
     */
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      Object ref = filename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filename = 8;</code>
     */
    public Builder setFilename(
        String value) {
      if (value == null) value = "";
  
      filename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 8;</code>
     */
    public Builder clearFilename() {
      
      filename_ = getDefaultInstance().getFilename();
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 8;</code>
     */
    public Builder setFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filename_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HttpDownloadStaticRes)
  }

  // @@protoc_insertion_point(class_scope:HttpDownloadStaticRes)
  private static final HttpDownloadStaticRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HttpDownloadStaticRes();
  }

  public static HttpDownloadStaticRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpDownloadStaticRes>
      PARSER = new com.google.protobuf.AbstractParser<HttpDownloadStaticRes>() {
    @Override
    public HttpDownloadStaticRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HttpDownloadStaticRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HttpDownloadStaticRes> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<HttpDownloadStaticRes> getParserForType() {
    return PARSER;
  }

  @Override
  public HttpDownloadStaticRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

