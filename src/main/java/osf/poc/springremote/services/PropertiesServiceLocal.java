/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osf.poc.springremote.services;

import java.util.List;
import javax.ejb.Local;
import osf.poc.springremote.model.Property;

/**
 *
 * @author Jeremy
 */
@Local
public interface PropertiesServiceLocal {
    
    public List<Property> getProperties();

}
