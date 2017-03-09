package com.expedia.assignment.rest.client.request;

import javax.ws.rs.HttpMethod;

import com.expedia.assignment.rest.client.request.processor.GetRequestInvocationBuilder;
import com.expedia.assignment.rest.client.request.processor.RequestInvocationBuilder;

/**
 * This class represents the concrete implementation of RESTful HTTP GET request
 * 
 * @author Mazen H. Khalil
 * @see HttpMethod#GET
 */
public class GetRequest extends Request {

    public GetRequest(String schema, String host, Integer port, String resource) {
	super(schema, host, port, resource);
    }

    @Override
    public RequestInvocationBuilder getInvocationBuilder() {
	return new GetRequestInvocationBuilder();
    }
}