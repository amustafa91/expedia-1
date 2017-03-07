package com.expedia.assignment.rest.client.request.processor;

import javax.ws.rs.client.Invocation;

public class GetRequestInvocationBuilder extends RequestInvocationBuilder {

	@Override
	public Invocation build(Invocation.Builder invocationBuilder) {
		return invocationBuilder.buildGet();
	}
}