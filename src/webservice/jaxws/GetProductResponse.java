
package webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductResponse", namespace = "http://webservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductResponse", namespace = "http://webservice/")
public class GetProductResponse {

    @XmlElement(name = "return", namespace = "")
    private model.Product _return;

    /**
     * 
     * @return
     *     returns Product
     */
    public model.Product getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(model.Product _return) {
        this._return = _return;
    }

}
