package osf.poc.springremote.resources;

import java.util.List;
import osf.poc.model.Property;

/**
 * Abstracted resource shared using HTTP invoker
 */
public interface IPropertiesHttpInvoker {

    public List<Property> getProperties();
    
}