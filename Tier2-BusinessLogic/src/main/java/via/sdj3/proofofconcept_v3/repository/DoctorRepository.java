package via.sdj3.proofofconcept_v3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.proofofconcept_v3.entity.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

}
