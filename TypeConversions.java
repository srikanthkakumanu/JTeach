public class TypeConversions {
    byte b = 2;
    short s = 4;
    int i = 128;
    long l = 28L;
    char c = 38;
    float f = 31.28f;
    double d = 832.432d;
    boolean bb = false;

    public void automatic() {
        s = b; // signed 2 bytes = signed 1 byte
        i = s; // signed 4 bytes = signed 2 bytes
        l = i; // signed 8 bytes = signed 4 bytes
        // s = c; // signed 2 bytes = unsigned 2 bytes
        i = c; // signed 4 bytes = unsigned 2 bytes
        l = c; // signed 8 bytes = unsigned 2 bytes
        f = i; // signed 4 bytes = signed 4 bytes
        f = l; // signed 4 bytes = signed 8 bytes
        d = l; // signed 8 bytes = signed 8 bytes
        // c = bb; 

    }

    public void narrow() {
        b = (byte) i; // type casting by modulo % if the value is beyond memory range
        c = (char) s; 
        System.out.println(b);
    }

    public void exprPromotion() {
        // int result = (b + s) * c;
        // long result = (b * s) + (i + l);
        // float result = (b * s) + c * (i + l) + f;
        double result =  (b * s) + c * (i + l) + f * d;

    }

    public static void main(String[] args) {
        TypeConversions t = new TypeConversions();
        t.automatic();
        t.narrow();
    }
}
