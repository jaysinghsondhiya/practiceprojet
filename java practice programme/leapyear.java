public class leapyear {
    public static void main(String[] args) {
        int year = 2024;
        if ((year%4==0 && year%100 != 0 && year%400==0)) {
            System.out.println("yes "+year+ " is a leap year ");
        }
        else{
            System.out.println("no "+year+ " is not a leap year ");
        }
    }
}
