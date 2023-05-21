//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno que varia de 0a 100. As faixas da correlação são mostradas abaixo:
//Nota Conceito
//0 a 49 Insuficiente
//50 a 64 Regular
//65 a 84 Bom
//85 100 Ótimo
//* Data: 21/05/2023



import java.util.Scanner;

class Main{
public static void main(String[] args){
//Passo1:Mostrar variável

double nota;
  
//Passo2:Entrada de dados
  
Scanner teclado = new Scanner(System.in);
  System.out.println("Digite uma nota de 0 a 100:");
nota = teclado.nextDouble();

if(nota >=0 && nota <= 49){
    System.out.println("Nota coiceito está:INSUFICIENTE");
}else
if(nota <= 64){
    System.out.println("Nota coiceito está:REGULAR");
 }else
 if(nota <= 84){
    System.out.println("Nota coiceito está:BOM");
 }else
 if(nota <= 100){
    System.out.println("Nota coiceito está:ÓTIMO");
 }
    }
 }