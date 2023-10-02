package FactoryPattern;

public class FactoryPattern {
    
    public static void main(String args[]){

        Shapefactory shape = new Shapefactory();
        ShapeInterface shapeObject = shape.getShape("");
        if(shapeObject != null)
            shapeObject.draw();

    }

}
