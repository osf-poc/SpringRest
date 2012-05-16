package osf.poc.springremote.resources;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import osf.poc.model.Property;
import osf.poc.services.PropertiesServiceLocal;

/**
 * End point for the JAX-WS Implementation
 * @author wichtounet
 */
@WebService(serviceName="PropertiesJAXWS")
public class PropertiesEndPoint {

    @Autowired
    private PropertiesServiceLocal service;

    @WebMethod
    public List<Property> getProperties() {
        return service.getProperties();
    }
}