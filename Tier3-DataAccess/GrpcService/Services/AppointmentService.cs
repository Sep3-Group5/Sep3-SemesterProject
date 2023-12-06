using Domain.Models;
using EFC.DAOs;
using Grpc.Core;

namespace GrpcService.Services;

public class AppointmentService : Appointment.AppointmentBase
{
    private IAppointmentDao service;

    public AppointmentService(IAppointmentDao service)
    {
        this.service = service;
    }

    public override async Task<AppointmentObj> CreateAsync(AppointmentObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Appointment addingAppointment = new Domain.Models.Appointment()
            {
                Id = request.Id,
                PatientId = request.PatientId,
                DoctorId = request.DoctorId,
                Date = request.Date,
                Time = request.Time,
                Diagnosis = request.Diagnosis,
                Status = request.Status
            };
            Domain.Models.Appointment addedAppointment = await service.CreateAsync(addingAppointment);
            AppointmentObj appointmentObj = new AppointmentObj()
            {
                Id = addedAppointment.Id,
                Date = addedAppointment.Date,
                Diagnosis = addedAppointment.Diagnosis,
                DoctorId = addedAppointment.DoctorId,
                PatientId = addedAppointment.PatientId,
                Time = addedAppointment.Time
            };
            return appointmentObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<AppointmentList> GetAsync(AppointmentVoid request, ServerCallContext context)
    {
        try
        {
            IEnumerable<Domain.Models.Appointment> appointments = await service.GetAsync();
            AppointmentList appointmentList = new AppointmentList();
            foreach (Domain.Models.Appointment a in appointments)
            {
                AppointmentObj appointmentObj = new AppointmentObj()
                {
                    Id = a.Id,
                    PatientId = a.PatientId,
                    DoctorId = a.DoctorId,
                    Date = a.Date,
                    Time = a.Time,
                    Diagnosis = a.Diagnosis,
                    Status = a.Status
                };
                appointmentList.Appointments.Add(appointmentObj);
            }

            return appointmentList;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<AppointmentObj> GetByIdAsync(AppointmentId request, ServerCallContext context)
    {
        try
        {
            int appointmentId = request.Id;
            Domain.Models.Appointment fetchedAppointment = await service.GetAsync(appointmentId);
            AppointmentObj appointmentObj = new AppointmentObj()
            {
                Id = fetchedAppointment.Id,
                PatientId = fetchedAppointment.PatientId,
                DoctorId = fetchedAppointment.DoctorId,
                Date = fetchedAppointment.Date,
                Time = fetchedAppointment.Time,
                Diagnosis = fetchedAppointment.Diagnosis,
                // Status = fetchedAppointment.Status
            };
            return appointmentObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<AppointmentObj> GetByDtoAsync(AppointmentDto request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Appointment fetchedAppointment = await service.GetAsync(request.Date, request.Time);
            AppointmentObj appointmentObj = new AppointmentObj()
            {
                Id = fetchedAppointment.Id,
                PatientId = fetchedAppointment.PatientId,
                DoctorId = fetchedAppointment.DoctorId,
                Date = fetchedAppointment.Date,
                Time = fetchedAppointment.Time,
                Diagnosis = fetchedAppointment.Diagnosis
            };
            return appointmentObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<AppointmentResponse> UpdateAsync(AppointmentObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Appointment updatingAppointment = new Domain.Models.Appointment(request.Id, request.PatientId,
                request.DoctorId, request.Date, request.Time, request.Diagnosis);
            await service.UpdateAsync(updatingAppointment);
            AppointmentResponse response = new AppointmentResponse()
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

    public override async Task<AppointmentResponse> DeleteAsync(AppointmentId request, ServerCallContext context)
    {
        try
        {
            int appointmentId = request.Id;
            await service.DeleteAsync(appointmentId);
            AppointmentResponse response = new AppointmentResponse()
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
