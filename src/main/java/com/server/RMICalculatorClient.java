package com.server;

import java.rmi.Naming;

import com.server.interfaces.ICalculator;

/**
 * Hello world!
 *
 */
public class RMICalculatorClient 
{
    public static void main( String[] args ) throws Exception{

        String objName = "rmi://localhost:1099/calc";
        ICalculator calc = (ICalculator) Naming.lookup(objName);
        
        System.out.println("O Resultado da soma é: " + calc.addition(5,4));

    }
}
