package com.server.classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.server.interfaces.ICalculator;

public class Calculator extends UnicastRemoteObject implements ICalculator{

    public Calculator() throws RemoteException {
    }

    public double addition(double x, double y) throws RemoteException {
        return x + y;
    }

    public double subtraction(double x, double y) throws RemoteException {
        return x - y;
    }

    public double multiplication(double x, double y) throws RemoteException {
        return x*y;
    }

    public double division(double x, double y) throws RemoteException {
        return x/y;
    }
    
}
