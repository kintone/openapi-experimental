package kiota.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Get App Response
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAppResponss implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The appId property
     */
    private String appId;
    /**
     * The code property
     */
    private String code;
    /**
     * The createdAt property
     */
    private String createdAt;
    /**
     * The creator property
     */
    private GetAppResponssCreator creator;
    /**
     * The description property
     */
    private String description;
    /**
     * The modifiedAt property
     */
    private String modifiedAt;
    /**
     * The modifier property
     */
    private GetAppResponssModifier modifier;
    /**
     * The name property
     */
    private String name;
    /**
     * The spaceId property
     */
    private String spaceId;
    /**
     * The threadId property
     */
    private String threadId;
    /**
     * Instantiates a new {@link GetAppResponss} and sets the default values.
     */
    public GetAppResponss() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetAppResponss}
     */
    @jakarta.annotation.Nonnull
    public static GetAppResponss createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetAppResponss();
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
     * Gets the appId property value. The appId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the code property value. The code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the createdAt property value. The createdAt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the creator property value. The creator property
     * @return a {@link GetAppResponssCreator}
     */
    @jakarta.annotation.Nullable
    public GetAppResponssCreator getCreator() {
        return this.creator;
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("creator", (n) -> { this.setCreator(n.getObjectValue(GetAppResponssCreator::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getStringValue()); });
        deserializerMap.put("modifier", (n) -> { this.setModifier(n.getObjectValue(GetAppResponssModifier::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("spaceId", (n) -> { this.setSpaceId(n.getStringValue()); });
        deserializerMap.put("threadId", (n) -> { this.setThreadId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedAt property value. The modifiedAt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the modifier property value. The modifier property
     * @return a {@link GetAppResponssModifier}
     */
    @jakarta.annotation.Nullable
    public GetAppResponssModifier getModifier() {
        return this.modifier;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the spaceId property value. The spaceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpaceId() {
        return this.spaceId;
    }
    /**
     * Gets the threadId property value. The threadId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.threadId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("createdAt", this.getCreatedAt());
        writer.writeObjectValue("creator", this.getCreator());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("modifiedAt", this.getModifiedAt());
        writer.writeObjectValue("modifier", this.getModifier());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("spaceId", this.getSpaceId());
        writer.writeStringValue("threadId", this.getThreadId());
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
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the createdAt property value. The createdAt property
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the creator property value. The creator property
     * @param value Value to set for the creator property.
     */
    public void setCreator(@jakarta.annotation.Nullable final GetAppResponssCreator value) {
        this.creator = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the modifiedAt property value. The modifiedAt property
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final String value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the modifier property value. The modifier property
     * @param value Value to set for the modifier property.
     */
    public void setModifier(@jakarta.annotation.Nullable final GetAppResponssModifier value) {
        this.modifier = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the spaceId property value. The spaceId property
     * @param value Value to set for the spaceId property.
     */
    public void setSpaceId(@jakarta.annotation.Nullable final String value) {
        this.spaceId = value;
    }
    /**
     * Sets the threadId property value. The threadId property
     * @param value Value to set for the threadId property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.threadId = value;
    }
}
