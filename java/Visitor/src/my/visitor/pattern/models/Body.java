package my.visitor.pattern.models;

import my.visitor.pattern.ICarElement;
import my.visitor.pattern.ICarElementVisitor;

/**
 * Created by davydovKP on 13.10.2015.
 */
public class Body implements ICarElement {
    public void accept(ICarElementVisitor visitor){
        visitor.visit(this);
    }
}
