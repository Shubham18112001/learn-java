import java.util.Scanner;
public class p16project {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess the number(1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == mynumber) {
                System.out.println("Wohoooooo.. Correct number!!!!!!!");
                break;
            }
            else if(userNumber > mynumber) {
                System.out.println("your number is too big");
            }
            else {
                System.out.println("your number is too small");
            }
        } while(userNumber >= 0);
        System.out.print("my number is : ");
        System.out.println(mynumber);
    }
}
