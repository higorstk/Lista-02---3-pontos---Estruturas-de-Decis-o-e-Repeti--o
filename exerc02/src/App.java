//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa: Construa um programa que receba como entrada três valores A,B,C e os imprima em ordem crescente.
//* Data: 21/05/2023

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //Passo1: Mostrar variavel
        //Construa um programa que receba como entrada três valores A, B
        //e C e os imprima em ordem crescente.
        
        double valorA;
        double valorB;
        double valorC;
        //Passo2: Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor (A);");
        valorA = teclado.nextDouble();
        System.out.println("Digite o valor (B):");
        valorB = teclado.nextDouble();
        System.out.println("Digite o valor (C):");
        valorC = teclado.nextDouble();

        if (valorA <= valorB && valorA <= valorC) {
            if (valorB <= valorC) {
                System.out.println("O valor em ordem crescente é: " + valorA + ", " + valorB + ", " + valorC);
            } else {
                System.out.println("O valor em ordem crescente é: " + valorA + ", " + valorC + ", " + valorB);
            }
        } else if (valorB <= valorA && valorB <= valorC) {
            if (valorA <= valorC) {
                System.out.println("O valor em ordem crescente é: " + valorB + ", " + valorA + ", " + valorC);
            } else {
                System.out.println("O valor em ordem crescente é: " + valorB + ", " + valorC + ", " + valorA);
            }
        } else {
            if (valorA <= valorB) {
                System.out.println("O valor em ordem crescente é: " + valorC + ", " + valorA + ", " + valorB);
            } else {
                System.out.println("O valor em ordem crescente é: " + valorC + ", " + valorB + ", " + valorA);
            }
        }
    }
}

        

