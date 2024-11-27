package kiota.client;

import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
import kiota.client.guest.GuestRequestBuilder;
import kiota.client.k.KRequestBuilder;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiClient extends BaseRequestBuilder {
    /**
     * The guest property
     * @return a {@link GuestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GuestRequestBuilder guest() {
        return new GuestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The k property
     * @return a {@link KRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KRequestBuilder k() {
        return new KRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://sample.cybozu.com");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
