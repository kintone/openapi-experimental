package kiota.client.k.v1.apisjson;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApisGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The apis property
     */
    private ApisGetResponseApis apis;
    /**
     * The baseUrl property
     */
    private String baseUrl;
    /**
     * Instantiates a new {@link ApisGetResponse} and sets the default values.
     */
    public ApisGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApisGetResponse}
     */
    @jakarta.annotation.Nonnull
    public static ApisGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApisGetResponse();
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
     * Gets the apis property value. The apis property
     * @return a {@link ApisGetResponseApis}
     */
    @jakarta.annotation.Nullable
    public ApisGetResponseApis getApis() {
        return this.apis;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("apis", (n) -> { this.setApis(n.getObjectValue(ApisGetResponseApis::createFromDiscriminatorValue)); });
        deserializerMap.put("baseUrl", (n) -> { this.setBaseUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("apis", this.getApis());
        writer.writeStringValue("baseUrl", this.getBaseUrl());
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
     * Sets the apis property value. The apis property
     * @param value Value to set for the apis property.
     */
    public void setApis(@jakarta.annotation.Nullable final ApisGetResponseApis value) {
        this.apis = value;
    }
    /**
     * Sets the baseUrl property value. The baseUrl property
     * @param value Value to set for the baseUrl property.
     */
    public void setBaseUrl(@jakarta.annotation.Nullable final String value) {
        this.baseUrl = value;
    }
}
