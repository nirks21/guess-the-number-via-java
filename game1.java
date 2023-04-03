
import java.util.Scanner;
import java.util.Random;
public class game1 {

        public static void main(String[] args) {
            for(int i=1;i<=6;i++) {
                Scanner s=new Scanner(System.in);
                int guessnumber=s.nextInt();
                System.out.println("your guess is :"+guessnumber);
                Random rnd=new Random();
                int rndnumber=rnd.nextInt(20);
                System.out.println("random number :"+rndnumber);
                if(guessnumber<rndnumber) {
                    System.out.println("your guess is too low");
                }
                else if(guessnumber>rndnumber) {
                    System.out.println("your guess is too high");
                }
                else {
                    System.out.println("right guess");
                    break;
                }
            }
        }


}
