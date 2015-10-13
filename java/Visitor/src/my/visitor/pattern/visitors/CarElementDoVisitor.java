package my.visitor.pattern.visitors;

import my.visitor.pattern.ICarElementVisitor;
import my.visitor.pattern.models.Body;
import my.visitor.pattern.models.Car;
import my.visitor.pattern.models.Engine;
import my.visitor.pattern.models.Wheel;

/**
 * Created by davydovKP on 13.10.2015.
 */
public class CarElementDoVisitor implements ICarElementVisitor {
    public void visit(Wheel wheel){
        System.out.println("Kicking my" + wheel.getName() + "wheel");
    }

    public void visit(Engine engine){
        System.out.println("Starting my engine");
    }

    public void visit(Body body){
        System.out.println("Moving my body");
    }

    public void visit(Car car){
        System.out.println("Starting my car");
    }
}
