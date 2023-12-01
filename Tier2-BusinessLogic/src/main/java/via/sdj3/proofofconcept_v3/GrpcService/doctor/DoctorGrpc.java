package via.sdj3.proofofconcept_v3.GrpcService.doctor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: doctor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DoctorGrpc {

  private DoctorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "doctor.Doctor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> getCreateAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> getCreateAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> getCreateAsyncMethod;
    if ((getCreateAsyncMethod = DoctorGrpc.getCreateAsyncMethod) == null) {
      synchronized (DoctorGrpc.class) {
        if ((getCreateAsyncMethod = DoctorGrpc.getCreateAsyncMethod) == null) {
          DoctorGrpc.getCreateAsyncMethod = getCreateAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorMethodDescriptorSupplier("CreateAsync"))
              .build();
        }
      }
    }
    return getCreateAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> getGetAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> getGetAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> getGetAsyncMethod;
    if ((getGetAsyncMethod = DoctorGrpc.getGetAsyncMethod) == null) {
      synchronized (DoctorGrpc.class) {
        if ((getGetAsyncMethod = DoctorGrpc.getGetAsyncMethod) == null) {
          DoctorGrpc.getGetAsyncMethod = getGetAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorMethodDescriptorSupplier("GetAsync"))
              .build();
        }
      }
    }
    return getGetAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> getUpdateAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> getUpdateAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> getUpdateAsyncMethod;
    if ((getUpdateAsyncMethod = DoctorGrpc.getUpdateAsyncMethod) == null) {
      synchronized (DoctorGrpc.class) {
        if ((getUpdateAsyncMethod = DoctorGrpc.getUpdateAsyncMethod) == null) {
          DoctorGrpc.getUpdateAsyncMethod = getUpdateAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorMethodDescriptorSupplier("UpdateAsync"))
              .build();
        }
      }
    }
    return getUpdateAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> getDeleteAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId,
      via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> getDeleteAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> getDeleteAsyncMethod;
    if ((getDeleteAsyncMethod = DoctorGrpc.getDeleteAsyncMethod) == null) {
      synchronized (DoctorGrpc.class) {
        if ((getDeleteAsyncMethod = DoctorGrpc.getDeleteAsyncMethod) == null) {
          DoctorGrpc.getDeleteAsyncMethod = getDeleteAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId, via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorMethodDescriptorSupplier("DeleteAsync"))
              .build();
        }
      }
    }
    return getDeleteAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoctorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorStub>() {
        @java.lang.Override
        public DoctorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorStub(channel, callOptions);
        }
      };
    return DoctorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoctorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorBlockingStub>() {
        @java.lang.Override
        public DoctorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorBlockingStub(channel, callOptions);
        }
      };
    return DoctorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoctorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorFutureStub>() {
        @java.lang.Override
        public DoctorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorFutureStub(channel, callOptions);
        }
      };
    return DoctorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAsyncMethod(), responseObserver);
    }

    /**
     */
    default void getAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAsyncMethod(), responseObserver);
    }

    /**
     */
    default void updateAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAsyncMethod(), responseObserver);
    }

    /**
     */
    default void deleteAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAsyncMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Doctor.
   */
  public static abstract class DoctorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DoctorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Doctor.
   */
  public static final class DoctorStub
      extends io.grpc.stub.AbstractAsyncStub<DoctorStub> {
    private DoctorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorStub(channel, callOptions);
    }

    /**
     */
    public void createAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAsyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Doctor.
   */
  public static final class DoctorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DoctorBlockingStub> {
    private DoctorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj createAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj getAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse updateAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse deleteAsync(via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Doctor.
   */
  public static final class DoctorFutureStub
      extends io.grpc.stub.AbstractFutureStub<DoctorFutureStub> {
    private DoctorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> createAsync(
        via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj> getAsync(
        via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> updateAsync(
        via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse> deleteAsync(
        via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ASYNC = 0;
  private static final int METHODID_GET_ASYNC = 1;
  private static final int METHODID_UPDATE_ASYNC = 2;
  private static final int METHODID_DELETE_ASYNC = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ASYNC:
          serviceImpl.createAsync((via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj>) responseObserver);
          break;
        case METHODID_GET_ASYNC:
          serviceImpl.getAsync((via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj>) responseObserver);
          break;
        case METHODID_UPDATE_ASYNC:
          serviceImpl.updateAsync((via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse>) responseObserver);
          break;
        case METHODID_DELETE_ASYNC:
          serviceImpl.deleteAsync((via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj,
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj>(
                service, METHODID_CREATE_ASYNC)))
        .addMethod(
          getGetAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId,
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj>(
                service, METHODID_GET_ASYNC)))
        .addMethod(
          getUpdateAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj,
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse>(
                service, METHODID_UPDATE_ASYNC)))
        .addMethod(
          getDeleteAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorId,
              via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorResponse>(
                service, METHODID_DELETE_ASYNC)))
        .build();
  }

  private static abstract class DoctorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoctorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Doctor");
    }
  }

  private static final class DoctorFileDescriptorSupplier
      extends DoctorBaseDescriptorSupplier {
    DoctorFileDescriptorSupplier() {}
  }

  private static final class DoctorMethodDescriptorSupplier
      extends DoctorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DoctorMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DoctorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoctorFileDescriptorSupplier())
              .addMethod(getCreateAsyncMethod())
              .addMethod(getGetAsyncMethod())
              .addMethod(getUpdateAsyncMethod())
              .addMethod(getDeleteAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
