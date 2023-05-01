package org.example;

import java.util.Scanner;
import org.listas.Lista;
import org.reproductor.Cancion;
import org.reproductor.ListaCancion;
import org.reproductor.ListaCancionOrdenada;



import java.util.Scanner;

public class Main {
    
   
    public static void main(String[] args) {
        
        
                ListaCancionOrdenada lco = new ListaCancionOrdenada();
                
                
                System.out.println("CANCIONES QUE APARECEN EN ESTE MENU:");
                System.out.println(" ");
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\LEO RIZZI","1. AMAPOLAS.mp3"));
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\LEO RIZZI","2. AL OTRO LADO.mp3"));
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\THE CURE","3. JUST LIKE HEAVEN.mp3"));
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\THE CURE","4. BOYS DONT CRY.mp3"));
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\REM","5. LOSSING MY RELIGION.mp3"));
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\REM","6. I DO IT.mp3"));
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\MEN AT WORK","7. DOWN UNDER.mp3"));
        lco.insertar(new Cancion("D:\\Victor Vasquez\\Desktop\\Saves\\MEN AT WORK","8. WHO CAN BE NOW.mp3"));
        lco.visualizar();
        System.out.println(" ");
        System.out.println("FIN DE LA LISTA");
    
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Menu de Artistas:");
            System.out.println(" ");
            System.out.println("1. LEO RIZZI");
            System.out.println("2. THE CURE");
            System.out.println("3. REM");
            System.out.println("4. MEN AT WORK");
            System.out.println("0. SALIR");
            System.out.print("SELECCIONASTE LA OPCION: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("CANCIONES DE LEO RIZZI:");
                    System.out.println("1. AMAPOLAS");
                    System.out.println("2. AL OTRO LADO");
                    
                    break;
                case 2:
                    System.out.println("CANCIONES DE THE CURE:");
                    System.out.println("1. JUST LIKE HEAVEN");
                    System.out.println("2. BOYS DONT CRY");
                    break;
                case 3:
                    System.out.println("CANCIONES DE REM:");
                    System.out.println("1. LOOSING MY RELIGION");
                    System.out.println("2. I DO IT");
                    break;
                case 4:
                    System.out.println("CANCIONES DE MEN AT WORK:");
                    System.out.println("1. DOWN UNDER");
                    System.out.println("2. WHO CAN BE NOW");
                    break;
                case 0:
                    System.out.println("HASTA LA VISTA BABY!");
                    break;
                default:
                    System.out.println("CAGASTE HERMANO, NO EXISTE, NO HAY!");
                    break;
            }
        } while (opcion != 0);
            
        sc.close();
    }
}

