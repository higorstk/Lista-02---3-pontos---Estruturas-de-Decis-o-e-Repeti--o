//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
//R$ 5.50 por diária, se o número de diárias for maior que 15;
//R$ 6.00 por diária, se o número de diárias for igual a 15;
//R$ 8.00 por diária, se o número de diárias for menor que 15.
//* Data: 21/05/2023


import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável  
double hospedagem;
 double diaria;
  double valor;
//Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite a quantidade de diárias :");
diaria = teclado.nextDouble();
teclado.close();

hospedagem = (diaria * 60);

if (diaria > 15){
    valor =(diaria * 5.50) + hospedagem;
    System.out.println("Valor da hospedagem é :" + valor);
}
    if (diaria == 15){
        valor = (diaria * 6) + hospedagem;
        System.out.println("Valor da hospedagem é :" + valor);
    }
        if (diaria < 15){
            valor = (diaria * 8) + hospedagem;
            System.out.println("Valor da hospedagem é :" + valor);
        }
  }
   }
  
 
