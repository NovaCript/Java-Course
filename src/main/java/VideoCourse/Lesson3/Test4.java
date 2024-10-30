package VideoCourse.Lesson3;

import java.sql.SQLData;

public class Test4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        System.out.println(c - b);

        int a1 = 10;
        int a2 = 3;
        int a3 = 3;
        System.out.println(a1 / a2);
        float f1 = a1 / a2;
        double d1 = a1 / a2;
        System.out.println(f1);
        System.out.println(d1);

        int celayaChast = a1 / a2;
        int octatok = a1 % a2;
        System.out.print(celayaChast);
        System.out.print(".");
        System.out.println(octatok);

        int unaty = 7;
        System.out.println(++unaty);
        System.out.println(--unaty);

        System.out.print("a2 до унарной операции ");
        System.out.println(a2);
        int postfix = a1 - a2++;
        System.out.print("Сначала у нас произошло вычитание 10 - a2, а затем a2++, как результат: ");
        System.out.println(postfix);
        System.out.print("a2 после унарной операции ");
        System.out.println(a2);

        System.out.print("a3 до унарной операции ");
        System.out.println(a3);
        int prefix = a1 - ++a3;
        System.out.print("Сначала у нас произошло ++a3, а затем вычитание 10 - a3, как результат: ");
        System.out.println(prefix);
        System.out.print("a3 после унарной операции ");
        System.out.println(a3);

    }
}
