package lab2p2_diegomaradiaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_DiegoMaradiaga {
    
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        ArrayList lista = new ArrayList();
        ArrayList usuarios = new ArrayList();
        do{
            System.out.println("--------------------------------------------");
            System.out.println(">>>>>>>   Inmbobilaria BLACK_FLOYD   <<<<<<<");
            System.out.println("");
            System.out.println("1. Registro de Inmbueble/Solar ");
            System.out.println("2. Manejo de Estados           ");
            System.out.println("3. Log In/Sign Up              ");
            System.out.println("4. Salir ");
            System.out.println("");
            System.out.print("Ingrese su opcion: ");
            opcion = leer.nextInt();
            System.out.println("");
            
            
            switch (opcion){
                case 1:{ 
                    
                }
                case 2:{ 
                    
                }
                case 3:{ 
                    
                }
                default:{
                    System.exit(0);
                }
            }//Fin switch
        }while(opcion!=4);
    }
    
}
