package osf.poc.springremote.resources;

import java.util.List;
import osf.poc.model.Property;
import osf.poc.services.PropertiesServiceLocal;

/**
 * Represent the resource shared through the HTTP invoder
 */
public class PropertiesHttpInvoker implements IPropertiesHttpInvoker {
    
    private PropertiesServiceLocal service;
    
    public PropertiesHttpInvoker(PropertiesServiceLocal service) {
        this.service = service;
    }

    @Override
    public List<Property> getProperties() {
        return service.getProperties();
    }
}
