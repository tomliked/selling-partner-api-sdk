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

package com.amazon.SellingPartnerAPI;

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
 * The request for the &#x60;deleteNotifications&#x60; operation.
 */
@Schema(description = "The request for the `deleteNotifications` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:07:58.358369Z[Etc/UTC]")

public class DeleteNotificationsRequest {
  @SerializedName("templateId")
  private String templateId = null;

  /**
   * The unique identifier that maps each notification status to a reason code.
   */
  @JsonAdapter(DeletionReasonEnum.Adapter.class)
  public enum DeletionReasonEnum {
    @SerializedName("INCORRECT_CONTENT")
    CONTENT("INCORRECT_CONTENT"),
    @SerializedName("INCORRECT_RECIPIENT")
    RECIPIENT("INCORRECT_RECIPIENT");

    private String value;

    DeletionReasonEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeletionReasonEnum fromValue(String input) {
      for (DeletionReasonEnum b : DeletionReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeletionReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeletionReasonEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DeletionReasonEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DeletionReasonEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("deletionReason")
  private DeletionReasonEnum deletionReason = null;

  public DeleteNotificationsRequest templateId(String templateId) {
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

  public DeleteNotificationsRequest deletionReason(DeletionReasonEnum deletionReason) {
    this.deletionReason = deletionReason;
    return this;
  }

   /**
   * The unique identifier that maps each notification status to a reason code.
   * @return deletionReason
  **/
  @Schema(required = true, description = "The unique identifier that maps each notification status to a reason code.")
  public DeletionReasonEnum getDeletionReason() {
    return deletionReason;
  }

  public void setDeletionReason(DeletionReasonEnum deletionReason) {
    this.deletionReason = deletionReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteNotificationsRequest deleteNotificationsRequest = (DeleteNotificationsRequest) o;
    return Objects.equals(this.templateId, deleteNotificationsRequest.templateId) &&
        Objects.equals(this.deletionReason, deleteNotificationsRequest.deletionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, deletionReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteNotificationsRequest {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    deletionReason: ").append(toIndentedString(deletionReason)).append("\n");
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
