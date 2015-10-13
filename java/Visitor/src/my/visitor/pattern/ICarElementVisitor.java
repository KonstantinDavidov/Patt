package my.visitor.pattern;

import my.visitor.pattern.models.Body;
import my.visitor.pattern.models.Car;
import my.visitor.pattern.models.Engine;
import my.visitor.pattern.models.Wheel;

/**
 * Created by davydovKP on 13.10.2015.
 */
public interface ICarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
