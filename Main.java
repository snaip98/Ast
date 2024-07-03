//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = inputNumbers("a");
        int b = inputNumbers("b");
        compareNumbers(a,b);
        addNumbers(a,b);
        subtractNumbers(a,b);
        divideNumbers(a,b);
        multiplyNumbers(a,b);
    }
    public static int inputNumbers(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число " + name + ";");
        return scanner.nextInt();
    }
    public static void compareNumbers (int a, int b)
    {
        if (a > b) {
            System.out.println("Результат сравнения: "+"a > b");
        }
        else if (a < b) {
            System.out.println("Результат сравнения: "+"a < b");
        }
        else {
            System.out.println("Результат сравнения: "+"a = b");
        }
    }
    public static void addNumbers(int a,int b){
        System.out.println("Сумма чисел = "+(a+b));
    }
    public static void subtractNumbers(int a,int b){
        System.out.println("Разность чисел = "+(a-b));
    }
    public static void divideNumbers(int a,int b){
        if(b==0){
            System.out.println("На ноль делить нельзя");
        }
        else {
            double div = (double) a/b;
            System.out.println("Частное чисел = "+div);}
    }
    public static void multiplyNumbers(int a,int b){
        System.out.println("Произведение чисел = "+(a*b));
    }

}