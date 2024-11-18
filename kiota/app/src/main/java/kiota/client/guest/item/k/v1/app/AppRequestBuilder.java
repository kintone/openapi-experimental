package kiota.client.guest.item.k.v1.app;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.guest.item.k.v1.app.adminnotesjson.AdminNotesJsonRequestBuilder;
/**
 * Builds and executes requests for operations under /guest/{SpaceID}/k/v1/app
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppRequestBuilder extends BaseRequestBuilder {
    /**
     * The adminNotesJson property
     * @return a {@link AdminNotesJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdminNotesJsonRequestBuilder adminNotesJson() {
        return new AdminNotesJsonRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AppRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest/{SpaceID}/k/v1/app", pathParameters);
    }
    /**
     * Instantiates a new {@link AppRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/guest/{SpaceID}/k/v1/app", rawUrl);
    }
}