import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Введите три числа");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a % 5 == 0){
            System.out.print("a=" + a + " ");
        }
        if (b % 5 == 0){
            System.out.print("b=" + b + " ");
        }
        if (c % 5 == 0){
            System.out.print("c=" + c + " ");
        }
        if (a % 5 != 0 && b % 5 != 0 && c % 5 != 0) {
            System.out.print("Нет значений, кратных 5");
        }
        System.out.println();
        int splitInteger = a/b;
        double split = (double) a / (double) b;
        double roundUp = Math.ceil((double) a/b);
        double roundLow = Math.floor((double) a/b);
        double roundMath = Math.round((double) a/b);
        int remainder = b % c;
        int min = Math.min(a,b);
        int max = Math.max(b,c);
        System.out.println(
                "Результат целочисленного деления a на b: " + splitInteger + "\n" +
                "Результат деления a на b: " + split + "\n" +
                "Результат деления a на b с округлением в большую сторону: " + (int)roundUp + "\n" +
                "Результат деления a на b с округлением в меньшую сторону: " + (int)roundLow + "\n" +
                "Результат деления a на b с округлением по математическим правилам: " + (int)roundMath + "\n" +
                "Остаток от деления b на c: " + remainder + "\n" +
                "Наименьшее значение из a и b: " + min + "\n" +
                "Наибольшее значение из b и c: " + max);
        in.close();
    }
}