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

package software.amazon.spapi.models.fulfillment.outbound.v2020_07_01;

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
 * Localized messaging for a delivery offering.
 */
@Schema(description = "Localized messaging for a delivery offering.")


public class DeliveryMessage {
  @SerializedName("text")
  private String text = null;

  @SerializedName("locale")
  private String locale = null;

  public DeliveryMessage text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The message content for a delivery offering.
   * @return text
  **/
  @Schema(description = "The message content for a delivery offering.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public DeliveryMessage locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale for the message (for example, en_US).
   * @return locale
  **/
  @Schema(description = "The locale for the message (for example, en_US).")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryMessage deliveryMessage = (DeliveryMessage) o;
    return Objects.equals(this.text, deliveryMessage.text) &&
        Objects.equals(this.locale, deliveryMessage.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMessage {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
