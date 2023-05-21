//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que imprima os múltiplos negativos de 7,superiores a -1000. (utilize do / while)
//* Data: 21/05/2023


import java.util.Scanner;
public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print(+ num + "," );
            num = num - 7;
            
        }  while (num >= -1000);
        teclado.close();
    } 
}