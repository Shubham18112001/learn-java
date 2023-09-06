import java.util.Scanner;

public class p11switch {
     public static void main(String[] args){
    //how to take a input
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your number of day : ");
    int day = sc.nextInt();
    
    switch (day) {
        case 1:
        System.out.println("monday");
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("enter correct value.. between 0 to 7");

    }
    }
}
