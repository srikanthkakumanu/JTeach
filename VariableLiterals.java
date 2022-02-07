public class VariableLiterals {

    int age;
    String name;
    static boolean isAlive;
    static int maxAge = 100;
    
    static final int MAX_SALARY = 3999;

    static {
        int k = 393;
    }

    public int add(int a, int b) {
        int dd = 39;
        int c = a + b + dd;
        System.out.println(c);
        return c;
    }

    public void print(int a) {
        a += 2;
        System.out.println("aVal = " + a);

        for(int b = 1; b < 10; b++) {

            if(b == 78) {
                int kk = 398;
                System.out.print("\t " + (b + a + kk));
            }

            System.out.print("\t " + b + a);
        }
    }

    public static void main(String[] args) {
        String simpleText = "Hello World";
        String multiLineText = "Hello" + "\n" + "\t \t " + "World" + "\n";
        int bigValue = 38_382_382;
        float bigFloatValue = 38_32.9_3f;
        
        System.out.println(simpleText);
        System.out.println(multiLineText);
        System.out.println(isAlive);

        VariableLiterals vi = new VariableLiterals();
        int aVal = 10;
        System.out.println("aVal = " + aVal);
        vi.print(aVal);
        System.out.println("aVal = " + aVal);
    }
}

