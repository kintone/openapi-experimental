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
 * DeployAppSettingsRequestAppsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T04:52:36.267360054Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class DeployAppSettingsRequestAppsInner {
  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  @javax.annotation.Nullable
  private String app;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  @javax.annotation.Nullable
  private String revision;

  public DeployAppSettingsRequestAppsInner() {
  }

  public DeployAppSettingsRequestAppsInner app(@javax.annotation.Nullable String app) {
    this.app = app;
    return this;
  }

  /**
   * The ID of the app.
   * @return app
   */
  @javax.annotation.Nullable
  public String getApp() {
    return app;
  }

  public void setApp(@javax.annotation.Nullable String app) {
    this.app = app;
  }


  public DeployAppSettingsRequestAppsInner revision(@javax.annotation.Nullable String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The revision number of the app.
   * @return revision
   */
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(@javax.annotation.Nullable String revision) {
    this.revision = revision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployAppSettingsRequestAppsInner deployAppSettingsRequestAppsInner = (DeployAppSettingsRequestAppsInner) o;
    return Objects.equals(this.app, deployAppSettingsRequestAppsInner.app) &&
        Objects.equals(this.revision, deployAppSettingsRequestAppsInner.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployAppSettingsRequestAppsInner {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
    openapiFields.add("app");
    openapiFields.add("revision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeployAppSettingsRequestAppsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeployAppSettingsRequestAppsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeployAppSettingsRequestAppsInner is not found in the empty JSON string", DeployAppSettingsRequestAppsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeployAppSettingsRequestAppsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeployAppSettingsRequestAppsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("app") != null && !jsonObj.get("app").isJsonNull()) && !jsonObj.get("app").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeployAppSettingsRequestAppsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeployAppSettingsRequestAppsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeployAppSettingsRequestAppsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeployAppSettingsRequestAppsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DeployAppSettingsRequestAppsInner>() {
           @Override
           public void write(JsonWriter out, DeployAppSettingsRequestAppsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeployAppSettingsRequestAppsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeployAppSettingsRequestAppsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeployAppSettingsRequestAppsInner
   * @throws IOException if the JSON string is invalid with respect to DeployAppSettingsRequestAppsInner
   */
  public static DeployAppSettingsRequestAppsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeployAppSettingsRequestAppsInner.class);
  }

  /**
   * Convert an instance of DeployAppSettingsRequestAppsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

