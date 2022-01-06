/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appEmpleadosHerencias;

/**
 *
 * @author Pedro Martinez <perele1982@gmail.com>
 * 09-feb-2021 19:10:34
 */
public class EmpContratado extends Empleado {

   //Variables
   private int diasContrato;

   //Constructor
   public EmpContratado(String nombre, String apellidos, int edad, String id, int diasContrato) {
      super(nombre, apellidos, edad, id);

      this.diasContrato = diasContrato;
   }

   //Get para los dias de contrato
   public int getDiasContrato() {
      return diasContrato;
   }

   //Set para los dias de contrato
   public void setDiasContrato(int diasContrato) {
      this.diasContrato = diasContrato;
   }

   //Sueldo empleado contratado
   public double importeNomina() {
      return 1000.0;
   }
}
