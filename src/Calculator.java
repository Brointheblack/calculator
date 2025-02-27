import java.util.Scanner;

public class Calculator {
    public void scanInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выржаение в формате(2 + 2): ");
        String str = sc.nextLine();
        String [] parts = str.split(" ");
        int num_1 = Integer.parseInt(parts[0]);
        int num_2 = Integer.parseInt(parts[2]);
        String oper = parts[1];
        sc.close();
        double result = calcResult(num_1, num_2, oper);
        printResult(result);
    }
    public double calcResult(int num_1, int num_2, String oper){
        switch (oper) {
            case "+":
                return add(num_1, num_2);
            case "-":
                return sub(num_1,num_2);
            case "*":
                return mult(num_1, num_2);
            case "/":
                return div(num_1, num_2);
            default:
                System.out.println("Неизвестная операция");
                return -1;
        }
    }

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int mult(int a, int b){
        return a * b;
    }

    public double div(int a, int b){
        if (b == 0){
            System.out.println("Делить на ноль нельзя! ");
        }
        double res = (double) a / b;
        return res;
    }

    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }

}




 

