/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a
 * portion of the value.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.TimePartConfig}
 */
public final class TimePartConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.TimePartConfig)
    TimePartConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TimePartConfig.newBuilder() to construct.
  private TimePartConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TimePartConfig() {
    partToExtract_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TimePartConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TimePartConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8:
            {
              int rawValue = input.readEnum();

              partToExtract_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_TimePartConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_TimePartConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.TimePartConfig.class,
            com.google.privacy.dlp.v2.TimePartConfig.Builder.class);
  }

  /** Protobuf enum {@code google.privacy.dlp.v2.TimePartConfig.TimePart} */
  public enum TimePart implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>TIME_PART_UNSPECIFIED = 0;</code> */
    TIME_PART_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * [0-9999]
     * </pre>
     *
     * <code>YEAR = 1;</code>
     */
    YEAR(1),
    /**
     *
     *
     * <pre>
     * [1-12]
     * </pre>
     *
     * <code>MONTH = 2;</code>
     */
    MONTH(2),
    /**
     *
     *
     * <pre>
     * [1-31]
     * </pre>
     *
     * <code>DAY_OF_MONTH = 3;</code>
     */
    DAY_OF_MONTH(3),
    /**
     *
     *
     * <pre>
     * [1-7]
     * </pre>
     *
     * <code>DAY_OF_WEEK = 4;</code>
     */
    DAY_OF_WEEK(4),
    /**
     *
     *
     * <pre>
     * [1-53]
     * </pre>
     *
     * <code>WEEK_OF_YEAR = 5;</code>
     */
    WEEK_OF_YEAR(5),
    /**
     *
     *
     * <pre>
     * [0-23]
     * </pre>
     *
     * <code>HOUR_OF_DAY = 6;</code>
     */
    HOUR_OF_DAY(6),
    UNRECOGNIZED(-1),
    ;

    /** <code>TIME_PART_UNSPECIFIED = 0;</code> */
    public static final int TIME_PART_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * [0-9999]
     * </pre>
     *
     * <code>YEAR = 1;</code>
     */
    public static final int YEAR_VALUE = 1;
    /**
     *
     *
     * <pre>
     * [1-12]
     * </pre>
     *
     * <code>MONTH = 2;</code>
     */
    public static final int MONTH_VALUE = 2;
    /**
     *
     *
     * <pre>
     * [1-31]
     * </pre>
     *
     * <code>DAY_OF_MONTH = 3;</code>
     */
    public static final int DAY_OF_MONTH_VALUE = 3;
    /**
     *
     *
     * <pre>
     * [1-7]
     * </pre>
     *
     * <code>DAY_OF_WEEK = 4;</code>
     */
    public static final int DAY_OF_WEEK_VALUE = 4;
    /**
     *
     *
     * <pre>
     * [1-53]
     * </pre>
     *
     * <code>WEEK_OF_YEAR = 5;</code>
     */
    public static final int WEEK_OF_YEAR_VALUE = 5;
    /**
     *
     *
     * <pre>
     * [0-23]
     * </pre>
     *
     * <code>HOUR_OF_DAY = 6;</code>
     */
    public static final int HOUR_OF_DAY_VALUE = 6;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TimePart valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TimePart forNumber(int value) {
      switch (value) {
        case 0:
          return TIME_PART_UNSPECIFIED;
        case 1:
          return YEAR;
        case 2:
          return MONTH;
        case 3:
          return DAY_OF_MONTH;
        case 4:
          return DAY_OF_WEEK;
        case 5:
          return WEEK_OF_YEAR;
        case 6:
          return HOUR_OF_DAY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TimePart> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TimePart> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TimePart>() {
          public TimePart findValueByNumber(int number) {
            return TimePart.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.privacy.dlp.v2.TimePartConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final TimePart[] VALUES = values();

    public static TimePart valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TimePart(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.TimePartConfig.TimePart)
  }

  public static final int PART_TO_EXTRACT_FIELD_NUMBER = 1;
  private int partToExtract_;
  /**
   * <code>.google.privacy.dlp.v2.TimePartConfig.TimePart part_to_extract = 1;</code>
   *
   * @return The enum numeric value on the wire for partToExtract.
   */
  public int getPartToExtractValue() {
    return partToExtract_;
  }
  /**
   * <code>.google.privacy.dlp.v2.TimePartConfig.TimePart part_to_extract = 1;</code>
   *
   * @return The partToExtract.
   */
  public com.google.privacy.dlp.v2.TimePartConfig.TimePart getPartToExtract() {
    @SuppressWarnings("deprecation")
    com.google.privacy.dlp.v2.TimePartConfig.TimePart result =
        com.google.privacy.dlp.v2.TimePartConfig.TimePart.valueOf(partToExtract_);
    return result == null ? com.google.privacy.dlp.v2.TimePartConfig.TimePart.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (partToExtract_
        != com.google.privacy.dlp.v2.TimePartConfig.TimePart.TIME_PART_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, partToExtract_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partToExtract_
        != com.google.privacy.dlp.v2.TimePartConfig.TimePart.TIME_PART_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, partToExtract_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.TimePartConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.TimePartConfig other = (com.google.privacy.dlp.v2.TimePartConfig) obj;

    if (partToExtract_ != other.partToExtract_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PART_TO_EXTRACT_FIELD_NUMBER;
    hash = (53 * hash) + partToExtract_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TimePartConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.privacy.dlp.v2.TimePartConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a
   * portion of the value.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.TimePartConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.TimePartConfig)
      com.google.privacy.dlp.v2.TimePartConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_TimePartConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_TimePartConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.TimePartConfig.class,
              com.google.privacy.dlp.v2.TimePartConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.TimePartConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      partToExtract_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_TimePartConfig_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TimePartConfig getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.TimePartConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TimePartConfig build() {
      com.google.privacy.dlp.v2.TimePartConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TimePartConfig buildPartial() {
      com.google.privacy.dlp.v2.TimePartConfig result =
          new com.google.privacy.dlp.v2.TimePartConfig(this);
      result.partToExtract_ = partToExtract_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.TimePartConfig) {
        return mergeFrom((com.google.privacy.dlp.v2.TimePartConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.TimePartConfig other) {
      if (other == com.google.privacy.dlp.v2.TimePartConfig.getDefaultInstance()) return this;
      if (other.partToExtract_ != 0) {
        setPartToExtractValue(other.getPartToExtractValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2.TimePartConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.TimePartConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int partToExtract_ = 0;
    /**
     * <code>.google.privacy.dlp.v2.TimePartConfig.TimePart part_to_extract = 1;</code>
     *
     * @return The enum numeric value on the wire for partToExtract.
     */
    public int getPartToExtractValue() {
      return partToExtract_;
    }
    /**
     * <code>.google.privacy.dlp.v2.TimePartConfig.TimePart part_to_extract = 1;</code>
     *
     * @param value The enum numeric value on the wire for partToExtract to set.
     * @return This builder for chaining.
     */
    public Builder setPartToExtractValue(int value) {
      partToExtract_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2.TimePartConfig.TimePart part_to_extract = 1;</code>
     *
     * @return The partToExtract.
     */
    public com.google.privacy.dlp.v2.TimePartConfig.TimePart getPartToExtract() {
      @SuppressWarnings("deprecation")
      com.google.privacy.dlp.v2.TimePartConfig.TimePart result =
          com.google.privacy.dlp.v2.TimePartConfig.TimePart.valueOf(partToExtract_);
      return result == null
          ? com.google.privacy.dlp.v2.TimePartConfig.TimePart.UNRECOGNIZED
          : result;
    }
    /**
     * <code>.google.privacy.dlp.v2.TimePartConfig.TimePart part_to_extract = 1;</code>
     *
     * @param value The partToExtract to set.
     * @return This builder for chaining.
     */
    public Builder setPartToExtract(com.google.privacy.dlp.v2.TimePartConfig.TimePart value) {
      if (value == null) {
        throw new NullPointerException();
      }

      partToExtract_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2.TimePartConfig.TimePart part_to_extract = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPartToExtract() {

      partToExtract_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.TimePartConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.TimePartConfig)
  private static final com.google.privacy.dlp.v2.TimePartConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.TimePartConfig();
  }

  public static com.google.privacy.dlp.v2.TimePartConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimePartConfig> PARSER =
      new com.google.protobuf.AbstractParser<TimePartConfig>() {
        @java.lang.Override
        public TimePartConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TimePartConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TimePartConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimePartConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.TimePartConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
