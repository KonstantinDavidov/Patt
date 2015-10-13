package my.visitor.pattern;

import my.visitor.pattern.models.Car;
import my.visitor.pattern.visitors.CarElementDoVisitor;
import my.visitor.pattern.visitors.CarElementPrintVisitor;

/**
 * Created by davydovKP on 13.10.2015.
 */
public class DemoMain {
    public static void main(String[] args){
        ICarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
