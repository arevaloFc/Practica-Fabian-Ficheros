import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        Plane F18 = null;

        Scanner sc = new Scanner(System.in);
        String opcionUsuario = "";

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
                    System.out.println("Salir del programa");
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }
        }
    }
}
