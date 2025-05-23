/*
 * Selling Partner API for A+ Content Management
 * Use the A+ Content API to build applications that help selling partners add rich marketing content to their Amazon product detail pages. Selling partners can use A+ content to share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners use content modules to add images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.apluscontent.v2020_11_01;

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
 * The type of rich text decorator.
 */
@JsonAdapter(DecoratorType.Adapter.class)
public enum DecoratorType {
  @SerializedName("LIST_ITEM")
  LIST_ITEM("LIST_ITEM"),
  @SerializedName("LIST_ORDERED")
  LIST_ORDERED("LIST_ORDERED"),
  @SerializedName("LIST_UNORDERED")
  LIST_UNORDERED("LIST_UNORDERED"),
  @SerializedName("STYLE_BOLD")
  STYLE_BOLD("STYLE_BOLD"),
  @SerializedName("STYLE_ITALIC")
  STYLE_ITALIC("STYLE_ITALIC"),
  @SerializedName("STYLE_LINEBREAK")
  STYLE_LINEBREAK("STYLE_LINEBREAK"),
  @SerializedName("STYLE_PARAGRAPH")
  STYLE_PARAGRAPH("STYLE_PARAGRAPH"),
  @SerializedName("STYLE_UNDERLINE")
  STYLE_UNDERLINE("STYLE_UNDERLINE");

  private String value;

  DecoratorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DecoratorType fromValue(String input) {
    for (DecoratorType b : DecoratorType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DecoratorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DecoratorType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DecoratorType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DecoratorType.fromValue((String)(value));
    }
  }
}
