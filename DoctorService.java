import java.util.ArrayList;
import java.util.List;

class DoctorService {
    private final List<Doctor> doctors = new ArrayList<>();

    DoctorService() {
        this.doctors.add(new Doctor("Adam", "Lecz"));
        this.doctors.add(new Doctor("Ala", "Lecz"));
        this.doctors.add(new Doctor("Ada", "Leczy"));
        this.doctors.add(new Doctor("Maria", "Chory"));
    }

    List<Doctor> getAll() {
        return this.doctors;
    }
}
