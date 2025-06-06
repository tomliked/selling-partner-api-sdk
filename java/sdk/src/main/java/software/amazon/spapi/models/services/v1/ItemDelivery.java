/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.services.v1;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
import software.amazon.spapi.models.services.v1.ItemDeliveryPromise;
/**
 * Delivery information for the item.
 */
@Schema(description = "Delivery information for the item.")


public class ItemDelivery {
  @SerializedName("estimatedDeliveryDate")
  private OffsetDateTime estimatedDeliveryDate = null;

  @SerializedName("itemDeliveryPromise")
  private ItemDeliveryPromise itemDeliveryPromise = null;

  public ItemDelivery estimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

   /**
   * The date and time of the latest Estimated Delivery Date (EDD) of all the items with an EDD. In ISO 8601 format.
   * @return estimatedDeliveryDate
  **/
  @Schema(description = "The date and time of the latest Estimated Delivery Date (EDD) of all the items with an EDD. In ISO 8601 format.")
  public OffsetDateTime getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }

  public ItemDelivery itemDeliveryPromise(ItemDeliveryPromise itemDeliveryPromise) {
    this.itemDeliveryPromise = itemDeliveryPromise;
    return this;
  }

   /**
   * Get itemDeliveryPromise
   * @return itemDeliveryPromise
  **/
  @Schema(description = "")
  public ItemDeliveryPromise getItemDeliveryPromise() {
    return itemDeliveryPromise;
  }

  public void setItemDeliveryPromise(ItemDeliveryPromise itemDeliveryPromise) {
    this.itemDeliveryPromise = itemDeliveryPromise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDelivery itemDelivery = (ItemDelivery) o;
    return Objects.equals(this.estimatedDeliveryDate, itemDelivery.estimatedDeliveryDate) &&
        Objects.equals(this.itemDeliveryPromise, itemDelivery.itemDeliveryPromise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedDeliveryDate, itemDeliveryPromise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDelivery {\n");
    
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
    sb.append("    itemDeliveryPromise: ").append(toIndentedString(itemDeliveryPromise)).append("\n");
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
