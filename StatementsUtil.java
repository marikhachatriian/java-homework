public class StatementsUtil {
    public static void main(String[] args) {
    }

    public static boolean checkEvenOdd(int x) {
        return x % 2 == 0;
    }

    public static boolean checkPositiveNegative(int x) {
        return x > 0;
    }

    public static boolean checkRange(int x) {
        return (x < 8 && x > 5) || (x > 15);
    }

    public static boolean checkDivisible(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    public static boolean checkSecondDigit(int num) {
        int secondDigit = (num / 10) % 10;
        return secondDigit == 7;
    }

    public static boolean checkCircle(double x, double y) {
        return (x * x + y * y) <= 25;
    }

    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void printNumbers() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    public static void printFirstDigit(int num) {
        int temp = num;
        while (temp >= 10) {
            temp /= 10;
        }
        System.out.println(temp);
    }

    public static void loopExample() {
        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    public static void printSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int sumDivisibleByFive(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static long productOfEvenDigits(int n) {
        long product = 1;
        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i >= 10 && i <= 99) {
                product *= i;
                found = true;
            }
        }
        return found ? product : 0;
    }

    public static double averageMinMax(int n) {
        if (n <= 0) return 0;
        int min = 1;
        int max = n;
        return (min + max) / 2.0;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        int temp = num < 0 ? -num : num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
