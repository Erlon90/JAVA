
package com.mycompany.aula20250226;


public class Conta 
{
    int numero;
    String nome;
    double limite;
    double saldo;
    
    void Sacar(double valor)
    {
        if(saldo >= 0)
        {
            if(valor <= limite || valor > saldo)
            {
                System.out.printf("Foi sacado de sua conta %f reais\n", valor);
                
                saldo -= valor;
                
                System.out.printf("Saldo restante:%f \n", saldo);
            }
            else
            {
                System.out.println("Não foi possível realizar o saque, tente novamente!");
            }
        }
        else
        {
            System.out.println("Seu saldo é nulo, faça um depósito antes de tentar sacar! ");
        }
              
    }
    
    void Depositar(double valor)
    {

        
        System.out.printf("Foi depositado em sua conta %f reais\n", valor);
        
        saldo += valor;
        
        System.out.printf("Saldo atualizado:%f\n ", saldo);
            
    }
}

