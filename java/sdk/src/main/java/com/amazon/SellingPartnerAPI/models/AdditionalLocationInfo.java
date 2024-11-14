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
 * Additional location information.
 */
@JsonAdapter(AdditionalLocationInfo.Adapter.class)
public enum AdditionalLocationInfo {
  @SerializedName("AS_INSTRUCTED")
  AS_INSTRUCTED("AS_INSTRUCTED"),
  @SerializedName("CARPORT")
  CARPORT("CARPORT"),
  @SerializedName("CUSTOMER_PICKUP")
  CUSTOMER_PICKUP("CUSTOMER_PICKUP"),
  @SerializedName("DECK")
  DECK("DECK"),
  @SerializedName("DOOR_PERSON")
  DOOR_PERSON("DOOR_PERSON"),
  @SerializedName("FRONT_DESK")
  FRONT_DESK("FRONT_DESK"),
  @SerializedName("FRONT_DOOR")
  FRONT_DOOR("FRONT_DOOR"),
  @SerializedName("GARAGE")
  GARAGE("GARAGE"),
  @SerializedName("GUARD")
  GUARD("GUARD"),
  @SerializedName("MAIL_ROOM")
  MAIL_ROOM("MAIL_ROOM"),
  @SerializedName("MAIL_SLOT")
  MAIL_SLOT("MAIL_SLOT"),
  @SerializedName("MAILBOX")
  MAILBOX("MAILBOX"),
  @SerializedName("MC_BOY")
  MC_BOY("MC_BOY"),
  @SerializedName("MC_GIRL")
  MC_GIRL("MC_GIRL"),
  @SerializedName("MC_MAN")
  MC_MAN("MC_MAN"),
  @SerializedName("MC_WOMAN")
  MC_WOMAN("MC_WOMAN"),
  @SerializedName("NEIGHBOR")
  NEIGHBOR("NEIGHBOR"),
  @SerializedName("OFFICE")
  OFFICE("OFFICE"),
  @SerializedName("OUTBUILDING")
  OUTBUILDING("OUTBUILDING"),
  @SerializedName("PATIO")
  PATIO("PATIO"),
  @SerializedName("PORCH")
  PORCH("PORCH"),
  @SerializedName("REAR_DOOR")
  REAR_DOOR("REAR_DOOR"),
  @SerializedName("RECEPTIONIST")
  RECEPTIONIST("RECEPTIONIST"),
  @SerializedName("RECEIVER")
  RECEIVER("RECEIVER"),
  @SerializedName("SECURE_LOCATION")
  SECURE_LOCATION("SECURE_LOCATION"),
  @SerializedName("SIDE_DOOR")
  SIDE_DOOR("SIDE_DOOR");

  private String value;

  AdditionalLocationInfo(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdditionalLocationInfo fromValue(String input) {
    for (AdditionalLocationInfo b : AdditionalLocationInfo.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdditionalLocationInfo> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdditionalLocationInfo enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public AdditionalLocationInfo read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return AdditionalLocationInfo.fromValue((String)(value));
    }
  }
}
