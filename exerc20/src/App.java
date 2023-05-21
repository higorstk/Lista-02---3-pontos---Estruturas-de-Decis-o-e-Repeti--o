//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Escreva um programa que, dada a carga máxima de um elevador e
//a quantidade máxima de pessoas digitadas pelo usuário, leia o
//peso de cada pessoa, também digitada pelo usuário, que entra
//no elevador até que a carga máxima seja atingida ou o número
//máximo de pessoas seja atingido (utilize do / while)
//* Data: 21/05/2023


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a carga máxima do elevador: ");
        double cargamaxima = scanner.nextDouble();
        
        System.out.print("Digite a quantidade máxima de pessoas: ");
        int maximopessoas = scanner.nextInt();
        
        double cargaAtual = 0;
        int pessoas = 0;
        do {
            System.out.print("Digite o peso da pessoa: ");
            double peso = scanner.nextDouble();
            cargaAtual += peso;
            pessoas++;
        } while (cargaAtual < cargamaxima && pessoas < maximopessoas);
        
        System.out.println("O elevador atingiu a carga máxima ou o número máximo de pessoas foi atingido.");
        System.out.println("Carga atual: " + cargaAtual + " kg");
        System.out.println("Quantidade de pessoas: " + pessoas);
        
        scanner.close();
    }

}