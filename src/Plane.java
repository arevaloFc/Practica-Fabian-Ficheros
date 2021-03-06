import java.io.Serializable;

public class Plane implements Serializable {
    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;
    private boolean flaps = false;
    private boolean landingGear = true;
    private boolean ejectionSystem = true;
    private boolean seatOccupation;

    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
        this.fuelLevel = fuelLevel;
        this.pilotCallSign = pilotCallSign;
        this.squadNumber = squadNumber;
    }

    // Completa el código para cumplir con los requisitos.

    public void toggleFlaps() {
        flaps = !flaps;
        if(flaps == true)
            System.out.println("Estados de los flaps: Arriba");
        else
            System.out.println("Estados de los flaps: Abajo");
    }

    public void toggleLandingGear() {
        landingGear = !landingGear;
        if(landingGear == false)
            System.out.println("Estado del tren de aterrizaje: Abajo");
        else
            System.out.println("Estado del tren de aterrizaje: Arriba");
    }

    public void ejectionSystem() {
        ejectionSystem = !ejectionSystem;
        if(ejectionSystem == false)
            System.out.println("Estado del sistema de eyección del piloto: Desarmado");
        else
            System.out.println("Estado del sistema de eyección del piloto: Armado");
    }

    public void setSeatOccupation() {
        boolean pilotSeated = ejectionSystem;
        seatOccupation = pilotSeated;
        if(pilotSeated == false)
            System.out.println("Asiento ocupado");
        else
            System.out.println("Asiento desocupado");
    }

    @Override
    public String toString() {
        return "Plane: " + "\n" +
                "--> fuelLevel: " + fuelLevel + "\n" +
                "--> pilotCallSign: " + pilotCallSign + "\n" +
                "--> squadNumber: " + squadNumber + "\n" +
                "--> flaps: " + flaps + "\n" +
                "--> landingGear: " + landingGear + "\n" +
                "--> ejectionSystem: " + ejectionSystem + "\n" +
                "--> seatOccupation: " + seatOccupation + "\n";
    }
}
