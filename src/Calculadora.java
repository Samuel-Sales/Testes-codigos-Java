import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("==== CALCULADORA ====");
        System.out.println("Selecione a operacao\n" + "1 - Soma\n" + "2 - Subtracao\n" + "3 - Multiplicacao\n" + "4 - Divisao");

        int escolha = entrada.nextInt();
        double numero1 = 0.0;
        double numero2 = 0.0;
        double total = 0.0;

        switch (escolha) {
            case 1:
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();
                total = numero1 + numero2;
                System.out.println("A soma dos numeros eh "+ total);
                break;

            case 2:
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();
                total = numero1 - numero2;
                System.out.println("A subtracao dos numeros eh "+ total);
                break;

            case 3:
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();
                total = numero1 * numero2;
                System.out.println("A multiplicacao dos numeros eh "+ total);
                break;

            case 4:
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();
                total = numero1 / numero2;
                System.out.println("A divisao dos numeros eh "+ total);
                break;

            default:
                System.out.println("Nao existe essa opcao!!");
        }

        entrada.close();
    }
}
