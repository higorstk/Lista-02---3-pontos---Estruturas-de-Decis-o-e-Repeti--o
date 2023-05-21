//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que exiba todos os números pares a partir de 0 até que encontre um múltiplo de 7 (utilize do/while)
//* Data: 21/05/2023


import java.util.Scanner;
public class App {
       public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        
         do {
            System.out.print( + num + "," );
            num = num + 1;
            num ++;
            
        }  while (num < 7);
    } 
}