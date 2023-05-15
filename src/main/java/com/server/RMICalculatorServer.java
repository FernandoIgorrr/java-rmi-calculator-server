package com.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.server.classes.Calculator;
import com.server.interfaces.ICalculator;

/**
 * Hello RMI world!
 *
 */
public class RMICalculatorServer 
{
    public static void main( String[] args )
    {
        try{
            ICalculator calc = new Calculator();
            String objName = "rmi://localhost/calc";

            System.out.println("Registrando o objeto no RMIRegistry...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, calc);

            System.out.println("Aguardando clientes...");
        } catch( Exception e){
            e.printStackTrace();
        }
    }
}
