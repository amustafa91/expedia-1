package com.expedia.assignment.rest.client.request.processor;

import javax.ws.rs.client.Invocation;

import com.expedia.assignment.rest.client.request.Request;

/**
 * Request Invocation Builder determines how to build {@link Invocation.Builder}
 * from the {@link Invocation.Builder} based on {@link Request} type
 * 
 * @author Mazen H. Khalil
 */
public interface RequestInvocationBuilder {

    public abstract Invocation build(Invocation.Builder invocationBuilder);
}