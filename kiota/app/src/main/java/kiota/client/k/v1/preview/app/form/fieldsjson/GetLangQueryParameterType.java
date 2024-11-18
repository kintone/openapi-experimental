package kiota.client.k.v1.preview.app.form.fieldsjson;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetLangQueryParameterType implements ValuedEnum {
    Default("default"),
    En("en"),
    Ja("ja"),
    Zh("zh"),
    User("user");
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
            case "default": return Default;
            case "en": return En;
            case "ja": return Ja;
            case "zh": return Zh;
            case "user": return User;
            default: return null;
        }
    }
}
