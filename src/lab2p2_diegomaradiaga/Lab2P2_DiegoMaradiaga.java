package lab2p2_diegomaradiaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_DiegoMaradiaga {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        ArrayList lista = new ArrayList();
        ArrayList usuarios = new ArrayList();
        do {
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

            switch (opcion) {
                case 1: {
                    System.out.println("Solamente el usuario Admin puede ingresar");
                }//Fin case 1
                case 2: {
                    System.out.println("Solamente el usuario Admin puede ingresar");
                }//Fin case 2
                case 3: {
                    int opcioncase3 = 0;
                    System.out.println("1. Log In");
                    System.out.println("2. Sign In");
                    System.out.print("Ingrese su opcion: ");
                    opcioncase3 = leer.nextInt();

                    usuarios.add(new Usuario("Diego", 18, "admin", "admin1234"));
                    String nombre = "";
                    int edad;
                    String username = "";
                    String contra = "";

                    switch (opcioncase3) {
                        case 1: 
                            System.out.println("");
                            System.out.println("LOG IN");
                            System.out.println("Ingrese el usuario: ");
                            username = leer.next();
                            System.out.println("Ingrese la contrasena: ");
                            contra = leer.next();

                            for (int i = 0; i < usuarios.size(); i++) {
                                if (username.equals("admin") && contra.equals("admin1234")) {
                                    System.out.println("Ha iniciado sesion correctamente");
                                    System.out.println("");
                                    System.out.println("1. Registro de Inmbueble/Solar ");
                                    System.out.println("2. Manejo de Estados           ");
                                    System.out.println("3. Log Out              ");
                                    System.out.println("4. Salir ");
                                    System.out.println("");
                                    System.out.print("Ingrese su opcion: ");
                                    opcion = leer.nextInt();
                                }else if(usuarios.get(i) instanceof Usuario){
                                    System.out.println("Ha iniciado sesion correctamente");
                                    System.out.println("");
                                    System.out.println("1. Registro de Inmbueble/Solar ");
                                    System.out.println("2. Manejo de Estados           ");
                                    System.out.println("3. Log Out              ");
                                    System.out.println("4. Salir ");
                                    System.out.println("");
                                    System.out.print("Ingrese su opcion: ");
                                    opcion = leer.nextInt();

                                    switch (opcion) {
                                        case 1:
                                            System.out.println("LISTA");
                                            break;
                                        case 2:
                                            System.out.println("Esta opcion no es valida para usted, solo el admin puede ingresar");
                                            break;
                                        case 3:

                                            break;
                                        case 4:
                                            System.exit(0);
                                            break;
                                    }//Fin switch
                                }else{
                                    System.out.println("El usuario ingresado no es valido");
                            }
                            }//Fin for case LOG IN
                        break;//case 1 LOG IN
                        case 2:
                            System.out.println("");
                            System.out.println("SIGN UP");
                            System.out.print("Ingrese su nombre: ");
                            nombre = leer.next();
                            System.out.print("Ingrese su edad: ");
                            edad = leer.nextInt();
                            System.out.print("Ingrese un username: ");
                            username = leer.next();
                            System.out.print("Ingrese una contrasena: ");
                            contra = leer.next();
                            
                            usuarios.add(new Usuario(nombre, edad, username, contra));
                            
                            System.out.println("Se ha registrado correctamente");
                            System.out.println("");
                            System.out.println("1. Registro de Inmbueble/Solar ");
                            System.out.println("2. Manejo de Estados           ");
                            System.out.println("3. Log In              ");
                            System.out.println("4. Salir ");
                            System.out.println("");
                            System.out.print("Ingrese su opcion: ");
                            opcion = leer.nextInt();                    
                            
                            switch (opcion){
                                
                            }//Fin switch
                    break;//case 2 SIGN UP
                    }//Fin switchcase3
                
                }break;// case 3
                
                default: {
                    System.exit(0);
                }    
            }//Fin switchGrande
        } while (opcion != 4);//Fin DOWhile

    }//Fin main
}//Fin clase

