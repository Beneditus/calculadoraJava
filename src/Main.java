import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            switch(opcao){
                case 1:
                    somar();
                    break;
                case 2:
                    subtrair();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 0:
                    System.out.println("Saída!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    static int menu(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|----------- Calculadora -----------|");
        System.out.println("|                                   |");
        System.out.println("|            Opção 1 - Soma         |");
        System.out.println("|            Opção 2 - Subtração    |");
        System.out.println("|            Opção 3 - Multiplicação|");
        System.out.println("|            Opção 4 - Divisão      |");
        System.out.println("|            Opção 0 - Sair         |");
        System.out.println("|                                   |");
        System.out.println("-------------------------------------");

        System.out.print("Escolha uma das opções: ");

        int opcao = leitor.nextInt();

        return opcao;
    }

    static void somar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = leitor.nextInt();

        System.out.println("Resultado da soma: " + (a + b));
    }

    static void subtrair(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = leitor.nextInt();

        System.out.println("Resultado da subtração: " + (a - b));
    }

    static void multiplicar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = leitor.nextInt();

        System.out.println("Resultado da multiplicação: " + (a * b));
    }

    static void dividir(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = leitor.nextInt();

        if (b != 0) {
            System.out.println("Resultado da divisão: " + (a / b));
        } else {
            System.out.println("Erro: divisão por zero!");
        }
    }
}
