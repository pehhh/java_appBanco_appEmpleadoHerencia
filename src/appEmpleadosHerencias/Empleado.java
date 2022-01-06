/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appEmpleadosHerencias;

/**
 *
 * @author Pedro Martinez <perele1982@gmail.com>
 * 08-feb-2021 19:04:34
 */
public abstract class Empleado extends Persona {

   //Variables
   private String id;

   //Constructor
   public Empleado(String nombre, String apellidos, int edad, String id) {
      super(nombre, apellidos, edad);

      this.id = id;
   }

   public String getId() {
      return id;
   }

   public abstract double importeNomina();

}
