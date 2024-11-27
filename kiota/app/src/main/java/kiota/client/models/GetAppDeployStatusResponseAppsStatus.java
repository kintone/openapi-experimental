package kiota.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The deployment status of the app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetAppDeployStatusResponseAppsStatus implements ValuedEnum {
    PROCESSING("PROCESSING"),
    SUCCESS("SUCCESS"),
    FAIL("FAIL"),
    CANCEL("CANCEL");
    public final String value;
    GetAppDeployStatusResponseAppsStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetAppDeployStatusResponseAppsStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PROCESSING": return PROCESSING;
            case "SUCCESS": return SUCCESS;
            case "FAIL": return FAIL;
            case "CANCEL": return CANCEL;
            default: return null;
        }
    }
}
