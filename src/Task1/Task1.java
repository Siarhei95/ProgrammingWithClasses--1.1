//Создайте  класс  Test1  двумя переменными. Добавьте  метод  вывода на экран и  методы  изменения этих
//переменных. Добавьте  метод, который  находит сумму значений этих переменных, и  метод,  который  находит
//наибольшее значение из этих двух переменных.

package Task1;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Task1 Object = new Task1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");    //введем любые значения
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        changeValueA(a,b);
        changeValueB(a,b);
        searchSum(a,b);
        searchMax(a,b);
        writeAllMethods(a,b);
    }
    private static double changeValueA(double a, double b){ //изменим переменную a: поменяем местами: a и b и возведем в квадрат.
        double c = a;
        a = b;
        b = c;
        a = Math.pow(a,2);
        return a;
    }
    private static double changeValueB(double a, double b){ //изменим переменную a: поменяем местами: b и a и возведем в квадрат.
        double c = a;
        a = b;
        b = c;
        b = Math.pow(b,2);
        return b;
    }
    private static double searchSum(double a, double b){
        double sum = a + b;
        return sum;
    }
    private static double searchMax(double a, double b){
        double max = 0;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }
    private static void writeAllMethods(double a, double b){
        System.out.println("Modified a: " + changeValueA(a,b));  //a->b^2
        System.out.println("Modified b: " + changeValueB(a,b));  //b->a^2
        System.out.println("Max (a and b): " + searchMax(a,b));  //max из a и b
        System.out.println("Sum (a and b): " + searchSum(a,b));  //sum из a и b
    }
}
