package my.visitor.pattern.models;

import my.visitor.pattern.ICarElement;
import my.visitor.pattern.ICarElementVisitor;

/**
 * Created by davydovKP on 13.10.2015.
 */
public class Car implements ICarElement {
    private ICarElement[] elements;

    public Car(){
        elements = new ICarElement[]{new Wheel("front left"),
        new Wheel("front right"), new Wheel("back left"),
        new Wheel("back right"), new Body(), new Engine()};
    }

    public void accept(ICarElementVisitor visitor){
        for(ICarElement elem : elements)
            elem.accept(visitor);
        visitor.visit(this);
    }
}
