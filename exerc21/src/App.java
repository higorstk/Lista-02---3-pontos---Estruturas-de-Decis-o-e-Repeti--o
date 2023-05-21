//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os números de 1 até o número digitado. (utilize for)
//* Data: 21/05/2023

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = Scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Digite um número positivo.");
        } else {
                for (int i = 1; i <= numero; i++) {
                    int vezes = numero * i;
                    System.out.println(numero + " x " + i + " = " + vezes);
                }
                System.out.println();
            }
        }
    }