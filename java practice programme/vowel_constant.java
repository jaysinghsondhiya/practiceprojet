public class vowel_constant {
    public static void main(String[] args) {
        char c = 'v';
        if (c=='a'||c=='e'|| c=='i'||c=='o'||c=='u') {
            System.out.println("it is a vowel");
        }
        else if(c>='a' && c <='z'){
            System.out.println("it is a constant ");
        }

        else
        {
            System.out.println(" number note alllow please enter a aplphabatic lowercase value  ");
        }

    }
}
