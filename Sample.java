public class Sample {
    public static void main(String[] args) {

        // Dynamic initialization
        // double a = 3.0, b = 5.0;
        // double d = a * a + b * b; // dynamic initialization
        // System.out.println(d);

        // life time of a variable
        int x;
        for(x = 0; x < 3; x++) {
            int y = -2;
            System.out.println("y is : " + y);
            y = 100;
            System.out.println("y is now : " + y);
        }

        // type promotion in expressions
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s); // automatic type promotion in expressions
        System.out.println(result);
    }
}