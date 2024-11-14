/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.FulfillmentReturnItemStatus;
import com.amazon.SellingPartnerAPI.ReturnItemDisposition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * An item that Amazon accepted for return.
 */
@Schema(description = "An item that Amazon accepted for return.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:08:45.340222Z[Etc/UTC]")

public class ReturnItem {
  @SerializedName("sellerReturnItemId")
  private String sellerReturnItemId = null;

  @SerializedName("sellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  @SerializedName("amazonShipmentId")
  private String amazonShipmentId = null;

  @SerializedName("sellerReturnReasonCode")
  private String sellerReturnReasonCode = null;

  @SerializedName("returnComment")
  private String returnComment = null;

  @SerializedName("amazonReturnReasonCode")
  private String amazonReturnReasonCode = null;

  @SerializedName("status")
  private FulfillmentReturnItemStatus status = null;

  @SerializedName("statusChangedDate")
  private OffsetDateTime statusChangedDate = null;

  @SerializedName("returnAuthorizationId")
  private String returnAuthorizationId = null;

  @SerializedName("returnReceivedCondition")
  private ReturnItemDisposition returnReceivedCondition = null;

  @SerializedName("fulfillmentCenterId")
  private String fulfillmentCenterId = null;

  public ReturnItem sellerReturnItemId(String sellerReturnItemId) {
    this.sellerReturnItemId = sellerReturnItemId;
    return this;
  }

   /**
   * An identifier assigned by the seller to the return item.
   * @return sellerReturnItemId
  **/
  @Schema(required = true, description = "An identifier assigned by the seller to the return item.")
  public String getSellerReturnItemId() {
    return sellerReturnItemId;
  }

  public void setSellerReturnItemId(String sellerReturnItemId) {
    this.sellerReturnItemId = sellerReturnItemId;
  }

  public ReturnItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * The identifier assigned to the item by the seller when the fulfillment order was created.
   * @return sellerFulfillmentOrderItemId
  **/
  @Schema(required = true, description = "The identifier assigned to the item by the seller when the fulfillment order was created.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }

  public ReturnItem amazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
    return this;
  }

   /**
   * The identifier for the shipment that is associated with the return item.
   * @return amazonShipmentId
  **/
  @Schema(required = true, description = "The identifier for the shipment that is associated with the return item.")
  public String getAmazonShipmentId() {
    return amazonShipmentId;
  }

  public void setAmazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
  }

  public ReturnItem sellerReturnReasonCode(String sellerReturnReasonCode) {
    this.sellerReturnReasonCode = sellerReturnReasonCode;
    return this;
  }

   /**
   * The return reason code assigned to the return item by the seller.
   * @return sellerReturnReasonCode
  **/
  @Schema(required = true, description = "The return reason code assigned to the return item by the seller.")
  public String getSellerReturnReasonCode() {
    return sellerReturnReasonCode;
  }

  public void setSellerReturnReasonCode(String sellerReturnReasonCode) {
    this.sellerReturnReasonCode = sellerReturnReasonCode;
  }

  public ReturnItem returnComment(String returnComment) {
    this.returnComment = returnComment;
    return this;
  }

   /**
   * An optional comment about the return item.
   * @return returnComment
  **/
  @Schema(description = "An optional comment about the return item.")
  public String getReturnComment() {
    return returnComment;
  }

  public void setReturnComment(String returnComment) {
    this.returnComment = returnComment;
  }

  public ReturnItem amazonReturnReasonCode(String amazonReturnReasonCode) {
    this.amazonReturnReasonCode = amazonReturnReasonCode;
    return this;
  }

   /**
   * The return reason code that the Amazon fulfillment center assigned to the return item.
   * @return amazonReturnReasonCode
  **/
  @Schema(description = "The return reason code that the Amazon fulfillment center assigned to the return item.")
  public String getAmazonReturnReasonCode() {
    return amazonReturnReasonCode;
  }

  public void setAmazonReturnReasonCode(String amazonReturnReasonCode) {
    this.amazonReturnReasonCode = amazonReturnReasonCode;
  }

