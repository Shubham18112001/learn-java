import java.util.Arrays;


public class diff {
    public static void main(String[] args){
        //String name ="Aman and Ram";
        //System.out.println(name.substring(3, 6));
        //int age = 30;
        //int physics = 45;
        //int chemistry = 40;
        //int mathematics = 90;

        int[] marks = new int[3];
        marks[0] = 45;
        marks[1] = 40;
        marks[2] = 90;
        //System.out.println(marks[2]);

        //length
        //System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);


    }
}
