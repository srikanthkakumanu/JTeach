public class Operators {
    public static void main(String[] args) {
        
        // Unary Operators
        
        // Bitwise Operators

        // Bitwise logical operators

        // Bitwise Operator compound assignments
        int x = 0, y = 0;
        x = x >> 4;
        x >>= 4;
        x = x | y;
        x |= y;

        // Relational Operators

        // boolean operators
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;


        // Short-circuit logical operators
        int c1 = 0, e1 = 0, d1 = 0;
        if(c1==1 & e1++ < 100) d1 = 100;

        // ternary operators
    }
}
