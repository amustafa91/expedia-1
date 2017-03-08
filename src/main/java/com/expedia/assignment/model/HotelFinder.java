package com.expedia.assignment.model;

import com.expedia.assignment.model.entities.Result;
import com.expedia.assignment.rest.MoxyContextResolver;
import com.expedia.assignment.rest.client.ClientConfigurations;
import com.expedia.assignment.rest.client.RequestExecutor;
import com.expedia.assignment.rest.client.Response;
import com.expedia.assignment.rest.client.request.GetRequest;
import com.expedia.assignment.rest.client.request.Request;

public final class HotelFinder {

	public static final String SCHEMA = "https";
	public static final String HOST = "offersvc.expedia.com";
	public static final Integer PORT = 443;
	public static final String RESOURCE = "offers/v2/getOffers";

	public static Result find(Filter filter) {
		Request request = generateRequest(filter);

		ClientConfigurations clientConfigurations = new ClientConfigurations();
		clientConfigurations.addProvider(MoxyContextResolver.class);
		Response response = RequestExecutor.processRequest(request, clientConfigurations);

		return response.readEntity(Result.class);
	}

	private static Request generateRequest(Filter filter) {
		Request request = new GetRequest();
		request.setSchema(SCHEMA);
		request.setHost(HOST);
		request.setPort(PORT);
		request.setResource(RESOURCE);
		request.addQueryParameter("scenario", "deal-finder");
		request.addQueryParameter("page", "foo");
		request.addQueryParameter("uid", "foo");
		request.addQueryParameter("productType", "Hotel");

		return request;
	}
}