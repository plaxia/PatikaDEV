import java.sql.SQLOutput;
import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {
        int km,age,type;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance (km) : ");
        km=input.nextInt();
        double cost=km*0.1;
        System.out.print("Enter your age :");
        age=input.nextInt();
        System.out.print(" 1-One way \n 2-Round trip\n Select your ticket type :  ");
        type=input.nextInt();
        if(age<12&&km>0)
        {
            cost=cost*0.5;
            if(type==2)
            {
                cost=cost*0.8*2;
            }
           isError=true;
        }
        if(age>=12&& age<=24&&km>0)
        {
        cost=cost*0.9;
            if(type==2)
            {
            cost=cost*0.8*2;
            }
           isError=true;
        }
        if(age>=65&&km>0)
        {
        cost=cost*0.7;
            if(type==2)
            {
            cost=cost*0.8*2;
            }
           isError=true;
        }
        if(isError==false)
        {
            System.out.println("Wrong Enter");
        }
        else
        {
            System.out.println("Cost : "+cost+"Turkish Liras");
        }

    }
}
