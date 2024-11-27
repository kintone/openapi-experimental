package kiota.client.guest.item.k.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.guest.item.k.v1.app.AppRequestBuilder;
import kiota.client.guest.item.k.v1.preview.PreviewRequestBuilder;
/**
 * Builds and executes requests for operations under /guest/{SpaceID}/k/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The app property
     * @return a {@link AppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRequestBuilder app() {
        return new AppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The preview property
     * @return a {@link PreviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PreviewRequestBuilder preview() {
        return new PreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest/{SpaceID}/k/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest/{SpaceID}/k/v1", rawUrl);
    }
}
