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

public interface QuoteInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.QuoteInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   *
   * @return Whether the dateTime field is set.
   */
  boolean hasDateTime();
  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   *
   * @return The dateTime.
   */
  com.google.privacy.dlp.v2.DateTime getDateTime();
  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   */
  com.google.privacy.dlp.v2.DateTimeOrBuilder getDateTimeOrBuilder();

  public com.google.privacy.dlp.v2.QuoteInfo.ParsedQuoteCase getParsedQuoteCase();
}
