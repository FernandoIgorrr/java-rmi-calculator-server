package com.server.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator  extends Remote{
    
    double addition(double x, double y)                  throws RemoteException;
    double subtraction(double x, double y)            throws RemoteException;
    double multiplication(double x, double y)        throws RemoteException;
    double division(double x, double y)                   throws RemoteException;

}
