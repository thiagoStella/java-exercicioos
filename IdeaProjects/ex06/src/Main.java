//  Crie um algoritmo em Java que solicita um número inteiro ao usuário.
//  Em seguida, deve-se verificar se o número digitado é ou não é um número primo.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println(("Número menor que 2!"));
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Não é primo");
            }else {
                System.out.println("É primo");
            }
        }


    }
}