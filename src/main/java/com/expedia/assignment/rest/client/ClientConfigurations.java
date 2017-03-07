package com.expedia.assignment.rest.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClientConfigurations {

	private final Map<String, Object> configurations = new HashMap<>();
	private final Set<Class> providers = new HashSet<>();

	public void addConfiguration(String name, Object value) {
		configurations.put(name, value);
	}

	public Map<String, Object> getConfigurations() {
		return Collections.unmodifiableMap(configurations);
	}

	public void addProvider(Class clazz) {
		providers.add(clazz);
	}

	public Set<Class> getProviders() {
		return Collections.unmodifiableSet(providers);
	}

}
