package org.example.springbootweb.controller;

import org.example.springbootweb.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ContentController {
    @Autowired
    private PropertyService propertyService;
    @GetMapping("/loadProperties")
    public Map loadProperties() throws Exception{
        //Credential from Authorization
        //Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //String username = authentication.getName();
        //Metadata
        Map resultMap = propertyService.getPropertiesMap();
        return resultMap;
    }
}
