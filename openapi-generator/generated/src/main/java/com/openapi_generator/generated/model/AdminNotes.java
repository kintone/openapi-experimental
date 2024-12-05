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
 * App Admin Notes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T04:52:36.267360054Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class AdminNotes {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  @javax.annotation.Nullable
  private String content;

  public static final String SERIALIZED_NAME_INCLUDE_IN_TEMPLATE_AND_DUPLICATES = "includeInTemplateAndDuplicates";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IN_TEMPLATE_AND_DUPLICATES)
  @javax.annotation.Nullable
  private Boolean includeInTemplateAndDuplicates;

  public AdminNotes() {
  }

  public AdminNotes content(@javax.annotation.Nullable String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(@javax.annotation.Nullable String content) {
    this.content = content;
  }


  public AdminNotes includeInTemplateAndDuplicates(@javax.annotation.Nullable Boolean includeInTemplateAndDuplicates) {
    this.includeInTemplateAndDuplicates = includeInTemplateAndDuplicates;
    return this;
  }

  /**
   * Get includeInTemplateAndDuplicates
   * @return includeInTemplateAndDuplicates
   */
  @javax.annotation.Nullable
  public Boolean getIncludeInTemplateAndDuplicates() {
    return includeInTemplateAndDuplicates;
  }

  public void setIncludeInTemplateAndDuplicates(@javax.annotation.Nullable Boolean includeInTemplateAndDuplicates) {
    this.includeInTemplateAndDuplicates = includeInTemplateAndDuplicates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminNotes adminNotes = (AdminNotes) o;
    return Objects.equals(this.content, adminNotes.content) &&
        Objects.equals(this.includeInTemplateAndDuplicates, adminNotes.includeInTemplateAndDuplicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, includeInTemplateAndDuplicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminNotes {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    includeInTemplateAndDuplicates: ").append(toIndentedString(includeInTemplateAndDuplicates)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("includeInTemplateAndDuplicates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdminNotes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdminNotes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminNotes is not found in the empty JSON string", AdminNotes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdminNotes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminNotes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminNotes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminNotes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminNotes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminNotes.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminNotes>() {
           @Override
           public void write(JsonWriter out, AdminNotes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminNotes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdminNotes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdminNotes
   * @throws IOException if the JSON string is invalid with respect to AdminNotes
   */
  public static AdminNotes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminNotes.class);
  }

  /**
   * Convert an instance of AdminNotes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

