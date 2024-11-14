/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Item-level information for a removal shipment item adjustment.
 */
@Schema(description = "Item-level information for a removal shipment item adjustment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:08:23.717591Z[Etc/UTC]")

public class RemovalShipmentItemAdjustment {
  @SerializedName("RemovalShipmentItemId")
  private String removalShipmentItemId = null;

  @SerializedName("TaxCollectionModel")
  private String taxCollectionModel = null;

  @SerializedName("FulfillmentNetworkSKU")
  private String fulfillmentNetworkSKU = null;

  @SerializedName("AdjustedQuantity")
  private Integer adjustedQuantity = null;

  @SerializedName("RevenueAdjustment")
  private Currency revenueAdjustment = null;

  @SerializedName("TaxAmountAdjustment")
  private Currency taxAmountAdjustment = null;

  @SerializedName("TaxWithheldAdjustment")
  private Currency taxWithheldAdjustment = null;

  public RemovalShipmentItemAdjustment removalShipmentItemId(String removalShipmentItemId) {
    this.removalShipmentItemId = removalShipmentItemId;
    return this;
  }

   /**
   * An identifier for an item in a removal shipment.
   * @return removalShipmentItemId
  **/
  @Schema(description = "An identifier for an item in a removal shipment.")
  public String getRemovalShipmentItemId() {
    return removalShipmentItemId;
  }

  public void setRemovalShipmentItemId(String removalShipmentItemId) {
    this.removalShipmentItemId = removalShipmentItemId;
  }

  public RemovalShipmentItemAdjustment taxCollectionModel(String taxCollectionModel) {
    this.taxCollectionModel = taxCollectionModel;
    return this;
  }

   /**
   * The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.
   * @return taxCollectionModel
  **/
  @Schema(description = "The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.")
  public String getTaxCollectionModel() {
    return taxCollectionModel;
  }

  public void setTaxCollectionModel(String taxCollectionModel) {
    this.taxCollectionModel = taxCollectionModel;
  }

  public RemovalShipmentItemAdjustment fulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
    this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    return this;
  }

   /**
   * The Amazon fulfillment network SKU for the item.
   * @return fulfillmentNetworkSKU
  **/
  @Schema(description = "The Amazon fulfillment network SKU for the item.")
  public String getFulfillmentNetworkSKU() {
    return fulfillmentNetworkSKU;
  }

  public void setFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
    this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
  }

  public RemovalShipmentItemAdjustment adjustedQuantity(Integer adjustedQuantity) {
    this.adjustedQuantity = adjustedQuantity;
    return this;
  }

   /**
   * Adjusted quantity of removal shipmentItemAdjustment items.
   * @return adjustedQuantity
  **/
  @Schema(description = "Adjusted quantity of removal shipmentItemAdjustment items.")
  public Integer getAdjustedQuantity() {
    return adjustedQuantity;
  }

  public void setAdjustedQuantity(Integer adjustedQuantity) {
    this.adjustedQuantity = adjustedQuantity;
  }

  public RemovalShipmentItemAdjustment revenueAdjustment(Currency revenueAdjustment) {
    this.revenueAdjustment = revenueAdjustment;
    return this;
  }

   /**
   * Get revenueAdjustment
   * @return revenueAdjustment
  **/
  @Schema(description = "")
  public Currency getRevenueAdjustment() {
    return revenueAdjustment;
  }

  public void setRevenueAdjustment(Currency revenueAdjustment) {
    this.revenueAdjustment = revenueAdjustment;
  }

  public RemovalShipmentItemAdjustment taxAmountAdjustment(Currency taxAmountAdjustment) {
    this.taxAmountAdjustment = taxAmountAdjustment;
    return this;
  }

   /**
   * Get taxAmountAdjustment
   * @return taxAmountAdjustment
  **/
  @Schema(description = "")
  public Currency getTaxAmountAdjustment() {
    return taxAmountAdjustment;
  }

  public void setTaxAmountAdjustment(Currency taxAmountAdjustment) {
    this.taxAmountAdjustment = taxAmountAdjustment;
  }

  public RemovalShipmentItemAdjustment taxWithheldAdjustment(Currency taxWithheldAdjustment) {
    this.taxWithheldAdjustment = taxWithheldAdjustment;
    return this;
  }

   /**
   * Get taxWithheldAdjustment
   * @return taxWithheldAdjustment
  **/
  @Schema(description = "")
  public Currency getTaxWithheldAdjustment() {
    return taxWithheldAdjustment;
  }

  public void setTaxWithheldAdjustment(Currency taxWithheldAdjustment) {
    this.taxWithheldAdjustment = taxWithheldAdjustment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovalShipmentItemAdjustment removalShipmentItemAdjustment = (RemovalShipmentItemAdjustment) o;
    return Objects.equals(this.removalShipmentItemId, removalShipmentItemAdjustment.removalShipmentItemId) &&
        Objects.equals(this.taxCollectionModel, removalShipmentItemAdjustment.taxCollectionModel) &&
        Objects.equals(this.fulfillmentNetworkSKU, removalShipmentItemAdjustment.fulfillmentNetworkSKU) &&
        Objects.equals(this.adjustedQuantity, removalShipmentItemAdjustment.adjustedQuantity) &&
        Objects.equals(this.revenueAdjustment, removalShipmentItemAdjustment.revenueAdjustment) &&
        Objects.equals(this.taxAmountAdjustment, removalShipmentItemAdjustment.taxAmountAdjustment) &&
        Objects.equals(this.taxWithheldAdjustment, removalShipmentItemAdjustment.taxWithheldAdjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removalShipmentItemId, taxCollectionModel, fulfillmentNetworkSKU, adjustedQuantity, revenueAdjustment, taxAmountAdjustment, taxWithheldAdjustment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovalShipmentItemAdjustment {\n");
    
    sb.append("    removalShipmentItemId: ").append(toIndentedString(removalShipmentItemId)).append("\n");
    sb.append("    taxCollectionModel: ").append(toIndentedString(taxCollectionModel)).append("\n");
    sb.append("    fulfillmentNetworkSKU: ").append(toIndentedString(fulfillmentNetworkSKU)).append("\n");
    sb.append("    adjustedQuantity: ").append(toIndentedString(adjustedQuantity)).append("\n");
    sb.append("    revenueAdjustment: ").append(toIndentedString(revenueAdjustment)).append("\n");
    sb.append("    taxAmountAdjustment: ").append(toIndentedString(taxAmountAdjustment)).append("\n");
    sb.append("    taxWithheldAdjustment: ").append(toIndentedString(taxWithheldAdjustment)).append("\n");
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
