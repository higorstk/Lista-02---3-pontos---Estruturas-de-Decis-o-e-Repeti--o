
//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se épositivo ou negativo.
//* Data: 21/05/2023


import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável  
  double numero;
  double par;
  double ímpar;
//Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite um número inteiro :");
numero = teclado.nextDouble();
teclado.close();

if (numero % 2 == 0){

System.out.println("O número é par");
}else{
    System.out.println("O número é ímpar");
}
if (numero > 0){
    System.out.println("E positivo");
}
else 
if (numero < 0){
    System.out.println("E negativo");
}

  }
   }
