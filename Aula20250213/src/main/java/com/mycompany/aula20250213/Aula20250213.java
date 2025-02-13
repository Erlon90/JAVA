/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula20250213;

import java.util.Scanner;

public class Aula20250213 {

    public static void main(String[] args) 
    {
        int z = 1;
        
        do 
        {
            int x1 = 0;
            int x2 = 0;
         System.out.println("CALCULADORA");   
         
         System.out.println("Escolha o tipo de operação a ser feito: \n"
                 + "1-Adição \n2-Subtração \n3-Multiplicação \n4-Divisão\n0-Sair"); 
         
         
         Scanner scanner = new Scanner(System.in);
         int opr;
         System.out.printf("Digite o numero referente ao tipo de operação que voce quer fazer: ");
         opr = scanner.nextInt();
         System.out.printf("o Numero selecionado foi: %d \n\n",opr);
         
         if(opr == 1)
         {
           System.out.println("A opção selecionada foi a Adição\n");
           System.out.printf("Digite o primeiro numero: \n");
           x1 = scanner.nextInt();
           System.out.printf("Digite o segundo numero: \n");
           x2 = scanner.nextInt();
         }
         else if(opr == 2)
         {
             System.out.println("A opção selecionada foi a Subtração\n");
         }
         else if(opr == 3)
         {
             System.out.println("A opção selecionada foi a Multiplicação\n");
         }
         else if(opr == 4)
         {
             System.out.println("A opção selecionada foi a Divisão\n");
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
