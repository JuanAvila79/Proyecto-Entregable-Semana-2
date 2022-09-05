/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoentregable2;

/**
 *
 * @author noc-02
 */
public class Cliente {

    // declaracion de las variables de la clase cliente.
    private  String nombres, producto;
    private int identificacion, edad;
    private char sexo;
    
    // declaracion de un constructor vacio
    public Cliente() {
    }

    // declaracion de un constructor que recibe los datos para crear el cliente
    public Cliente(String nombre,int identificacion, int edad,char sexo,String producto) {
    this.nombres = nombre;
    this.identificacion = identificacion;
    this.edad = edad;
    this.sexo = sexo;
    this.producto = producto;
    }

    // declaracion de los metodos get y set 
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
   

}
