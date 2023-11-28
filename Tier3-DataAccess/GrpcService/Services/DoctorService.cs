using EFC.DAOs;
using Grpc.Core;
using Domain.Models;

namespace GrpcService.Services;

public class DoctorService : Doctor.DoctorBase
{
    private IDoctorDao service;

    public DoctorService(IDoctorDao service)
    {
        this.service = service;
    }

    public override async Task<DoctorResponse> CreateAsync(DoctorObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Doctor addingDoctor = new Domain.Models.Doctor()
            {
                Id = request.Id,
                Username = request.Username,
                Password = request.Password,
                FullName = request.Fullname,
                Specialization = request.Specialization,
                Validated = request.Validated
            };
            await service.CreateAsync(addingDoctor);
            DoctorResponse response = new DoctorResponse()
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

    public override async Task<DoctorObj> GetAsync(DoctorId request, ServerCallContext context)
    {
        try
        {
            int doctorId = request.Id;
            Domain.Models.Doctor fetchedDoctor = await service.GetAsync(doctorId);
            DoctorObj doctorObj = new DoctorObj()
            {
                Id = fetchedDoctor.Id,
                Username = fetchedDoctor.Username,
                Password = fetchedDoctor.Password,
                Fullname = fetchedDoctor.FullName,
                Specialization = fetchedDoctor.Specialization,
                Validated = fetchedDoctor.Validated
            };
            return doctorObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<DoctorResponse> UpdateAsync(DoctorObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Doctor updatingDoctor = new Domain.Models.Doctor(request.Id, request.Username, request.Password, request.Fullname,
                request.Specialization, request.Validated);
            await service.UpdateAsync(updatingDoctor);
            DoctorResponse response = new DoctorResponse()
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

    public override async Task<DoctorResponse> DeleteAsync(DoctorId request, ServerCallContext context)
    {
        try
        {
            int doctorId = request.Id;
            await service.DeleteAsync(doctorId);
            DoctorResponse response = new DoctorResponse()
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