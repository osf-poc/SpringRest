package osf.poc.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import osf.poc.model.Property;

/**
 * Represent a service to get configuration properties
 */
@Service
public class PropertiesService implements PropertiesServiceLocal {
    
    private List<Property> properties = new ArrayList<Property>();

    public PropertiesService(){
        for(int i = 0; i < 1000; ++i){
            properties.add(new Property("count" + i, "" + i));
        }
    }
    
    @Override
    public void init() {
        // TODO for JPA
    }
    
    @Override
    public List<Property> getProperties() {
        return new ArrayList<Property>(this.properties);
    }
}
