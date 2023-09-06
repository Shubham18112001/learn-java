import java.util.Scanner;

public class p13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        do{
            System.out.println("input a number ");
            i = sc.nextInt();
            System.out.print("here is number ");
            System.out.println(i);
        } while (i>=0);
        System.out.println("end the loop");



        //break and continue
        int j = 0;
        while(true){
            if (j==3){
                j++;
                continue;
            }
            if (j==6){
                j++;
                continue;
            }
            if (j==2){
                j++;
                continue;
            }
            System.out.println(j);
            j++;
            if(j>10){
                break;
            }
        }
    }
}
