public class p7 {
    public static void main(String[] args){
    //operators
    int a = 121;
    int b = 2321;
    int add = a+b; 
    System.out.println(add);    //print 3


    int c = 10324;
    int d = 20423;
    int sub = c-d; 
    System.out.println(sub);    //print -10

    int e = 12;
    int f = 4;
    int mul = e*f; 
    System.out.println(mul);    //print 48

    int div1 = e/f;
    System.out.println(div1);   //print 3
    int div2 = f/e;
    System.out.println(div2);   //print 0

    double g = 4;
    double h = 13;
    double div3 = g/h;
    System.out.println(div3);   //print 0.3076923076923077

    
    double div4 = g%h;
    System.out.println(div4);   //print 4.0
    double div5 = h%g;
    System.out.println(div5);   //print 1.0

    int num = 5;
    System.out.println(num);    //print 5
    num = num + 4;
    System.out.println(num);    //print 9
    num++;
    System.out.println(num);    //print 10
    ++num;
    System.out.println(num);    //print 11

    int x = 2;
    System.out.println(x);      //print 2
    System.out.println(x++);    //print 2
    System.out.println(x);      //print 3
    System.out.println(++x);    //print 4
    System.out.println(x);      //print 4

    int y = 10;
    System.out.println(y);      //print 10
    System.out.println(y--);    //print 10
    System.out.println(y);      //print 9
    System.out.println(--y);    //print 8
    System.out.println(y);      //print 8

    System.out.println(Math.max(5, 6)); //max value
    System.out.println(Math.min(5, 6)); //min value 

    //random
    System.out.println(Math.random()); //random value in the form of float value & less than 1
    System.out.println((int)Math.random()); //random value between 0 and 1
    System.out.println((int)(Math.random()*100)); //random value between 0 and 100
    

    



    }
}
