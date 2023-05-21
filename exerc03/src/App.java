//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Elabore um programa que lê dois valores A e B e os escreve com a mensagem: “São múltiplos” ou “Não são múltiplos”.
//* Data: 21/05/2023


import java.util.Scanner;
public class App {
   
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        System.out.print ("Digite um número:");
        double A = teclado.nextDouble();
        System.out.print ("Digite outro número:");
        double B = teclado.nextDouble();

        if(A % B == 0 || B % A == 0 ){
            System.out.print("São múltiplos");
        }
        else {
            System.out.print("Não são múltiplos");
        }

    }
}