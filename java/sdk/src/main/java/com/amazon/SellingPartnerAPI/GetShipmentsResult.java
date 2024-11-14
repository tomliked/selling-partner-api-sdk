/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
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
import com.amazon.SellingPartnerAPI.InboundShipmentList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Result for the get shipments operation
 */
@Schema(description = "Result for the get shipments operation")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:08:32.346564Z[Etc/UTC]")

public class GetShipmentsResult {
  @SerializedName("ShipmentData")
  private InboundShipmentList shipmentData = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public GetShipmentsResult shipmentData(InboundShipmentList shipmentData) {
    this.shipmentData = shipmentData;
    return this;
  }

   /**
   * Get shipmentData
   * @return shipmentData
  **/
  @Schema(description = "")
  public InboundShipmentList getShipmentData() {
    return shipmentData;
  }

  public void setShipmentData(InboundShipmentList shipmentData) {
    this.shipmentData = shipmentData;
  }

  public GetShipmentsResult nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/
  @Schema(description = "When present and not empty, pass this string token in the next request to return the next response page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShipmentsResult getShipmentsResult = (GetShipmentsResult) o;
    return Objects.equals(this.shipmentData, getShipmentsResult.shipmentData) &&
        Objects.equals(this.nextToken, getShipmentsResult.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentData, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShipmentsResult {\n");
    
    sb.append("    shipmentData: ").append(toIndentedString(shipmentData)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
