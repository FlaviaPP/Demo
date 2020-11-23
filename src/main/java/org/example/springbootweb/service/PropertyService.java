package org.example.springbootweb.service;

import java.util.Map;
@Autowired
public interface PropertyService {
    public Map<String, Object> getPropertiesMap();
}
