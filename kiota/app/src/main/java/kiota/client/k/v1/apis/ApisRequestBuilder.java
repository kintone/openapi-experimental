package kiota.client.k.v1.apis;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.k.v1.apis.item.WithApiIdJsonItemRequestBuilder;
/**
 * Builds and executes requests for operations under /k/v1/apis
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApisRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the kiota.client.k.v1.apis.item collection
     * @param apiIdJson Unique identifier of the item
     * @return a {@link WithApiIdJsonItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithApiIdJsonItemRequestBuilder byApiIdJson(@jakarta.annotation.Nonnull final String apiIdJson) {
        Objects.requireNonNull(apiIdJson);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("apiId", apiIdJson);
        return new WithApiIdJsonItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ApisRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApisRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/apis", pathParameters);
    }
    /**
     * Instantiates a new {@link ApisRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApisRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/apis", rawUrl);
    }
}
