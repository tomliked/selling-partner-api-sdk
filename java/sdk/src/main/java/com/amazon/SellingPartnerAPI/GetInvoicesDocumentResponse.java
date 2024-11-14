/*
 * The Selling Partner API for Invoices.
 * Use the Selling Partner API for Invoices to retrieve and manage invoice-related operations, which can help selling partners manage their bookkeeping processes.
 *
 * OpenAPI spec version: 2024-06-19
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.SellingPartnerAPI.InvoicesDocument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Success.
 */
@Schema(description = "Success.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:08:50.842451Z[Etc/UTC]")

public class GetInvoicesDocumentResponse {
  @SerializedName("invoicesDocument")
  private InvoicesDocument invoicesDocument = null;

  public GetInvoicesDocumentResponse invoicesDocument(InvoicesDocument invoicesDocument) {
    this.invoicesDocument = invoicesDocument;
    return this;
  }

   /**
   * Get invoicesDocument
   * @return invoicesDocument
  **/
  @Schema(description = "")
  public InvoicesDocument getInvoicesDocument() {
    return invoicesDocument;
  }

  public void setInvoicesDocument(InvoicesDocument invoicesDocument) {
    this.invoicesDocument = invoicesDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvoicesDocumentResponse getInvoicesDocumentResponse = (GetInvoicesDocumentResponse) o;
    return Objects.equals(this.invoicesDocument, getInvoicesDocumentResponse.invoicesDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoicesDocument);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvoicesDocumentResponse {\n");
    
    sb.append("    invoicesDocument: ").append(toIndentedString(invoicesDocument)).append("\n");
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
