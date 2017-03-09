package com.expedia.assignment.rest.client.request.processor;

import javax.ws.rs.client.Invocation;

/**
 * This class defines the correct way for building REST {@link Invocation} from
 * {@link Invocation.Builder}
 * 
 * @author Mazen H. Khalil
 */
public class GetRequestInvocationBuilder implements RequestInvocationBuilder {

    @Override
    public Invocation build(Invocation.Builder invocationBuilder) {
	return invocationBuilder.buildGet();
    }
}