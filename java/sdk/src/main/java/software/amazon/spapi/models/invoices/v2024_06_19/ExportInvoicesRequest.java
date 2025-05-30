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

package software.amazon.spapi.models.invoices.v2024_06_19;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import software.amazon.spapi.models.invoices.v2024_06_19.FileFormat;
import software.amazon.spapi.models.invoices.v2024_06_19.TransactionIdentifier;
/**
 * The information required to create the export request.
 */
@Schema(description = "The information required to create the export request.")


public class ExportInvoicesRequest {
  @SerializedName("dateEnd")
  private LocalDate dateEnd = null;

  @SerializedName("dateStart")
  private LocalDate dateStart = null;

  @SerializedName("externalInvoiceId")
  private String externalInvoiceId = null;

  @SerializedName("fileFormat")
  private FileFormat fileFormat = null;

  @SerializedName("invoiceType")
  private String invoiceType = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("series")
  private String series = null;

  @SerializedName("statuses")
  private List<String> statuses = null;

  @SerializedName("transactionIdentifier")
  private TransactionIdentifier transactionIdentifier = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  public ExportInvoicesRequest dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }

   /**
   * The latest invoice creation date for invoices that you want to include in the response. Dates are in [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date-time format. The default is the time of the request.
   * @return dateEnd
  **/
  @Schema(description = "The latest invoice creation date for invoices that you want to include in the response. Dates are in [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date-time format. The default is the time of the request.")
  public LocalDate getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }

  public ExportInvoicesRequest dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }

   /**
   * The earliest invoice creation date for invoices that you want to include in the response. Dates are in [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date-time format. The default is 24 hours prior to the time of the request.
   * @return dateStart
  **/
  @Schema(description = "The earliest invoice creation date for invoices that you want to include in the response. Dates are in [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date-time format. The default is 24 hours prior to the time of the request.")
  public LocalDate getDateStart() {
    return dateStart;
  }

  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }

  public ExportInvoicesRequest externalInvoiceId(String externalInvoiceId) {
    this.externalInvoiceId = externalInvoiceId;
    return this;
  }

   /**
   * The external ID of the invoices you want included in the response.
   * @return externalInvoiceId
  **/
  @Schema(description = "The external ID of the invoices you want included in the response.")
  public String getExternalInvoiceId() {
    return externalInvoiceId;
  }

  public void setExternalInvoiceId(String externalInvoiceId) {
    this.externalInvoiceId = externalInvoiceId;
  }

  public ExportInvoicesRequest fileFormat(FileFormat fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Get fileFormat
   * @return fileFormat
  **/
  @Schema(description = "")
  public FileFormat getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(FileFormat fileFormat) {
    this.fileFormat = fileFormat;
  }

  public ExportInvoicesRequest invoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * The marketplace-specific classification of the invoice type. Use the &#x60;getInvoicesAttributes&#x60; operation to check &#x60;invoiceType&#x60; options.
   * @return invoiceType
  **/
  @Schema(description = "The marketplace-specific classification of the invoice type. Use the `getInvoicesAttributes` operation to check `invoiceType` options.")
  public String getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
  }

  public ExportInvoicesRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The ID of the marketplace from which you want the invoices.
   * @return marketplaceId
  **/
  @Schema(required = true, description = "The ID of the marketplace from which you want the invoices.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ExportInvoicesRequest series(String series) {
    this.series = series;
    return this;
  }

   /**
   * The series number of the invoices you want included in the response.
   * @return series
  **/
  @Schema(description = "The series number of the invoices you want included in the response.")
  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public ExportInvoicesRequest statuses(List<String> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ExportInvoicesRequest addStatusesItem(String statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<String>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * A list of statuses that you can use to filter invoices. Use the &#x60;getInvoicesAttributes&#x60; operation to check invoice status options.  Min count: 1
   * @return statuses
  **/
  @Schema(description = "A list of statuses that you can use to filter invoices. Use the `getInvoicesAttributes` operation to check invoice status options.  Min count: 1")
  public List<String> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<String> statuses) {
    this.statuses = statuses;
  }

  public ExportInvoicesRequest transactionIdentifier(TransactionIdentifier transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

   /**
   * Get transactionIdentifier
   * @return transactionIdentifier
  **/
  @Schema(description = "")
  public TransactionIdentifier getTransactionIdentifier() {
    return transactionIdentifier;
  }

  public void setTransactionIdentifier(TransactionIdentifier transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }

  public ExportInvoicesRequest transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The marketplace-specific classification of the transaction type for which the invoice was created. Use the &#x60;getInvoicesAttributes&#x60; operation to check &#x60;transactionType&#x60; options
   * @return transactionType
  **/
  @Schema(description = "The marketplace-specific classification of the transaction type for which the invoice was created. Use the `getInvoicesAttributes` operation to check `transactionType` options")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportInvoicesRequest exportInvoicesRequest = (ExportInvoicesRequest) o;
    return Objects.equals(this.dateEnd, exportInvoicesRequest.dateEnd) &&
        Objects.equals(this.dateStart, exportInvoicesRequest.dateStart) &&
        Objects.equals(this.externalInvoiceId, exportInvoicesRequest.externalInvoiceId) &&
        Objects.equals(this.fileFormat, exportInvoicesRequest.fileFormat) &&
        Objects.equals(this.invoiceType, exportInvoicesRequest.invoiceType) &&
        Objects.equals(this.marketplaceId, exportInvoicesRequest.marketplaceId) &&
        Objects.equals(this.series, exportInvoicesRequest.series) &&
        Objects.equals(this.statuses, exportInvoicesRequest.statuses) &&
        Objects.equals(this.transactionIdentifier, exportInvoicesRequest.transactionIdentifier) &&
        Objects.equals(this.transactionType, exportInvoicesRequest.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateEnd, dateStart, externalInvoiceId, fileFormat, invoiceType, marketplaceId, series, statuses, transactionIdentifier, transactionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportInvoicesRequest {\n");
    
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    externalInvoiceId: ").append(toIndentedString(externalInvoiceId)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
