// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: doctor.proto

package via.sdj3.proofofconcept_v3.GrpcService.doctor;

/**
 * Protobuf type {@code doctor.DoctorObj}
 */
public  final class DoctorObj extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:doctor.DoctorObj)
    DoctorObjOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DoctorObj.newBuilder() to construct.
  private DoctorObj(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DoctorObj() {
    username_ = "";
    password_ = "";
    fullname_ = "";
    specialization_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DoctorObj();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DoctorObj(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            password_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fullname_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            specialization_ = s;
            break;
          }
          case 48: {

            validated_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorOuterClass.internal_static_doctor_DoctorObj_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorOuterClass.internal_static_doctor_DoctorObj_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.class, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  public int getId() {
    return id_;
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 2;</code>
   * @return The username.
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 2;</code>
   * @return The bytes for username.
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 3;
  private volatile java.lang.Object password_;
  /**
   * <code>string password = 3;</code>
   * @return The password.
   */
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>string password = 3;</code>
   * @return The bytes for password.
   */
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FULLNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object fullname_;
  /**
   * <code>string fullname = 4;</code>
   * @return The fullname.
   */
  public java.lang.String getFullname() {
    java.lang.Object ref = fullname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullname_ = s;
      return s;
    }
  }
  /**
   * <code>string fullname = 4;</code>
   * @return The bytes for fullname.
   */
  public com.google.protobuf.ByteString
      getFullnameBytes() {
    java.lang.Object ref = fullname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPECIALIZATION_FIELD_NUMBER = 5;
  private volatile java.lang.Object specialization_;
  /**
   * <code>string specialization = 5;</code>
   * @return The specialization.
   */
  public java.lang.String getSpecialization() {
    java.lang.Object ref = specialization_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      specialization_ = s;
      return s;
    }
  }
  /**
   * <code>string specialization = 5;</code>
   * @return The bytes for specialization.
   */
  public com.google.protobuf.ByteString
      getSpecializationBytes() {
    java.lang.Object ref = specialization_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      specialization_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATED_FIELD_NUMBER = 6;
  private boolean validated_;
  /**
   * <code>bool validated = 6;</code>
   * @return The validated.
   */
  public boolean getValidated() {
    return validated_;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    if (!getPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, password_);
    }
    if (!getFullnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fullname_);
    }
    if (!getSpecializationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, specialization_);
    }
    if (validated_ != false) {
      output.writeBool(6, validated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
    }
    if (!getPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, password_);
    }
    if (!getFullnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fullname_);
    }
    if (!getSpecializationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, specialization_);
    }
    if (validated_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, validated_);
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
    if (!(obj instanceof via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj)) {
      return super.equals(obj);
    }
    via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj other = (via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj) obj;

    if (getId()
        != other.getId()) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getFullname()
        .equals(other.getFullname())) return false;
    if (!getSpecialization()
        .equals(other.getSpecialization())) return false;
    if (getValidated()
        != other.getValidated()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + FULLNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullname().hashCode();
    hash = (37 * hash) + SPECIALIZATION_FIELD_NUMBER;
    hash = (53 * hash) + getSpecialization().hashCode();
    hash = (37 * hash) + VALIDATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parseFrom(
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
  public static Builder newBuilder(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj prototype) {
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
   * Protobuf type {@code doctor.DoctorObj}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:doctor.DoctorObj)
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObjOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorOuterClass.internal_static_doctor_DoctorObj_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorOuterClass.internal_static_doctor_DoctorObj_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.class, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.Builder.class);
    }

    // Construct using via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      username_ = "";

      password_ = "";

      fullname_ = "";

      specialization_ = "";

      validated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorOuterClass.internal_static_doctor_DoctorObj_descriptor;
    }

    @java.lang.Override
    public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj getDefaultInstanceForType() {
      return via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj build() {
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj buildPartial() {
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj result = new via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj(this);
      result.id_ = id_;
      result.username_ = username_;
      result.password_ = password_;
      result.fullname_ = fullname_;
      result.specialization_ = specialization_;
      result.validated_ = validated_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj) {
        return mergeFrom((via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj other) {
      if (other == via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (!other.getFullname().isEmpty()) {
        fullname_ = other.fullname_;
        onChanged();
      }
      if (!other.getSpecialization().isEmpty()) {
        specialization_ = other.specialization_;
        onChanged();
      }
      if (other.getValidated() != false) {
        setValidated(other.getValidated());
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
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <code>string password = 3;</code>
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string password = 3;</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string password = 3;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string password = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string password = 3;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fullname_ = "";
    /**
     * <code>string fullname = 4;</code>
     * @return The fullname.
     */
    public java.lang.String getFullname() {
      java.lang.Object ref = fullname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fullname = 4;</code>
     * @return The bytes for fullname.
     */
    public com.google.protobuf.ByteString
        getFullnameBytes() {
      java.lang.Object ref = fullname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fullname = 4;</code>
     * @param value The fullname to set.
     * @return This builder for chaining.
     */
    public Builder setFullname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fullname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fullname = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullname() {
      
      fullname_ = getDefaultInstance().getFullname();
      onChanged();
      return this;
    }
    /**
     * <code>string fullname = 4;</code>
     * @param value The bytes for fullname to set.
     * @return This builder for chaining.
     */
    public Builder setFullnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fullname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object specialization_ = "";
    /**
     * <code>string specialization = 5;</code>
     * @return The specialization.
     */
    public java.lang.String getSpecialization() {
      java.lang.Object ref = specialization_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        specialization_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string specialization = 5;</code>
     * @return The bytes for specialization.
     */
    public com.google.protobuf.ByteString
        getSpecializationBytes() {
      java.lang.Object ref = specialization_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        specialization_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string specialization = 5;</code>
     * @param value The specialization to set.
     * @return This builder for chaining.
     */
    public Builder setSpecialization(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      specialization_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string specialization = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpecialization() {
      
      specialization_ = getDefaultInstance().getSpecialization();
      onChanged();
      return this;
    }
    /**
     * <code>string specialization = 5;</code>
     * @param value The bytes for specialization to set.
     * @return This builder for chaining.
     */
    public Builder setSpecializationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      specialization_ = value;
      onChanged();
      return this;
    }

    private boolean validated_ ;
    /**
     * <code>bool validated = 6;</code>
     * @return The validated.
     */
    public boolean getValidated() {
      return validated_;
    }
    /**
     * <code>bool validated = 6;</code>
     * @param value The validated to set.
     * @return This builder for chaining.
     */
    public Builder setValidated(boolean value) {
      
      validated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool validated = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidated() {
      
      validated_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:doctor.DoctorObj)
  }

  // @@protoc_insertion_point(class_scope:doctor.DoctorObj)
  private static final via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj();
  }

  public static via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DoctorObj>
      PARSER = new com.google.protobuf.AbstractParser<DoctorObj>() {
    @java.lang.Override
    public DoctorObj parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DoctorObj(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DoctorObj> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoctorObj> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

