/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI;

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
 * The type of access point, like counter (HELIX), lockers, etc.
 */
@JsonAdapter(AccessPointType.Adapter.class)
public enum AccessPointType {
  @SerializedName("HELIX")
  HELIX("HELIX"),
  @SerializedName("CAMPUS_LOCKER")
  CAMPUS_LOCKER("CAMPUS_LOCKER"),
  @SerializedName("OMNI_LOCKER")
  OMNI_LOCKER("OMNI_LOCKER"),
  @SerializedName("ODIN_LOCKER")
  ODIN_LOCKER("ODIN_LOCKER"),
  @SerializedName("DOBBY_LOCKER")
  DOBBY_LOCKER("DOBBY_LOCKER"),
  @SerializedName("CORE_LOCKER")
  CORE_LOCKER("CORE_LOCKER"),
  @SerializedName("3P")
  _3P("3P"),
  @SerializedName("CAMPUS_ROOM")
  CAMPUS_ROOM("CAMPUS_ROOM");

  private String value;

  AccessPointType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccessPointType fromValue(String input) {
    for (AccessPointType b : AccessPointType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccessPointType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccessPointType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public AccessPointType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return AccessPointType.fromValue((String)(value));
    }
  }
}
