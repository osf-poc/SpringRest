package osf.poc.springremote.services;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.springframework.stereotype.Service;
import osf.poc.springremote.model.Property;

/**
 *
 * @author Jeremy
 */
@Stateless
@Service
public class PropertiesService implements PropertiesServiceLocal {
    
    private List<Property> properties = new ArrayList<Property>();

    public PropertiesService(){
        for(int i = 0; i < 1000; ++i){
            properties.add(new Property("count" + i, "" + i));
        }
    }
    
    @Override
    public List<Property> getProperties() {
        return new ArrayList<Property>(this.properties);
    }
}
