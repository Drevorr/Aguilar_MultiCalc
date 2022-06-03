package mcm.edu.ph.aguiilar_multicalc;

public class Controller {

    //Physics
    public double weight(double getterSetterMass, double mass, double gravity){return (mass*gravity);
    }

    public double density(double mass, double mass2, double volume){
        return (mass2/volume);
    }

    public double velocity(double getterSetterDistance, double distance, double time){
        return (distance/time);
    }

    public double force(double mass, double mass3, double acceleration){
        return (mass3*acceleration);
    }

    //Geometry
    public String sphereVolume(double radius){
        return String.valueOf(4 * Math.PI * Math.pow(radius, 3.0) / 3);
    }

    public double coneVolume(double radius, double baseRadius, double height){
        return (Math.PI * Math.pow(baseRadius, 2.0) *  height / 3);
    }

    public double cylinderVolume(double radius, double baseRadius, double height){
        return (Math.PI * Math.pow(baseRadius, 2.0) *  height);
    }

    public double capsuleVolume(double radius, double baseRadius, double height){
        return (Math.PI * Math.pow(baseRadius, 2.0) *  ( 4 * baseRadius / 3 + height ));
    }

    public double sphereSA(double getterSetterRadius, double radius){
        return (4 * Math.PI * Math.pow(radius, 2.0));
    }

    public String coneSA(double baseRadius, double height){
        return String.valueOf(Math.PI * baseRadius * (baseRadius + Math.sqrt(Math.pow(height, 2.0) + Math.pow(baseRadius, 2.0))));
    }

    public String cylinderSA(double baseRadius, double height){
        return String.valueOf((2 * Math.PI * baseRadius * height) + (2 * Math.PI * Math.pow(baseRadius, 2.0)));
    }

    public String capsuleSA(double baseRadius, double height){
        return String.valueOf((2 * Math.PI * baseRadius * height) + (4 * Math.PI * Math.pow(baseRadius, 2.0)));
    }

}

