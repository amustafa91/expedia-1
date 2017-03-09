package com.expedia.assignment.rest.client;

/**
 * {@link javax.ws.rs.core.Response} wrapper
 * 
 * @author Mazen H. Khalil
 * @see javax.ws.rs.core.Response
 */
public class Response {

    private final javax.ws.rs.core.Response response;

    public Response(javax.ws.rs.core.Response response) {
	this.response = response;
    }

    public int getStatusCode() {
	return response.getStatusInfo().getStatusCode();
    }

    public String getStatusMessage() {
	return response.getStatusInfo().getReasonPhrase();
    }

    public <T> T readEntity(Class<T> type) {
	return response.readEntity(type);
    }
}