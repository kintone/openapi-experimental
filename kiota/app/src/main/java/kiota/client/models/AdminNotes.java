package kiota.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * App Admin Notes
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminNotes implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The content property
     */
    private String content;
    /**
     * The includeInTemplateAndDuplicates property
     */
    private Boolean includeInTemplateAndDuplicates;
    /**
     * Instantiates a new {@link AdminNotes} and sets the default values.
     */
    public AdminNotes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminNotes}
     */
    @jakarta.annotation.Nonnull
    public static AdminNotes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminNotes();
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
     * Gets the content property value. The content property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("includeInTemplateAndDuplicates", (n) -> { this.setIncludeInTemplateAndDuplicates(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeInTemplateAndDuplicates property value. The includeInTemplateAndDuplicates property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeInTemplateAndDuplicates() {
        return this.includeInTemplateAndDuplicates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeBooleanValue("includeInTemplateAndDuplicates", this.getIncludeInTemplateAndDuplicates());
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
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the includeInTemplateAndDuplicates property value. The includeInTemplateAndDuplicates property
     * @param value Value to set for the includeInTemplateAndDuplicates property.
     */
    public void setIncludeInTemplateAndDuplicates(@jakarta.annotation.Nullable final Boolean value) {
        this.includeInTemplateAndDuplicates = value;
    }
}
