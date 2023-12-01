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
  private static volatile io.grpc.MethodDescriptor<DoctorObj,
          DoctorObj> getCreateAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAsync",
      requestType = DoctorObj.class,
      responseType = DoctorObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DoctorObj,
          DoctorObj> getCreateAsyncMethod() {
    io.grpc.MethodDescriptor<DoctorObj, DoctorObj> getCreateAsyncMethod;
    if ((getCreateAsyncMethod = DoctorGrpc.getCreateAsyncMethod) == null) {
      synchronized (DoctorGrpc.class) {
        if ((getCreateAsyncMethod = DoctorGrpc.getCreateAsyncMethod) == null) {
          DoctorGrpc.getCreateAsyncMethod = getCreateAsyncMethod =
              io.grpc.MethodDescriptor.<DoctorObj, DoctorObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoctorObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoctorObj.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorMethodDescriptorSupplier("CreateAsync"))
              .build();
        }
      }
    }
    return getCreateAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.Name,
          DoctorObj> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.Name.class,
      responseType = DoctorObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.Name,
          DoctorObj> getGetUserMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.Name, DoctorObj> getGetUserMethod;
    if ((getGetUserMethod = DoctorGrpc.getGetUserMethod) == null) {
      synchronized (DoctorGrpc.class) {
        if ((getGetUserMethod = DoctorGrpc.getGetUserMethod) == null) {
          DoctorGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.Name, DoctorObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.Name.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoctorObj.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
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
    default void createAsync(DoctorObj request,
                             io.grpc.stub.StreamObserver<DoctorObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAsyncMethod(), responseObserver);
    }

    /**
     */
    default void getUser(via.sdj3.proofofconcept_v3.GrpcService.Name request,
        io.grpc.stub.StreamObserver<DoctorObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
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
    public void createAsync(DoctorObj request,
                            io.grpc.stub.StreamObserver<DoctorObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(via.sdj3.proofofconcept_v3.GrpcService.Name request,
        io.grpc.stub.StreamObserver<DoctorObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
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
    public DoctorObj createAsync(DoctorObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public DoctorObj getUser(via.sdj3.proofofconcept_v3.GrpcService.Name request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<DoctorObj> createAsync(
        DoctorObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DoctorObj> getUser(
        via.sdj3.proofofconcept_v3.GrpcService.Name request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ASYNC = 0;
  private static final int METHODID_GET_USER = 1;

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
          serviceImpl.createAsync((DoctorObj) request,
              (io.grpc.stub.StreamObserver<DoctorObj>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((via.sdj3.proofofconcept_v3.GrpcService.Name) request,
              (io.grpc.stub.StreamObserver<DoctorObj>) responseObserver);
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
                    DoctorObj,
                    DoctorObj>(
                service, METHODID_CREATE_ASYNC)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.Name,
                    DoctorObj>(
                service, METHODID_GET_USER)))
        .build();
  }

  private static abstract class DoctorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoctorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DoctorOuterClass.getDescriptor();
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
              .addMethod(getGetUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
