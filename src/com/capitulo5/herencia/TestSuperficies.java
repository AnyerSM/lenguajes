/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo5.herencia;

/**
 *
 * @author T-301
 */
public class TestSuperficies {
 public static void main(String args[]) throws Exception{
     for(Superficies s:GenerarSuperficies.obtenerFiguras()){
             System.out.println( s.calcularArea());
     }
 }   
}
