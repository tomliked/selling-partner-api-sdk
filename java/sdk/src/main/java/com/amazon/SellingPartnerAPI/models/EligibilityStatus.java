/*
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The current eligibility status of an offer.
 */
@JsonAdapter(EligibilityStatus.Adapter.class)
public enum EligibilityStatus {
  @SerializedName("ELIGIBLE")
  ELIGIBLE("ELIGIBLE"),
  @SerializedName("INELIGIBLE")
  INELIGIBLE("INELIGIBLE"),
  @SerializedName("SUSPENDED")
  SUSPENDED("SUSPENDED"),
  @SerializedName("REPLENISHMENT_ONLY_ORDERING")
  REPLENISHMENT_ONLY_ORDERING("REPLENISHMENT_ONLY_ORDERING");

  private String value;

  EligibilityStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EligibilityStatus fromValue(String input) {
    for (EligibilityStatus b : EligibilityStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EligibilityStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final EligibilityStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EligibilityStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EligibilityStatus.fromValue((String)(value));
    }
  }
}
