import java.util.Scanner;
public class InClass {
    public static void main(String[] args){
        System.out.println("How many outputs do you want?");
        Scanner entry = new Scanner(System.in);
        int numberOfOutput = entry.nextInt();
        int firstNo = 0;
        int secondNo = 1;
        for (int i = 1; i <= numberOfOutput; i++) {
            int fibNo = firstNo + secondNo;
            System.out.println(fibNo);
            firstNo = secondNo;
            secondNo = fibNo;

        }
    }
}
