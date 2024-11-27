package kiota.client.guest.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.guest.item.k.KRequestBuilder;
/**
 * Builds and executes requests for operations under /guest/{SpaceID}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSpaceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The k property
     * @return a {@link KRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KRequestBuilder k() {
        return new KRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithSpaceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSpaceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest/{SpaceID}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithSpaceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSpaceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest/{SpaceID}", rawUrl);
    }
}
