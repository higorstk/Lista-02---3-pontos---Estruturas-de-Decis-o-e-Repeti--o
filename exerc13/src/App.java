//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma.
//* Data: 21/05/2023


import java.util.Scanner;
class App{
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int soma = 0;
    int i;
    i = 1;
System.out.println("O valor total da soma de 1 a 100 é:");
while(i <= 100){
     soma = i + soma;
    i = i + 1;
    teclado.close();
  }
  System.out.print(+soma);
 }
}