
public class p12loops {
     public static void main(String[] args){
    

    //for loop increment
    System.out.println("counting from 1 to 20  ");
    for (int i = 1;i <=20;i++){
        System.out.println(i);
    }

    //for loop decrement
    System.out.println("counting from 50 to 20  ");
    for (int i = 50;i >=20;i--){
        System.out.println(i);
    }

    //while loops decrement
    System.out.println("counting from 20 to 0 ");
    int j = 20;
    while (j>=0){
        System.out.println(j);
        j--;    //k=k-1
    }

    //while loops increment
    System.out.println("counting from 1 to 20 ");
    int k = 1;
    while (k<=20){
        System.out.println(k);
        k=k+1;  //k++
    }

    //do while loop decrement
    System.out.println("counting from 20 to 1 ");
    int l = 20;
    do {
        System.out.println(l);
        l--;
    } while (l>=1);

    //do while loop increment
    System.out.println("counting from 0 to 20 ");
    int m = 0;
    do {
        System.out.println(m);
        m++;
    } while (m<=20);

    
}
}