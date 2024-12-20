package kiota.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Add App Request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddAppRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the app.
     */
    private String name;
    /**
     * The ID of the space where the app will be created.
     */
    private Integer space;
    /**
     * The ID of the thread where the app will be created.
     */
    private Integer thread;
    /**
     * Instantiates a new {@link AddAppRequest} and sets the default values.
     */
    public AddAppRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddAppRequest}
     */
    @jakarta.annotation.Nonnull
    public static AddAppRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddAppRequest();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("space", (n) -> { this.setSpace(n.getIntegerValue()); });
        deserializerMap.put("thread", (n) -> { this.setThread(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the space property value. The ID of the space where the app will be created.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSpace() {
        return this.space;
    }
    /**
     * Gets the thread property value. The ID of the thread where the app will be created.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getThread() {
        return this.thread;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("space", this.getSpace());
        writer.writeIntegerValue("thread", this.getThread());
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
     * Sets the name property value. The name of the app.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the space property value. The ID of the space where the app will be created.
     * @param value Value to set for the space property.
     */
    public void setSpace(@jakarta.annotation.Nullable final Integer value) {
        this.space = value;
    }
    /**
     * Sets the thread property value. The ID of the thread where the app will be created.
     * @param value Value to set for the thread property.
     */
    public void setThread(@jakarta.annotation.Nullable final Integer value) {
        this.thread = value;
    }
}
