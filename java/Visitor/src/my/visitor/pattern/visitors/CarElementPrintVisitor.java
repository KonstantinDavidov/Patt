package my.visitor.pattern.visitors;

import my.visitor.pattern.ICarElementVisitor;
import my.visitor.pattern.models.Body;
import my.visitor.pattern.models.Car;
import my.visitor.pattern.models.Engine;
import my.visitor.pattern.models.Wheel;

/**
 * Created by davydovKP on 13.10.2015.
 */
public class CarElementPrintVisitor implements ICarElementVisitor {
    public void visit(Wheel wheel) {
        System.out.println("Visiting" + wheel.getName() + "wheel");
    }

    public void visit(Engine engine){
        System.out.println("Visiting engine");
    }

    public void visit(Body body){
        System.out.println("Visiting body");
    }

    public void visit(Car car){
        System.out.println("Visiting car");
    }
}
