public class Variables {

    public static void main(String[] args) {
        groupInteger();
        groupFloatingPoint();
        groupCharacter();
        groupBoolean();
        task13();
        typeCasting();
    }

    public static void groupInteger() {
        System.out.println("--- Group (Integer) ---");

        byte a = 10;
        byte b = 20;
        System.out.println("a = " + a + ", b = " + b);

        short c = 100;
        short d = 200;
        System.out.println("c = " + c + ", d = " + d);

        int e = 1000;
        int f = 2000;
        System.out.println("e = " + e + ", f = " + f);

        long g = 50000L;
        long h = 100000L;
        System.out.println("g = " + g + ", h = " + h);

        System.out.println("Byte Min: " + Byte.MIN_VALUE + ", Max: " + Byte.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE + ", Max: " + Short.MAX_VALUE);
        System.out.println("Integer Min: " + Integer.MIN_VALUE + ", Max: " + Integer.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE + ", Max: " + Long.MAX_VALUE);

        byte binByte = 0b00001010;
        int binInt = 0b00010100;
        System.out.println("Binary byte (0b00001010): " + binByte);
        System.out.println("Binary int (0b00010100): " + binInt);
    }

    public static void groupFloatingPoint() {
        System.out.println("\n--- Group (Floating Point) ---");

        float j = 5.75f;
        float k = 3.14f;
        System.out.println("j = " + j + ", k = " + k);

        double l = 12.345;
        double m = 67.89;
        System.out.println("l = " + l + ", m = " + m);

        System.out.println("Float Min: " + Float.MIN_VALUE + ", Max: " + Float.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE + ", Max: " + Double.MAX_VALUE);

        double d1 = 34.567839023;
        double d2 = 12.345;
        double d3 = 8923.1234857;
        double d4 = 3456.091;

        float f1 = 34.567839023f;
        float f2 = 12.345f;
        float f3 = 8923.1234857f;
        float f4 = 3456.091f;

        System.out.println("Double d1: " + d1 + " | Float f1: " + f1);
    }

    public static void groupCharacter() {
        System.out.println("\n--- Group (Character) ---");

        char n = 'A';
        char o = 'B';
        System.out.println("n = " + n + ", o = " + o);

        char s = 77;
        char w = 109;
        System.out.println("s (77) = " + s + ", w (109) = " + w);

        char k1 = 'K';
        char k2 = 75;
        char k3 = '\u004B';
        System.out.println("K1: " + k1 + ", K2: " + k2 + ", K3: " + k3);
    }

    public static void groupBoolean() {
        System.out.println("\n--- Group (Boolean) ---");

        boolean p = true;
        boolean q = false;
        System.out.println("p = " + p + ", q = " + q);
    }

    public static void task13() {
        System.out.println("\n--- Task 13 ---");
        int year = 2011;
        System.out.print(year);
        System.out.println();
    }

    public static void typeCasting() {
        System.out.println("\n--- Java Type Casting ---");

        int aa = 7;
        long bb = aa;
        System.out.println("aa (int) = " + aa + ", bb (long) = " + bb);

        int myInt = 7;
        double myDouble = myInt;
        System.out.println("myInt = " + myInt + ", myDouble = " + myDouble);
    }
}


