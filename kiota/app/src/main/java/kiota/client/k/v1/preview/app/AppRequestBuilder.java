package kiota.client.k.v1.preview.app;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.k.v1.preview.app.adminnotesjson.AdminNotesJsonRequestBuilder;
import kiota.client.k.v1.preview.app.deployjson.DeployJsonRequestBuilder;
import kiota.client.k.v1.preview.app.form.FormRequestBuilder;
/**
 * Builds and executes requests for operations under /k/v1/preview/app
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
     * The deployJson property
     * @return a {@link DeployJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeployJsonRequestBuilder deployJson() {
        return new DeployJsonRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The form property
     * @return a {@link FormRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FormRequestBuilder form() {
        return new FormRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AppRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/preview/app", pathParameters);
    }
    /**
     * Instantiates a new {@link AppRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1/preview/app", rawUrl);
    }
}
