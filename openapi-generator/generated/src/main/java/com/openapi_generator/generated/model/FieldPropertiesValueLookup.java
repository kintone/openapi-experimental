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
 * FieldPropertiesValueLookup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T04:52:36.267360054Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class FieldPropertiesValueLookup {
  public static final String SERIALIZED_NAME_RELATED_APP = "relatedApp";
  @SerializedName(SERIALIZED_NAME_RELATED_APP)
  @javax.annotation.Nullable
  private FieldPropertiesValueReferenceTableRelatedApp relatedApp;

  public static final String SERIALIZED_NAME_RELATED_KEY_FIELD = "relatedKeyField";
  @SerializedName(SERIALIZED_NAME_RELATED_KEY_FIELD)
  @javax.annotation.Nullable
  private String relatedKeyField;

  public static final String SERIALIZED_NAME_FIELD_MAPPINGS = "fieldMappings";
  @SerializedName(SERIALIZED_NAME_FIELD_MAPPINGS)
  @javax.annotation.Nullable
  private List<FieldPropertiesValueReferenceTableCondition> fieldMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOOKUP_PICKER_FIELDS = "lookupPickerFields";
  @SerializedName(SERIALIZED_NAME_LOOKUP_PICKER_FIELDS)
  @javax.annotation.Nullable
  private List<String> lookupPickerFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTER_COND = "filterCond";
  @SerializedName(SERIALIZED_NAME_FILTER_COND)
  @javax.annotation.Nullable
  private String filterCond;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  @javax.annotation.Nullable
  private String sort;

  public FieldPropertiesValueLookup() {
  }

  public FieldPropertiesValueLookup relatedApp(@javax.annotation.Nullable FieldPropertiesValueReferenceTableRelatedApp relatedApp) {
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


  public FieldPropertiesValueLookup relatedKeyField(@javax.annotation.Nullable String relatedKeyField) {
    this.relatedKeyField = relatedKeyField;
    return this;
  }

  /**
   * Get relatedKeyField
   * @return relatedKeyField
   */
  @javax.annotation.Nullable
  public String getRelatedKeyField() {
    return relatedKeyField;
  }

  public void setRelatedKeyField(@javax.annotation.Nullable String relatedKeyField) {
    this.relatedKeyField = relatedKeyField;
  }


  public FieldPropertiesValueLookup fieldMappings(@javax.annotation.Nullable List<FieldPropertiesValueReferenceTableCondition> fieldMappings) {
    this.fieldMappings = fieldMappings;
    return this;
  }

  public FieldPropertiesValueLookup addFieldMappingsItem(FieldPropertiesValueReferenceTableCondition fieldMappingsItem) {
    if (this.fieldMappings == null) {
      this.fieldMappings = new ArrayList<>();
    }
    this.fieldMappings.add(fieldMappingsItem);
    return this;
  }

  /**
   * Get fieldMappings
   * @return fieldMappings
   */
  @javax.annotation.Nullable
  public List<FieldPropertiesValueReferenceTableCondition> getFieldMappings() {
    return fieldMappings;
  }

  public void setFieldMappings(@javax.annotation.Nullable List<FieldPropertiesValueReferenceTableCondition> fieldMappings) {
    this.fieldMappings = fieldMappings;
  }


  public FieldPropertiesValueLookup lookupPickerFields(@javax.annotation.Nullable List<String> lookupPickerFields) {
    this.lookupPickerFields = lookupPickerFields;
    return this;
  }

  public FieldPropertiesValueLookup addLookupPickerFieldsItem(String lookupPickerFieldsItem) {
    if (this.lookupPickerFields == null) {
      this.lookupPickerFields = new ArrayList<>();
    }
    this.lookupPickerFields.add(lookupPickerFieldsItem);
    return this;
  }

  /**
   * Get lookupPickerFields
   * @return lookupPickerFields
   */
  @javax.annotation.Nullable
  public List<String> getLookupPickerFields() {
    return lookupPickerFields;
  }

  public void setLookupPickerFields(@javax.annotation.Nullable List<String> lookupPickerFields) {
    this.lookupPickerFields = lookupPickerFields;
  }


  public FieldPropertiesValueLookup filterCond(@javax.annotation.Nullable String filterCond) {
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


  public FieldPropertiesValueLookup sort(@javax.annotation.Nullable String sort) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldPropertiesValueLookup fieldPropertiesValueLookup = (FieldPropertiesValueLookup) o;
    return Objects.equals(this.relatedApp, fieldPropertiesValueLookup.relatedApp) &&
        Objects.equals(this.relatedKeyField, fieldPropertiesValueLookup.relatedKeyField) &&
        Objects.equals(this.fieldMappings, fieldPropertiesValueLookup.fieldMappings) &&
        Objects.equals(this.lookupPickerFields, fieldPropertiesValueLookup.lookupPickerFields) &&
        Objects.equals(this.filterCond, fieldPropertiesValueLookup.filterCond) &&
        Objects.equals(this.sort, fieldPropertiesValueLookup.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedApp, relatedKeyField, fieldMappings, lookupPickerFields, filterCond, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPropertiesValueLookup {\n");
    sb.append("    relatedApp: ").append(toIndentedString(relatedApp)).append("\n");
    sb.append("    relatedKeyField: ").append(toIndentedString(relatedKeyField)).append("\n");
    sb.append("    fieldMappings: ").append(toIndentedString(fieldMappings)).append("\n");
    sb.append("    lookupPickerFields: ").append(toIndentedString(lookupPickerFields)).append("\n");
    sb.append("    filterCond: ").append(toIndentedString(filterCond)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("relatedKeyField");
    openapiFields.add("fieldMappings");
    openapiFields.add("lookupPickerFields");
    openapiFields.add("filterCond");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FieldPropertiesValueLookup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldPropertiesValueLookup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldPropertiesValueLookup is not found in the empty JSON string", FieldPropertiesValueLookup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldPropertiesValueLookup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldPropertiesValueLookup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `relatedApp`
      if (jsonObj.get("relatedApp") != null && !jsonObj.get("relatedApp").isJsonNull()) {
        FieldPropertiesValueReferenceTableRelatedApp.validateJsonElement(jsonObj.get("relatedApp"));
      }
      if ((jsonObj.get("relatedKeyField") != null && !jsonObj.get("relatedKeyField").isJsonNull()) && !jsonObj.get("relatedKeyField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedKeyField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relatedKeyField").toString()));
      }
      if (jsonObj.get("fieldMappings") != null && !jsonObj.get("fieldMappings").isJsonNull()) {
        JsonArray jsonArrayfieldMappings = jsonObj.getAsJsonArray("fieldMappings");
        if (jsonArrayfieldMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fieldMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fieldMappings` to be an array in the JSON string but got `%s`", jsonObj.get("fieldMappings").toString()));
          }

          // validate the optional field `fieldMappings` (array)
          for (int i = 0; i < jsonArrayfieldMappings.size(); i++) {
            FieldPropertiesValueReferenceTableCondition.validateJsonElement(jsonArrayfieldMappings.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("lookupPickerFields") != null && !jsonObj.get("lookupPickerFields").isJsonNull() && !jsonObj.get("lookupPickerFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lookupPickerFields` to be an array in the JSON string but got `%s`", jsonObj.get("lookupPickerFields").toString()));
      }
      if ((jsonObj.get("filterCond") != null && !jsonObj.get("filterCond").isJsonNull()) && !jsonObj.get("filterCond").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterCond` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterCond").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldPropertiesValueLookup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldPropertiesValueLookup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldPropertiesValueLookup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldPropertiesValueLookup.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldPropertiesValueLookup>() {
           @Override
           public void write(JsonWriter out, FieldPropertiesValueLookup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldPropertiesValueLookup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FieldPropertiesValueLookup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldPropertiesValueLookup
   * @throws IOException if the JSON string is invalid with respect to FieldPropertiesValueLookup
   */
  public static FieldPropertiesValueLookup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldPropertiesValueLookup.class);
  }

  /**
   * Convert an instance of FieldPropertiesValueLookup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
