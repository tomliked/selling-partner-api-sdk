/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.easyship.v2022_03_23;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import software.amazon.spapi.models.easyship.v2022_03_23.PackageDetails;
/**
 * This object allows users to specify an order to be scheduled. Only the amazonOrderId is required. 
 */
@Schema(description = "This object allows users to specify an order to be scheduled. Only the amazonOrderId is required. ")


public class OrderScheduleDetails {
  @SerializedName("amazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("packageDetails")
  private PackageDetails packageDetails = null;

  public OrderScheduleDetails amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * Get amazonOrderId
   * @return amazonOrderId
  **/
  @Schema(required = true, description = "")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public OrderScheduleDetails packageDetails(PackageDetails packageDetails) {
    this.packageDetails = packageDetails;
    return this;
  }

   /**
   * Get packageDetails
   * @return packageDetails
  **/
  @Schema(description = "")
  public PackageDetails getPackageDetails() {
    return packageDetails;
  }

  public void setPackageDetails(PackageDetails packageDetails) {
    this.packageDetails = packageDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderScheduleDetails orderScheduleDetails = (OrderScheduleDetails) o;
    return Objects.equals(this.amazonOrderId, orderScheduleDetails.amazonOrderId) &&
        Objects.equals(this.packageDetails, orderScheduleDetails.packageDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, packageDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderScheduleDetails {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    packageDetails: ").append(toIndentedString(packageDetails)).append("\n");
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
