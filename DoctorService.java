import java.util.ArrayList;
import java.util.List;

class DoctorService {
    private final List<Doctor> doctors = new ArrayList<>();

    DoctorService() {
        this.doctors.add(new Doctor("Adam", "Lecz"));
        this.doctors.add(new Doctor("Ala", "Lecz"));
        this.doctors.add(new Doctor("Ada", "Leczy"));
        this.doctors.add(new Doctor("Marcin", "Chory"));
        this.doctors.add(new Doctor("Krzystof", "Choruje"));
    }

    List<Doctor> getAll() {
        return this.doctors;
    }
}
