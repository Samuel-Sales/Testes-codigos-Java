import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = entrada.nextLine();

        System.out.println("informe sua idade");
        int idade = entrada.nextInt();

        if (idade < 18) {
            System.out.println("Tu eh menor que 18 porra");
        }else {
            System.out.println("Tu eh maior que 18");
        }

        entrada.close();
    }
}