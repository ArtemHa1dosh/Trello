//Ввести с клавиатуры два числа. Определить, что больше, сумма квадратов
//        или квадрат суммы этих чисел. Ответ вывести в виде сообщения.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ЗАДАЧА:");
        System.out.println("Ввести с клавиатуры два числа. Определить, что больше, сумма квадратов или квадрат суммы этих чисел. Ответ вывести в виде сообщения.");

        System.out.println("Введіть два числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(squareOfSum(a,b) < sumOfSquare(a,b)){
            System.out.println("Квадрат суми цих чисел є БІЛЬШИМ");
        }
        else if (squareOfSum(a,b) > sumOfSquare(a,b)){
            System.out.println("Cума квадратів цих чисел є БІЛЬША");
        }


    }

    public static int squareOfSum(int a, int b) {
        //(a+b)^2
       int res;
       res = (a*a) + (2*a*b) + (b*b);
       return res;
    }

    public static int sumOfSquare(int a, int b){
        int res = (a*a)+(b*b);
        return res;
    }

}
