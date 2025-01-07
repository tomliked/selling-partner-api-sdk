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

package com.amazon.SellingPartnerAPI.models.vendor.shipments;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.models.vendor.shipments.PurchaseOrderItems;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Transport Request pickup date
 */
@Schema(description = "Transport Request pickup date")


public class PurchaseOrders {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("purchaseOrderDate")
  private OffsetDateTime purchaseOrderDate = null;

  @SerializedName("shipWindow")
  private String shipWindow = null;

  @SerializedName("items")
  private List<PurchaseOrderItems> items = null;

  public PurchaseOrders purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order numbers involved in this shipment, list all the PO that are involved as part of this shipment.
   * @return purchaseOrderNumber
  **/
  @Schema(description = "Purchase order numbers involved in this shipment, list all the PO that are involved as part of this shipment.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public PurchaseOrders purchaseOrderDate(OffsetDateTime purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
    return this;
  }

   /**
   * Purchase order numbers involved in this shipment, list all the PO that are involved as part of this shipment.
   * @return purchaseOrderDate
  **/
  @Schema(description = "Purchase order numbers involved in this shipment, list all the PO that are involved as part of this shipment.")
  public OffsetDateTime getPurchaseOrderDate() {
    return purchaseOrderDate;
  }

  public void setPurchaseOrderDate(OffsetDateTime purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
  }

  public PurchaseOrders shipWindow(String shipWindow) {
    this.shipWindow = shipWindow;
    return this;
  }

   /**
   * Date range in which shipment is expected for these purchase orders.
   * @return shipWindow
  **/
  @Schema(description = "Date range in which shipment is expected for these purchase orders.")
  public String getShipWindow() {
    return shipWindow;
  }

  public void setShipWindow(String shipWindow) {
    this.shipWindow = shipWindow;
  }

  public PurchaseOrders items(List<PurchaseOrderItems> items) {
    this.items = items;
    return this;
  }

  public PurchaseOrders addItemsItem(PurchaseOrderItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<PurchaseOrderItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of the items that are associated to the PO in this transport and their associated details.
   * @return items
  **/
  @Schema(description = "A list of the items that are associated to the PO in this transport and their associated details.")
  public List<PurchaseOrderItems> getItems() {
    return items;
  }

  public void setItems(List<PurchaseOrderItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseOrders purchaseOrders = (PurchaseOrders) o;
    return Objects.equals(this.purchaseOrderNumber, purchaseOrders.purchaseOrderNumber) &&
        Objects.equals(this.purchaseOrderDate, purchaseOrders.purchaseOrderDate) &&
        Objects.equals(this.shipWindow, purchaseOrders.shipWindow) &&
        Objects.equals(this.items, purchaseOrders.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, purchaseOrderDate, shipWindow, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrders {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    purchaseOrderDate: ").append(toIndentedString(purchaseOrderDate)).append("\n");
    sb.append("    shipWindow: ").append(toIndentedString(shipWindow)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
