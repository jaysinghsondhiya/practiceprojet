public class trianglecheck {
    public static void main(String[] args) {
        int side1 = 7;
        int side2 = 9;
        int side3 = 3;
        if ((side1+side2)>side3&&(side2+side3)>side1&&(side1+side3)>side2) {
            System.out.println("yes it is triangle");
        }
        else{
            System.out.println("it is not a triangle");
        }

    }
}
