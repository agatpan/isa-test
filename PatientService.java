import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Maria", "Nowakowska", 13));
        this.patients.add(new Patient("Kasia", "Kowalska", 13));
        this.patients.add(new Patient("Jan", "Nowak", 13));
        this.patients.add(new Patient("Marcin", "Iksiński", 13));
        this.patients.add(new Patient("Maria", "Nowakowska", 13));
        this.patients.add(new Patient("Maria", "Nowakowska", 13));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
