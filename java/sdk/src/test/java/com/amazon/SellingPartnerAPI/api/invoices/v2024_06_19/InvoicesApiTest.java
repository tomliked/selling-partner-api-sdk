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

package com.amazon.SellingPartnerAPI.api.invoices.v2024_06_19;

import com.amazon.SellingPartnerAPI.ApiResponse;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.ErrorList;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.ExportInvoicesRequest;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.ExportInvoicesResponse;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.GetInvoiceResponse;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.GetInvoicesAttributesResponse;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.GetInvoicesDocumentResponse;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.GetInvoicesExportResponse;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.GetInvoicesExportsResponse;
import com.amazon.SellingPartnerAPI.models.invoices.v2024_06_19.GetInvoicesResponse;
import org.threeten.bp.OffsetDateTime;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class InvoicesApiTest {

   private static String endpoint = "http://localhost:3000";
   private static String authEndpoint = "http://localhost:3000/auth/o2/token";
   private static LWAAuthorizationCredentials credentials = LWAAuthorizationCredentials.builder()
        .clientId("clientId")
        .clientSecret("clientSecret")
        .refreshToken("refreshToken")
        .endpoint(authEndpoint)
        .build();

   private final InvoicesApi api = new InvoicesApi.Builder()
        .lwaAuthorizationCredentials(credentials)
        .endpoint(endpoint)
        .build();

    @Test
    public void createInvoicesExportTest() throws Exception {
        instructBackendMock("createInvoicesExport", "202");
        ExportInvoicesRequest body = new ExportInvoicesRequest();

        ApiResponse<ExportInvoicesResponse> response = api.createInvoicesExportWithHttpInfo(body);

        assertEquals(202, response.getStatusCode());
        if(202 != 204) assertNotNull(response.getData());
    }

    @Test
    public void getInvoiceTest() throws Exception {
        instructBackendMock("getInvoice", "200");
        String marketplaceId = "";String invoiceId = "";
        ApiResponse<GetInvoiceResponse> response = api.getInvoiceWithHttpInfo(marketplaceId, invoiceId);

        assertEquals(200, response.getStatusCode());
        if(200 != 204) assertNotNull(response.getData());
    }

    @Test
    public void getInvoicesTest() throws Exception {
        instructBackendMock("getInvoices", "200");
        String marketplaceId = "";
        ApiResponse<GetInvoicesResponse> response = api.getInvoicesWithHttpInfo(marketplaceId, null, null, null, null, null, null, null, null, null, null, null, null, null);

        assertEquals(200, response.getStatusCode());
        if(200 != 204) assertNotNull(response.getData());
    }

    @Test
    public void getInvoicesAttributesTest() throws Exception {
        instructBackendMock("getInvoicesAttributes", "200");
        String marketplaceId = "";
        ApiResponse<GetInvoicesAttributesResponse> response = api.getInvoicesAttributesWithHttpInfo(marketplaceId);

        assertEquals(200, response.getStatusCode());
        if(200 != 204) assertNotNull(response.getData());
    }

    @Test
    public void getInvoicesDocumentTest() throws Exception {
        instructBackendMock("getInvoicesDocument", "200");
        String invoicesDocumentId = "";
        ApiResponse<GetInvoicesDocumentResponse> response = api.getInvoicesDocumentWithHttpInfo(invoicesDocumentId);

        assertEquals(200, response.getStatusCode());
        if(200 != 204) assertNotNull(response.getData());
    }

    @Test
    public void getInvoicesExportTest() throws Exception {
        instructBackendMock("getInvoicesExport", "200");
        String exportId = "";
        ApiResponse<GetInvoicesExportResponse> response = api.getInvoicesExportWithHttpInfo(exportId);

        assertEquals(200, response.getStatusCode());
        if(200 != 204) assertNotNull(response.getData());
    }

    @Test
    public void getInvoicesExportsTest() throws Exception {
        instructBackendMock("getInvoicesExports", "200");
        String marketplaceId = "";
        ApiResponse<GetInvoicesExportsResponse> response = api.getInvoicesExportsWithHttpInfo(marketplaceId, null, null, null, null, null);

        assertEquals(200, response.getStatusCode());
        if(200 != 204) assertNotNull(response.getData());
    }


    private void instructBackendMock(String response, String code) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
              .uri(new URI(endpoint + "/response/" + response + "/code/" + code))
              .POST(HttpRequest.BodyPublishers.noBody())
              .build();

        HttpClient.newHttpClient().send(request, BodyHandlers.discarding());
    }
}