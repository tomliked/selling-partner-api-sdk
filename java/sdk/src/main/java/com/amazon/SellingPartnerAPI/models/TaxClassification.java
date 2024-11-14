/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The tax classification for the entity.
 */
@Schema(description = "The tax classification for the entity.")


public class TaxClassification {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Value")
  private String value = null;

  public TaxClassification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The type of tax.
   * @return name
  **/
  @Schema(description = "The type of tax.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxClassification value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The entity&#x27;s tax identifier.
   * @return value
  **/
  @Schema(description = "The entity's tax identifier.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxClassification taxClassification = (TaxClassification) o;
    return Objects.equals(this.name, taxClassification.name) &&
        Objects.equals(this.value, taxClassification.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxClassification {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
