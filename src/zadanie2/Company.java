package zadanie2;

public class Company {
    char[] name;
    long nip;
    Address address;

    Company(char[] name, long nip, Address address){
        this.name = name;
        this.nip = nip;
        this.address = address;
    }

    void display(){
        System.out.print("Name: ");
        for(char c : name){
            System.out.print(c);
        }
        System.out.println();

        System.out.println("Nip: "+nip);

        address.display();
    }

}
