using Domain.Models;
using EFC.DAOs;
using Grpc.Core;
using GrpcService;
using Patient = Domain.Models.Patient;

namespace GrpcService.Services;

public class PatientService : Patient.PatientBase
    
{
    private IPatientDao service;

    public PatientService(IPatientDao service)
    {
        this.service = service;
    }

    public override async Task<PatientObj> CreateAsync(PatientObj request, ServerCallContext context)
    {
        Console.WriteLine(request.Name);
        try
        {
            Domain.Models.Patient addingPatient = new Domain.Models.Patient()
            {
                Id = request.Id,
                Name = request.Name
            };
            Domain.Models.Patient addedPatient = await service.CreateAsync(addingPatient);
    
            PatientObj patientObj = new PatientObj()
            {
                Id = addedPatient.Id,
                Name = addedPatient.Name
            };
    
            return patientObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }
}