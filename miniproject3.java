//package Track.Day4;
class cab{
    //properties
    String customername;
    String cabtype;
    double fare;
    static int totalbookings;

    static {
        totalbookings = 0;
        System.out.println("cab booking started");
    }

    cab(String customername, String cabtype){
        this.customername = customername;
        this.cabtype = cabtype;
        this.fare = calculateFare(cabtype);
        totalbookings++;
    }

    //constructor

    cab(){
        this("guest", "mini");
    }

    //method to calculate fare 
    double calculateFare(String cabtype){
        if(cabtype.equals("Mini"))
        return 100;
        else if(cabtype.equals("sedan"))
        return 200;
        else if(cabtype.equals("suv"))
        return 300;
        else return 0;   
    }

    //method overloading
    double calculateFare(String cabType, int distance){
        if(cabType.equals("mini"))
        return 10 * distance;
        if(cabType.equals("sedan"))
        return 15 * distance;
        if(cabType.equals("suv"))
        return 20 * distance;
        else return 0;
    }

    void displaybooking(){
        System.out.println("customer: "+customername+" cab: "+cabtype+" fare: "+fare);
    }

    static void showtotalbooking(){
        System.out.println(totalbookings);
    }


}

public class miniproject3 {
    public static void main(String[] args) {
        cab x1 =new cab();
        cab x2 = new cab("Abhinanda", "sedan");
        cab x3 = new cab("kiran", "suv");

        x2.displaybooking();
        x3.displaybooking();

        System.out.println(x3.calculateFare("suv", 10));
        cab.showtotalbooking();


    }
}
