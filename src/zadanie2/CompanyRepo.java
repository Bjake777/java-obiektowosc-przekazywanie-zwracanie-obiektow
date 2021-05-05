package zadanie2;

public class CompanyRepo {
    Company[] companies;
    int iterator = 0;

    CompanyRepo(int size){
        companies = new Company[size];
    }

    void add(Company company){
        if(iterator < companies.length) {
            companies[iterator] = company;
            iterator++;
        } else {
            System.out.println("Brak miejsc dla firmy:");
            company.display();
        }
    }

    Company findCompany(long nip){
        Company findedCompany = null;
        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            if(companies[i].nip == nip) {
                findedCompany = companies[i];
            }
        }
        return findedCompany;
    }


    void displayAll(){
        System.out.println("*********** wszystkie firmy ***********");
        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            System.out.println("---------------");
            companies[i].display();
        }
    }
}
