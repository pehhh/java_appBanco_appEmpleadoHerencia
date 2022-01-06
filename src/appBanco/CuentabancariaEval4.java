/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appBanco;


/**
 *
 * @author Pedro
 */
public class CuentabancariaEval4 {
     // Constantes 
    private final String iban;
    private final String titular;

    // Variables
    private double saldo;
    private double[] movimientos;
    private int numMovimientos; // Numero de movimientos
    
    // Constantes de clase (static final)
    private static final int MOV_MAXIMOS = 100;
    private static final double SALDO_NEGATIVO = -50.0;
    private static final double NOTIFICAR_HACIENDA = 3000.0;
    
    //Booleana validar cuenta
    private boolean validada;

    // Creamos constructor 
    public CuentabancariaEval4(String iban, String titular) {
        
        // Asignamos iban y titular
        this.iban = iban;
        this.titular = titular;

        // Inicializamos saldo y movimientos
        this.saldo = 0.0;
        this.movimientos = new double[MOV_MAXIMOS];
        this.numMovimientos = 0;

        //Inicializamos validada a true y en caso de error asignamos false
        this.validada=true;
        // Comprobamos la longitud del iban y si es 24 comprobamos que los dos primeros caracteres sean letras y los 22 siguientes números
        if(iban.length()==24){
            //Comprobamos que los dos primeros caracteres son letras,si el iban fuera invalido paramos el bucle
            for (int i=0;i<2 && this.validada==true;i++ ){ 
                //Char c es el caracter i que cogemos del iban
                char c = iban.charAt(i);
                //Comprobamos que char c es una letra y si no fuera una letra cambiamos validada a false
                if(!Character.isLetter(c)) {
                  System.out.println("IBAN incorrecto");
                  this.validada = false;  
                }    
            }
            //Comprobamos que el resto de caracteres son números,si el iban fuera invalido paramos el bucle
            for (int i=2;i<=23 && this.validada==true;i++ ){ 
                //Char c es el caracter i que cogemos del iban
                char c = iban.charAt(i);
               //Comprobamos que char c es un dígito y si no fuera un digito cambiamos validada a false 
                if(!Character.isDigit(c)) {
                  System.out.println("IBAN incorrecto");
                  this.validada = false;  
                }  
            }
        // Si la longitud es distinta de 24 caracteres cambiamos validada a false  
        } else {
            this.validada = false;
            System.out.println("IBAN incorrecto");
        }
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getValida() {
        return validada;
    }

    // Intenta ingresar una cantidad. Devuelve true si pudo hacerlo, false si no pudo
    public boolean ingresar(double cantidad) {
        //Limitamos el ingreso que para que no se pueda ingresar una cantidad negativa
        if (cantidad <= 0) {
            return false;
        }
        //Limitamos que los movimientos no excedan del maximo permitido
        if (numMovimientos >= MOV_MAXIMOS) {
            return false;
        }
        //Si la cantidad excede lo permitido, avisar a hacienda
        if (cantidad > NOTIFICAR_HACIENDA) {
            System.out.println("AVISO: Notificar a hacienda");
        }
        //Sumamos la cantidad ingresada al saldo
        saldo += cantidad;
        // En caso de hacer un ingreso y el saldo siga siendo negativo, imprimimos un aviso
        if (saldo < 0.0) {
            System.out.println("AVISO: Saldo negativo");
        }
        //Asignamos la cantidad a la primera posicion vacia del array movimientos
        movimientos[numMovimientos] = cantidad;
        //Adelantamos una posición para el siguiente movimiento
        numMovimientos++;
        return true;
        
    }

    // Intenta retirar una cantidad. Devuelve true si pudo hacerlo, false si no pudo
    public boolean retirar(double cantidad) {
        //Limitamos la retirada para que no se pueda ingresar una cantidad negativa
        if (cantidad <= 0) {
            return false;
        }
        //Limitamos que el saldo no pueda quedar por debajo de -50 y los movimientos no excedan el maximo permitido
        if ((saldo - cantidad < SALDO_NEGATIVO) || (numMovimientos >= MOV_MAXIMOS)) {
            return false;
        }
        // Si se retira una cantidad por encima de 300, avisamos a hacienda
        if (-cantidad > NOTIFICAR_HACIENDA) {
            System.out.println("AVISO: Notificar a hacienda");
        }
        //Restamos la cantidad retirada al saldo
        saldo -= cantidad;
        // En caso de hacer una retirada y el saldo se quede en negativo, imprimimos un aviso
        if (saldo < 0.0) {
            System.out.println("AVISO: Saldo negativo");
        }
        //Asignamos la cantidad a la primera posicion vacia del array movimientos
        movimientos[numMovimientos] = -cantidad;
        //Adelantamos una posición para el siguiente movimiento
        numMovimientos++;
        return true;
        
    }
    // Imprimimos la informacion de la cuenta
    public void imprimir() {
        imprimirDatos();
        imprimirMovimientos();
    }

    // Imprimimos los datos de la cuenta
    public void imprimirDatos() {
        System.out.println("IBAN: " + getIban() + ", Titular: " + getTitular() + ", Saldo: " + getSaldo());
    }

    // Imprimimos los movimientos
    public void imprimirMovimientos() {
        System.out.println("Movimientos: " + numMovimientos);
        for (int i = 0; i < numMovimientos; i++) {
            System.out.println("M"+(i + 1)+": " + movimientos[i]);
        }
    }
}

    

