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
import org.threeten.bp.OffsetDateTime;
import software.amazon.spapi.models.vendor.shipments.v1.Route;
import software.amazon.spapi.models.vendor.shipments.v1.Weight;
/**
 * Provide these fields only if this shipment is a direct import.
 */
@Schema(description = "Provide these fields only if this shipment is a direct import.")


public class ImportDetails {
  /**
   * This is used for import purchase orders only. If the recipient requests, this field will contain the shipment method of payment.
   */
  @JsonAdapter(MethodOfPaymentEnum.Adapter.class)
  public enum MethodOfPaymentEnum {
    @SerializedName("PaidByBuyer")
    PAIDBYBUYER("PaidByBuyer"),
    @SerializedName("CollectOnDelivery")
    COLLECTONDELIVERY("CollectOnDelivery"),
    @SerializedName("DefinedByBuyerAndSeller")
    DEFINEDBYBUYERANDSELLER("DefinedByBuyerAndSeller"),
    @SerializedName("FOBPortOfCall")
    FOBPORTOFCALL("FOBPortOfCall"),
    @SerializedName("PrepaidBySeller")
    PREPAIDBYSELLER("PrepaidBySeller"),
    @SerializedName("PaidBySeller")
    PAIDBYSELLER("PaidBySeller");

    private String value;

    MethodOfPaymentEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MethodOfPaymentEnum fromValue(String input) {
      for (MethodOfPaymentEnum b : MethodOfPaymentEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MethodOfPaymentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodOfPaymentEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public MethodOfPaymentEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MethodOfPaymentEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("methodOfPayment")
  private MethodOfPaymentEnum methodOfPayment = null;

  @SerializedName("sealNumber")
  private String sealNumber = null;

  @SerializedName("route")
  private Route route = null;

  @SerializedName("importContainers")
  private String importContainers = null;

  @SerializedName("billableWeight")
  private Weight billableWeight = null;

  @SerializedName("estimatedShipByDate")
  private OffsetDateTime estimatedShipByDate = null;

  /**
   * Identification of the instructions on how specified item/carton/pallet should be handled.
   */
  @JsonAdapter(HandlingInstructionsEnum.Adapter.class)
  public enum HandlingInstructionsEnum {
    @SerializedName("Oversized")
    OVERSIZED("Oversized"),
    @SerializedName("Fragile")
    FRAGILE("Fragile"),
    @SerializedName("Food")
    FOOD("Food"),
    @SerializedName("HandleWithCare")
    HANDLEWITHCARE("HandleWithCare");

    private String value;

    HandlingInstructionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HandlingInstructionsEnum fromValue(String input) {
      for (HandlingInstructionsEnum b : HandlingInstructionsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HandlingInstructionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HandlingInstructionsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public HandlingInstructionsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return HandlingInstructionsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("handlingInstructions")
  private HandlingInstructionsEnum handlingInstructions = null;

  public ImportDetails methodOfPayment(MethodOfPaymentEnum methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
    return this;
  }

   /**
   * This is used for import purchase orders only. If the recipient requests, this field will contain the shipment method of payment.
   * @return methodOfPayment
  **/
  @Schema(description = "This is used for import purchase orders only. If the recipient requests, this field will contain the shipment method of payment.")
  public MethodOfPaymentEnum getMethodOfPayment() {
    return methodOfPayment;
  }

  public void setMethodOfPayment(MethodOfPaymentEnum methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
  }

  public ImportDetails sealNumber(String sealNumber) {
    this.sealNumber = sealNumber;
    return this;
  }

   /**
   * The container&#x27;s seal number.
   * @return sealNumber
  **/
  @Schema(description = "The container's seal number.")
  public String getSealNumber() {
    return sealNumber;
  }

  public void setSealNumber(String sealNumber) {
    this.sealNumber = sealNumber;
  }

  public ImportDetails route(Route route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @Schema(description = "")
  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public ImportDetails importContainers(String importContainers) {
    this.importContainers = importContainers;
    return this;
  }

   /**
   * Types and numbers of container(s) for import purchase orders. Can be a comma-separated list if shipment has multiple containers.
   * @return importContainers
  **/
  @Schema(description = "Types and numbers of container(s) for import purchase orders. Can be a comma-separated list if shipment has multiple containers.")
  public String getImportContainers() {
    return importContainers;
  }

  public void setImportContainers(String importContainers) {
    this.importContainers = importContainers;
  }

  public ImportDetails billableWeight(Weight billableWeight) {
    this.billableWeight = billableWeight;
    return this;
  }

   /**
   * Get billableWeight
   * @return billableWeight
  **/
  @Schema(description = "")
  public Weight getBillableWeight() {
    return billableWeight;
  }

  public void setBillableWeight(Weight billableWeight) {
    this.billableWeight = billableWeight;
  }

  public ImportDetails estimatedShipByDate(OffsetDateTime estimatedShipByDate) {
    this.estimatedShipByDate = estimatedShipByDate;
    return this;
  }

   /**
   * Date on which the shipment is expected to be shipped. This value should not be in the past and not more than 60 days out in the future.
   * @return estimatedShipByDate
  **/
  @Schema(description = "Date on which the shipment is expected to be shipped. This value should not be in the past and not more than 60 days out in the future.")
  public OffsetDateTime getEstimatedShipByDate() {
    return estimatedShipByDate;
  }

  public void setEstimatedShipByDate(OffsetDateTime estimatedShipByDate) {
    this.estimatedShipByDate = estimatedShipByDate;
  }

  public ImportDetails handlingInstructions(HandlingInstructionsEnum handlingInstructions) {
    this.handlingInstructions = handlingInstructions;
    return this;
  }

   /**
   * Identification of the instructions on how specified item/carton/pallet should be handled.
   * @return handlingInstructions
  **/
  @Schema(description = "Identification of the instructions on how specified item/carton/pallet should be handled.")
  public HandlingInstructionsEnum getHandlingInstructions() {
    return handlingInstructions;
  }

  public void setHandlingInstructions(HandlingInstructionsEnum handlingInstructions) {
    this.handlingInstructions = handlingInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportDetails importDetails = (ImportDetails) o;
    return Objects.equals(this.methodOfPayment, importDetails.methodOfPayment) &&
        Objects.equals(this.sealNumber, importDetails.sealNumber) &&
        Objects.equals(this.route, importDetails.route) &&
        Objects.equals(this.importContainers, importDetails.importContainers) &&
        Objects.equals(this.billableWeight, importDetails.billableWeight) &&
        Objects.equals(this.estimatedShipByDate, importDetails.estimatedShipByDate) &&
        Objects.equals(this.handlingInstructions, importDetails.handlingInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodOfPayment, sealNumber, route, importContainers, billableWeight, estimatedShipByDate, handlingInstructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportDetails {\n");
    
    sb.append("    methodOfPayment: ").append(toIndentedString(methodOfPayment)).append("\n");
    sb.append("    sealNumber: ").append(toIndentedString(sealNumber)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    importContainers: ").append(toIndentedString(importContainers)).append("\n");
    sb.append("    billableWeight: ").append(toIndentedString(billableWeight)).append("\n");
    sb.append("    estimatedShipByDate: ").append(toIndentedString(estimatedShipByDate)).append("\n");
    sb.append("    handlingInstructions: ").append(toIndentedString(handlingInstructions)).append("\n");
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
