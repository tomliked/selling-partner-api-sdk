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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The identifier for a transaction.
 */
@Schema(description = "The identifier for a transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-14T09:08:50.842451Z[Etc/UTC]")

public class TransactionIdentifier {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public TransactionIdentifier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The transaction identifier name. Use the &#x60;getInvoicesAttributes&#x60; operation to check &#x60;transactionIdentifierName&#x60; options.
   * @return name
  **/
  @Schema(description = "The transaction identifier name. Use the `getInvoicesAttributes` operation to check `transactionIdentifierName` options.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TransactionIdentifier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The transaction identifier.
   * @return id
  **/
  @Schema(description = "The transaction identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionIdentifier transactionIdentifier = (TransactionIdentifier) o;
    return Objects.equals(this.name, transactionIdentifier.name) &&
        Objects.equals(this.id, transactionIdentifier.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionIdentifier {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
