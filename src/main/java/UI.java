
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruth Anai
 */
public class UI {
    
    /**
     * Mensaje inicial
     * @return opcion elegida
     */
    public static int initial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al radio Mercedes-Benz ");
        System.out.println("");
        System.out.println("Seleccione el número deseado");
        System.out.println("");
        System.out.println("1. Encender/Apagar");
        System.out.println("2. Cambiar FM o Am");
        System.out.println("3. Cambiar emisora");
        System.out.println("4. Guardar emisora");
        return scanner.nextInt();
    }
    /**
     * Mensaje
     * @param msg mensaje
     */
    public static void show(String msg){
        System.out.println(msg);
    }

}
