import java.util.Scanner;

public class electricty_bill_charge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your electricty unit : ");
        int  unit = sc.nextInt();

        float servicecharge ;
        float ammount;
        float billammount;

        if (unit<=50) {
             ammount = unit*0.50f;
           

        }

        else if (unit<=150) {
            ammount = unit*0.75f;
           
        }

        else if(unit<=250){
            ammount = unit*1.20f;
        }

        else{
            ammount = unit*1.50f;
        } 
        
        servicecharge = ammount+ 0.2f;
        billammount = servicecharge+ammount;
        System.out.println("Your bill amount is : "+billammount);   
    }
   



}
