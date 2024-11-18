package kiota.client.k.v1.appjson;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kiota.client.models.GetAppResponss;
import kiota.client.models.KintoneRestApiError;
/**
 * Builds and executes requests for operations under /k/v1/app.json
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppJsonRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AppJsonRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppJsonRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/app.json", pathParameters);
    }
    /**
     * Instantiates a new {@link AppJsonRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppJsonRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/app.json", rawUrl);
    }
    /**
     * 1
     * @param body The request body
     * @return a {@link GetAppResponss}
     * @throws KintoneRestApiError When receiving a 400 status code
     * @throws KintoneRestApiError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetAppResponss post(@jakarta.annotation.Nonnull final AppPostRequestBody body) {
        return post(body, null);
    }
    /**
     * 1
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAppResponss}
     * @throws KintoneRestApiError When receiving a 400 status code
     * @throws KintoneRestApiError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetAppResponss post(@jakarta.annotation.Nonnull final AppPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", KintoneRestApiError::createFromDiscriminatorValue);
        errorMapping.put("500", KintoneRestApiError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetAppResponss::createFromDiscriminatorValue);
    }
    /**
     * 1
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AppPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * 1
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AppPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AppJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppJsonRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AppJsonRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
