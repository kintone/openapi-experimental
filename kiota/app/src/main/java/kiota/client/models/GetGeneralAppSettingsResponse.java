package kiota.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Get General App Settings Response
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetGeneralAppSettingsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of the app.
     */
    private String description;
    /**
     * The icon property
     */
    private GetGeneralAppSettingsResponseIcon icon;
    /**
     * The name of the app.
     */
    private String name;
    /**
     * The revision number of the app.
     */
    private String revision;
    /**
     * The theme of the app.
     */
    private String theme;
    /**
     * Instantiates a new {@link GetGeneralAppSettingsResponse} and sets the default values.
     */
    public GetGeneralAppSettingsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetGeneralAppSettingsResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetGeneralAppSettingsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetGeneralAppSettingsResponse();
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
     * Gets the description property value. The description of the app.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("icon", (n) -> { this.setIcon(n.getObjectValue(GetGeneralAppSettingsResponseIcon::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getStringValue()); });
        deserializerMap.put("theme", (n) -> { this.setTheme(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the icon property value. The icon property
     * @return a {@link GetGeneralAppSettingsResponseIcon}
     */
    @jakarta.annotation.Nullable
    public GetGeneralAppSettingsResponseIcon getIcon() {
        return this.icon;
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
     * Gets the revision property value. The revision number of the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRevision() {
        return this.revision;
    }
    /**
     * Gets the theme property value. The theme of the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTheme() {
        return this.theme;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("icon", this.getIcon());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("revision", this.getRevision());
        writer.writeStringValue("theme", this.getTheme());
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
     * Sets the description property value. The description of the app.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the icon property value. The icon property
     * @param value Value to set for the icon property.
     */
    public void setIcon(@jakarta.annotation.Nullable final GetGeneralAppSettingsResponseIcon value) {
        this.icon = value;
    }
    /**
     * Sets the name property value. The name of the app.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the revision property value. The revision number of the app.
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final String value) {
        this.revision = value;
    }
    /**
     * Sets the theme property value. The theme of the app.
     * @param value Value to set for the theme property.
     */
    public void setTheme(@jakarta.annotation.Nullable final String value) {
        this.theme = value;
    }
}
