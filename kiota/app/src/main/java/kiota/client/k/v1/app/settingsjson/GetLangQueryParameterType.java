package kiota.client.k.v1.app.settingsjson;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetLangQueryParameterType implements ValuedEnum {
    En("en"),
    Ja("ja"),
    Zh("zh"),
    User("user"),
    Default("default");
    public final String value;
    GetLangQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetLangQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "en": return En;
            case "ja": return Ja;
            case "zh": return Zh;
            case "user": return User;
            case "default": return Default;
            default: return null;
        }
    }
}
