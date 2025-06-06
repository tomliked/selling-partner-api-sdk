/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.vendor.shipments.v1;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import software.amazon.spapi.models.vendor.shipments.v1.ItemDetails;
import software.amazon.spapi.models.vendor.shipments.v1.ItemQuantity;
/**
 * Carton/Pallet level details for the item.
 */
@Schema(description = "Carton/Pallet level details for the item.")


public class ContainerItem {
  @SerializedName("itemReference")
  private String itemReference = null;

  @SerializedName("shippedQuantity")
  private ItemQuantity shippedQuantity = null;

  @SerializedName("itemDetails")
  private ItemDetails itemDetails = null;

  public ContainerItem itemReference(String itemReference) {
    this.itemReference = itemReference;
    return this;
  }

   /**
   * The reference number for the item. Please provide the itemSequenceNumber from the &#x27;items&#x27; segment to refer to that item&#x27;s details here.
   * @return itemReference
  **/
  @Schema(required = true, description = "The reference number for the item. Please provide the itemSequenceNumber from the 'items' segment to refer to that item's details here.")
  public String getItemReference() {
    return itemReference;
  }

  public void setItemReference(String itemReference) {
    this.itemReference = itemReference;
  }

  public ContainerItem shippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
    return this;
  }

   /**
   * Get shippedQuantity
   * @return shippedQuantity
  **/
  @Schema(required = true, description = "")
  public ItemQuantity getShippedQuantity() {
    return shippedQuantity;
  }

  public void setShippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
  }

  public ContainerItem itemDetails(ItemDetails itemDetails) {
    this.itemDetails = itemDetails;
    return this;
  }

   /**
   * Get itemDetails
   * @return itemDetails
  **/
  @Schema(description = "")
  public ItemDetails getItemDetails() {
    return itemDetails;
  }

  public void setItemDetails(ItemDetails itemDetails) {
    this.itemDetails = itemDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerItem containerItem = (ContainerItem) o;
    return Objects.equals(this.itemReference, containerItem.itemReference) &&
        Objects.equals(this.shippedQuantity, containerItem.shippedQuantity) &&
        Objects.equals(this.itemDetails, containerItem.itemDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReference, shippedQuantity, itemDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerItem {\n");
    
    sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
    sb.append("    shippedQuantity: ").append(toIndentedString(shippedQuantity)).append("\n");
    sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
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
