package com.expedia.assignment.rest.client.request;

import com.expedia.assignment.rest.client.request.processor.GetRequestInvocationBuilder;
import com.expedia.assignment.rest.client.request.processor.RequestInvocationBuilder;

public class GetRequest extends Request {

	@Override
	public RequestInvocationBuilder getInvocationBuilder() {
		return new GetRequestInvocationBuilder();
	}
}