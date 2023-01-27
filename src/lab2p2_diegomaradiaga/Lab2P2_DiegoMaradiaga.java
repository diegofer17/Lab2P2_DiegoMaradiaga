package lab2p2_diegomaradiaga;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_DiegoMaradiaga {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        ArrayList lista = new ArrayList();
        ArrayList <Usuario> usuarios = new ArrayList();
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
                    int opcionc1 = 0;
                    System.out.println("1. Crear Casas/Edificios/Solares");
                    System.out.println("2. Listar Casas/Edificios/Solares");
                    System.out.println("3. Modificar Casas/Edificios/Solares");
                    System.out.println("4. Comprar Casas/Edificios/Solares");
                    System.out.println("");
                    System.out.print("Ingrese su opcion: ");
                    opcionc1 = leer.nextInt();
                    System.out.println("");
                    switch (opcionc1){
                        case 1:
                            int opcionCedificaciones = 0;
                            System.out.println("Que desea crear (1. Casa/ 2. Edificio/ 3. Solar? ");
                            opcionCedificaciones = leer.nextInt();
                            switch(opcionCedificaciones){
                                case 1: 
                                    lista.add(newCasa());
                                    System.out.println("Casa agregada exitosamente");
                                break;
                                case 2: 
                                    lista.add(newEdificio());
                                    System.out.println("Edificio agregada exitosamente");
                                break;
                                case 3: 
                                    lista.add(newSolar());
                                    System.out.println("Solar agregada exitosamente");
                                break;
                            }//Fin switch
                            break;
                        case 2:
                            int opcionLedificaciones = 0;
                            System.out.println("Que desea listar (1. Casa/ 2. Edificio/ 3. Solar / 4.TODO? ");
                            opcionLedificaciones = leer.nextInt();
                            switch(opcionLedificaciones){
                                case 1:
                                    String salida1 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Casa) {
                                            salida1 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                    break;
                                case 2: 
                                    String salida2 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Edificio) {
                                            salida2 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                break;
                                case 3: 
                                    String salida3 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Solar) {
                                            salida3 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                break;
                                case 4:
                                    String salida4 = "";
                                    for (Object t : lista) {
                                            salida4 += "" + lista.indexOf(t) + ") " + t + "\n";
                                    }
                                break;
                            }//Fin switch
                            break;
                        case 3:
                            int opcionMedificaciones = 0;
                            System.out.println("Que desea modificar (1. Casa/ 2. Edificio/ 3. Solar? ");
                            opcionMedificaciones = leer.nextInt();
                            switch(opcionMedificaciones){
                                case 1: 
                                    lista.add(newCasa());
                                    System.out.println("Casa agregada exitosamente");
                                break;
                                case 2: 
                                    lista.add(newEdificio());
                                    System.out.println("Edificio agregada exitosamente");
                                break;
                                case 3: 
                                    lista.add(newSolar());
                                    System.out.println("Solar agregada exitosamente");
                                break;
                            }//Fin switch
                            break;
                        case 4:
                            String salidaE = "";
                            for (Object t : lista) {
                                salidaE += "" + lista.indexOf(t) + ") " + t + "\n";
                            }
                            System.out.println("Que desea eliminar? ");
                            int index = leer.nextInt();
                            if (index >= 0 && index < lista.size()) {
                                lista.remove(index);
                            }else{
                                System.out.println("El indice esta fuera de los limites");
                            }
                            break;
                        
                    }
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
    
    static Casa newCasa() {
        Casa retorno1;
        System.out.print("Ingrese el numero de la casa: ");
        int NumCasa = leer.nextInt();
        System.out.print("Ingrese el numero de bloque de la casa: ");
        int NumBloq = leer.nextInt();
        Color C = JColorChooser.showDialog(null, "Ingrese el color que desea: ", Color.white);
        System.out.print("Ingrese el ancho de la casa: ");
        int ancho = leer.nextInt();
        System.out.print("Ingrese el largo de la casa: ");
        int largo = leer.nextInt();
        System.out.print("Ingrese el numero de banos de la casa: ");
        int NumBanos = leer.nextInt();
        System.out.print("Ingrese el numero de cuartos de la casa: ");
        int NumCuartos = leer.nextInt();
        System.out.print("Ingrese el estado de la casa (Lista, EnConstrucción, ConstrucciónenEspera, EnEsperadeDemolición): ");
        String EstadoC = leer.next();
        System.out.print("Ingrese el dueno de la casa: ");
        String Dueno = leer.next();
        retorno1 = new Casa(NumCasa, NumBloq, C, ancho, largo, NumBanos, NumCuartos, EstadoC, Dueno);

        return retorno1;
    }//Fin Crear Casa
    
    static Edificio newEdificio() {
        Edificio retorno2;
        System.out.print("Ingrese el numero de pisos: ");
        int NumPisos = leer.nextInt();
        System.out.print("Ingrese la cantidad de locales: ");
        int CantLocal = leer.nextInt();
        System.out.println("Ingrese la direccion por referencia del edificio: ");
        String DxRefer = leer.next();
        System.out.print("Ingrese el estado de la casa (Lista, EnConstrucción, ConstrucciónenEspera, EnEsperadeDemolición): ");
        String EstadoC = leer.next();
        System.out.print("Ingrese el dueno de la casa: ");
        String Dueno = leer.next(); 
        
        retorno2 = new Edificio(NumPisos, CantLocal, DxRefer, EstadoC, Dueno);
        return retorno2;
    }//Fin Crear Edificio
    
    static Solar newSolar() {
        Solar retorno3;
        System.out.print("Ingrese el ancho del solar: ");
        int ancho = leer.nextInt();
        System.out.print("Ingrese el largo del solar: ");
        int largo = leer.nextInt();
        System.out.print("Ingrese el dueno de la casa: ");
        String Dueno = leer.next();
        
        retorno3 = new Solar(ancho, largo, largo, Dueno);
        return retorno3;
    }//Fin Crear Solar
    
}//Fin clase

