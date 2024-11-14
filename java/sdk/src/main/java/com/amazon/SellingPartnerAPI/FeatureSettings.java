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

package com.amazon.SellingPartnerAPI;

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
 * &#x60;FeatureSettings&#x60; allows users to apply fulfillment features to an order. To block an order from being shipped using Amazon Logistics (AMZL) and an AMZL tracking number, use &#x60;featureName&#x60; as &#x60;BLOCK_AMZL&#x60; and &#x60;featureFulfillmentPolicy&#x60; as &#x60;Required&#x60;. Blocking AMZL will incur an additional fee surcharge on your MCF orders and increase the risk of some of your orders being unfulfilled or delivered late if there are no alternative carriers available. Using &#x60;BLOCK_AMZL&#x60; in an order request will take precedence over your Seller Central account setting. To ship in non-Amazon branded packaging (blank boxes), use featureName &#x60;BLANK_BOX&#x60;.
 */
@Schema(description = "`FeatureSettings` allows users to apply fulfillment features to an order. To block an order from being shipped using Amazon Logistics (AMZL) and an AMZL tracking number, use `featureName` as `BLOCK_AMZL` and `featureFulfillmentPolicy` as `Required`. Blocking AMZL will incur an additional fee surcharge on your MCF orders and increase the risk of some of your orders being unfulfilled or delivered late if there are no alternative carriers available. Using `BLOCK_AMZL` in an order request will take precedence over your Seller Central account setting. To ship in non-Amazon branded packaging (blank boxes), use featureName `BLANK_BOX`.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:08:45.340222Z[Etc/UTC]")

public class FeatureSettings {
  @SerializedName("featureName")
  private String featureName = null;

  /**
   * Specifies the policy to use when fulfilling an order.
   */
  @JsonAdapter(FeatureFulfillmentPolicyEnum.Adapter.class)
  public enum FeatureFulfillmentPolicyEnum {
    @SerializedName("Required")
    REQUIRED("Required"),
    @SerializedName("NotRequired")
    NOTREQUIRED("NotRequired");

    private String value;

    FeatureFulfillmentPolicyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FeatureFulfillmentPolicyEnum fromValue(String input) {
      for (FeatureFulfillmentPolicyEnum b : FeatureFulfillmentPolicyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FeatureFulfillmentPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeatureFulfillmentPolicyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FeatureFulfillmentPolicyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FeatureFulfillmentPolicyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("featureFulfillmentPolicy")
  private FeatureFulfillmentPolicyEnum featureFulfillmentPolicy = null;

  public FeatureSettings featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

   /**
   * The name of the feature.
   * @return featureName
  **/
  @Schema(description = "The name of the feature.")
  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  public FeatureSettings featureFulfillmentPolicy(FeatureFulfillmentPolicyEnum featureFulfillmentPolicy) {
    this.featureFulfillmentPolicy = featureFulfillmentPolicy;
    return this;
  }

   /**
   * Specifies the policy to use when fulfilling an order.
   * @return featureFulfillmentPolicy
  **/
  @Schema(description = "Specifies the policy to use when fulfilling an order.")
  public FeatureFulfillmentPolicyEnum getFeatureFulfillmentPolicy() {
    return featureFulfillmentPolicy;
  }

  public void setFeatureFulfillmentPolicy(FeatureFulfillmentPolicyEnum featureFulfillmentPolicy) {
    this.featureFulfillmentPolicy = featureFulfillmentPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSettings featureSettings = (FeatureSettings) o;
    return Objects.equals(this.featureName, featureSettings.featureName) &&
        Objects.equals(this.featureFulfillmentPolicy, featureSettings.featureFulfillmentPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureFulfillmentPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSettings {\n");
    
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureFulfillmentPolicy: ").append(toIndentedString(featureFulfillmentPolicy)).append("\n");
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
