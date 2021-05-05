package zadanie2;

public class Address {
    char[] street;
    int houseNumber;
    int flatNumber;

    Address(char[] street, int houseNumber, int flatNumber){
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    void display(){
        System.out.print("Street: ");
        for(char c : street){
            System.out.print(c);
        }
        System.out.println();

        System.out.println("House number: "+houseNumber);
        System.out.println("Flat number: "+flatNumber);
    }
}
