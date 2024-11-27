package kiota.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Update App Admin Notes Request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateAppAdminNotesRequest extends AdminNotes implements Parsable {
    /**
     * The app property
     */
    private String app;
    /**
     * The revision property
     */
    private String revision;
    /**
     * Instantiates a new {@link UpdateAppAdminNotesRequest} and sets the default values.
     */
    public UpdateAppAdminNotesRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateAppAdminNotesRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateAppAdminNotesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAppAdminNotesRequest();
    }
    /**
     * Gets the app property value. The app property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApp() {
        return this.app;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("app", (n) -> { this.setApp(n.getStringValue()); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the revision property value. The revision property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRevision() {
        return this.revision;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("app", this.getApp());
        writer.writeStringValue("revision", this.getRevision());
    }
    /**
     * Sets the app property value. The app property
     * @param value Value to set for the app property.
     */
    public void setApp(@jakarta.annotation.Nullable final String value) {
        this.app = value;
    }
    /**
     * Sets the revision property value. The revision property
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final String value) {
        this.revision = value;
    }
}
