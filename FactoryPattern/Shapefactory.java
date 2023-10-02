package FactoryPattern;

public class Shapefactory {
    
    public ShapeInterface getShape(String input){

        switch (input) {
            case "Circle":
                return new Circle();
        
            case "Rectangle":
                return new Rectangle();

            case "Square":
                return new Square();

            default:
                return null;
        }

    }

}
