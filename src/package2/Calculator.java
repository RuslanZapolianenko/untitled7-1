package package2;

class UserException extends Exception {
    public void method1() {
        System.out.println("Мое Исключение! - method1()");
    }
    public void method2() {
        System.out.println("Мое Исключение! - method2()");
    }

}




public class Calculator {
    private static double number1;
    private static double number2;

    Calculator(double n1, double n2) {
        number1 = n1;
        number2 = n2;
    }

    public void print() {
        System.out.println(number1 + " * " + number2 + " = " + met1());
        System.out.println(number1 + " + " + number2 + " = " + met2());
        System.out.println(number1 + " - " + number2 + " = " + met3());
        System.out.println(number2 + " - " + number1 + " = " + met4());
        met5();
    }

    public static double met1() {
        return number1 * number2;
    }

    public static double met2() {
        return number1 + number2;
    }

    public static double met3() {
        return number1 - number2;
    }

    public static double met4() {
        return number2 - number1;
    }

    public static double met5() {
        if (number1 == 0) {
            return delNul();
        } else if (number2 == 0) {
            return delNul();
        } else {
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            met6();
            return (number1 / number2);
        }
    }

    public static double met6() {
        System.out.println(number2 + " / " + number1 + " = " + (number2 / number1));
        return (number2 / number1);
    }

    public static double delNul() {
        System.out.println("Деление на ноль не возможно");
        return 0;
    }


    public static double met7() {
        double result = 0;

        try {
            result = number1 / number2;
            if (result == Double.POSITIVE_INFINITY ||
                    result == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
        } catch (ArithmeticException q) {
            System.out.println("на ноль делить нельзя.");
        }

        System.out.println(result);
        return result;
    }

    public static double met8(int a, int b) {
        int rezolt = a / b;
        System.out.println(rezolt);
        return rezolt;
    }

    public static void met9(int a) {

        if (a == 2){
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException q) {
                System.out.println("Тест ошибка");
            }
        } else {
            System.out.println("rezolt a = " + a );
        }
    }

    public static int met10(int a,int c,int k) {

        int b = a + 2;

        try { if(c == 0)
            throw new UserException();
            try { if(k == 0)
                throw new UserException();
            } catch (UserException e) {
                System.out.println("Catch 1: " + e.getMessage());
                e.method2();
            }
        } catch (UserException e) {
            System.out.println("Обработка исключения.");
            e.method1();
        }
        System.out.println("return b = " + b);
        return b;
    }
}

class Main {

    public static void main(String[] args) {
        Calculator qwety = new Calculator(0,2);
        // qwety.met7();
        //  qwety.met8(0,3);
        //  qwety.met9(3);
        qwety.met10(0,2,0);

    }
}

