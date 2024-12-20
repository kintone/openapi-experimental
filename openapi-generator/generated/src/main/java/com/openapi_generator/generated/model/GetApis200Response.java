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
import com.openapi_generator.generated.model.GetApis200ResponseApisValue;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * GetApis200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T04:52:36.267360054Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class GetApis200Response {
  public static final String SERIALIZED_NAME_BASE_URL = "baseUrl";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  @javax.annotation.Nullable
  private String baseUrl;

  public static final String SERIALIZED_NAME_APIS = "apis";
  @SerializedName(SERIALIZED_NAME_APIS)
  @javax.annotation.Nullable
  private Map<String, GetApis200ResponseApisValue> apis = new HashMap<>();

  public GetApis200Response() {
  }

  public GetApis200Response baseUrl(@javax.annotation.Nullable String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Get baseUrl
   * @return baseUrl
   */
  @javax.annotation.Nullable
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(@javax.annotation.Nullable String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public GetApis200Response apis(@javax.annotation.Nullable Map<String, GetApis200ResponseApisValue> apis) {
    this.apis = apis;
    return this;
  }

  public GetApis200Response putApisItem(String key, GetApis200ResponseApisValue apisItem) {
    if (this.apis == null) {
      this.apis = new HashMap<>();
    }
    this.apis.put(key, apisItem);
    return this;
  }

  /**
   * Get apis
   * @return apis
   */
  @javax.annotation.Nullable
  public Map<String, GetApis200ResponseApisValue> getApis() {
    return apis;
  }

  public void setApis(@javax.annotation.Nullable Map<String, GetApis200ResponseApisValue> apis) {
    this.apis = apis;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApis200Response getApis200Response = (GetApis200Response) o;
    return Objects.equals(this.baseUrl, getApis200Response.baseUrl) &&
        Objects.equals(this.apis, getApis200Response.apis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, apis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApis200Response {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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
    openapiFields.add("baseUrl");
    openapiFields.add("apis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetApis200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetApis200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetApis200Response is not found in the empty JSON string", GetApis200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetApis200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetApis200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("baseUrl") != null && !jsonObj.get("baseUrl").isJsonNull()) && !jsonObj.get("baseUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetApis200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetApis200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetApis200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetApis200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetApis200Response>() {
           @Override
           public void write(JsonWriter out, GetApis200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetApis200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetApis200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetApis200Response
   * @throws IOException if the JSON string is invalid with respect to GetApis200Response
   */
  public static GetApis200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetApis200Response.class);
  }

  /**
   * Convert an instance of GetApis200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

