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

    public override async Task<BoolResponse> CreateAsync(DoctorObj request, ServerCallContext context)
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
            BoolResponse response = new BoolResponse()
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

    public override async Task<BoolResponse> UpdateAsync(DoctorObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Doctor updatingDoctor = new Domain.Models.Doctor(request.Id, request.Username, request.Password, request.Fullname,
                request.Specialization, request.Validated);
            await service.UpdateAsync(updatingDoctor);
            BoolResponse response = new BoolResponse()
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

    public override async Task<BoolResponse> DeleteAsync(DoctorId request, ServerCallContext context)
    {
        try
        {
            int doctorId = request.Id;
            await service.DeleteAsync(doctorId);
            BoolResponse response = new BoolResponse()
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