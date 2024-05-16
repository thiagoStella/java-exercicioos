// 1. Crie um algoritmo em Java que solicita três números decimais ao usuário.
// Em seguida, a média destes números é calculada e mostrada na tela para o usuário.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Primeiro Número: ");
        float n1 = scanner.nextFloat();
        System.out.print("Digite o Segundo Número: ");
        float n2 = scanner.nextFloat();
        System.out.print("Digite o Terceiro Número: ");
        float n3 = scanner.nextFloat();

        float media = (n1 +n2 + n3)/3;

        System.out.println("A média dos números é: " + media);
    }
}


