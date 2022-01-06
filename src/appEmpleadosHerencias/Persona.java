/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appEmpleadosHerencias;

/**
 *
 * @author Pedro Martinez <perele1982@gmail.com>
 * 08-feb-2021 18:24:24
 */
public class Persona {

   //Variables
   private String nombre;
   private String apellidos;
   private int edad;

   //Constructor
   public Persona(String nombre, String apellidos, int edad) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.edad = edad;
   }

   //Getters y Setters
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellidos() {
      return apellidos;
   }

   public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

}
