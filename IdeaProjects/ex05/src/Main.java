// Crie um algoritmo em Java que peça ao usuário para que se digite um ano (exemplo: 2032).
// Em seguida, o algoritmo deve verificar se o ano informado é ou não bissexto.

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);

            System.out.print("Digite o ano: ");
            int ano = scan.nextInt();


            if (ano % 4 == 0) {
                System.out.println("Ano bissexto");
            }else {
                System.out.println("Não é um ano bissexto");
            }
            scan.close();
        }
    }

