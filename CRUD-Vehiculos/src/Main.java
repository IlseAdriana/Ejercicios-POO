import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import vehiculos.*;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("--------------------");
                    mostrarMenuVehiculos();
                    int opcionAlta = leer.nextInt();
                    switch(opcionAlta) {
                        case 1:
                            System.out.println("--------------------");
                            System.out.print("Digite la matrícula: ");
                            String matriculaCarro = leer.next();
                            System.out.print("Digite la marca: ");
                            String marcaCarro = leer.next();
                            System.out.print("Digite el modelo: ");
                            String modeloCarro = leer.next();
                            System.out.print("Digite el color: ");
                            String colorCarro = leer.next();
                            System.out.print("Digite la transmisión: ");
                            String transmisionCarro = leer.next();
                            System.out.print("Digite el kilometraje: ");
                            Integer kmCarro = leer.nextInt();
                            System.out.print("Digite el número de puertas: ");
                            Integer puertasCarro = leer.nextInt();
                            vehiculos.add(new Carro(matriculaCarro, marcaCarro, modeloCarro, colorCarro, transmisionCarro, kmCarro, puertasCarro));
                            break;
                        case 2:
                            System.out.println("--------------------");
                            System.out.print("Digite la matrícula: ");
                            String matriculaCamioneta = leer.next();
                            System.out.print("Digite la marca: ");
                            String marcaCamioneta = leer.next();
                            System.out.print("Digite el modelo: ");
                            String modeloCamioneta = leer.next();
                            System.out.print("Digite el color: ");
                            String colorCamioneta = leer.next();
                            System.out.print("Digite la transmisión: ");
                            String transmisionCamioneta = leer.next();
                            System.out.print("Digite el kilometraje: ");
                            Integer kmCamioneta = leer.nextInt();
                            System.out.print("Digite el número de puertas: ");
                            Integer puertasCamioneta = leer.nextInt();
                            vehiculos.add(new Camioneta(matriculaCamioneta, marcaCamioneta, modeloCamioneta, colorCamioneta, transmisionCamioneta, kmCamioneta, puertasCamioneta));
                            break;
                        case 3:
                            System.out.println("--------------------");
                            System.out.print("Digite la matrícula: ");
                            String matriculaMoto = leer.next();
                            System.out.print("Digite la marca: ");
                            String marcaMoto = leer.next();
                            System.out.print("Digite el modelo: ");
                            String modeloMoto = leer.next();
                            System.out.print("Digite el color: ");
                            String colorMoto = leer.next();
                            System.out.print("Digite la transmisión: ");
                            String transmisionMoto = leer.next();
                            System.out.print("Digite el kilometraje: ");
                            Integer kmMoto = leer.nextInt();
                            System.out.print("Digite el no. de llantas: ");
                            Integer noLlantas  = leer.nextInt();
                            vehiculos.add(new Motocicleta(matriculaMoto, marcaMoto, modeloMoto, colorMoto, transmisionMoto, kmMoto, noLlantas));
                            break;
                        default:
                            System.out.println("--------------------");
                            System.out.println("Opción Inválida");
                            break;
                    } 
                    System.out.println("--------------------");
                    break;
                case 2:
                    if (vehiculos.size() > 0) {
                        System.out.println("--------------------");
                        System.out.println("Baja de vehículos");
                        for(int i = 0; i < vehiculos.size(); i++) {
                            System.out.printf("%d - %s con matrícula: %s\n", i+1, vehiculos.get(i).getClass().getSimpleName(), vehiculos.get(i).getMatricula());
                        }
                        System.out.print("Ingrese el número correspondiente al vehículo que desea modificar: ");
                        int vehiculoEliminar = leer.nextInt() - 1;
                        vehiculos.remove(vehiculoEliminar);
                        System.out.println("--------------------");
                    } else {
                        System.out.println("--------------------");
                        System.out.println("No se han ingresado vehículos");
                        System.out.println("--------------------");
                    }
                    break;
                case 3:
                    if (vehiculos.size() > 0) {
                        System.out.println("--------------------");
                        for(int i = 0; i < vehiculos.size(); i++) {
                            System.out.printf("%d - %s con matrícula: %s\n", i+1, vehiculos.get(i).getClass().getSimpleName(), vehiculos.get(i).getMatricula());
                        }
                        System.out.print("Ingrese el número correspondiente al vehículo que desea modificar: ");
                        int vehiculoModificar = leer.nextInt() - 1;
                        System.out.println("--------------------");
                        if(vehiculos.get(vehiculoModificar) instanceof Carro) {
                            leer.nextLine();
                            System.out.print("Digite la matrícula: ");
                            vehiculos.get(vehiculoModificar).setMatricula(leer.nextLine());
                            System.out.print("Digite la marca: ");
                            vehiculos.get(vehiculoModificar).setMarca(leer.nextLine());
                            System.out.print("Digite el modelo: ");
                            vehiculos.get(vehiculoModificar).setModelo(leer.nextLine());
                            System.out.print("Digite el color: ");
                            vehiculos.get(vehiculoModificar).setColor(leer.nextLine());
                            System.out.print("Digite la transmisión: ");
                            vehiculos.get(vehiculoModificar).setTransmision(leer.nextLine());
                            System.out.print("Digite el kilometraje: ");
                            vehiculos.get(vehiculoModificar).setKilometraje(leer.nextInt());
                            System.out.print("Digite el número de puertas: ");
                            ((Carro) vehiculos.get(vehiculoModificar)).setNoPuertas(leer.nextInt());
                        } else if (vehiculos.get(vehiculoModificar) instanceof Camioneta) {
                            leer.nextLine();
                            System.out.print("Digite la matrícula: ");
                            vehiculos.get(vehiculoModificar).setMatricula(leer.nextLine());
                            System.out.print("Digite la marca: ");
                            vehiculos.get(vehiculoModificar).setMarca(leer.nextLine());
                            System.out.print("Digite el modelo: ");
                            vehiculos.get(vehiculoModificar).setModelo(leer.nextLine());
                            System.out.print("Digite el color: ");
                            vehiculos.get(vehiculoModificar).setColor(leer.nextLine());
                            System.out.print("Digite la transmisión: ");
                            vehiculos.get(vehiculoModificar).setTransmision(leer.nextLine());
                            System.out.print("Digite el kilometraje: ");
                            vehiculos.get(vehiculoModificar).setKilometraje(leer.nextInt());
                            System.out.print("Digite el número de puertas: ");
                            ((Camioneta) vehiculos.get(vehiculoModificar)).setNoPuertas(leer.nextInt());
                        } else {
                            leer.nextLine();
                            System.out.print("Digite la matrícula: ");
                            vehiculos.get(vehiculoModificar).setMatricula(leer.nextLine());
                            System.out.print("Digite la marca: ");
                            vehiculos.get(vehiculoModificar).setMarca(leer.nextLine());
                            System.out.print("Digite el modelo: ");
                            vehiculos.get(vehiculoModificar).setModelo(leer.nextLine());
                            System.out.print("Digite el color: ");
                            vehiculos.get(vehiculoModificar).setColor(leer.nextLine());
                            System.out.print("Digite la transmisión: ");
                            vehiculos.get(vehiculoModificar).setTransmision(leer.nextLine());
                            System.out.print("Digite el kilometraje: ");
                            vehiculos.get(vehiculoModificar).setKilometraje(leer.nextInt());
                            System.out.print("Digite el no. de llantas: ");
                            ((Motocicleta) vehiculos.get(vehiculoModificar)).setNoLlantas(leer.nextInt());
                        }
                        System.out.println("--------------------");
                    } else {
                        System.out.println("--------------------");
                        System.out.println("No se han ingresado vehículos");
                        System.out.println("--------------------");
                    }
                    break;
                case 4:
                    if (vehiculos.size() > 0) {
                        System.out.println("--------------------");
                        Collections.sort(vehiculos);
                        for (Vehiculo vehiculo : vehiculos) {
                            System.out.println(vehiculo);
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("--------------------");
                        System.out.println("No se han ingresado vehículos");
                        System.out.println("--------------------");
                    }
                    break;
                case 5: break;
                default:
                    System.out.println("--------------------");
                    System.out.println("Digite una opción válida");
                    System.out.println("--------------------");
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("1---Dar de alta un vehiculo\n2---Dar de baja un vehiculo\n3---Modificar información de un vehículo\n4---Mostrar todos los vehículos\n5---Salir");
        System.out.print("Digite la opcion que desea realizar: ");
    }

    public static void mostrarMenuVehiculos() {
        System.out.println("1---Carro\n2---Camioneta\n3---Motocicleta");
        System.out.print("Digite el vehículo que desea agregar: ");
    }
}