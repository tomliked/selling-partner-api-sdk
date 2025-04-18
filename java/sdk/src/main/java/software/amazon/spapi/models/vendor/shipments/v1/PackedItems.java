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
import software.amazon.spapi.models.vendor.shipments.v1.ItemQuantity;
import software.amazon.spapi.models.vendor.shipments.v1.PackageItemDetails;
/**
 * Details of the item being shipped.
 */
@Schema(description = "Details of the item being shipped.")


public class PackedItems {
  @SerializedName("itemSequenceNumber")
  private String itemSequenceNumber = null;

  @SerializedName("buyerProductIdentifier")
  private String buyerProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("packedQuantity")
  private ItemQuantity packedQuantity = null;

  @SerializedName("itemDetails")
  private PackageItemDetails itemDetails = null;

  public PackedItems itemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Item sequence number for the item. The first item will be 001, the second 002, and so on. This number is used as a reference to refer to this item from the carton or pallet level.
   * @return itemSequenceNumber
  **/
  @Schema(description = "Item sequence number for the item. The first item will be 001, the second 002, and so on. This number is used as a reference to refer to this item from the carton or pallet level.")
  public String getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public PackedItems buyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
    return this;
  }

   /**
   * Buyer Standard Identification Number (ASIN) of an item.
   * @return buyerProductIdentifier
  **/
  @Schema(description = "Buyer Standard Identification Number (ASIN) of an item.")
  public String getBuyerProductIdentifier() {
    return buyerProductIdentifier;
  }

  public void setBuyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
  }

  public PackedItems vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identification of the item. Should be the same as was sent in the purchase order.
   * @return vendorProductIdentifier
  **/
  @Schema(description = "The vendor selected product identification of the item. Should be the same as was sent in the purchase order.")
  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public PackedItems packedQuantity(ItemQuantity packedQuantity) {
    this.packedQuantity = packedQuantity;
    return this;
  }

   /**
   * Get packedQuantity
   * @return packedQuantity
  **/
  @Schema(description = "")
  public ItemQuantity getPackedQuantity() {
    return packedQuantity;
  }

  public void setPackedQuantity(ItemQuantity packedQuantity) {
    this.packedQuantity = packedQuantity;
  }

  public PackedItems itemDetails(PackageItemDetails itemDetails) {
    this.itemDetails = itemDetails;
    return this;
  }

   /**
   * Get itemDetails
   * @return itemDetails
  **/
  @Schema(description = "")
  public PackageItemDetails getItemDetails() {
    return itemDetails;
  }

  public void setItemDetails(PackageItemDetails itemDetails) {
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
    PackedItems packedItems = (PackedItems) o;
    return Objects.equals(this.itemSequenceNumber, packedItems.itemSequenceNumber) &&
        Objects.equals(this.buyerProductIdentifier, packedItems.buyerProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, packedItems.vendorProductIdentifier) &&
        Objects.equals(this.packedQuantity, packedItems.packedQuantity) &&
        Objects.equals(this.itemDetails, packedItems.itemDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, buyerProductIdentifier, vendorProductIdentifier, packedQuantity, itemDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackedItems {\n");
    
    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    buyerProductIdentifier: ").append(toIndentedString(buyerProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    packedQuantity: ").append(toIndentedString(packedQuantity)).append("\n");
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
