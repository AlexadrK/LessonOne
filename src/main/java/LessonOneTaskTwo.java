import java.util.Scanner;

public class LessonOneTaskTwo {
    public static void main(String[] agrs) {
        int n ; //указываем количество строк
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String smin = new String();
        String smax = new String();
        String setalon = new String();
        Scanner sin = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        n = Integer.parseInt(sin.nextLine());
        System.out.println("Введите строки символов: ");
        for (int i=0; i<n; i++) {
            //  System.out.println("Введите строку символов: ");
            setalon = sin.nextLine();
            if (setalon.length() >= max) {
                smax = setalon;
                max = setalon.length();
            }
            if (setalon.length() <= min && setalon.length() > 0) {
                smin = setalon;
                min = setalon.length();
            }
        }
        System.out.println();
        if (max > min) {
            System.out.print("Самая длинная строка (последняя для одинаково длинных): ");
            System.out.println(smax);
            System.out.println("Длина строки : " + max + " симв.");
            System.out.println();
            System.out.print("Самая короткая строка (последняя для одинаково коротких): ");
            System.out.println(smin);
            System.out.println("Длина строки : " + min + " симв.");
        } else if (max != 0) {
            System.out.println("По длине строки одинаковы : по " + max + " симв.");
        } else {
            System.out.println("Недостаточно строк для сравнения.");
        }

    }
}