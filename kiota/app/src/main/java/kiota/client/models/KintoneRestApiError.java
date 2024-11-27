package kiota.client.models;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The error response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KintoneRestApiError extends ApiException implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The index of the failed request when executing bulkRequest and one of the requests fails. This value is undefined otherwise.
     */
    private Double bulkRequestIndex;
    /**
     * The code of the error, to specify the type of error it is.
     */
    private String code;
    /**
     * The HTTP headers of the response.
     */
    private KintoneRestApiErrorHeaders headers;
    /**
     * The ID of the error.
     */
    private String id;
    /**
     * The error message.
     */
    private String message;
    /**
     * The HTTP status of the response.
     */
    private Double status;
    /**
     * Instantiates a new {@link KintoneRestApiError} and sets the default values.
     */
    public KintoneRestApiError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link KintoneRestApiError}
     */
    @jakarta.annotation.Nonnull
    public static KintoneRestApiError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KintoneRestApiError();
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
     * Gets the bulkRequestIndex property value. The index of the failed request when executing bulkRequest and one of the requests fails. This value is undefined otherwise.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBulkRequestIndex() {
        return this.bulkRequestIndex;
    }
    /**
     * Gets the code property value. The code of the error, to specify the type of error it is.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("bulkRequestIndex", (n) -> { this.setBulkRequestIndex(n.getDoubleValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("headers", (n) -> { this.setHeaders(n.getObjectValue(KintoneRestApiErrorHeaders::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the headers property value. The HTTP headers of the response.
     * @return a {@link KintoneRestApiErrorHeaders}
     */
    @jakarta.annotation.Nullable
    public KintoneRestApiErrorHeaders getHeaders() {
        return this.headers;
    }
    /**
     * Gets the id property value. The ID of the error.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * The primary error message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nonnull
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    /**
     * Gets the message property value. The error message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageEscaped() {
        return this.message;
    }
    /**
     * Gets the status property value. The HTTP status of the response.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("bulkRequestIndex", this.getBulkRequestIndex());
        writer.writeStringValue("code", this.getCode());
        writer.writeObjectValue("headers", this.getHeaders());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message", this.getMessageEscaped());
        writer.writeDoubleValue("status", this.getStatus());
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
     * Sets the bulkRequestIndex property value. The index of the failed request when executing bulkRequest and one of the requests fails. This value is undefined otherwise.
     * @param value Value to set for the bulkRequestIndex property.
     */
    public void setBulkRequestIndex(@jakarta.annotation.Nullable final Double value) {
        this.bulkRequestIndex = value;
    }
    /**
     * Sets the code property value. The code of the error, to specify the type of error it is.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the headers property value. The HTTP headers of the response.
     * @param value Value to set for the headers property.
     */
    public void setHeaders(@jakarta.annotation.Nullable final KintoneRestApiErrorHeaders value) {
        this.headers = value;
    }
    /**
     * Sets the id property value. The ID of the error.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message property value. The error message.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the status property value. The HTTP status of the response.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Double value) {
        this.status = value;
    }
}