  public ReturnItem status(FulfillmentReturnItemStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public FulfillmentReturnItemStatus getStatus() {
    return status;
  }

  public void setStatus(FulfillmentReturnItemStatus status) {
    this.status = status;
  }

  public ReturnItem statusChangedDate(OffsetDateTime statusChangedDate) {
    this.statusChangedDate = statusChangedDate;
    return this;
  }

   /**
   * Get statusChangedDate
   * @return statusChangedDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getStatusChangedDate() {
    return statusChangedDate;
  }

  public void setStatusChangedDate(OffsetDateTime statusChangedDate) {
    this.statusChangedDate = statusChangedDate;
  }

  public ReturnItem returnAuthorizationId(String returnAuthorizationId) {
    this.returnAuthorizationId = returnAuthorizationId;
    return this;
  }

   /**
   * Identifies the return authorization used to return this item. Refer to &#x60;ReturnAuthorization&#x60;.
   * @return returnAuthorizationId
  **/
  @Schema(description = "Identifies the return authorization used to return this item. Refer to `ReturnAuthorization`.")
  public String getReturnAuthorizationId() {
    return returnAuthorizationId;
  }

  public void setReturnAuthorizationId(String returnAuthorizationId) {
    this.returnAuthorizationId = returnAuthorizationId;
  }

  public ReturnItem returnReceivedCondition(ReturnItemDisposition returnReceivedCondition) {
    this.returnReceivedCondition = returnReceivedCondition;
    return this;
  }

   /**
   * Get returnReceivedCondition
   * @return returnReceivedCondition
  **/
  @Schema(description = "")
  public ReturnItemDisposition getReturnReceivedCondition() {
    return returnReceivedCondition;
  }

  public void setReturnReceivedCondition(ReturnItemDisposition returnReceivedCondition) {
    this.returnReceivedCondition = returnReceivedCondition;
  }

  public ReturnItem fulfillmentCenterId(String fulfillmentCenterId) {
    this.fulfillmentCenterId = fulfillmentCenterId;
    return this;
  }

   /**
   * The identifier for the Amazon fulfillment center that processed the return item.
   * @return fulfillmentCenterId
  **/
  @Schema(description = "The identifier for the Amazon fulfillment center that processed the return item.")
  public String getFulfillmentCenterId() {
    return fulfillmentCenterId;
  }

  public void setFulfillmentCenterId(String fulfillmentCenterId) {
    this.fulfillmentCenterId = fulfillmentCenterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnItem returnItem = (ReturnItem) o;
    return Objects.equals(this.sellerReturnItemId, returnItem.sellerReturnItemId) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, returnItem.sellerFulfillmentOrderItemId) &&
        Objects.equals(this.amazonShipmentId, returnItem.amazonShipmentId) &&
        Objects.equals(this.sellerReturnReasonCode, returnItem.sellerReturnReasonCode) &&
        Objects.equals(this.returnComment, returnItem.returnComment) &&
        Objects.equals(this.amazonReturnReasonCode, returnItem.amazonReturnReasonCode) &&
        Objects.equals(this.status, returnItem.status) &&
        Objects.equals(this.statusChangedDate, returnItem.statusChangedDate) &&
        Objects.equals(this.returnAuthorizationId, returnItem.returnAuthorizationId) &&
        Objects.equals(this.returnReceivedCondition, returnItem.returnReceivedCondition) &&
        Objects.equals(this.fulfillmentCenterId, returnItem.fulfillmentCenterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerReturnItemId, sellerFulfillmentOrderItemId, amazonShipmentId, sellerReturnReasonCode, returnComment, amazonReturnReasonCode, status, statusChangedDate, returnAuthorizationId, returnReceivedCondition, fulfillmentCenterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnItem {\n");
    
    sb.append("    sellerReturnItemId: ").append(toIndentedString(sellerReturnItemId)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
    sb.append("    amazonShipmentId: ").append(toIndentedString(amazonShipmentId)).append("\n");
    sb.append("    sellerReturnReasonCode: ").append(toIndentedString(sellerReturnReasonCode)).append("\n");
    sb.append("    returnComment: ").append(toIndentedString(returnComment)).append("\n");
    sb.append("    amazonReturnReasonCode: ").append(toIndentedString(amazonReturnReasonCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedDate: ").append(toIndentedString(statusChangedDate)).append("\n");
    sb.append("    returnAuthorizationId: ").append(toIndentedString(returnAuthorizationId)).append("\n");
    sb.append("    returnReceivedCondition: ").append(toIndentedString(returnReceivedCondition)).append("\n");
    sb.append("    fulfillmentCenterId: ").append(toIndentedString(fulfillmentCenterId)).append("\n");
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
