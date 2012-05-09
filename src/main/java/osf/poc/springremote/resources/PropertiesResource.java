package osf.poc.springremote.resources;

import java.util.List;
import osf.poc.springremote.model.Property;
import osf.poc.springremote.services.PropertiesServiceLocal;

/**
 *
 * @author Jeremy
 */
public class PropertiesResource implements IPropertiesResource {
    
    private PropertiesServiceLocal service;
    
    public PropertiesResource(PropertiesServiceLocal service) {
        this.service = service;
    }

    @Override
    public List<Property> getProperties() {
        return service.getProperties();
    }
}
