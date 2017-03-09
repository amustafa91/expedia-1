package com.expedia.assignment.rest.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Configurable;
import javax.ws.rs.ext.Provider;

/**
 * REST client configurations wrapper class used to configure the REST consumer
 * and to register needed Providers
 * 
 * @author Mazen H. Khalil
 * @See {@link Configurable}
 * @See {@link Provider}
 */
public class ClientConfigurations {

    private final Map<String, Object> configurations = new HashMap<>();
    private final Set<Class<?>> providers = new HashSet<>();

    public void addConfiguration(String name, Object value) {
	configurations.put(name, value);
    }

    public Map<String, Object> getConfigurations() {
	return Collections.unmodifiableMap(configurations);
    }

    public void addProvider(Class<?> clazz) {
	providers.add(clazz);
    }

    public Set<Class<?>> getProviders() {
	return Collections.unmodifiableSet(providers);
    }
}