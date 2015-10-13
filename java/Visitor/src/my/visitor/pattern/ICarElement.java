package my.visitor.pattern;

/**
 * Created by davydovKP on 13.10.2015.
 */
public interface ICarElement {
    void accept(ICarElementVisitor visitor);
}
