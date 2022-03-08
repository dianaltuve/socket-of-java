/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seniat.services;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 *
 * @author daltuve
 */
public class ServidorHilo extends Thread{
    
    private final DataInputStream in;
    private final DataOutputStream out;
    private final String nombreCliente;

    public ServidorHilo(DataInputStream in, DataOutputStream out, String nombreCliente) {
        this.in = in;
        this.out = out;
        this.nombreCliente = nombreCliente;
    }
    
    @Override
    public void run(){
        
    }   
}