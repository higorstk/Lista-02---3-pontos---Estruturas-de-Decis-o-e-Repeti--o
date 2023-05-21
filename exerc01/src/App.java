//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que leia dois números A e B e imprima o maior deles.
//* Data: 21/05/2023



import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável  
  double numeroA;
  double numeroB;
//Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite um número (A)");
numeroA = teclado.nextDouble();
System.out.println("Digite um número (B)");
numeroB = teclado.nextDouble();
teclado.close();

if (numeroA > numeroB){
  System.out.println("O númeroA é maior que númeroB:" + numeroA);
}
else{
  if (numeroA < numeroB){
    System.out.println("O númeroA é menor que númeroB:" + numeroB );
}
      if (numeroA == numeroB){
        System.out.println("Os números são iguais");
      }
    
  }
  }
   }
  
 
