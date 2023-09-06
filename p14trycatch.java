public class p14trycatch {
    public static void main(String[] args) {
        int[] values = {1,2,3,4};
        try {
            System.out.println(values[7]);
        } catch (Exception exception) {
            // Ignore exception and continue with previous exception message
        }
        System.out.println("name is aman");
    }
    
}
