package kiota.client.k.v1.preview;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.k.v1.preview.app.AppRequestBuilder;
import kiota.client.k.v1.preview.appjson.AppJsonRequestBuilder;
/**
 * Builds and executes requests for operations under /k/v1/preview
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PreviewRequestBuilder extends BaseRequestBuilder {
    /**
     * The app property
     * @return a {@link AppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRequestBuilder app() {
        return new AppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The appJson property
     * @return a {@link AppJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppJsonRequestBuilder appJson() {
        return new AppJsonRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PreviewRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PreviewRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/preview", pathParameters);
    }
    /**
     * Instantiates a new {@link PreviewRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PreviewRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/preview", rawUrl);
    }
}
