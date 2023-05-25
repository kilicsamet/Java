import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Doctor> doctorsOfGata = new ArrayList<>();
        List<Nurse> nursesOfGata = new ArrayList<>();
        List<Staff> gataStaff = new ArrayList<>();
        List<Patience> patiencesOfGata = new ArrayList<>();

        Hospital gata = new Hospital(1,"Gata");
        Doctor ahmetMaranki = new Doctor(
                new IdInformation(101,"Ahmet","Maranki","07/05/1985"),
                "Beyin Cerrahı","Surgent"
        );
        Doctor cananKaratay = new Doctor(
                new IdInformation(102,"Canan","Karatay","05/12/1945"),
                "Diyetisyen","Surgent"
        );
        doctorsOfGata.add(ahmetMaranki);
        doctorsOfGata.add(cananKaratay);

        Nurse pelin = new Nurse(
                new IdInformation(11,"Pelin","Su","10/10/1999"),
                "20/02/2019","Kan Alma"
        );
        nursesOfGata.add(pelin);

        Staff ahmet = new Staff(
                new IdInformation(21,"Ahmet","Alıcı","15/10/1975"),
                "Temizlik"
        );
        gataStaff.add(ahmet);

        Patience patient1 = new Patience(
                new IdInformation(101,"Ali", "Salih","15/07/2003"),
                "23/05/2023",false,"headache"
        );
        patiencesOfGata.add(patient1);

        gata.doctors = doctorsOfGata;
        gata.hospitalStaff = gataStaff;
        gata.nurses = nursesOfGata;
        gata.patiences = patiencesOfGata;

        print(gata);

    }

    public  static  void print(Hospital hospital){

        System.out.println(hospital.id);
        System.out.println(hospital.name);

        for (Doctor doctor : hospital.doctors){
            printId(doctor.idInformation);
            System.out.println(doctor.profession + " " +doctor.title);
        }

        for(Nurse nurse: hospital.nurses){
            printId(nurse.idInformation);
            System.out.println(nurse.department +" " + nurse.startDate);
        }

        for (Staff staff: hospital.hospitalStaff){
            printId(staff.idInformation);
            System.out.println(staff.department);
        }

        for (Patience patience: hospital.patiences){
            printId(patience.idInformation);
            System.out.println(patience.disaese + " " + patience.enteranceDate + " " + patience.isTaburcu);
        }

    }

    public  static  void printId(IdInformation idInformation){

        System.out.println("İsim: " + idInformation.name + " Soyisim: " + idInformation.surname);

    }



}