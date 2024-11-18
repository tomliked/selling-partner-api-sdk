/*
 * Listings Items v2021-08-01
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
import com.amazon.SellingPartnerAPI.models.listings.items.FulfillmentAvailability;
import com.amazon.SellingPartnerAPI.models.listings.items.ItemAttributes;
import com.amazon.SellingPartnerAPI.models.listings.items.ItemIssues;
import com.amazon.SellingPartnerAPI.models.listings.items.ItemOffers;
import com.amazon.SellingPartnerAPI.models.listings.items.ItemProcurement;
import com.amazon.SellingPartnerAPI.models.listings.items.ItemSummaries;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A listings item.
 */
@Schema(description = "A listings item.")


public class Item {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("summaries")
  private ItemSummaries summaries = null;

  @SerializedName("attributes")
  private ItemAttributes attributes = null;

  @SerializedName("issues")
  private ItemIssues issues = null;

  @SerializedName("offers")
  private ItemOffers offers = null;

  @SerializedName("fulfillmentAvailability")
  private List<FulfillmentAvailability> fulfillmentAvailability = null;

  @SerializedName("procurement")
  private List<ItemProcurement> procurement = null;

  public Item sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * A selling partner provided identifier for an Amazon listing.
   * @return sku
  **/
  @Schema(required = true, description = "A selling partner provided identifier for an Amazon listing.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Item summaries(ItemSummaries summaries) {
    this.summaries = summaries;
    return this;
  }

   /**
   * Get summaries
   * @return summaries
  **/
  @Schema(description = "")
  public ItemSummaries getSummaries() {
    return summaries;
  }

  public void setSummaries(ItemSummaries summaries) {
    this.summaries = summaries;
  }

  public Item attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  public Item issues(ItemIssues issues) {
    this.issues = issues;
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @Schema(description = "")
  public ItemIssues getIssues() {
    return issues;
  }

  public void setIssues(ItemIssues issues) {
    this.issues = issues;
  }

  public Item offers(ItemOffers offers) {
    this.offers = offers;
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
  @Schema(description = "")
  public ItemOffers getOffers() {
    return offers;
  }

  public void setOffers(ItemOffers offers) {
    this.offers = offers;
  }

  public Item fulfillmentAvailability(List<FulfillmentAvailability> fulfillmentAvailability) {
    this.fulfillmentAvailability = fulfillmentAvailability;
    return this;
  }

  public Item addFulfillmentAvailabilityItem(FulfillmentAvailability fulfillmentAvailabilityItem) {
    if (this.fulfillmentAvailability == null) {
      this.fulfillmentAvailability = new ArrayList<FulfillmentAvailability>();
    }
    this.fulfillmentAvailability.add(fulfillmentAvailabilityItem);
    return this;
  }

   /**
   * The fulfillment availability for the listings item.
   * @return fulfillmentAvailability
  **/
  @Schema(description = "The fulfillment availability for the listings item.")
  public List<FulfillmentAvailability> getFulfillmentAvailability() {
    return fulfillmentAvailability;
  }

  public void setFulfillmentAvailability(List<FulfillmentAvailability> fulfillmentAvailability) {
    this.fulfillmentAvailability = fulfillmentAvailability;
  }

  public Item procurement(List<ItemProcurement> procurement) {
    this.procurement = procurement;
    return this;
  }

  public Item addProcurementItem(ItemProcurement procurementItem) {
    if (this.procurement == null) {
      this.procurement = new ArrayList<ItemProcurement>();
    }
    this.procurement.add(procurementItem);
    return this;
  }

   /**
   * The vendor procurement information for the listings item.
   * @return procurement
  **/
  @Schema(description = "The vendor procurement information for the listings item.")
  public List<ItemProcurement> getProcurement() {
    return procurement;
  }

  public void setProcurement(List<ItemProcurement> procurement) {
    this.procurement = procurement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.sku, item.sku) &&
        Objects.equals(this.summaries, item.summaries) &&
        Objects.equals(this.attributes, item.attributes) &&
        Objects.equals(this.issues, item.issues) &&
        Objects.equals(this.offers, item.offers) &&
        Objects.equals(this.fulfillmentAvailability, item.fulfillmentAvailability) &&
        Objects.equals(this.procurement, item.procurement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, summaries, attributes, issues, offers, fulfillmentAvailability, procurement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    fulfillmentAvailability: ").append(toIndentedString(fulfillmentAvailability)).append("\n");
    sb.append("    procurement: ").append(toIndentedString(procurement)).append("\n");
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
