// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patient.proto

package via.sdj3.proofofconcept_v3.GrpcService.patient;

public final class PatientOuterClass {
  private PatientOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_patient_PatientObj_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_patient_PatientObj_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_patient_Name_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_patient_Name_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_patient_PatientLogin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_patient_PatientLogin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpatient.proto\022\007patient\"J\n\nPatientObj\022\n" +
      "\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010username\030\003 \001" +
      "(\t\022\020\n\010password\030\004 \001(\t\"\024\n\004Name\022\014\n\004name\030\001 \001" +
      "(\t\"2\n\014PatientLogin\022\020\n\010username\030\001 \001(\t\022\020\n\010" +
      "password\030\002 \001(\t2\257\001\n\007Patient\0227\n\013CreateAsyn" +
      "c\022\023.patient.PatientObj\032\023.patient.Patient" +
      "Obj\022-\n\007GetUser\022\r.patient.Name\032\023.patient." +
      "PatientObj\022<\n\016LoginAsPatient\022\025.patient.P" +
      "atientLogin\032\023.patient.PatientObjB2\n.via." +
      "sdj3.proofofconcept_v3.GrpcService.patie" +
      "ntP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_patient_PatientObj_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_patient_PatientObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_patient_PatientObj_descriptor,
        new java.lang.String[] { "Id", "Name", "Username", "Password", });
    internal_static_patient_Name_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_patient_Name_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_patient_Name_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_patient_PatientLogin_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_patient_PatientLogin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_patient_PatientLogin_descriptor,
        new java.lang.String[] { "Username", "Password", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
