import java.util.Scanner;

public class LessonOneTaskThree {
    public static void main(String[] args) {
        int res=0;       //res результат
        // обьвляем сканнер и запихиваем в него значения
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите первое число");
        int n1 = sc.nextInt();
        System.out.println("Укажите второе число");
        int n2 = sc.nextInt();
        System.out.println("Укажите знак оперции");
        String op=sc.next();
        sc.close();
        //производим вычиления
        switch (op) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                res = n1 / n2;
                break;
        }
        System.out.println(res);
    }
}