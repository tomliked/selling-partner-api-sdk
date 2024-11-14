/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.models.UnmanifestedCarrierInformationList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The Response  for the GetUnmanifestedShipmentsResponse operation.
 */
@Schema(description = "The Response  for the GetUnmanifestedShipmentsResponse operation.")


public class GetUnmanifestedShipmentsResponse {
  @SerializedName("unmanifestedCarrierInformationList")
  private UnmanifestedCarrierInformationList unmanifestedCarrierInformationList = null;

  public GetUnmanifestedShipmentsResponse unmanifestedCarrierInformationList(UnmanifestedCarrierInformationList unmanifestedCarrierInformationList) {
    this.unmanifestedCarrierInformationList = unmanifestedCarrierInformationList;
    return this;
  }

   /**
   * Get unmanifestedCarrierInformationList
   * @return unmanifestedCarrierInformationList
  **/
  @Schema(description = "")
  public UnmanifestedCarrierInformationList getUnmanifestedCarrierInformationList() {
    return unmanifestedCarrierInformationList;
  }

  public void setUnmanifestedCarrierInformationList(UnmanifestedCarrierInformationList unmanifestedCarrierInformationList) {
    this.unmanifestedCarrierInformationList = unmanifestedCarrierInformationList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUnmanifestedShipmentsResponse getUnmanifestedShipmentsResponse = (GetUnmanifestedShipmentsResponse) o;
    return Objects.equals(this.unmanifestedCarrierInformationList, getUnmanifestedShipmentsResponse.unmanifestedCarrierInformationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unmanifestedCarrierInformationList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUnmanifestedShipmentsResponse {\n");
    
    sb.append("    unmanifestedCarrierInformationList: ").append(toIndentedString(unmanifestedCarrierInformationList)).append("\n");
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
