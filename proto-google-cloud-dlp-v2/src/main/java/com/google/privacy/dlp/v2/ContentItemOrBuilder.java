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

public interface ContentItemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ContentItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * String data to inspect or redact.
   * </pre>
   *
   * <code>string value = 3;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();
  /**
   *
   *
   * <pre>
   * String data to inspect or redact.
   * </pre>
   *
   * <code>string value = 3;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * Structured content for inspection. See
   * https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
   * learn more.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Table table = 4;</code>
   *
   * @return Whether the table field is set.
   */
  boolean hasTable();
  /**
   *
   *
   * <pre>
   * Structured content for inspection. See
   * https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
   * learn more.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Table table = 4;</code>
   *
   * @return The table.
   */
  com.google.privacy.dlp.v2.Table getTable();
  /**
   *
   *
   * <pre>
   * Structured content for inspection. See
   * https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
   * learn more.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Table table = 4;</code>
   */
  com.google.privacy.dlp.v2.TableOrBuilder getTableOrBuilder();

  /**
   *
   *
   * <pre>
   * Content data to inspect or redact. Replaces `type` and `data`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 5;</code>
   *
   * @return Whether the byteItem field is set.
   */
  boolean hasByteItem();
  /**
   *
   *
   * <pre>
   * Content data to inspect or redact. Replaces `type` and `data`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 5;</code>
   *
   * @return The byteItem.
   */
  com.google.privacy.dlp.v2.ByteContentItem getByteItem();
  /**
   *
   *
   * <pre>
   * Content data to inspect or redact. Replaces `type` and `data`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 5;</code>
   */
  com.google.privacy.dlp.v2.ByteContentItemOrBuilder getByteItemOrBuilder();

  public com.google.privacy.dlp.v2.ContentItem.DataItemCase getDataItemCase();
}
