public class greaternumbr {
    public static void main(String[] args) {

        int A = 20;
        int B = 30;
        int C = 100;

        if (A>B&&A>C) {
            System.out.println("A = " + A + " is greater then B and C");
        }
        else if (B>A&&B>C) {

            System.out.println("B = " + B + " is greater then A and C");
        }

        else
        {
            System.out.println("C = " + C + " is greater then B and C");
        }
    }
}
