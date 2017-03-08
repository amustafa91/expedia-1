package com.expedia.assignment.rest;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.moxy.json.MoxyJsonConfig;

@Provider
public class MoxyContextResolver implements ContextResolver<MoxyJsonConfig> {

	private final MoxyJsonConfig config;

	public MoxyContextResolver() {
		config = new MoxyJsonConfig();
		config.setIncludeRoot(false);
	}

	@Override
	public MoxyJsonConfig getContext(Class<?> objectType) {
		return config;
	}
}