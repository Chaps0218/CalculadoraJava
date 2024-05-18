package com.mycompany.calculadoraapp.Vistas.Conexion;

import com.dneonline.Calculator;
import com.dneonline.CalculatorSoap;

public class Conexion {
    
    private Calculator servicio;
    private CalculatorSoap calculadora;
    
    public Conexion(){
        this.servicio = new Calculator();
        this.calculadora = this.servicio.getCalculatorSoap();
    }
    
    public int Suma(int numA, int numB){
        int result = this.calculadora.add(numA, numB);
        return result;
    }
    
    public int Resta(int numA, int numB){
        int result = this.calculadora.subtract(numA, numB);
        return result;
    }
    
    public int Multiplicar(int numA, int numB){
        int result = this.calculadora.multiply(numA, numB);
        return result;
    }
    
    public int Dividir(int numA, int numB){
        int result = this.calculadora.divide(numA, numB);
        return result;
    }
}
