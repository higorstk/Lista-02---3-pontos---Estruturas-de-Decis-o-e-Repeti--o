//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que determine o fatorial de um número. Para este problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N (N!) é definido conforme a seguir (utilize for):
//* Data: 21/05/2023


import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número:"); 
        int numero = teclado.nextInt();
        int fatorial = numero;
        int i;
        if (numero == 0) {
            System.out.print ("O fatorial é 1:");
       }
        for (i = numero; i != 1; i--){
         fatorial = fatorial * (i-1);
        }
        System.out.print(fatorial);      
             
    }
}