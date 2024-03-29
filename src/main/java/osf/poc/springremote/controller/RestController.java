package osf.poc.springremote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import osf.poc.services.PropertiesServiceLocal;
import osf.poc.springremote.resources.PropertiesRest;

@Controller
public class RestController {
    private PropertiesServiceLocal service;

    public RestController(PropertiesServiceLocal service) {
        this.service = service;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/properties")
    public ModelAndView getProperties(){
        return new ModelAndView("properties", "properties", new PropertiesRest(service.getProperties()));
    }
}