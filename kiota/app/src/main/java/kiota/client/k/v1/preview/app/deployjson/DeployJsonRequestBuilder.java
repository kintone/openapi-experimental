package kiota.client.k.v1.preview.app.deployjson;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kiota.client.models.GetAppDeployStatusResponse;
/**
 * Builds and executes requests for operations under /k/v1/preview/app/deploy.json
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeployJsonRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DeployJsonRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeployJsonRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/preview/app/deploy.json?apps={apps}", pathParameters);
    }
    /**
     * Instantiates a new {@link DeployJsonRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeployJsonRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/preview/app/deploy.json?apps={apps}", rawUrl);
    }
    /**
     * Retrieves the deployment status of an app in Kintone.
     * @return a {@link GetAppDeployStatusResponse}
     */
    @jakarta.annotation.Nullable
    public GetAppDeployStatusResponse get() {
        return get(null);
    }
    /**
     * Retrieves the deployment status of an app in Kintone.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAppDeployStatusResponse}
     */
    @jakarta.annotation.Nullable
    public GetAppDeployStatusResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetAppDeployStatusResponse::createFromDiscriminatorValue);
    }
    /**
     * Deploys the settings of an app.
     * @param body The request body
     * @return a {@link DeployPostResponse}
     * @throws Deploy400Error When receiving a 400 status code
     * @throws Deploy401Error When receiving a 401 status code
     * @throws Deploy500Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public DeployPostResponse post(@jakarta.annotation.Nonnull final DeployPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Deploys the settings of an app.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeployPostResponse}
     * @throws Deploy400Error When receiving a 400 status code
     * @throws Deploy401Error When receiving a 401 status code
     * @throws Deploy500Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public DeployPostResponse post(@jakarta.annotation.Nonnull final DeployPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Deploy400Error::createFromDiscriminatorValue);
        errorMapping.put("401", Deploy401Error::createFromDiscriminatorValue);
        errorMapping.put("500", Deploy500Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeployPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Retrieves the deployment status of an app in Kintone.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieves the deployment status of an app in Kintone.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Deploys the settings of an app.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeployPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Deploys the settings of an app.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeployPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/k/v1/preview/app/deploy.json", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link DeployJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeployJsonRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeployJsonRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieves the deployment status of an app in Kintone.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The IDs of the apps.
         */
        @jakarta.annotation.Nullable
        public String[] apps;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("apps", apps);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
