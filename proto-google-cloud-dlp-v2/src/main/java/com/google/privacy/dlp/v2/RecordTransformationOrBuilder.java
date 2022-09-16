/*
 * Copyright 2020 Google LLC
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

public interface RecordTransformationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RecordTransformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * For record transformations, provide a field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field_id = 1;</code>
   *
   * @return Whether the fieldId field is set.
   */
  boolean hasFieldId();
  /**
   *
   *
   * <pre>
   * For record transformations, provide a field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field_id = 1;</code>
   *
   * @return The fieldId.
   */
  com.google.privacy.dlp.v2.FieldId getFieldId();
  /**
   *
   *
   * <pre>
   * For record transformations, provide a field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field_id = 1;</code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 2;</code>
   *
   * @return Whether the containerTimestamp field is set.
   */
  boolean hasContainerTimestamp();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 2;</code>
   *
   * @return The containerTimestamp.
   */
  com.google.protobuf.Timestamp getContainerTimestamp();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getContainerTimestampOrBuilder();

  /**
   *
   *
   * <pre>
   * Container version, if available ("generation" for Cloud Storage).
   * </pre>
   *
   * <code>string container_version = 3;</code>
   *
   * @return The containerVersion.
   */
  java.lang.String getContainerVersion();
  /**
   *
   *
   * <pre>
   * Container version, if available ("generation" for Cloud Storage).
   * </pre>
   *
   * <code>string container_version = 3;</code>
   *
   * @return The bytes for containerVersion.
   */
  com.google.protobuf.ByteString getContainerVersionBytes();
}