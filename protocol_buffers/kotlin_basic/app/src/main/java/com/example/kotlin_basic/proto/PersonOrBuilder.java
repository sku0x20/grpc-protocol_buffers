// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook_file.proto

package com.example.kotlin_basic.proto;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.kotlin_basic.proto.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * unique id number for this person
   * </pre>
   *
   * <code>int32 id = 2;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>optional string email = 3;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>optional string email = 3;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>optional string email = 3;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .com.example.kotlin_basic.proto.Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<com.example.kotlin_basic.proto.Person.PhoneNumber> 
      getPhonesList();
  /**
   * <code>repeated .com.example.kotlin_basic.proto.Person.PhoneNumber phones = 4;</code>
   */
  com.example.kotlin_basic.proto.Person.PhoneNumber getPhones(int index);
  /**
   * <code>repeated .com.example.kotlin_basic.proto.Person.PhoneNumber phones = 4;</code>
   */
  int getPhonesCount();
  /**
   * <code>repeated .com.example.kotlin_basic.proto.Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<? extends com.example.kotlin_basic.proto.Person.PhoneNumberOrBuilder> 
      getPhonesOrBuilderList();
  /**
   * <code>repeated .com.example.kotlin_basic.proto.Person.PhoneNumber phones = 4;</code>
   */
  com.example.kotlin_basic.proto.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp last_updated = 5;</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 5;</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();
}