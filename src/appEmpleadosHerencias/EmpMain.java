/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appEmpleadosHerencias;

/**
 *
 * @author Pedro Martinez <perele1982@gmail.com>
 * 08-feb-2021 19:14:34
 */
public class EmpMain {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Plantilla p = new Plantilla();

      EmpFijo e1 = new EmpFijo("Pedro", "Martinez Bañon", 34, "44771872A");
      p.addEmpleado(e1);
      EmpContratado ec1 = new EmpContratado("Paco", "Gonzalez Mira", 34, "3456Q", 65);
      p.addEmpleado(ec1);

      EmpFijo e2 = new EmpFijo("Tomas", "Hernandez Martinez", 52, "1274A");
      p.addEmpleado(e2);
      EmpContratado ec2 = new EmpContratado("Maria", "Gonzalez Esteve", 44, "3476Q", 45);
      p.addEmpleado(ec2);

      EmpFijo e3 = new EmpFijo("Sergio", "Fernandez Martin", 62, "1343A");
      p.addEmpleado(e3);
      EmpContratado ec3 = new EmpContratado("Manuela", "Perez Esteve", 24, "33276Q", 102);
      p.addEmpleado(ec3);

      p.imprimirPlantilla();

      System.out.println("El importe de las nominas de todos los empleados es: " + p.importeTotal());
   }
}
