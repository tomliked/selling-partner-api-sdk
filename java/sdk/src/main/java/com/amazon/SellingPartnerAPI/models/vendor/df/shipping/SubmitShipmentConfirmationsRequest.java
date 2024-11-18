/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models.vendor.df.shipping;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.models.vendor.df.shipping.ShipmentConfirmation;
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
 * The request schema for the submitShipmentConfirmations operation.
 */
@Schema(description = "The request schema for the submitShipmentConfirmations operation.")


public class SubmitShipmentConfirmationsRequest {
  @SerializedName("shipmentConfirmations")
  private List<ShipmentConfirmation> shipmentConfirmations = null;

  public SubmitShipmentConfirmationsRequest shipmentConfirmations(List<ShipmentConfirmation> shipmentConfirmations) {
    this.shipmentConfirmations = shipmentConfirmations;
    return this;
  }

  public SubmitShipmentConfirmationsRequest addShipmentConfirmationsItem(ShipmentConfirmation shipmentConfirmationsItem) {
    if (this.shipmentConfirmations == null) {
      this.shipmentConfirmations = new ArrayList<ShipmentConfirmation>();
    }
    this.shipmentConfirmations.add(shipmentConfirmationsItem);
    return this;
  }

   /**
   * Array of ShipmentConfirmation objects, each representing confirmation details for a specific shipment.
   * @return shipmentConfirmations
  **/
  @Schema(description = "Array of ShipmentConfirmation objects, each representing confirmation details for a specific shipment.")
  public List<ShipmentConfirmation> getShipmentConfirmations() {
    return shipmentConfirmations;
  }

  public void setShipmentConfirmations(List<ShipmentConfirmation> shipmentConfirmations) {
    this.shipmentConfirmations = shipmentConfirmations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitShipmentConfirmationsRequest submitShipmentConfirmationsRequest = (SubmitShipmentConfirmationsRequest) o;
    return Objects.equals(this.shipmentConfirmations, submitShipmentConfirmationsRequest.shipmentConfirmations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentConfirmations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitShipmentConfirmationsRequest {\n");
    
    sb.append("    shipmentConfirmations: ").append(toIndentedString(shipmentConfirmations)).append("\n");
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
