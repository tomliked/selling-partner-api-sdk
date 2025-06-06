/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.models.fulfillment.inbound.v2024_03_20;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Resource to download the requested document.
 */
@Schema(description = "Resource to download the requested document.")


public class DocumentDownload {
  @SerializedName("downloadType")
  private String downloadType = null;

  @SerializedName("expiration")
  private OffsetDateTime expiration = null;

  @SerializedName("uri")
  private String uri = null;

  public DocumentDownload downloadType(String downloadType) {
    this.downloadType = downloadType;
    return this;
  }

   /**
   * The type of download. Possible values: &#x60;URL&#x60;.
   * @return downloadType
  **/
  @Schema(required = true, description = "The type of download. Possible values: `URL`.")
  public String getDownloadType() {
    return downloadType;
  }

  public void setDownloadType(String downloadType) {
    this.downloadType = downloadType;
  }

  public DocumentDownload expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * The URI&#x27;s expiration time. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) datetime format with pattern &#x60;yyyy-MM-ddTHH:mm:ss.sssZ&#x60;.
   * @return expiration
  **/
  @Schema(description = "The URI's expiration time. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) datetime format with pattern `yyyy-MM-ddTHH:mm:ss.sssZ`.")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  public DocumentDownload uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Uniform resource identifier to identify where the document is located.
   * @return uri
  **/
  @Schema(required = true, description = "Uniform resource identifier to identify where the document is located.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDownload documentDownload = (DocumentDownload) o;
    return Objects.equals(this.downloadType, documentDownload.downloadType) &&
        Objects.equals(this.expiration, documentDownload.expiration) &&
        Objects.equals(this.uri, documentDownload.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadType, expiration, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDownload {\n");
    
    sb.append("    downloadType: ").append(toIndentedString(downloadType)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
