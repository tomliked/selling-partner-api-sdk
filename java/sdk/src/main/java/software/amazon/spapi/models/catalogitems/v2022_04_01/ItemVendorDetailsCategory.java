/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.catalogitems.v2022_04_01;

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
 * Product category or subcategory associated with an Amazon catalog item.
 */
@Schema(description = "Product category or subcategory associated with an Amazon catalog item.")


public class ItemVendorDetailsCategory {
  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("value")
  private String value = null;

  public ItemVendorDetailsCategory displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the product category or subcategory
   * @return displayName
  **/
  @Schema(description = "Display name of the product category or subcategory")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ItemVendorDetailsCategory value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value (code) of the product category or subcategory.
   * @return value
  **/
  @Schema(description = "Value (code) of the product category or subcategory.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemVendorDetailsCategory itemVendorDetailsCategory = (ItemVendorDetailsCategory) o;
    return Objects.equals(this.displayName, itemVendorDetailsCategory.displayName) &&
        Objects.equals(this.value, itemVendorDetailsCategory.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemVendorDetailsCategory {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
