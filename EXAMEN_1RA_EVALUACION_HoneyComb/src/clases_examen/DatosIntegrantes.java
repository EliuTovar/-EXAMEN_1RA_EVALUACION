/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author tovar
 */
public class DatosIntegrantes {
    int numControl1;
    String carrera1;
    String nombre1;
    String apellidos1;
    
    int numControl2;
    String carrera2;
    String nombre2;
    String apellidos2;
    
    int numControl3;
    String carrera3;
    String nombre3;
    String apellidos3;
    
    public DatosIntegrantes(){
        this.numControl1 = 21550363;
        this.carrera1 = "Ingenieria en Sistemas Computacionales";
        this.nombre1 = "Eliu David";
        this.apellidos1 = "Tovar Escobar";
        
        this.numControl2 = 21550338;
        this.carrera2 = "Ingenieria en Sistemas Computacionales";
        this.nombre2 = "Javier";
        this.apellidos2 = "Prieto";
        
        this.numControl3 = 21550301;
        this.carrera3 = "Ingenieria en Sistemas Computacionales";
        this.nombre3 = "Diana Jaqueline";
        this.apellidos3 = "Arzaga Perez";
    }
    
    public DatosIntegrantes(int numControl, String carrera, String nombre, String apellidos){
        this.numControl1 = numControl;
        this.carrera1 = carrera;
        this.nombre1 = nombre;
        this.apellidos1 = apellidos;
        
        this.numControl2 = numControl;
        this.carrera2 = carrera;
        this.nombre2 = nombre;
        this.apellidos2 = apellidos;
        
        this.numControl3 = numControl;
        this.carrera3 = carrera;
        this.nombre3 = nombre;
        this.apellidos3 = apellidos;
}
    
    public void ImprimirDatosEquipo(){
        System.out.println("Numero de control: " + numControl1);
        System.out.println("Carrera: " + carrera1);
        System.out.println("Nombre: " + nombre1);
        System.out.println("Apellidos: " + apellidos1);
        System.out.println("");
        System.out.println("Numero de control: " + numControl2);
        System.out.println("Carrera: " + carrera2);
        System.out.println("Nombre: " + nombre2);
        System.out.println("Apellidos: " + apellidos2);
        System.out.println("");
        System.out.println("Numero de control: " + numControl3);
        System.out.println("Carrera: " + carrera3);
        System.out.println("Nombre: " + nombre3);
        System.out.println("Apellidos: " + apellidos3);
        
    }
    
}
