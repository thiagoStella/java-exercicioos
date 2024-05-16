// Crie um algoritmo em Java que mostre na tela todos os múltiplos de 3 entre os números 0 e 30 usando a estrutura “do while”.
public class Main {
    public static void main(String[] args) {

        int num = 0;
        do {
            if (num % 3 == 0) {
                System.out.println(num);
            }
            num++;
        }while (num <= 30);
    }
}