package com.expedia.assignment.rest.client.request.processor;

import javax.ws.rs.client.Invocation;

public abstract class RequestInvocationBuilder {

	public abstract Invocation build(Invocation.Builder invocationBuilder);
}
