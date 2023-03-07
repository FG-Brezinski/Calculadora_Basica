import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção");
        System.out.println(" ");
        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("/ - Divisão");
        System.out.println("* - Multiplicação");
        System.out.println(" ");
        System.out.println("Escolha uma opção:");

        String operador = scanner.next();

        if(operador.equals("-")){
            System.out.println("X:");
            double x = scanner.nextDouble();
            System.out.println("Y:");
            double y = scanner.nextDouble();
            double subtracao = x - y;
            System.out.println(subtracao);
        } else if (operador.equals("+")) {
            System.out.println("X:");
            double x = scanner.nextDouble();
            System.out.println("Y:");
            double y = scanner.nextDouble();
            double soma = x + y;
            System.out.println(soma);
        } else if (operador.equals("/")) {
            System.out.println("X:");
            double x = scanner.nextDouble();
            System.out.println("Y:");
            double y = scanner.nextDouble();
            double divicao = x / y;
            System.out.println(divicao);
        } else if (operador.equals("*")) {
            System.out.println("X:");
            double x = scanner.nextDouble();
            System.out.println("Y:");
            double y = scanner.nextDouble();
            double multiplicacao = x * y;
            System.out.println(multiplicacao);
        } else{
            System.out.println("Operador Invalido!!!");
        }

        scanner.close();

    }
}