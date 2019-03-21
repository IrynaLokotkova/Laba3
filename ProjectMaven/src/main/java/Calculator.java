import java.util.Scanner;

public class Calculator {
    public double sum(double A, double B){
        return A+B;
    }

    public double substr(double A, double B){
        return A-B;
    }

    public double mult(double A, double B){
        return A*B;
    }

    public double dif(double A, double B){
        return A/B;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Input number A");
        double A = scanner.nextInt();
        System.out.println("Choose operation +, -, /, *");
        String op = new String();
        op = scanner.next();
        System.out.println("Input number B");
        double B = scanner.nextInt();
        if ("+".equals(op)) {
            System.out.println(A + "+" + B +"="+ calculator.sum(A, B));

        } else if ("-".equals(op))
            System.out.println(A + "-" + B +"="+ calculator.substr(A, B));

         else if ("/".equals(op))
            System.out.println(A + "/" + B +"="+ calculator.dif(A, B));

         else if ("*".equals(op))
            System.out.println(A + "*" + B +"=" + calculator.mult(A, B));
         else
            System.out.println("wrong input");
    }
}
