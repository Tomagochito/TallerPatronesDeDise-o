/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller07.FactoryMethod;

/**
 *
 * @author nathaly
 */
public class ComputadoraFactory extends ProductFactory {

    @Override
    public Producto createProducto() {
        
        return new Computadora();
    }
    
    
}
