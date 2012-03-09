package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-01-25T17:41:44")
@StaticMetamodel(ProductCode.class)
public class ProductCode_ { 

    public static volatile SingularAttribute<ProductCode, String> description;
    public static volatile SingularAttribute<ProductCode, String> prodCode;
    public static volatile CollectionAttribute<ProductCode, Product> productCollection;
    public static volatile SingularAttribute<ProductCode, Character> discountCode;

}