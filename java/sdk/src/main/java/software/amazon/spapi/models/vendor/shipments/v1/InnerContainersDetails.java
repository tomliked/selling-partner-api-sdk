/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.vendor.shipments.v1;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import software.amazon.spapi.models.vendor.shipments.v1.ContainerSequenceNumbers;
/**
 * Details of the innerContainersDetails.
 */
@Schema(description = "Details of the innerContainersDetails.")


public class InnerContainersDetails {
  @SerializedName("containerCount")
  private Integer containerCount = null;

  @SerializedName("containerSequenceNumbers")
  private List<ContainerSequenceNumbers> containerSequenceNumbers = null;

  public InnerContainersDetails containerCount(Integer containerCount) {
    this.containerCount = containerCount;
    return this;
  }

   /**
   * Total containers as part of the shipment
   * @return containerCount
  **/
  @Schema(description = "Total containers as part of the shipment")
  public Integer getContainerCount() {
    return containerCount;
  }

  public void setContainerCount(Integer containerCount) {
    this.containerCount = containerCount;
  }

  public InnerContainersDetails containerSequenceNumbers(List<ContainerSequenceNumbers> containerSequenceNumbers) {
    this.containerSequenceNumbers = containerSequenceNumbers;
    return this;
  }

  public InnerContainersDetails addContainerSequenceNumbersItem(ContainerSequenceNumbers containerSequenceNumbersItem) {
    if (this.containerSequenceNumbers == null) {
      this.containerSequenceNumbers = new ArrayList<ContainerSequenceNumbers>();
    }
    this.containerSequenceNumbers.add(containerSequenceNumbersItem);
    return this;
  }

   /**
   * Container sequence numbers that are involved in this shipment.
   * @return containerSequenceNumbers
  **/
  @Schema(description = "Container sequence numbers that are involved in this shipment.")
  public List<ContainerSequenceNumbers> getContainerSequenceNumbers() {
    return containerSequenceNumbers;
  }

  public void setContainerSequenceNumbers(List<ContainerSequenceNumbers> containerSequenceNumbers) {
    this.containerSequenceNumbers = containerSequenceNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerContainersDetails innerContainersDetails = (InnerContainersDetails) o;
    return Objects.equals(this.containerCount, innerContainersDetails.containerCount) &&
        Objects.equals(this.containerSequenceNumbers, innerContainersDetails.containerSequenceNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerCount, containerSequenceNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerContainersDetails {\n");
    
    sb.append("    containerCount: ").append(toIndentedString(containerCount)).append("\n");
    sb.append("    containerSequenceNumbers: ").append(toIndentedString(containerSequenceNumbers)).append("\n");
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
