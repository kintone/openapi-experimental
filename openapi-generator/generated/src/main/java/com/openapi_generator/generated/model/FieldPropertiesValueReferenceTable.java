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
import com.openapi_generator.generated.model.FieldPropertiesValueReferenceTableCondition;
import com.openapi_generator.generated.model.FieldPropertiesValueReferenceTableRelatedApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * FieldPropertiesValueReferenceTable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T04:52:36.267360054Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class FieldPropertiesValueReferenceTable {
  public static final String SERIALIZED_NAME_RELATED_APP = "relatedApp";
  @SerializedName(SERIALIZED_NAME_RELATED_APP)
  @javax.annotation.Nullable
  private FieldPropertiesValueReferenceTableRelatedApp relatedApp;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  @javax.annotation.Nullable
  private FieldPropertiesValueReferenceTableCondition condition;

  public static final String SERIALIZED_NAME_FILTER_COND = "filterCond";
  @SerializedName(SERIALIZED_NAME_FILTER_COND)
  @javax.annotation.Nullable
  private String filterCond;

  public static final String SERIALIZED_NAME_DISPLAY_FIELDS = "displayFields";
  @SerializedName(SERIALIZED_NAME_DISPLAY_FIELDS)
  @javax.annotation.Nullable
  private List<String> displayFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  @javax.annotation.Nullable
  private String sort;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  @javax.annotation.Nullable
  private String size;

  public FieldPropertiesValueReferenceTable() {
  }

  public FieldPropertiesValueReferenceTable relatedApp(@javax.annotation.Nullable FieldPropertiesValueReferenceTableRelatedApp relatedApp) {
    this.relatedApp = relatedApp;
    return this;
  }

  /**
   * Get relatedApp
   * @return relatedApp
   */
  @javax.annotation.Nullable
  public FieldPropertiesValueReferenceTableRelatedApp getRelatedApp() {
    return relatedApp;
  }

  public void setRelatedApp(@javax.annotation.Nullable FieldPropertiesValueReferenceTableRelatedApp relatedApp) {
    this.relatedApp = relatedApp;
  }


  public FieldPropertiesValueReferenceTable condition(@javax.annotation.Nullable FieldPropertiesValueReferenceTableCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @javax.annotation.Nullable
  public FieldPropertiesValueReferenceTableCondition getCondition() {
    return condition;
  }

  public void setCondition(@javax.annotation.Nullable FieldPropertiesValueReferenceTableCondition condition) {
    this.condition = condition;
  }


  public FieldPropertiesValueReferenceTable filterCond(@javax.annotation.Nullable String filterCond) {
    this.filterCond = filterCond;
    return this;
  }

  /**
   * Get filterCond
   * @return filterCond
   */
  @javax.annotation.Nullable
  public String getFilterCond() {
    return filterCond;
  }

  public void setFilterCond(@javax.annotation.Nullable String filterCond) {
    this.filterCond = filterCond;
  }


  public FieldPropertiesValueReferenceTable displayFields(@javax.annotation.Nullable List<String> displayFields) {
    this.displayFields = displayFields;
    return this;
  }

  public FieldPropertiesValueReferenceTable addDisplayFieldsItem(String displayFieldsItem) {
    if (this.displayFields == null) {
      this.displayFields = new ArrayList<>();
    }
    this.displayFields.add(displayFieldsItem);
    return this;
  }

  /**
   * Get displayFields
   * @return displayFields
   */
  @javax.annotation.Nullable
  public List<String> getDisplayFields() {
    return displayFields;
  }

  public void setDisplayFields(@javax.annotation.Nullable List<String> displayFields) {
    this.displayFields = displayFields;
  }


  public FieldPropertiesValueReferenceTable sort(@javax.annotation.Nullable String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
   */
  @javax.annotation.Nullable
  public String getSort() {
    return sort;
  }

  public void setSort(@javax.annotation.Nullable String sort) {
    this.sort = sort;
  }


  public FieldPropertiesValueReferenceTable size(@javax.annotation.Nullable String size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  public String getSize() {
    return size;
  }

  public void setSize(@javax.annotation.Nullable String size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldPropertiesValueReferenceTable fieldPropertiesValueReferenceTable = (FieldPropertiesValueReferenceTable) o;
    return Objects.equals(this.relatedApp, fieldPropertiesValueReferenceTable.relatedApp) &&
        Objects.equals(this.condition, fieldPropertiesValueReferenceTable.condition) &&
        Objects.equals(this.filterCond, fieldPropertiesValueReferenceTable.filterCond) &&
        Objects.equals(this.displayFields, fieldPropertiesValueReferenceTable.displayFields) &&
        Objects.equals(this.sort, fieldPropertiesValueReferenceTable.sort) &&
        Objects.equals(this.size, fieldPropertiesValueReferenceTable.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedApp, condition, filterCond, displayFields, sort, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPropertiesValueReferenceTable {\n");
    sb.append("    relatedApp: ").append(toIndentedString(relatedApp)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    filterCond: ").append(toIndentedString(filterCond)).append("\n");
    sb.append("    displayFields: ").append(toIndentedString(displayFields)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("relatedApp");
    openapiFields.add("condition");
    openapiFields.add("filterCond");
    openapiFields.add("displayFields");
    openapiFields.add("sort");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FieldPropertiesValueReferenceTable
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldPropertiesValueReferenceTable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldPropertiesValueReferenceTable is not found in the empty JSON string", FieldPropertiesValueReferenceTable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldPropertiesValueReferenceTable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldPropertiesValueReferenceTable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `relatedApp`
      if (jsonObj.get("relatedApp") != null && !jsonObj.get("relatedApp").isJsonNull()) {
        FieldPropertiesValueReferenceTableRelatedApp.validateJsonElement(jsonObj.get("relatedApp"));
      }
      // validate the optional field `condition`
      if (jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) {
        FieldPropertiesValueReferenceTableCondition.validateJsonElement(jsonObj.get("condition"));
      }
      if ((jsonObj.get("filterCond") != null && !jsonObj.get("filterCond").isJsonNull()) && !jsonObj.get("filterCond").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterCond` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterCond").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("displayFields") != null && !jsonObj.get("displayFields").isJsonNull() && !jsonObj.get("displayFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayFields` to be an array in the JSON string but got `%s`", jsonObj.get("displayFields").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldPropertiesValueReferenceTable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldPropertiesValueReferenceTable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldPropertiesValueReferenceTable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldPropertiesValueReferenceTable.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldPropertiesValueReferenceTable>() {
           @Override
           public void write(JsonWriter out, FieldPropertiesValueReferenceTable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldPropertiesValueReferenceTable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FieldPropertiesValueReferenceTable given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldPropertiesValueReferenceTable
   * @throws IOException if the JSON string is invalid with respect to FieldPropertiesValueReferenceTable
   */
  public static FieldPropertiesValueReferenceTable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldPropertiesValueReferenceTable.class);
  }

  /**
   * Convert an instance of FieldPropertiesValueReferenceTable to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

