// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: booking.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981
#region Designer generated code

using grpc = global::Grpc.Core;

namespace GrpcService {
  public static partial class Booking
  {
    static readonly string __ServiceName = "booking.Booking";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcService.BookingObj> __Marshaller_booking_BookingObj = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcService.BookingObj.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcService.BookingResponse> __Marshaller_booking_BookingResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcService.BookingResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcService.BookingId> __Marshaller_booking_BookingId = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcService.BookingId.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcService.BookingDto> __Marshaller_booking_BookingDto = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcService.BookingDto.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcService.BookingObj, global::GrpcService.BookingResponse> __Method_CreateAsync = new grpc::Method<global::GrpcService.BookingObj, global::GrpcService.BookingResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CreateAsync",
        __Marshaller_booking_BookingObj,
        __Marshaller_booking_BookingResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcService.BookingId, global::GrpcService.BookingObj> __Method_GetByIdAsync = new grpc::Method<global::GrpcService.BookingId, global::GrpcService.BookingObj>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetByIdAsync",
        __Marshaller_booking_BookingId,
        __Marshaller_booking_BookingObj);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcService.BookingDto, global::GrpcService.BookingObj> __Method_GetByDtoAsync = new grpc::Method<global::GrpcService.BookingDto, global::GrpcService.BookingObj>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetByDtoAsync",
        __Marshaller_booking_BookingDto,
        __Marshaller_booking_BookingObj);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcService.BookingObj, global::GrpcService.BookingResponse> __Method_UpdateAsync = new grpc::Method<global::GrpcService.BookingObj, global::GrpcService.BookingResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "UpdateAsync",
        __Marshaller_booking_BookingObj,
        __Marshaller_booking_BookingResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcService.BookingId, global::GrpcService.BookingResponse> __Method_DeleteAsync = new grpc::Method<global::GrpcService.BookingId, global::GrpcService.BookingResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "DeleteAsync",
        __Marshaller_booking_BookingId,
        __Marshaller_booking_BookingResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::GrpcService.BookingReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of Booking</summary>
    [grpc::BindServiceMethod(typeof(Booking), "BindService")]
    public abstract partial class BookingBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GrpcService.BookingResponse> CreateAsync(global::GrpcService.BookingObj request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GrpcService.BookingObj> GetByIdAsync(global::GrpcService.BookingId request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GrpcService.BookingObj> GetByDtoAsync(global::GrpcService.BookingDto request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GrpcService.BookingResponse> UpdateAsync(global::GrpcService.BookingObj request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::GrpcService.BookingResponse> DeleteAsync(global::GrpcService.BookingId request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(BookingBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_CreateAsync, serviceImpl.CreateAsync)
          .AddMethod(__Method_GetByIdAsync, serviceImpl.GetByIdAsync)
          .AddMethod(__Method_GetByDtoAsync, serviceImpl.GetByDtoAsync)
          .AddMethod(__Method_UpdateAsync, serviceImpl.UpdateAsync)
          .AddMethod(__Method_DeleteAsync, serviceImpl.DeleteAsync).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, BookingBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_CreateAsync, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GrpcService.BookingObj, global::GrpcService.BookingResponse>(serviceImpl.CreateAsync));
      serviceBinder.AddMethod(__Method_GetByIdAsync, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GrpcService.BookingId, global::GrpcService.BookingObj>(serviceImpl.GetByIdAsync));
      serviceBinder.AddMethod(__Method_GetByDtoAsync, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GrpcService.BookingDto, global::GrpcService.BookingObj>(serviceImpl.GetByDtoAsync));
      serviceBinder.AddMethod(__Method_UpdateAsync, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GrpcService.BookingObj, global::GrpcService.BookingResponse>(serviceImpl.UpdateAsync));
      serviceBinder.AddMethod(__Method_DeleteAsync, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::GrpcService.BookingId, global::GrpcService.BookingResponse>(serviceImpl.DeleteAsync));
    }

  }
}
#endregion
