/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appBanco;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class DawbankEval4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

        Scanner entrada = new Scanner(System.in);

        CuentabancariaEval4 cuenta;
        
        // Solicitamos IBAN y titular hasta que el IBAN sea valido
        do {
            System.out.print("Introduzca numero IBAN: ");
            String iban = entrada.nextLine();
            System.out.print("Introduzca titular de cuenta: ");
            String titular = entrada.nextLine();
            cuenta = new CuentabancariaEval4 (iban, titular);
            
        } while (!cuenta.getValida());

        //Variables
        int accion;
        double cantidad;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");

            accion = entrada.nextInt();

            switch (accion) {
                case 1:
                    cuenta.imprimirDatos();
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo());
                    break;
                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    cantidad = entrada.nextDouble();
                    if (cuenta.ingresar(cantidad)) {
                        System.out.println("Ingreso: Correcto");
                    } else {
                        System.out.println("Ingreso: Erroneo");
                    }
                    break;
                case 6:
                    System.out.print("Cantidad a retirar:");
                    cantidad = entrada.nextDouble();
                    if (cuenta.retirar(cantidad)) {
                        System.out.println("Retirada: Correcta");
                    } else {
                        System.out.println("Retirada: Erronea");
                    }
                    break;
                case 7:
                    cuenta.imprimirMovimientos();
                    break;
                case 8:
                    System.out.println("Hasta la próxima!!");
                    break;
                default:
                    System.out.println("No existe esa opción");
                    break;
            }
        } while (accion != 8);

        entrada.close();
    }

}
