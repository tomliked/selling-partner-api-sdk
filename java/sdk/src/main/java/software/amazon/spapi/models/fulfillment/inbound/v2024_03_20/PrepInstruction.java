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
import software.amazon.spapi.models.fulfillment.inbound.v2024_03_20.Currency;
/**
 * Information pertaining to the preparation of inbound goods.
 */
@Schema(description = "Information pertaining to the preparation of inbound goods.")


public class PrepInstruction {
  @SerializedName("fee")
  private Currency fee = null;

  @SerializedName("prepOwner")
  private String prepOwner = null;

  @SerializedName("prepType")
  private String prepType = null;

  public PrepInstruction fee(Currency fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @Schema(description = "")
  public Currency getFee() {
    return fee;
  }

  public void setFee(Currency fee) {
    this.fee = fee;
  }

  public PrepInstruction prepOwner(String prepOwner) {
    this.prepOwner = prepOwner;
    return this;
  }

   /**
   * In some situations, special preparations are required for items and this field reflects the owner of the preparations. Options include &#x60;AMAZON&#x60;, &#x60;SELLER&#x60; or &#x60;NONE&#x60;.
   * @return prepOwner
  **/
  @Schema(description = "In some situations, special preparations are required for items and this field reflects the owner of the preparations. Options include `AMAZON`, `SELLER` or `NONE`.")
  public String getPrepOwner() {
    return prepOwner;
  }

  public void setPrepOwner(String prepOwner) {
    this.prepOwner = prepOwner;
  }

  public PrepInstruction prepType(String prepType) {
    this.prepType = prepType;
    return this;
  }

   /**
   * Type of preparation that should be done.  Possible values: &#x60;ITEM_LABELING&#x60;, &#x60;ITEM_BUBBLEWRAP&#x60;, &#x60;ITEM_POLYBAGGING&#x60;, &#x60;ITEM_TAPING&#x60;, &#x60;ITEM_BLACK_SHRINKWRAP&#x60;, &#x60;ITEM_HANG_GARMENT&#x60;, &#x60;ITEM_BOXING&#x60;, &#x60;ITEM_SETCREAT&#x60;, &#x60;ITEM_RMOVHANG&#x60;, &#x60;ITEM_SUFFOSTK&#x60;, &#x60;ITEM_CAP_SEALING&#x60;, &#x60;ITEM_DEBUNDLE&#x60;, &#x60;ITEM_SETSTK&#x60;, &#x60;ITEM_SIOC&#x60;, &#x60;ITEM_NO_PREP&#x60;, &#x60;ADULT&#x60;, &#x60;BABY&#x60;, &#x60;TEXTILE&#x60;, &#x60;HANGER&#x60;, &#x60;FRAGILE&#x60;, &#x60;LIQUID&#x60;, &#x60;SHARP&#x60;, &#x60;SMALL&#x60;, &#x60;PERFORATED&#x60;, &#x60;GRANULAR&#x60;, &#x60;SET&#x60;, &#x60;FC_PROVIDED&#x60;, &#x60;UNKNOWN&#x60;, &#x60;NONE&#x60;.
   * @return prepType
  **/
  @Schema(description = "Type of preparation that should be done.  Possible values: `ITEM_LABELING`, `ITEM_BUBBLEWRAP`, `ITEM_POLYBAGGING`, `ITEM_TAPING`, `ITEM_BLACK_SHRINKWRAP`, `ITEM_HANG_GARMENT`, `ITEM_BOXING`, `ITEM_SETCREAT`, `ITEM_RMOVHANG`, `ITEM_SUFFOSTK`, `ITEM_CAP_SEALING`, `ITEM_DEBUNDLE`, `ITEM_SETSTK`, `ITEM_SIOC`, `ITEM_NO_PREP`, `ADULT`, `BABY`, `TEXTILE`, `HANGER`, `FRAGILE`, `LIQUID`, `SHARP`, `SMALL`, `PERFORATED`, `GRANULAR`, `SET`, `FC_PROVIDED`, `UNKNOWN`, `NONE`.")
  public String getPrepType() {
    return prepType;
  }

  public void setPrepType(String prepType) {
    this.prepType = prepType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepInstruction prepInstruction = (PrepInstruction) o;
    return Objects.equals(this.fee, prepInstruction.fee) &&
        Objects.equals(this.prepOwner, prepInstruction.prepOwner) &&
        Objects.equals(this.prepType, prepInstruction.prepType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, prepOwner, prepType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepInstruction {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    prepOwner: ").append(toIndentedString(prepOwner)).append("\n");
    sb.append("    prepType: ").append(toIndentedString(prepType)).append("\n");
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
