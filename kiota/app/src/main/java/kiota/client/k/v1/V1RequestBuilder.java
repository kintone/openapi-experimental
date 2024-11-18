package kiota.client.k.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.k.v1.apis.ApisRequestBuilder;
import kiota.client.k.v1.apisjson.ApisJsonRequestBuilder;
import kiota.client.k.v1.app.AppRequestBuilder;
import kiota.client.k.v1.appjson.AppJsonRequestBuilder;
import kiota.client.k.v1.filejson.FileJsonRequestBuilder;
import kiota.client.k.v1.preview.PreviewRequestBuilder;
/**
 * Builds and executes requests for operations under /k/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The apis property
     * @return a {@link ApisRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApisRequestBuilder apis() {
        return new ApisRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The apisJson property
     * @return a {@link ApisJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApisJsonRequestBuilder apisJson() {
        return new ApisJsonRequestBuilder(pathParameters, requestAdapter);
    }
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
     * The fileJson property
     * @return a {@link FileJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FileJsonRequestBuilder fileJson() {
        return new FileJsonRequestBuilder(pathParameters, requestAdapter);
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
        super(requestAdapter, "{+baseurl}/k/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/k/v1", rawUrl);
    }
}
