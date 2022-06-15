import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        Plane F18 = new Plane(34f,"camilo","R-red2");

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
                    System.out.println("Hola 1");
                    break;
                case "2":
                    F18.toggleFlaps();
                    break;
                case "3":
                    F18.toggleLandingGear();
                    break;
                case "4":
                    System.out.println("Hola 4");
                    break;
                case "5":
                    System.out.println("Hola 5");
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
