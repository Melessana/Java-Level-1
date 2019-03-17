package gb_java1_lesson1;

public class Main {
//Задание 1.
    public static void main(String[] args) {
	// Задание 2.
        byte b = 34;
        short s = 25;
        int i = 565;
        long l = 394839489384L;
        float f = 203.4567232132441f;
        double d = 203.4567232132441;
        char tree = '\u2F4A', fire = '\u2F55', earth = '\u2F1F', water = '\u2F54', metal = '\u2FA6';
        boolean val = false;
        String str = "Тип данных String";
        System.out.println(b + " - тип данных byte");
        System.out.println(s + " - тип данных short");
        System.out.println(i + " - тип данных int");
        System.out.println(l + " - тип данных long");
        System.out.println(f + " - тип данных float");
        System.out.println(d + " - тип данных double");
        System.out.println(tree + " " + fire + " " + earth + " " + metal + " " + water + " - тип данных char");
        System.out.println(val + " - тип данных boolean");
        System.out.println(str);
//        Задание 3.
        System.out.println("Результат Задания №3: " + quest3(5,11,10,2));
//        Задание 4.
        System.out.println("Результат Задания №4: " + quest4(8, 6));
//        Задание 5.
        System.out.print("Результат задания №5: ");
        quest5(-5);
//        Задание 6.
        System.out.println("Результат Задания №6: " + quest6(-347));
//        Задание 7.
        quest7("Товарищ Геннадий");

        System.out.println("Результат Задания №8: " + quest8(1992));

    }
//    Задание 3.

    public static int quest3( int a, int b, int c, int d2) {
        return (a*(b+c/d2));
    }
//Задание 4
    public static boolean quest4( int a4, int b4) {
        if (((a4+b4) >= 10) && ((a4+b4) <= 20)) {
            return (true);
        }
        else return (false);
    }
//    Задание 5
    public static void quest5( int a5) {
        if (a5 < 0) {
          System.out.println ("Число " + a5 + " отрицательное");
        } else System.out.println ("Число " + a5 + " положительное");
    }
//     Задание 6
        public static boolean quest6 (int a6) {
            if (a6 < 0) {
                return(true);
            } else return(false);
    }
//    Задание 7
        public static void quest7 (String str7) {
        System.out.println ("Результат Задания №7: Привет, " + str7 + "!");
        }

//    Задание 8
        public static String quest8 (int a8) {

        if (((a8%4 == 0) && (Math.abs(a8)<100)) || (Math.abs(a8)%400 == 0) || ((a8%4 == 0) && (Math.abs(a8)>100) && (a8%100 !=0) )){
            return (a8 + " год является високосным");
        }
        else {
            return (a8 + " год не является високосным");
        }
        }
}
