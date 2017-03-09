package com.expedia.assignment.model;

import com.expedia.assignment.model.entities.Result;
import com.expedia.assignment.rest.MoxyContextResolver;
import com.expedia.assignment.rest.client.ClientConfigurations;
import com.expedia.assignment.rest.client.RequestExecutor;
import com.expedia.assignment.rest.client.Response;
import com.expedia.assignment.rest.client.request.GetRequest;
import com.expedia.assignment.rest.client.request.Request;

/**
 * This is the main class used to request for hotel deals
 * 
 * @author Mazen H. Khalil
 * @see Filter
 */
public final class HotelFinder {

    private static final String SCHEMA = "https";
    private static final String HOST = "offersvc.expedia.com";
    private static final Integer PORT = 443;
    private static final String RESOURCE = "offers/v2/getOffers";
    private static final String SCENARIO_QUERY_PARAMETER = "scenario";
    private static final String PAGE_QUERY_PARAMETER = "page";
    private static final String UID_QUERY_PARAMETER = "uid";
    private static final String PRODUCT_TYPE_QUERY_PARAMETER = "productType";

    public static Result find(Filter filter) {
	Request request = generateRequest(filter);
	ClientConfigurations clientConfigurations = new ClientConfigurations();
	clientConfigurations.addProvider(MoxyContextResolver.class);
	Response response = RequestExecutor.processRequest(request, clientConfigurations);
	return response.readEntity(Result.class);
    }

    private static Request generateRequest(Filter filter) {
	Request request = new GetRequest(SCHEMA, HOST, PORT, RESOURCE);
	request.addQueryParameter(SCENARIO_QUERY_PARAMETER, "deal-finder");
	request.addQueryParameter(PAGE_QUERY_PARAMETER, "foo");
	request.addQueryParameter(UID_QUERY_PARAMETER, "foo");
	request.addQueryParameter(PRODUCT_TYPE_QUERY_PARAMETER, "Hotel");
	applyFilter(request, filter);
	return request;
    }

    /**
     * Adds {@link Filter} parameters to the request
     * 
     * @param request
     * @param filter
     */
    private static void applyFilter(Request request, Filter filter) {
	addQueryParameter(request, Filter.DESTINATION_NAME_QUERY_PARAMETER, filter.getDestinationName());
	addQueryParameter(request, Filter.DESTINATION_CITY_QUERY_PARAMETER, filter.getDestinationCity());
	addQueryParameter(request, Filter.REGION_IDS_QUERY_PARAMETER, filter.getRegionIds() == null ? null : filter.getRegionIds().split(","));
	addQueryParameter(request, Filter.MIN_TRIP_START_DATE_QUERY_PARAMETER, filter.getMinTripStartDate());
	addQueryParameter(request, Filter.MAX_TRIP_START_DATE_QUERY_PARAMETER, filter.getMaxTripStartDate());
	addQueryParameter(request, Filter.LENGH_OF_STAY_QUERY_PARAMETER, filter.getLengthOfStay());
	addQueryParameter(request, Filter.MIN_STAR_RATING_QUERY_PARAMETER, filter.getMinStarRating());
	addQueryParameter(request, Filter.MAX_STAR_RATING_QUERY_PARAMETER, filter.getMaxStarRating());
	addQueryParameter(request, Filter.MIN_TOTAL_RATE_QUERY_PARAMETER, filter.getMinTotalRate());
	addQueryParameter(request, Filter.MAX_TOTAL_RATE__QUERY_PARAMETER, filter.getMaxTotalRate());
	addQueryParameter(request, Filter.MIN_GUEST_RATING_QUERY_PARAMETER, filter.getMinGuestRating());
	addQueryParameter(request, Filter.MAX_GUEST_RATING__QUERY_PARAMETER, filter.getMaxGuestRating());
    }

    private static void addQueryParameter(Request request, String parameterName, Object... parameterValue) {
	if (parameterValue == null || parameterValue[0] == null || parameterValue[0].toString().isEmpty()) {
	    return;
	}
	request.addQueryParameter(parameterName, parameterValue);
    }
}