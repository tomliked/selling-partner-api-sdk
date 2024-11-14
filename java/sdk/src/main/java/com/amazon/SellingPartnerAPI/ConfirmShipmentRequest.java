/*
 * Orders v0
 * Use the Orders Selling Partner API to programmatically retrieve order information. With this API, you can develop fast, flexible, and custom applications to manage order synchronization, perform order research, and create demand-based decision support tools.   _Note:_ For the JP, AU, and SG marketplaces, the Orders API supports orders from 2016 onward. For all other marketplaces, the Orders API supports orders for the last two years (orders older than this don't show up in the response).
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.PackageDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The request schema for an shipment confirmation.
 */
@Schema(description = "The request schema for an shipment confirmation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:09:13.380177Z[Etc/UTC]")

public class ConfirmShipmentRequest {
  @SerializedName("packageDetail")
  private PackageDetail packageDetail = null;

  /**
   * The COD collection method (only supported in the JP marketplace).
   */
  @JsonAdapter(CodCollectionMethodEnum.Adapter.class)
  public enum CodCollectionMethodEnum {
    @SerializedName("DirectPayment")
    DIRECTPAYMENT("DirectPayment");

    private String value;

    CodCollectionMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CodCollectionMethodEnum fromValue(String input) {
      for (CodCollectionMethodEnum b : CodCollectionMethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CodCollectionMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodCollectionMethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CodCollectionMethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CodCollectionMethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("codCollectionMethod")
  private CodCollectionMethodEnum codCollectionMethod = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  public ConfirmShipmentRequest packageDetail(PackageDetail packageDetail) {
    this.packageDetail = packageDetail;
    return this;
  }

   /**
   * Get packageDetail
   * @return packageDetail
  **/
  @Schema(required = true, description = "")
  public PackageDetail getPackageDetail() {
    return packageDetail;
  }

  public void setPackageDetail(PackageDetail packageDetail) {
    this.packageDetail = packageDetail;
  }

  public ConfirmShipmentRequest codCollectionMethod(CodCollectionMethodEnum codCollectionMethod) {
    this.codCollectionMethod = codCollectionMethod;
    return this;
  }

   /**
   * The COD collection method (only supported in the JP marketplace).
   * @return codCollectionMethod
  **/
  @Schema(description = "The COD collection method (only supported in the JP marketplace).")
  public CodCollectionMethodEnum getCodCollectionMethod() {
    return codCollectionMethod;
  }

  public void setCodCollectionMethod(CodCollectionMethodEnum codCollectionMethod) {
    this.codCollectionMethod = codCollectionMethod;
  }

  public ConfirmShipmentRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @Schema(required = true, description = "")
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
    ConfirmShipmentRequest confirmShipmentRequest = (ConfirmShipmentRequest) o;
    return Objects.equals(this.packageDetail, confirmShipmentRequest.packageDetail) &&
        Objects.equals(this.codCollectionMethod, confirmShipmentRequest.codCollectionMethod) &&
        Objects.equals(this.marketplaceId, confirmShipmentRequest.marketplaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageDetail, codCollectionMethod, marketplaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmShipmentRequest {\n");
    
    sb.append("    packageDetail: ").append(toIndentedString(packageDetail)).append("\n");
    sb.append("    codCollectionMethod: ").append(toIndentedString(codCollectionMethod)).append("\n");
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
