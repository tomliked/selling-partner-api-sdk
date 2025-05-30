/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.pricing.v0;

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
 * The state and country from where the item is shipped.
 */
@Schema(description = "The state and country from where the item is shipped.")


public class ShipsFromType {
  @SerializedName("State")
  private String state = null;

  @SerializedName("Country")
  private String country = null;

  public ShipsFromType state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state from where the item is shipped.
   * @return state
  **/
  @Schema(description = "The state from where the item is shipped.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ShipsFromType country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country from where the item is shipped.
   * @return country
  **/
  @Schema(description = "The country from where the item is shipped.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipsFromType shipsFromType = (ShipsFromType) o;
    return Objects.equals(this.state, shipsFromType.state) &&
        Objects.equals(this.country, shipsFromType.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipsFromType {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
