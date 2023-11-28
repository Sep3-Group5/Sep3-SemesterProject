using EFC.DAOs;
using Grpc.Core;

namespace GrpcService.Services;

public class BookingService : Booking.BookingBase
{
    private IBookingDao service;

    public BookingService(IBookingDao service)
    {
        this.service = service;
    }

    public override async Task<BookingResponse> CreateAsync(BookingObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Booking addingBooking = new Domain.Models.Booking()
            {
                Id = request.Id,
                PatientId = request.PatientId,
                DoctorId = request.DoctorId,
                Date = request.Date,
                Time = request.Time
            };
            await service.CreateAsync(addingBooking);
            BookingResponse response = new BookingResponse()
            {
                Successful = true
            };
            return response;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<BookingObj> GetByIdAsync(BookingId request, ServerCallContext context)
    {
        try
        {
            int bookingId = request.Id;
            Domain.Models.Booking fetchedBooking = await service.GetAsync(bookingId);
            BookingObj bookingObj = new BookingObj()
            {
                Id = fetchedBooking.Id,
                PatientId = fetchedBooking.PatientId,
                DoctorId = fetchedBooking.DoctorId,
                Date = fetchedBooking.Date,
                Time = fetchedBooking.Time
            };
            return bookingObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<BookingObj> GetByDtoAsync(BookingDto request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Booking fetchedBooking = await service.GetAsync(request.Date, request.Time);
            BookingObj bookingObj = new BookingObj()
            {
                Id = fetchedBooking.Id,
                PatientId = fetchedBooking.PatientId,
                DoctorId = fetchedBooking.DoctorId,
                Date = fetchedBooking.Date,
                Time = fetchedBooking.Time
            };
            return bookingObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<BookingResponse> UpdateAsync(BookingObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Booking updatingBooking = new Domain.Models.Booking(request.Id, request.PatientId,
                request.DoctorId, request.Date, request.Time);
            await service.UpdateAsync(updatingBooking);
            BookingResponse response = new BookingResponse()
            {
                Successful = true
            };
            return response;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<BookingResponse> DeleteAsync(BookingId request, ServerCallContext context)
    {
        try
        {
            int bookingId = request.Id;
            await service.DeleteAsync(bookingId);
            BookingResponse response = new BookingResponse()
            {
                Successful = true
            };
            return response;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }
}