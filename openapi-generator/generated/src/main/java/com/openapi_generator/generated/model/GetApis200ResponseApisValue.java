/*
 * Kintone REST API
 * This is an experimental
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openapi_generator.generated.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.openapi_generator.generated.JSON;

/**
 * GetApis200ResponseApisValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T04:52:36.267360054Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class GetApis200ResponseApisValue {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  @javax.annotation.Nullable
  private String link;

  public GetApis200ResponseApisValue() {
  }

  public GetApis200ResponseApisValue link(@javax.annotation.Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = link;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApis200ResponseApisValue getApis200ResponseApisValue = (GetApis200ResponseApisValue) o;
    return Objects.equals(this.link, getApis200ResponseApisValue.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApis200ResponseApisValue {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetApis200ResponseApisValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetApis200ResponseApisValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetApis200ResponseApisValue is not found in the empty JSON string", GetApis200ResponseApisValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetApis200ResponseApisValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetApis200ResponseApisValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetApis200ResponseApisValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetApis200ResponseApisValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetApis200ResponseApisValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetApis200ResponseApisValue.class));

       return (TypeAdapter<T>) new TypeAdapter<GetApis200ResponseApisValue>() {
           @Override
           public void write(JsonWriter out, GetApis200ResponseApisValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetApis200ResponseApisValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetApis200ResponseApisValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetApis200ResponseApisValue
   * @throws IOException if the JSON string is invalid with respect to GetApis200ResponseApisValue
   */
  public static GetApis200ResponseApisValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetApis200ResponseApisValue.class);
  }

  /**
   * Convert an instance of GetApis200ResponseApisValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
