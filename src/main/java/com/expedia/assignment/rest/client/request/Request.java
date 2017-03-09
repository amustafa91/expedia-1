package com.expedia.assignment.rest.client.request;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.expedia.assignment.rest.client.RequestExecutor;
import com.expedia.assignment.rest.client.request.processor.RequestInvocationBuilder;

/**
 * Abstract request wrapper to build generic REST request
 * 
 * @author Mazen H. Khalil
 * @see RequestExecutor
 * @see RequestInvocationBuilder
 */
public abstract class Request {

    private String schema;
    private String host;
    private Integer port;
    private String resource;
    private final Map<String, Object[]> queryParameters = new HashMap<>();
    private final Map<String, Object> headers = new HashMap<>();

    public Request(String schema, String host, Integer port, String resource) {
	if (schema == null) {
	    throw new IllegalArgumentException("schema cannot be null");
	}

	if (host == null) {
	    throw new IllegalArgumentException("host cannot be null");
	}

	if (port == null) {
	    throw new IllegalArgumentException("port cannot be null");
	}

	if (resource == null) {
	    throw new IllegalArgumentException("resource cannot be null");
	}

	this.schema = schema;
	this.host = host;
	this.port = port;
	this.resource = resource;
    }

    public String getSchema() {
	return schema;
    }

    public void setSchema(String schema) {
	this.schema = schema;
    }

    public String getHost() {
	return host;
    }

    public void setHost(String host) {
	this.host = host;
    }

    public Integer getPort() {
	return port;
    }

    public void setPort(Integer port) {
	this.port = port;
    }

    public String getResource() {
	return resource;
    }

    public void setResource(String resource) {
	this.resource = resource;
    }

    public void addQueryParameter(String parameterName, Object... value) {
	queryParameters.put(parameterName, value);
    }

    public Map<String, Object[]> getQueryParameters() {
	return Collections.unmodifiableMap(queryParameters);
    }

    public void addHeader(String headerName, String value) {
	headers.put(headerName, value);
    }

    public Map<String, Object> getHeaders() {
	return Collections.unmodifiableMap(headers);
    }

    public abstract RequestInvocationBuilder getInvocationBuilder();
}