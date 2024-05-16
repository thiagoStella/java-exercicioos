//Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Número: ");
        float num = scanner.nextFloat();
        if (num < 0) {
            System.out.println("O número é negativo");
        }
        else if (num > 0) {
            System.out.println("O número é positivo");
        }
        else {
                System.out.println("O número é zero ou invalido");
        }

    }
}

