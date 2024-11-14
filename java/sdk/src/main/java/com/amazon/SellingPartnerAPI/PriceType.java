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

package com.amazon.SellingPartnerAPI;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.MoneyType;
import com.amazon.SellingPartnerAPI.Points;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PriceType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:09:23.033658Z[Etc/UTC]")

public class PriceType {
  @SerializedName("LandedPrice")
  private MoneyType landedPrice = null;

  @SerializedName("ListingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("Shipping")
  private MoneyType shipping = null;

  @SerializedName("Points")
  private Points points = null;

  public PriceType landedPrice(MoneyType landedPrice) {
    this.landedPrice = landedPrice;
    return this;
  }

   /**
   * Get landedPrice
   * @return landedPrice
  **/
  @Schema(description = "")
  public MoneyType getLandedPrice() {
    return landedPrice;
  }

  public void setLandedPrice(MoneyType landedPrice) {
    this.landedPrice = landedPrice;
  }

  public PriceType listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * Get listingPrice
   * @return listingPrice
  **/
  @Schema(required = true, description = "")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public PriceType shipping(MoneyType shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @Schema(description = "")
  public MoneyType getShipping() {
    return shipping;
  }

  public void setShipping(MoneyType shipping) {
    this.shipping = shipping;
  }

  public PriceType points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @Schema(description = "")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceType priceType = (PriceType) o;
    return Objects.equals(this.landedPrice, priceType.landedPrice) &&
        Objects.equals(this.listingPrice, priceType.listingPrice) &&
        Objects.equals(this.shipping, priceType.shipping) &&
        Objects.equals(this.points, priceType.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(landedPrice, listingPrice, shipping, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceType {\n");
    
    sb.append("    landedPrice: ").append(toIndentedString(landedPrice)).append("\n");
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
