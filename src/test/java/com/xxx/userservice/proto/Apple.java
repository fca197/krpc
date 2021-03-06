// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

/**
 * Protobuf type {@code Apple}
 */
public  final class Apple extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Apple)
    AppleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Apple.newBuilder() to construct.
  private Apple(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Apple() {
    color_ = "";
    weight_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Apple(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            color_ = s;
            break;
          }
          case 17: {

            weight_ = input.readDouble();
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
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_Apple_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_Apple_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xxx.userservice.proto.Apple.class, com.xxx.userservice.proto.Apple.Builder.class);
  }

  public static final int COLOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object color_;
  /**
   * <code>string color = 1;</code>
   */
  public java.lang.String getColor() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      color_ = s;
      return s;
    }
  }
  /**
   * <code>string color = 1;</code>
   */
  public com.google.protobuf.ByteString
      getColorBytes() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      color_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  private double weight_;
  /**
   * <code>double weight = 2;</code>
   */
  public double getWeight() {
    return weight_;
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
    if (!getColorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, color_);
    }
    if (weight_ != 0D) {
      output.writeDouble(2, weight_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getColorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, color_);
    }
    if (weight_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, weight_);
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
    if (!(obj instanceof com.xxx.userservice.proto.Apple)) {
      return super.equals(obj);
    }
    com.xxx.userservice.proto.Apple other = (com.xxx.userservice.proto.Apple) obj;

    boolean result = true;
    result = result && getColor()
        .equals(other.getColor());
    result = result && (
        java.lang.Double.doubleToLongBits(getWeight())
        == java.lang.Double.doubleToLongBits(
            other.getWeight()));
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
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getColor().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xxx.userservice.proto.Apple parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Apple parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.Apple parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.Apple parseFrom(
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
  public static Builder newBuilder(com.xxx.userservice.proto.Apple prototype) {
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
   * Protobuf type {@code Apple}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Apple)
      com.xxx.userservice.proto.AppleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_Apple_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_Apple_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xxx.userservice.proto.Apple.class, com.xxx.userservice.proto.Apple.Builder.class);
    }

    // Construct using com.xxx.userservice.proto.Apple.newBuilder()
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
      color_ = "";

      weight_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_Apple_descriptor;
    }

    public com.xxx.userservice.proto.Apple getDefaultInstanceForType() {
      return com.xxx.userservice.proto.Apple.getDefaultInstance();
    }

    public com.xxx.userservice.proto.Apple build() {
      com.xxx.userservice.proto.Apple result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xxx.userservice.proto.Apple buildPartial() {
      com.xxx.userservice.proto.Apple result = new com.xxx.userservice.proto.Apple(this);
      result.color_ = color_;
      result.weight_ = weight_;
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
      if (other instanceof com.xxx.userservice.proto.Apple) {
        return mergeFrom((com.xxx.userservice.proto.Apple)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xxx.userservice.proto.Apple other) {
      if (other == com.xxx.userservice.proto.Apple.getDefaultInstance()) return this;
      if (!other.getColor().isEmpty()) {
        color_ = other.color_;
        onChanged();
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
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
      com.xxx.userservice.proto.Apple parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xxx.userservice.proto.Apple) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object color_ = "";
    /**
     * <code>string color = 1;</code>
     */
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        color_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string color = 1;</code>
     */
    public com.google.protobuf.ByteString
        getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        color_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string color = 1;</code>
     */
    public Builder setColor(
        java.lang.String value) {
      if (value == null) value = "";
  
      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string color = 1;</code>
     */
    public Builder clearColor() {
      
      color_ = getDefaultInstance().getColor();
      onChanged();
      return this;
    }
    /**
     * <code>string color = 1;</code>
     */
    public Builder setColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      color_ = value;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 2;</code>
     */
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 2;</code>
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 2;</code>
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:Apple)
  }

  // @@protoc_insertion_point(class_scope:Apple)
  private static final com.xxx.userservice.proto.Apple DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xxx.userservice.proto.Apple();
  }

  public static com.xxx.userservice.proto.Apple getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Apple>
      PARSER = new com.google.protobuf.AbstractParser<Apple>() {
    @java.lang.Override
    public Apple parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Apple(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Apple> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Apple> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xxx.userservice.proto.Apple getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

