//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa: Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final conforme condições a seguir:
//Venda a Vista - desconto de 10%
//Venda a Prazo 30 dias - desconto de 5%
//Venda a Prazo 60 dias - mesmo preço
//Venda a Prazo 90 dias - acréscimo de 5%
//Venda com cartão de débito - desconto de 8%
//Venda com cartão de crédito - desconto de 7%
//* Data: 21/05/2023



import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável  
  double valordavenda;
  int formadepagamento;
  double valortotal;
  double valoravista;
  double prazo30;
  double prazo60;
  double prazo90;
  double cartaodebito;
  double cartaocredito;
 
//Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o valor da venda:");
valordavenda = teclado.nextDouble();
System.out.println("\nEscolha a forma de pagamento:");
System.out.println("Digite (1) para: Valor a vista com desconto de 10%.");
System.out.println("Digite (2) para: Valor a prazo de 30 dias com desconto de 5%.");
System.out.println("Digite (3) para: Valor a prazo de 60 dias com mesmo valor.");
System.out.println("Digite (4) para: Valor a prazo de 90 dias com acréscimo de 5%.");
System.out.println("Digite (5) para: Valor com cartão de débito com desconto de 8%.");
System.out.println("Digite (6) para: Valor com cartão de crédito com desconto de 7%.");
System.out.println("Qual será a forma de pagamento ?");
formadepagamento = teclado.nextInt();


switch (formadepagamento){

 case 1:
    valortotal = valordavenda * 0.10;
    valoravista = valordavenda - valortotal;
    System.out.println("\nO valor a viste é R$:" + valoravista);
    break;
 case 2:
    valortotal = valordavenda  * 0.05;
    prazo30 = valordavenda - valortotal;
    System.out.println("\nO valor a prazo 30 é R$:" + prazo30);
    break;
 case 3:
    valortotal = valordavenda;
    prazo60 = valordavenda - valortotal;
    System.out.println("\nO valor a prazo 60 é R$:" + prazo60);
    break;
 case 4:
    valortotal = valordavenda * 0.05;
    prazo90 = valordavenda + valortotal;
    System.out.println("\nO valor a prazo 90 é R$:" + prazo90);
    break;
case 5:
    valortotal = valordavenda * 0.08;
    cartaodebito = valordavenda - valortotal;
    System.out.println("\nO valor no cartão de débito é R$:" + cartaodebito);
    break;
case 6:
    valortotal = valordavenda * 0.07;
    cartaocredito = valordavenda - valortotal;
    System.out.println("\nO valor no cartão de crédito é R$:" + cartaocredito); 
    break;

    default:
    System.out.println("\nA opção é invalida");
  }
  teclado.close();
 }
}

 
