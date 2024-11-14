/*
 * The Selling Partner API for third party application integrations.
 * With the AppIntegrations API v2024-04-01, you can send notifications to Amazon Selling Partners and display the notifications in Seller Central.
 *
 * OpenAPI spec version: 2024-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.models.NotificationParameters;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The request for the &#x60;createNotification&#x60; operation.
 */
@Schema(description = "The request for the `createNotification` operation.")


public class CreateNotificationRequest {
  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("notificationParameters")
  private NotificationParameters notificationParameters = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  public CreateNotificationRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the notification template you used to onboard your application.
   * @return templateId
  **/
  @Schema(required = true, description = "The unique identifier of the notification template you used to onboard your application.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public CreateNotificationRequest notificationParameters(NotificationParameters notificationParameters) {
    this.notificationParameters = notificationParameters;
    return this;
  }

   /**
   * Get notificationParameters
   * @return notificationParameters
  **/
  @Schema(required = true, description = "")
  public NotificationParameters getNotificationParameters() {
    return notificationParameters;
  }

  public void setNotificationParameters(NotificationParameters notificationParameters) {
    this.notificationParameters = notificationParameters;
  }

  public CreateNotificationRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * An encrypted marketplace identifier for the posted notification.
   * @return marketplaceId
  **/
  @Schema(description = "An encrypted marketplace identifier for the posted notification.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNotificationRequest createNotificationRequest = (CreateNotificationRequest) o;
    return Objects.equals(this.templateId, createNotificationRequest.templateId) &&
        Objects.equals(this.notificationParameters, createNotificationRequest.notificationParameters) &&
        Objects.equals(this.marketplaceId, createNotificationRequest.marketplaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, notificationParameters, marketplaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNotificationRequest {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    notificationParameters: ").append(toIndentedString(notificationParameters)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
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
