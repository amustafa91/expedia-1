package com.expedia.assignment.rest.client;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.uri.internal.JerseyUriBuilder;

import com.expedia.assignment.rest.client.request.Request;

public final class RequestExecutor {

	private RequestExecutor() {
	}

	public static Response processRequest(Request request, ClientConfigurations clientConfigurations) {
		Client client = getClient(clientConfigurations);
		UriBuilder uriBuilder = GetRequestUriBuilder(request);
		WebTarget webTarget = client.target(uriBuilder);
		Invocation.Builder invocationBuilder = webTarget.request();
		setHeaders(invocationBuilder, request.getHeaders());
		return new Response(request.getInvocationBuilder().build(invocationBuilder).invoke());
	}

	private static void setHeaders(Builder invocationBuilder, Map<String, Object> headers) {
		for (Entry<String, Object> entry : headers.entrySet()) {
			invocationBuilder.header(entry.getKey(), entry.getValue());
		}
	}

	private static UriBuilder GetRequestUriBuilder(Request request) {
		UriBuilder uriBuilder = new JerseyUriBuilder();
		uriBuilder.scheme(request.getSchema());
		uriBuilder.host(request.getHost());
		uriBuilder.port(request.getPort());
		uriBuilder.path(request.getResource());
		setQueryParameters(request, uriBuilder);
		return uriBuilder;
	}

	private static void setQueryParameters(Request request, UriBuilder uriBuilder) {
		for (Entry<String, Object[]> entry : request.getQueryParameters().entrySet()) {
			uriBuilder.queryParam(entry.getKey(), entry.getValue());
		}
	}

	private static Client getClient(ClientConfigurations clientConfigurations) {
		ClientConfig clientConfig = new ClientConfig();
		registerClientProviders(clientConfig, clientConfigurations.getProviders());
		setClientProperties(clientConfig, clientConfigurations.getConfigurations());
		return ClientBuilder.newClient(clientConfig);
	}

	private static void registerClientProviders(ClientConfig clientConfig, Set<Class> providers) {
		for (Class providerClass : providers) {
			clientConfig.register(providerClass);
		}
	}

	private static void setClientProperties(ClientConfig clientConfig, Map<String, Object> configurations) {
		for (Entry<String, Object> entry : configurations.entrySet()) {
			clientConfig.property(entry.getKey(), entry.getValue());
		}
	}
}