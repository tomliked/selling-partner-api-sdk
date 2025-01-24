/*
 * The Selling Partner API for Amazon Warehousing and Distribution
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory. 
 *
 * OpenAPI spec version: 2024-05-09
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.models.awd.v2024_05_09;

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
 * Statuses supported for an outbound order.
 */
@JsonAdapter(OutboundStatus.Adapter.class)
public enum OutboundStatus {
  @SerializedName("CONFIRMED")
  CONFIRMED("CONFIRMED"),
  @SerializedName("DRAFT")
  DRAFT("DRAFT"),
  @SerializedName("ELIGIBLE")
  ELIGIBLE("ELIGIBLE"),
  @SerializedName("EXECUTING")
  EXECUTING("EXECUTING"),
  @SerializedName("FAILURE")
  FAILURE("FAILURE"),
  @SerializedName("INELIGIBLE")
  INELIGIBLE("INELIGIBLE"),
  @SerializedName("INVENTORY_OUTBOUND")
  INVENTORY_OUTBOUND("INVENTORY_OUTBOUND"),
  @SerializedName("SUCCESS")
  SUCCESS("SUCCESS"),
  @SerializedName("VALIDATING")
  VALIDATING("VALIDATING");

  private String value;

  OutboundStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OutboundStatus fromValue(String input) {
    for (OutboundStatus b : OutboundStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OutboundStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OutboundStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OutboundStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OutboundStatus.fromValue((String)(value));
    }
  }
}
