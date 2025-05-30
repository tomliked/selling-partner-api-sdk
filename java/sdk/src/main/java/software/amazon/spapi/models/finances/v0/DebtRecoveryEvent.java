/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.finances.v0;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import software.amazon.spapi.models.finances.v0.ChargeInstrumentList;
import software.amazon.spapi.models.finances.v0.Currency;
import software.amazon.spapi.models.finances.v0.DebtRecoveryItemList;
/**
 * A debt payment or debt adjustment.
 */
@Schema(description = "A debt payment or debt adjustment.")


public class DebtRecoveryEvent {
  @SerializedName("DebtRecoveryType")
  private String debtRecoveryType = null;

  @SerializedName("RecoveryAmount")
  private Currency recoveryAmount = null;

  @SerializedName("OverPaymentCredit")
  private Currency overPaymentCredit = null;

  @SerializedName("DebtRecoveryItemList")
  private DebtRecoveryItemList debtRecoveryItemList = null;

  @SerializedName("ChargeInstrumentList")
  private ChargeInstrumentList chargeInstrumentList = null;

  public DebtRecoveryEvent debtRecoveryType(String debtRecoveryType) {
    this.debtRecoveryType = debtRecoveryType;
    return this;
  }

   /**
   * The debt recovery type.  Possible values:  * DebtPayment  * DebtPaymentFailure  * DebtAdjustment
   * @return debtRecoveryType
  **/
  @Schema(description = "The debt recovery type.  Possible values:  * DebtPayment  * DebtPaymentFailure  * DebtAdjustment")
  public String getDebtRecoveryType() {
    return debtRecoveryType;
  }

  public void setDebtRecoveryType(String debtRecoveryType) {
    this.debtRecoveryType = debtRecoveryType;
  }

  public DebtRecoveryEvent recoveryAmount(Currency recoveryAmount) {
    this.recoveryAmount = recoveryAmount;
    return this;
  }

   /**
   * Get recoveryAmount
   * @return recoveryAmount
  **/
  @Schema(description = "")
  public Currency getRecoveryAmount() {
    return recoveryAmount;
  }

  public void setRecoveryAmount(Currency recoveryAmount) {
    this.recoveryAmount = recoveryAmount;
  }

  public DebtRecoveryEvent overPaymentCredit(Currency overPaymentCredit) {
    this.overPaymentCredit = overPaymentCredit;
    return this;
  }

   /**
   * Get overPaymentCredit
   * @return overPaymentCredit
  **/
  @Schema(description = "")
  public Currency getOverPaymentCredit() {
    return overPaymentCredit;
  }

  public void setOverPaymentCredit(Currency overPaymentCredit) {
    this.overPaymentCredit = overPaymentCredit;
  }

  public DebtRecoveryEvent debtRecoveryItemList(DebtRecoveryItemList debtRecoveryItemList) {
    this.debtRecoveryItemList = debtRecoveryItemList;
    return this;
  }

   /**
   * Get debtRecoveryItemList
   * @return debtRecoveryItemList
  **/
  @Schema(description = "")
  public DebtRecoveryItemList getDebtRecoveryItemList() {
    return debtRecoveryItemList;
  }

  public void setDebtRecoveryItemList(DebtRecoveryItemList debtRecoveryItemList) {
    this.debtRecoveryItemList = debtRecoveryItemList;
  }

  public DebtRecoveryEvent chargeInstrumentList(ChargeInstrumentList chargeInstrumentList) {
    this.chargeInstrumentList = chargeInstrumentList;
    return this;
  }

   /**
   * Get chargeInstrumentList
   * @return chargeInstrumentList
  **/
  @Schema(description = "")
  public ChargeInstrumentList getChargeInstrumentList() {
    return chargeInstrumentList;
  }

  public void setChargeInstrumentList(ChargeInstrumentList chargeInstrumentList) {
    this.chargeInstrumentList = chargeInstrumentList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtRecoveryEvent debtRecoveryEvent = (DebtRecoveryEvent) o;
    return Objects.equals(this.debtRecoveryType, debtRecoveryEvent.debtRecoveryType) &&
        Objects.equals(this.recoveryAmount, debtRecoveryEvent.recoveryAmount) &&
        Objects.equals(this.overPaymentCredit, debtRecoveryEvent.overPaymentCredit) &&
        Objects.equals(this.debtRecoveryItemList, debtRecoveryEvent.debtRecoveryItemList) &&
        Objects.equals(this.chargeInstrumentList, debtRecoveryEvent.chargeInstrumentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debtRecoveryType, recoveryAmount, overPaymentCredit, debtRecoveryItemList, chargeInstrumentList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtRecoveryEvent {\n");
    
    sb.append("    debtRecoveryType: ").append(toIndentedString(debtRecoveryType)).append("\n");
    sb.append("    recoveryAmount: ").append(toIndentedString(recoveryAmount)).append("\n");
    sb.append("    overPaymentCredit: ").append(toIndentedString(overPaymentCredit)).append("\n");
    sb.append("    debtRecoveryItemList: ").append(toIndentedString(debtRecoveryItemList)).append("\n");
    sb.append("    chargeInstrumentList: ").append(toIndentedString(chargeInstrumentList)).append("\n");
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
