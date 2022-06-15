import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        Plane F18 = null;

        Scanner sc = new Scanner(System.in);
        String opcionUsuario = "";

        FileInputStream inputFile = null;
        BufferedInputStream bufferedInput = null;
        ObjectInputStream objectInput = null;

        Scanner sc = new Scanner(System.in);
        String opcionUsuario = "";

        try {

            inputFile = new FileInputStream("data/plane.dat");
            bufferedInput = new BufferedInputStream(inputFile);
            objectInput = new ObjectInputStream(bufferedInput);

            try {
                F18 = (Plane) objectInput.readObject();
                while (true) {
                    System.out.println(F18);
                    F18 = (Plane) objectInput.readObject();
                }
            } catch (EOFException ex) {
                System.out.println("Hemos llegado al final del fichero.");
            } catch (ClassNotFoundException e) {
                System.out.println("Se ha producido un error al leer un objeto");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Se ha producido un error de entrada salida");
        }

        while (!salir) {
            System.out.println("1 - Inicializar F18");
            System.out.println("2 - Alternar estado de los flap");
            System.out.println("3 - Alternar estado del tren de aterrizaje");
            System.out.println("4 - Armar sistema de eyección");
            System.out.println("5 - Eyectar piloto");
            System.out.println("Q - Salir");

            opcionUsuario = sc.nextLine();

            switch (opcionUsuario) {
                case "1":
                    System.out.println("Introduzca el número de litros de combustible cargado");
                    float combustible = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Introduzca apodo del piloto:");
                    String nombrePiloto = sc.nextLine();
                    System.out.println("Introduzca número de escuadrón");
                    String numeroEscuadron = sc.nextLine();

                    F18 = new Plane(combustible,nombrePiloto,numeroEscuadron);
                    F18.toggleFlaps();
                    F18.toggleLandingGear();
                    F18.ejectionSystem();
                    F18.setSeatOccupation();
                    break;
                case "2":
                    F18.toggleFlaps();
                    break;
                case "3":
                    F18.toggleLandingGear();
                    break;
                case "4":
                    F18.ejectionSystem();
                    break;
                case "5":
                    F18.setSeatOccupation();
                    break;
                case "Q":
                    FileOutputStream outputFile = null;
                    BufferedOutputStream bufferedOutput = null;
                    ObjectOutputStream objectOutput = null;

                    try {
                        outputFile = new FileOutputStream("data/plane.dat");
                        bufferedOutput = new BufferedOutputStream(outputFile);
                        objectOutput = new ObjectOutputStream(bufferedOutput);

                        objectOutput.writeObject(F18);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (objectOutput != null) objectOutput.close();
                            if (bufferedOutput != null) bufferedOutput.close();
                            if (outputFile != null) outputFile.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }
        }
    }
}
