/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models.listings.items;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * The request body schema for the &#x60;putListingsItem&#x60; operation.
 */
@Schema(description = "The request body schema for the `putListingsItem` operation.")


public class ListingsItemPutRequest {
  @SerializedName("productType")
  private String productType = null;

  /**
   * The name of the requirements set for the provided data.
   */
  @JsonAdapter(RequirementsEnum.Adapter.class)
  public enum RequirementsEnum {
    @SerializedName("LISTING")
    LISTING("LISTING"),
    @SerializedName("LISTING_PRODUCT_ONLY")
    LISTING_PRODUCT_ONLY("LISTING_PRODUCT_ONLY"),
    @SerializedName("LISTING_OFFER_ONLY")
    LISTING_OFFER_ONLY("LISTING_OFFER_ONLY");

    private String value;

    RequirementsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RequirementsEnum fromValue(String input) {
      for (RequirementsEnum b : RequirementsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RequirementsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequirementsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RequirementsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RequirementsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("requirements")
  private RequirementsEnum requirements = null;

  @SerializedName("attributes")
  private Map<String, Object> attributes = new HashMap<String, Object>();

  public ListingsItemPutRequest productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * The Amazon product type of the listings item.
   * @return productType
  **/
  @Schema(required = true, description = "The Amazon product type of the listings item.")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ListingsItemPutRequest requirements(RequirementsEnum requirements) {
    this.requirements = requirements;
    return this;
  }

   /**
   * The name of the requirements set for the provided data.
   * @return requirements
  **/
  @Schema(description = "The name of the requirements set for the provided data.")
  public RequirementsEnum getRequirements() {
    return requirements;
  }

  public void setRequirements(RequirementsEnum requirements) {
    this.requirements = requirements;
  }

  public ListingsItemPutRequest attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ListingsItemPutRequest putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * A JSON object containing structured listings item attribute data keyed by attribute name.
   * @return attributes
  **/
  @Schema(required = true, description = "A JSON object containing structured listings item attribute data keyed by attribute name.")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingsItemPutRequest listingsItemPutRequest = (ListingsItemPutRequest) o;
    return Objects.equals(this.productType, listingsItemPutRequest.productType) &&
        Objects.equals(this.requirements, listingsItemPutRequest.requirements) &&
        Objects.equals(this.attributes, listingsItemPutRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productType, requirements, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingsItemPutRequest {\n");
    
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
