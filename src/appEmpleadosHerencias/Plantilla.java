/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appEmpleadosHerencias;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pedro Martinez <perele1982@gmail.com>
 * 09-feb-2021 20:07:34
 */
public class Plantilla {

   private ArrayList<Empleado> listaEmp;
   private double importeTotal;

   public Plantilla() {
      this.listaEmp = new ArrayList();
      this.importeTotal = 0;
   }

   public void addEmpleado(Empleado empleado) {
      this.listaEmp.add(empleado);
      this.importeTotal += empleado.importeNomina();
   }

   public void imprimirPlantilla() {
      Empleado e;
      EmpContratado ec;
      Iterator<Empleado> iter = listaEmp.iterator();

      while (iter.hasNext()) {
         e = iter.next();
         if (e instanceof EmpFijo) {
            System.out.println("Nombre: " + e.getNombre() + " Apellidos: " + e.getApellidos()
               + " Edad: " + e.getEdad() + " Id: " + e.getId());
            System.out.println(" Tipo de empleado: Fijo Nomina empleado: " + e.importeNomina());
         } else {
            ec = (EmpContratado) e;
            System.out.println("Nombre: " + e.getNombre() + " Apellidos: " + e.getApellidos()
               + " Edad: " + e.getEdad() + " Id: " + e.getId() + " Dias de contrato: " + ec.getDiasContrato());
            System.out.println(" Tipo de empleado: Contratado Nomina empleado: " + e.importeNomina());
         }
      }
   }

   public double importeTotal() {
      return this.importeTotal;

   }
}
