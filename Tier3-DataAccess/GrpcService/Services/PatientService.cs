using Domain.DTOs;
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
        Console.WriteLine(request.Fullname);
        try
        {
            Domain.Models.Patient addingPatient = new Domain.Models.Patient()
            {
                Id = request.Id,
                Fullname = request.Fullname,
<<<<<<< Updated upstream
                Username = request.Username,
                Password = request.Password
=======
                Password = request.Password,
                Username = request.Username
>>>>>>> Stashed changes
            };
            Domain.Models.Patient addedPatient = await service.CreateAsync(addingPatient);

            PatientObj patientObj = new PatientObj()
            {
                Id = addedPatient.Id,
                Fullname = addedPatient.Fullname,
<<<<<<< Updated upstream
                Username = addedPatient.Username,
                Password = addedPatient.Password
            };

=======
                Password = addedPatient.Password,
                Username = addedPatient.Username
            };
>>>>>>> Stashed changes
            return patientObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<PatientList> GetAsync(PatientVoid request, ServerCallContext context)
    {
        try
        {
            IEnumerable<Domain.Models.Patient> patients = await service.GetAsync();
            PatientList patientList = new PatientList();
            foreach (Domain.Models.Patient p in patients)
            {
                PatientObj patientObj = new PatientObj()
                {
                    Id = p.Id,
                    Fullname = p.Fullname,
                    Username = p.Username,
                    Password = p.Password
                };
                patientList.Patients.Add(patientObj);
            }

            return patientList;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }
}
