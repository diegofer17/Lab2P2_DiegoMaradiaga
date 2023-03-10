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
                    System.out.println("4. Eliminar Casas/Edificios/Solares");
                    System.out.println("5. Comprar Casas/Edificios/Solares");
                    System.out.println("");
                    System.out.print("Ingrese su opcion: ");
                    opcionc1 = leer.nextInt();
                    System.out.println("");
                    switch (opcionc1){
                        case 1:
                            int opcionCedificaciones = 0;
                            System.out.println("Que desea crear (1. Casa/ 2. Edificio/ 3. Solar)? ");
                            opcionCedificaciones = leer.nextInt();
                            switch(opcionCedificaciones){
                                case 1: 
                                    lista.add(newCasa());
                                    System.out.println("Casa agregada exitosamente");
                                break;
                                case 2: 
                                    lista.add(newEdificio());
                                    System.out.println("Edificio agregado exitosamente");
                                break;
                                case 3: 
                                    lista.add(newSolar());
                                    System.out.println("Solar agregado exitosamente");
                                break;
                            }//Fin switch
                        break;
                        case 2:
                            int opcionLedificaciones = 0;
                            System.out.println("Que desea listar (1. Casa/ 2. Edificio/ 3. Solar / 4.TODO)? ");
                            opcionLedificaciones = leer.nextInt();
                            switch(opcionLedificaciones){
                                case 1:
                                    String salida1 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Casa) {
                                            salida1 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                    System.out.println(salida1);
                                    break;
                                case 2: 
                                    String salida2 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Edificio) {
                                            salida2 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                    System.out.println(salida2);
                                break;
                                case 3: 
                                    String salida3 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Solar) {
                                            salida3 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                    System.out.println(salida3);
                                break;
                                case 4:
                                    String salida4 = "";
                                    for (Object t : lista) {
                                            salida4 += "" + lista.indexOf(t) + ") " + t + "\n";
                                    }
                                    System.out.println(salida4);
                                break;
                            }//Fin switch
                        break;
                        case 3:   
                            int opcionMedificaciones = 0;
                            System.out.println("Que desea modificar (1. Casa/ 2. Edificio/ 3. Solar)? ");
                            opcionMedificaciones = leer.nextInt();
                            switch(opcionMedificaciones){
                                case 1:
                                    String salida1 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Casa) {
                                            salida1 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                    System.out.println(salida1);
                                    System.out.println("Ingrese el numero de casa que desea modificar: ");
                                    int opcionM1 = leer.nextInt();
                                    
                                    System.out.println("Modificara la casa # "+opcionM1);
                                    System.out.println("");
                                    System.out.println(""+
                                            "1. Numero de casa\n"+
                                            "2. Numero de Bloque\n" +
                                            "3. Color\n" +
                                            "4. Ancho\n" +
                                            "5. Largo\n" +
                                            "6. Numero de Ba??os\n" +
                                            "7. Numero de Cuartos\n" +
                                            "8. Estado de la casa\n" +
                                            "9. Dueno de la casa\n" +
                                            "Que desea modificar?");
                                            int M1 = leer.nextInt();
                                            switch (M1) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo numero de casa ");
                                            int NumCasa = leer.nextInt();
                                            ((Casa)lista.get(opcionM1)).setNumCasa(NumCasa);
                                        break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo numero de bloque ");
                                            int NumBloq = leer.nextInt();
                                            ((Casa)lista.get(opcionM1)).setNumBloq(NumBloq);
                                        break;
                                        case 3:
                                            Color C = JColorChooser.showDialog(null, "Ingrese el color que desea: ", Color.white);
                                            ((Casa)lista.get(opcionM1)).setColor(C);
                                        break;
                                        case 4:
                                            System.out.println("Ingrese el nuevo ancho ");
                                            int ancho = leer.nextInt();
                                            ((Casa)lista.get(opcionM1)).setAncho(ancho);
                                        break;
                                        case 5:
                                            System.out.println("Ingrese el nuevo largo ");
                                            int largo = leer.nextInt();
                                            ((Casa)lista.get(opcionM1)).setLargo(largo);
                                        break;
                                        case 6:
                                            System.out.println("Ingrese el nuevo numero de banos ");
                                            int NumBanos = leer.nextInt();
                                            ((Casa)lista.get(opcionM1)).setNumBanos(NumBanos);
                                        break;
                                        case 7:
                                            System.out.println("Ingrese el nuevo numero de cuartos ");
                                            int NumCuar = leer.nextInt();
                                            ((Casa)lista.get(opcionM1)).setNumCuartos(NumCuar);
                                        break;
                                        case 8:
                                            System.out.println("Ingrese el nuevo estado de la casa ");
                                            String estadoC = leer.next();
                                            ((Casa)lista.get(opcionM1)).setEstadoC(estadoC);
                                        break;
                                        case 9:
                                            System.out.println("Ingrese el nuevo dueno de la casa ");
                                            String Dueno = leer.next();
                                            ((Casa)lista.get(opcionM1)).setDueno(Dueno);
                                        break;
                                    }       
                                break;
                                case 2: 
                                    String salida2 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Edificio) {
                                            salida2 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                    System.out.println(salida2);
                                    System.out.println("Ingrese el numero de edificio que desea modificar: ");
                                    int opcionM2 = leer.nextInt();
                                    
                                    System.out.println("Modificara el edificio # "+opcionM2);
                                    System.out.println("");
                                    System.out.println(""+
                                            "1. Numero de pisos\n"+
                                            "2. Cantidad de locales\n" +
                                            "3. Direccion por referencia\n" +
                                            "4. Estado del edificio\n" +
                                            "5. Dueno del edificio\n" +
                                            "Que desea modificar?");
                                            int M2 = leer.nextInt();
                                            switch (M2) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo numero de pisos ");
                                            int NumPisos = leer.nextInt();
                                            ((Edificio)lista.get(opcionM2)).setNumPisos(NumPisos);
                                        break;
                                        case 2:
                                            System.out.println("Ingrese la nueva cantidad de locales ");
                                            int CantLocal = leer.nextInt();
                                            ((Edificio)lista.get(opcionM2)).setCantLocal(CantLocal);
                                        break;
                                        case 3:
                                            System.out.println("Ingrese la nueva direccion ");
                                            String DxRefer = leer.next();
                                            ((Edificio)lista.get(opcionM2)).setDxRefer(DxRefer);
                                        break;
                                        case 4:
                                            System.out.println("Ingrese el nuevo estado de la casa ");
                                            String estadoE = leer.next();
                                            ((Edificio)lista.get(opcionM2)).setEstadoE(estadoE);
                                        break;
                                        case 5:
                                            System.out.println("Ingrese el nuevo dueno de la casa ");
                                            String Dueno = leer.next();
                                            ((Edificio)lista.get(opcionM2)).setDueno(Dueno);
                                        break;
                                    }
                                break;
                                case 3: 
                                    String salida3 = "";
                                    for (Object t : lista) {
                                        if (t instanceof Solar) {
                                            salida3 += "" + lista.indexOf(t) + ") " + t + "\n";
                                        }
                                    }
                                    System.out.println(salida3);
                                    System.out.println("Ingrese el numero de solar que desea modificar: ");
                                    int opcionM3 = leer.nextInt();
                                    
                                    System.out.println("Modificara el solar # "+opcionM3);
                                    System.out.println("");
                                    System.out.println(""+
                                            "1. Ancho del solar\n"+
                                            "2. Largo del solar\n" +
                                            "3. Dueno del solar\n" +
                                            "Que desea modificar?");
                                            int M3 = leer.nextInt();
                                            switch (M3) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo ancho del solar ");
                                            int anchoS = leer.nextInt();
                                            ((Solar)lista.get(opcionM3)).setAnchoS(anchoS);
                                        break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo largo del solar ");
                                            int largoS = leer.nextInt();
                                            ((Solar)lista.get(opcionM3)).setLargoS(largoS);
                                        break;
                                        case 3:
                                            System.out.println("Ingrese el nuevo dueno del solar ");
                                            String Dueno = leer.next();
                                            ((Solar)lista.get(opcionM3)).setDueno(Dueno);
                                        break;
                                        
                                    }
                                break;
                            }//Fin de switch
                        break;    
                        case 4:
                            String salidaE = "";
                            for (Object t : lista) {
                                salidaE += "" + lista.indexOf(t) + ") " + t + "\n";
                            }
                            System.out.println(salidaE);
                            System.out.println("Que desea eliminar? ");
                            int index = leer.nextInt();
                            if (index >= 0 && index < lista.size()) {
                                lista.remove(index);
                            }else{
                                System.out.println("El indice esta fuera de los limites");
                            }
                        break;
                        case 5:
                            String salidaC = "";
                            for (Object t : lista) {
                                salidaC += "" + lista.indexOf(t) + ") " + t + "\n";
                            }
                            System.out.println(salidaC);
                            System.out.println("Que edificacion tendra un nuevo dueno? ");
                            int edificio = leer.nextInt();
                            
                            
                        break;
                        
                    }//Fin switch
                }break;//Fin case 1
                case 2: {
                    System.out.println("Solamente el usuario Admin puede ingresar");
                }break;//Fin case 2
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
                            boolean flag;
                           
                            for (int i = 0; i < usuarios.size(); i++) {
                                if (username.equals("admin") && contra.equals("admin1234")) {
                                    flag = true;
                                    System.out.println("El admin ha iniciado sesion correctamente");
                                    System.out.println("");
                                    System.out.println("1. Registro de Inmbueble/Solar ");
                                    System.out.println("2. Manejo de Estados           ");
                                    System.out.println("3. Log Out              ");
                                    System.out.println("4. Salir ");
                                    System.out.println("");
                                    System.out.print("Ingrese su opcion: ");
                                    opcion = leer.nextInt();
                                }else if(usuarios.get(i).equals(username) && usuarios.get(i).equals(contra)){
                                    flag = true;
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
                                    flag = false;
                                    System.out.println("Usuario ingresado no valido");
                            }
                            }//Fin for case LOG IN
                        break;//case 1 LOG IN
                        case 2:
                            System.out.println("");
                            System.out.println("SIGN UP");
                            usuarios.add(newUser());
                            
                            
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
        System.out.print("Ingrese el estado de la casa (Lista, EnConstrucci??n, Construcci??nenEspera, EnEsperadeDemolici??n): ");
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
        System.out.print("Ingrese el estado de la casa (Lista, EnConstrucci??n, Construcci??nenEspera, EnEsperadeDemolici??n): ");
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
        
        retorno3 = new Solar(ancho, largo, largo*ancho, Dueno);
        return retorno3;
    }//Fin Crear Solar
    
    static Usuario newUser() {
        Usuario retorno4;
        System.out.println("Ingrese su nombre: ");
        String name = leer.next();
        System.out.println("Ingrese la edad: ");
        int age = leer.nextInt();
        System.out.println("Ingrese un username: ");
        String Username = leer.next();
        System.out.println("Ingrese una contrasena: ");
        String contra = leer.next();
        
        retorno4 = new Usuario(name, age, Username, contra);
        return retorno4;
    }
}//Fin clase

