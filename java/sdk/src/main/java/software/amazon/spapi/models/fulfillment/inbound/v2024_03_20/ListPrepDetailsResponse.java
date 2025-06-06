/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.fulfillment.inbound.v2024_03_20;

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
import software.amazon.spapi.models.fulfillment.inbound.v2024_03_20.MskuPrepDetail;
/**
 * The response to the &#x60;listPrepDetails&#x60; operation.
 */
@Schema(description = "The response to the `listPrepDetails` operation.")


public class ListPrepDetailsResponse {
  @SerializedName("mskuPrepDetails")
  private List<MskuPrepDetail> mskuPrepDetails = new ArrayList<MskuPrepDetail>();

  public ListPrepDetailsResponse mskuPrepDetails(List<MskuPrepDetail> mskuPrepDetails) {
    this.mskuPrepDetails = mskuPrepDetails;
    return this;
  }

  public ListPrepDetailsResponse addMskuPrepDetailsItem(MskuPrepDetail mskuPrepDetailsItem) {
    this.mskuPrepDetails.add(mskuPrepDetailsItem);
    return this;
  }

   /**
   * A list of MSKUs and related prep details.
   * @return mskuPrepDetails
  **/
  @Schema(required = true, description = "A list of MSKUs and related prep details.")
  public List<MskuPrepDetail> getMskuPrepDetails() {
    return mskuPrepDetails;
  }

  public void setMskuPrepDetails(List<MskuPrepDetail> mskuPrepDetails) {
    this.mskuPrepDetails = mskuPrepDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPrepDetailsResponse listPrepDetailsResponse = (ListPrepDetailsResponse) o;
    return Objects.equals(this.mskuPrepDetails, listPrepDetailsResponse.mskuPrepDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mskuPrepDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPrepDetailsResponse {\n");
    
    sb.append("    mskuPrepDetails: ").append(toIndentedString(mskuPrepDetails)).append("\n");
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
