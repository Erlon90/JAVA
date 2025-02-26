
package com.mycompany.aula20250226;

import java.util.Scanner;


public class Aula20250226 {

    public static void main(String[] args) 
    {
       int z = 1;
       Scanner scan = new Scanner(System.in);
       Conta ct =  new Conta();
       
       ct.numero = 1;
       
       ct.nome = "Erlon Felipe";
       
       ct.limite = 1000.0;
       
       ct.saldo = 1500.0;
       
       double saque = 0;
       double deposito = 0;

        do 
        {

         System.out.println("Menu");   
         
         System.out.println("Escolha o que deseja fazer: \n" + "1-Sacar \n2-Depositar \n0-Sair");
         
         System.out.printf("Digite o numero referente ao que voce quer fazer: ");
         
         int opr = scan.nextInt();
         
         System.out.printf("o Numero selecionado foi: %d \n\n",opr);
         
         if(opr == 1)
         {
           System.out.println("A opção selecionada foi o Saque\n");
           
           System.out.printf("O seu saldo é de: %f\n", ct.saldo);
           
            System.out.printf("Seu limite é de %f \n Quanto deseja sacar?" , ct.limite);
            
            saque = scan.nextDouble();
           
            ct.Sacar(saque);
           
         }
         else if(opr == 2)
         {
            System.out.println("A opção selecionada foi o depósito \n");
            System.out.printf("O seu saldo é de: %f\n", ct.saldo);
        
            System.out.println("Quanto deseja depositar?");
        
            deposito =  scan.nextDouble();
            
            ct.Depositar(deposito);
            
         }
         else if(opr == 0)
         {
           System.out.println("Saindo....");  
           z = 0;
         }
         else
         {
             System.out.println("O número digitado não está dentro do escopo disponível");
         }
        
        } while (z != 0);
    }
}
