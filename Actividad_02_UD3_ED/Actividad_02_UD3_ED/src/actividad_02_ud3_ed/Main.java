/**
 * Clase principal que contiene el método main para ejecutar el programa de gestión de cuentas bancarias.
 * Permite realizar operaciones como ingresar y retirar dinero de una cuenta.
 * 
 * @author Ignacio
 * @version 1.0
 */
package actividad_02_ud3_ed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal que contiene el método main para ejecutar el programa de gestión de cuentas bancarias.
 */
public class Main {
    /**
     * Objeto BufferedReader para leer datos del teclado.
     */
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        int opcion=0;
        cuenta1 = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        do{
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion=Integer.parseInt(dato.readLine());
                if(opcion==1){
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                }else if(opcion==2){
                    System.out.println("¿Cuánto desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                }else if(opcion==3){
                    System.out.println("Finalizamos la ejecución");
                }else{
                    System.err.println("Opción errónea");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while (opcion!=3);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

    /**
     * Método para realizar operaciones de ingreso y retiro en una cuenta bancaria.
     * 
     * @param cuenta1 Objeto CCuenta que representa la cuenta bancaria sobre la que se realizará la operación.
     * @param cantidad Cantidad de dinero a ingresar o retirar.
     * @param opcion Opción seleccionada por el usuario (1 para ingresar o 2 para retirar).
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad,int opcion){
        if(opcion==2){
            try 
            {
                cuenta1.retirar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al retirar");
            }
        }else if(opcion==1){
            try
            {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
