package kiota.client.guest;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.guest.item.WithSpaceItemRequestBuilder;
/**
 * Builds and executes requests for operations under /guest
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GuestRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the kiota.client.guest.item collection
     * @param spaceID The Guest Space ID.
     * @return a {@link WithSpaceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSpaceItemRequestBuilder bySpaceID(@jakarta.annotation.Nonnull final Integer spaceID) {
        Objects.requireNonNull(spaceID);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("SpaceID", spaceID);
        return new WithSpaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link GuestRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GuestRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest", pathParameters);
    }
    /**
     * Instantiates a new {@link GuestRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GuestRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest", rawUrl);
    }
}
