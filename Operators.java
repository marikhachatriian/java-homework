public class Operators {
    public static void main(String[] args) {
        arithmeticOperators();
        unaryOperators();
        assignmentOperator();
        relationalOperators();
        additionalTasks();
        bitwiseLogicalOperators();
        shiftOperators();
    }

    public static void arithmeticOperators() {
        int a = 8;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);

        double c = 6.4;
        double d = 0.03;
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);

        int x2 = 2 * ((5 + 3) * 4 - 8);
        int y2 = 2 * 5 + 3 * 4 - 8;
        System.out.println(x2);
        System.out.println(y2);
    }

    public static void unaryOperators() {
        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    public static void assignmentOperator() {
        int x1 = (int)1.0;
        System.out.println(x1);
        short y1 = (short)1921222;
        System.out.println(y1);
        System.out.print(2147483647+1);
        System.out.println();
        long y3 = (x1 = 3);
        System.out.println(y3);
        boolean a = false;
        boolean b = (a = true);
        System.out.println(a);
        System.out.println(b);
    }

    public static void relationalOperators() {
        int x = 10;
        int y = 20;
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
    }

    public static void additionalTasks() {
        float y_t1 = 2.1f;
        System.out.println(y_t1);

        byte x_t2 = 5;
        byte y_t2 = 10;
        int z_t2 = x_t2 + y_t2;
        System.out.println(z_t2);

        short x_t3 = 10;
        short y_t3 = 3;
        int z_t3 = x_t3 * y_t3;
        System.out.println(z_t3);

        long x_t4 = 10;
        int y_t4 = 5;
        y_t4 = (int)(y_t4 * x_t4);
        System.out.println(y_t4);

        int num1 = 10;
        int num2 = 5;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);

        int sum = (1 + 100) * 100 / 2;
        System.out.println(sum);
    }

    public static void bitwiseLogicalOperators() {
        int a = 8;
        int b = 3;
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(true || (a < 4));
        System.out.println((b >= 6) || (++a <= 7));
        System.out.println((a < b) ? a : b);
        System.out.println(b ^ b);
    }

    public static void shiftOperators() {
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        int val = 12;
        System.out.println(val << 3);
        System.out.println(val << 4);
    }
}
