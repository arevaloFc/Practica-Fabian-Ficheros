public class Plane {
    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;
    private boolean flaps = false;
    private boolean landingGear = false;
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
    }

    public void ejectionSystem() {
        ejectionSystem = !ejectionSystem;
    }

    public void setSeatOccupation(boolean pilotSeated) {
        seatOccupation = pilotSeated;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "fuelLevel=" + fuelLevel +
                ", pilotCallSign='" + pilotCallSign + '\'' +
                ", squadNumber='" + squadNumber + '\'' +
                ", flaps=" + flaps +
                ", landingGear=" + landingGear +
                ", ejectionSystem=" + ejectionSystem +
                ", seatOccupation=" + seatOccupation +
                '}';
    }
}
