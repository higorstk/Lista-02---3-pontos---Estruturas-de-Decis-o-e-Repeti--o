
//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que solicite ao usuário que digite um número
//até que ele digite um número menor que 0 (utilize while)
//* Data: 21/05/2023


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
        }
        
        System.out.println("O número digitado é menor que 0.");
    }
}