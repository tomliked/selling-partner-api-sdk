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

package software.amazon.spapi.models.shipping.v2;

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
 * Collection Form Document Details
 */
@Schema(description = "Collection Form Document Details")


public class CollectionsFormDocument {
  @SerializedName("base64EncodedContent")
  private String base64EncodedContent = null;

  @SerializedName("documentFormat")
  private String documentFormat = null;

  public CollectionsFormDocument base64EncodedContent(String base64EncodedContent) {
    this.base64EncodedContent = base64EncodedContent;
    return this;
  }

   /**
   * Base64 document Value of Collection.
   * @return base64EncodedContent
  **/
  @Schema(description = "Base64 document Value of Collection.")
  public String getBase64EncodedContent() {
    return base64EncodedContent;
  }

  public void setBase64EncodedContent(String base64EncodedContent) {
    this.base64EncodedContent = base64EncodedContent;
  }

  public CollectionsFormDocument documentFormat(String documentFormat) {
    this.documentFormat = documentFormat;
    return this;
  }

   /**
   * Collection Document format is PDF.
   * @return documentFormat
  **/
  @Schema(description = "Collection Document format is PDF.")
  public String getDocumentFormat() {
    return documentFormat;
  }

  public void setDocumentFormat(String documentFormat) {
    this.documentFormat = documentFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionsFormDocument collectionsFormDocument = (CollectionsFormDocument) o;
    return Objects.equals(this.base64EncodedContent, collectionsFormDocument.base64EncodedContent) &&
        Objects.equals(this.documentFormat, collectionsFormDocument.documentFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64EncodedContent, documentFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsFormDocument {\n");
    
    sb.append("    base64EncodedContent: ").append(toIndentedString(base64EncodedContent)).append("\n");
    sb.append("    documentFormat: ").append(toIndentedString(documentFormat)).append("\n");
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
