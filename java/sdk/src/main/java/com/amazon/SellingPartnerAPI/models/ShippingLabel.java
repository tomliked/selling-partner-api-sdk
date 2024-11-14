/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.models.LabelData;
import com.amazon.SellingPartnerAPI.models.PartyIdentification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Shipping label information for an order, including the purchase order number, selling party, ship from party, label format, and package details.
 */
@Schema(description = "Shipping label information for an order, including the purchase order number, selling party, ship from party, label format, and package details.")


public class ShippingLabel {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipFromParty")
  private PartyIdentification shipFromParty = null;

  /**
   * Format of the label.
   */
  @JsonAdapter(LabelFormatEnum.Adapter.class)
  public enum LabelFormatEnum {
    @SerializedName("PNG")
    PNG("PNG"),
    @SerializedName("ZPL")
    ZPL("ZPL");

    private String value;

    LabelFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LabelFormatEnum fromValue(String input) {
      for (LabelFormatEnum b : LabelFormatEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LabelFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LabelFormatEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LabelFormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LabelFormatEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("labelFormat")
  private LabelFormatEnum labelFormat = null;

  @SerializedName("labelData")
  private List<LabelData> labelData = new ArrayList<LabelData>();

  public ShippingLabel purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * This field will contain the Purchase Order Number for this order.
   * @return purchaseOrderNumber
  **/
  @Schema(required = true, description = "This field will contain the Purchase Order Number for this order.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public ShippingLabel sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * Get sellingParty
   * @return sellingParty
  **/
  @Schema(required = true, description = "")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public ShippingLabel shipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
    return this;
  }

   /**
   * Get shipFromParty
   * @return shipFromParty
  **/
  @Schema(required = true, description = "")
  public PartyIdentification getShipFromParty() {
    return shipFromParty;
  }

  public void setShipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
  }

  public ShippingLabel labelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
    return this;
  }

   /**
   * Format of the label.
   * @return labelFormat
  **/
  @Schema(required = true, description = "Format of the label.")
  public LabelFormatEnum getLabelFormat() {
    return labelFormat;
  }

  public void setLabelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
  }

  public ShippingLabel labelData(List<LabelData> labelData) {
    this.labelData = labelData;
    return this;
  }

  public ShippingLabel addLabelDataItem(LabelData labelDataItem) {
    this.labelData.add(labelDataItem);
    return this;
  }

   /**
   * Provides the details of the packages in this shipment.
   * @return labelData
  **/
  @Schema(required = true, description = "Provides the details of the packages in this shipment.")
  public List<LabelData> getLabelData() {
    return labelData;
  }

  public void setLabelData(List<LabelData> labelData) {
    this.labelData = labelData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingLabel shippingLabel = (ShippingLabel) o;
    return Objects.equals(this.purchaseOrderNumber, shippingLabel.purchaseOrderNumber) &&
        Objects.equals(this.sellingParty, shippingLabel.sellingParty) &&
        Objects.equals(this.shipFromParty, shippingLabel.shipFromParty) &&
        Objects.equals(this.labelFormat, shippingLabel.labelFormat) &&
        Objects.equals(this.labelData, shippingLabel.labelData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, sellingParty, shipFromParty, labelFormat, labelData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingLabel {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipFromParty: ").append(toIndentedString(shipFromParty)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    labelData: ").append(toIndentedString(labelData)).append("\n");
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
