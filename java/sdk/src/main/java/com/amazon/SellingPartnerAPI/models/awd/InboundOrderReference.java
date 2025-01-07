/*
 * The Selling Partner API for Amazon Warehousing and Distribution
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory. 
 *
 * OpenAPI spec version: 2024-05-09
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models.awd;

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
 * A response that contains the reference identifiers for the newly created or updated inbound order. Consists of an order ID and version.
 */
@Schema(description = "A response that contains the reference identifiers for the newly created or updated inbound order. Consists of an order ID and version.")


public class InboundOrderReference {
  @SerializedName("orderId")
  private String orderId = null;

  @SerializedName("orderVersion")
  private String orderVersion = null;

  public InboundOrderReference orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID of the inbound order.
   * @return orderId
  **/
  @Schema(required = true, description = "Order ID of the inbound order.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public InboundOrderReference orderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
    return this;
  }

   /**
   * Order version of the inbound order.
   * @return orderVersion
  **/
  @Schema(required = true, description = "Order version of the inbound order.")
  public String getOrderVersion() {
    return orderVersion;
  }

  public void setOrderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundOrderReference inboundOrderReference = (InboundOrderReference) o;
    return Objects.equals(this.orderId, inboundOrderReference.orderId) &&
        Objects.equals(this.orderVersion, inboundOrderReference.orderVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundOrderReference {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderVersion: ").append(toIndentedString(orderVersion)).append("\n");
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
