package osf.poc.springremote.resources;

import java.util.List;
import javax.ejb.EJB;
import osf.poc.springremote.model.Property;
import osf.poc.springremote.services.PropertiesService;

/**
 *
 * @author Jeremy
 */
public class PropertiesResource implements IPropertiesResource {
    
    @EJB
    private PropertiesService service;

    @Override
    public List<Property> getProperties() {
        return service.getProperties();
    }
}
