public class App {
    public static void main(String[] args) throws Exception {
        int x,y = 0;
        x = 144;
        y = 999;
        double division;
        division = (double) x / (double) y; 
        

        System.out.printf("x + y = %d%n",x+y);
        System.out.printf("x - y = %d%n",x-y);
        System.out.printf( "x / y = %.8f%n",+ division);
        System.out.printf("x * y = %d%n",x*y);

    }
}
