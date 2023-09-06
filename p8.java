import java.util.Scanner;

public class p8 {
    public static void main(String[] args){
    //how to take a input
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your age : ");
    int age = sc.nextInt();
    System.out.println(age);

    System.out.println("Input your value : ");
    float value = sc.nextFloat();
    System.out.println(value);

    System.out.println("Input your name : ");
    String name = sc.next();
    System.out.println(name);

    
    System.out.println("Input your address : ");
    String address = sc.nextLine();
    System.out.println(address);

    int cash = sc.nextInt();
    if (cash < 10)
    System.out.println("cannot buy something  need more cash");
    else if(cash > 10 && cash <50)
    System.out.println("can get one thing");
    else
    System.out.println("can get both");
    
}
}
