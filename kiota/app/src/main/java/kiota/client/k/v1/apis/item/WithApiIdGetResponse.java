package kiota.client.k.v1.apis.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithApiIdGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The baseUrl property
     */
    private String baseUrl;
    /**
     * The httpMethod property
     */
    private String httpMethod;
    /**
     * The id property
     */
    private String id;
    /**
     * The path property
     */
    private String path;
    /**
     * The request property
     */
    private WithApiIdGetResponseRequest request;
    /**
     * The response property
     */
    private WithApiIdGetResponseResponse response;
    /**
     * The schemas property
     */
    private WithApiIdGetResponseSchemas schemas;
    /**
     * Instantiates a new {@link WithApiIdGetResponse} and sets the default values.
     */
    public WithApiIdGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WithApiIdGetResponse}
     */
    @jakarta.annotation.Nonnull
    public static WithApiIdGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithApiIdGetResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the baseUrl property value. The baseUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBaseUrl() {
        return this.baseUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("baseUrl", (n) -> { this.setBaseUrl(n.getStringValue()); });
        deserializerMap.put("httpMethod", (n) -> { this.setHttpMethod(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("request", (n) -> { this.setRequest(n.getObjectValue(WithApiIdGetResponseRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("response", (n) -> { this.setResponse(n.getObjectValue(WithApiIdGetResponseResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("schemas", (n) -> { this.setSchemas(n.getObjectValue(WithApiIdGetResponseSchemas::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the httpMethod property value. The httpMethod property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the path property value. The path property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the request property value. The request property
     * @return a {@link WithApiIdGetResponseRequest}
     */
    @jakarta.annotation.Nullable
    public WithApiIdGetResponseRequest getRequest() {
        return this.request;
    }
    /**
     * Gets the response property value. The response property
     * @return a {@link WithApiIdGetResponseResponse}
     */
    @jakarta.annotation.Nullable
    public WithApiIdGetResponseResponse getResponse() {
        return this.response;
    }
    /**
     * Gets the schemas property value. The schemas property
     * @return a {@link WithApiIdGetResponseSchemas}
     */
    @jakarta.annotation.Nullable
    public WithApiIdGetResponseSchemas getSchemas() {
        return this.schemas;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("baseUrl", this.getBaseUrl());
        writer.writeStringValue("httpMethod", this.getHttpMethod());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("path", this.getPath());
        writer.writeObjectValue("request", this.getRequest());
        writer.writeObjectValue("response", this.getResponse());
        writer.writeObjectValue("schemas", this.getSchemas());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the baseUrl property value. The baseUrl property
     * @param value Value to set for the baseUrl property.
     */
    public void setBaseUrl(@jakarta.annotation.Nullable final String value) {
        this.baseUrl = value;
    }
    /**
     * Sets the httpMethod property value. The httpMethod property
     * @param value Value to set for the httpMethod property.
     */
    public void setHttpMethod(@jakarta.annotation.Nullable final String value) {
        this.httpMethod = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the path property value. The path property
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the request property value. The request property
     * @param value Value to set for the request property.
     */
    public void setRequest(@jakarta.annotation.Nullable final WithApiIdGetResponseRequest value) {
        this.request = value;
    }
    /**
     * Sets the response property value. The response property
     * @param value Value to set for the response property.
     */
    public void setResponse(@jakarta.annotation.Nullable final WithApiIdGetResponseResponse value) {
        this.response = value;
    }
    /**
     * Sets the schemas property value. The schemas property
     * @param value Value to set for the schemas property.
     */
    public void setSchemas(@jakarta.annotation.Nullable final WithApiIdGetResponseSchemas value) {
        this.schemas = value;
    }
}
