//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que imprima todos os números pares de 1 a 100.
//* Data: 21/05/2023


    import java.util.Scanner;
class App{
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        int i = 0;
        System.out.println("Todos os números pares de 1 a 100 são:");
        while (i <=100){
            System.out.print(+i+ ",");
            i = i + 2;
            teclado.close();
        }
        
    }
}
