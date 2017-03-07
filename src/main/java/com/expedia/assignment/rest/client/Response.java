package com.expedia.assignment.rest.client;

public class Response {

	private final javax.ws.rs.core.Response response;

	public Response(javax.ws.rs.core.Response response) {
		this.response = response;
	}

	public int getStatusCode() {
		return response.getStatusInfo().getStatusCode();
	}

	public <T> T readEntity(Class<T> type) {
		return response.readEntity(type);
	}
}