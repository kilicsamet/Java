import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        List<String> companies = new ArrayList<String>();

        companies.add(company.name = "Baykar");
        companies.add(company.name = "FNSS");

        Branch branch = new Branch();
        branch.name = "Baykar Branch";
        branch.address = new Address();
        branch.address.city = "İstanbul";

        Personal personal = new Personal();
        personal.fullName = "Ahmet";
        List<Personal> personals = new ArrayList<Personal>();
        personals.add(personal);
        branch.personals = personals;

        List<Branch> branches = new ArrayList<Branch>();
        branches.add(branch);
        company.branches = branches;

        System.out.println("Company Name: " + company.name);
        System.out.println("Branch Name: " + company.branches.get(0).name);
        System.out.println("Branch City: " + company.branches.get(0).address.city);
        System.out.println("Personal Name: " + company.branches.get(0).personals.get(0).fullName);


    }
}