/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appEmpleadosHerencias;

/**
 *
 * @author Pedro Martinez <perele1982@gmail.com>
 * 09-feb-2021 19:07:34
 */
public class EmpFijo extends Empleado {

   //Constructor
   public EmpFijo(String nombre, String apellidos, int edad, String id) {
      super(nombre, apellidos, edad, id);
   }

   //Sueldo empleado fijo
   public double importeNomina() {
      return 1500.0;
   }
}
