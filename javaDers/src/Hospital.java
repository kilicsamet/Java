import java.util.List;

public class Hospital {

    int id;
    String name;

    public Hospital(int id, String name) {
        this.id = id;
        this.name = name;
    }

    List<Doctor> doctors;
    List<Nurse> nurses;
    List<Staff> hospitalStaff;
    List<Patience> patiences;

}
