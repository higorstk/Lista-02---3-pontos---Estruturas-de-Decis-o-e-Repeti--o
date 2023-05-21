//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Um determinado gás duplica seu volume a cada segundo. Dada um volume inicial, em centímetros cúbicos, digitado pelo usuário faça um programa que determine o tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos.(utilize while)
//* Data: 21/05/2023


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o volume inicial do gás (em cm³): ");
        double volume = teclado.nextDouble();
        
        int tempo = 0;
        while (volume <= 1000) {
            volume *= 2;
            tempo++;
        }
        
        System.out.println("O volume do gás ultrapassou 1000 cm³ após " + tempo + " segundos.");
    }
}