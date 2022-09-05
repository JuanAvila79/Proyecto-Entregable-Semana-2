/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoentregable2;

import javax.swing.JOptionPane;

/**
 *
 * @author noc-02
 */
public class ProyectoEntregable2 {
        static char sexo; // declaracion de la variable para alamacenar el tipo de sexo
        static  int opc,identificacion, edad, contador; // declaracion de las variables que almacena un dato entero
        static String nombres, producto, sex; // declaracion de las variable que almacenan un dato tipo cadena de texto
        static Cliente[] cliente = new Cliente[100]; // inicializamos el arreglo el cual es a su vez un objeto de la clase cliente.
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        operaciones();

        
    }
    
    public static void operaciones(){
        contador = 0; // inicializamos la variable contador
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                         Seleccione una Opción 
                                                                         1.- Registra un nuevo cliente
                                                                         2.- Ver los clientes registrados
                                                                         3.- Salir""")); // Mostramos el Menu de la aplicacion

            switch (opc) {
                case 1:

                    JOptionPane.showMessageDialog(null, ">>>> Registrando un nuevo Cliente <<<<");  // Mostramos un aviso que estamos registrando un nuevo cliente.
                    nombres = JOptionPane.showInputDialog("Nombre Completo del Cliente  : ");
                    try {
                        identificacion = Integer.parseInt(JOptionPane.showInputDialog("Número de Identificación : "));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "el dato ingresado es incorrecto, favor ingrese el número identificación de la persona... ");
                        identificacion = Integer.parseInt(JOptionPane.showInputDialog("Número de Identificación : "));
                    }

                    try {
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad : "));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "el dato ingresado es incorrecto, favor ingrese en numero la edad de la persona... ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad : "));
                    }

                    sex = JOptionPane.showInputDialog("Seleccione el Sexo de la Persona \n1.- Hombre = 'H'\n2.- Mujer = 'M'  ");
                    sexo = sex.charAt(0);
                    producto = JOptionPane.showInputDialog("Ingrese el producto comprado : ");

                    cliente[contador] = new Cliente(nombres, identificacion, edad, sexo, producto); // realizamos el pase de parametros a la clase Cliente para registrar los nuevos clientes.
                    contador++;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Mostrando los usuarios registrados");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("****** Listado de Clientes Registrados ******");
                        System.out.println("\n\n\nCliente # " +( i + 1));
                        System.out.println("Nombre Completo del Cliente : " + cliente[i].getNombres());
                        System.out.println("Número de Identificación : " + cliente[i].getIdentificacion());
                        System.out.println("Edad : " + cliente[i].getEdad());
                        System.out.println("Sexo : " + cliente[i].getSexo());
                        System.out.println("Producto : " + cliente[i].getProducto());
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Aplicación Finalizada...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar una de las opciones del Menu..");
            }

        } while (opc != 3);
    }

}
