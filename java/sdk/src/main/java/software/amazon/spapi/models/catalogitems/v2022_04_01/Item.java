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
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemAttributes;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemBrowseClassifications;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemDimensions;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemIdentifiers;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemImages;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemProductTypes;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemRelationships;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemSalesRanks;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemSummaries;
import software.amazon.spapi.models.catalogitems.v2022_04_01.ItemVendorDetails;
/**
 * An item in the Amazon catalog.
 */
@Schema(description = "An item in the Amazon catalog.")


public class Item {
  @SerializedName("asin")
  private String asin = null;

  @SerializedName("attributes")
  private ItemAttributes attributes = null;

  @SerializedName("classifications")
  private ItemBrowseClassifications classifications = null;

  @SerializedName("dimensions")
  private ItemDimensions dimensions = null;

  @SerializedName("identifiers")
  private ItemIdentifiers identifiers = null;

  @SerializedName("images")
  private ItemImages images = null;

  @SerializedName("productTypes")
  private ItemProductTypes productTypes = null;

  @SerializedName("relationships")
  private ItemRelationships relationships = null;

  @SerializedName("salesRanks")
  private ItemSalesRanks salesRanks = null;

  @SerializedName("summaries")
  private ItemSummaries summaries = null;

  @SerializedName("vendorDetails")
  private ItemVendorDetails vendorDetails = null;

  public Item asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * Get asin
   * @return asin
  **/
  @Schema(required = true, description = "")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public Item attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  public Item classifications(ItemBrowseClassifications classifications) {
    this.classifications = classifications;
    return this;
  }

   /**
   * Get classifications
   * @return classifications
  **/
  @Schema(description = "")
  public ItemBrowseClassifications getClassifications() {
    return classifications;
  }

  public void setClassifications(ItemBrowseClassifications classifications) {
    this.classifications = classifications;
  }

  public Item dimensions(ItemDimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @Schema(description = "")
  public ItemDimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(ItemDimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Item identifiers(ItemIdentifiers identifiers) {
    this.identifiers = identifiers;
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @Schema(description = "")
  public ItemIdentifiers getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(ItemIdentifiers identifiers) {
    this.identifiers = identifiers;
  }

  public Item images(ItemImages images) {
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @Schema(description = "")
  public ItemImages getImages() {
    return images;
  }

  public void setImages(ItemImages images) {
    this.images = images;
  }

  public Item productTypes(ItemProductTypes productTypes) {
    this.productTypes = productTypes;
    return this;
  }

   /**
   * Get productTypes
   * @return productTypes
  **/
  @Schema(description = "")
  public ItemProductTypes getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(ItemProductTypes productTypes) {
    this.productTypes = productTypes;
  }

  public Item relationships(ItemRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public ItemRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ItemRelationships relationships) {
    this.relationships = relationships;
  }

  public Item salesRanks(ItemSalesRanks salesRanks) {
    this.salesRanks = salesRanks;
    return this;
  }

   /**
   * Get salesRanks
   * @return salesRanks
  **/
  @Schema(description = "")
  public ItemSalesRanks getSalesRanks() {
    return salesRanks;
  }

  public void setSalesRanks(ItemSalesRanks salesRanks) {
    this.salesRanks = salesRanks;
  }

  public Item summaries(ItemSummaries summaries) {
    this.summaries = summaries;
    return this;
  }

   /**
   * Get summaries
   * @return summaries
  **/
  @Schema(description = "")
  public ItemSummaries getSummaries() {
    return summaries;
  }

  public void setSummaries(ItemSummaries summaries) {
    this.summaries = summaries;
  }

  public Item vendorDetails(ItemVendorDetails vendorDetails) {
    this.vendorDetails = vendorDetails;
    return this;
  }

   /**
   * Get vendorDetails
   * @return vendorDetails
  **/
  @Schema(description = "")
  public ItemVendorDetails getVendorDetails() {
    return vendorDetails;
  }

  public void setVendorDetails(ItemVendorDetails vendorDetails) {
    this.vendorDetails = vendorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.asin, item.asin) &&
        Objects.equals(this.attributes, item.attributes) &&
        Objects.equals(this.classifications, item.classifications) &&
        Objects.equals(this.dimensions, item.dimensions) &&
        Objects.equals(this.identifiers, item.identifiers) &&
        Objects.equals(this.images, item.images) &&
        Objects.equals(this.productTypes, item.productTypes) &&
        Objects.equals(this.relationships, item.relationships) &&
        Objects.equals(this.salesRanks, item.salesRanks) &&
        Objects.equals(this.summaries, item.summaries) &&
        Objects.equals(this.vendorDetails, item.vendorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, attributes, classifications, dimensions, identifiers, images, productTypes, relationships, salesRanks, summaries, vendorDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    salesRanks: ").append(toIndentedString(salesRanks)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    vendorDetails: ").append(toIndentedString(vendorDetails)).append("\n");
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
