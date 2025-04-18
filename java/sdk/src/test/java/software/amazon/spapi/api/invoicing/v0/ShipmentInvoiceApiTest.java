/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.api.invoicing.v0;

import software.amazon.spapi.ApiResponse;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import software.amazon.spapi.models.invoicing.v0.GetInvoiceStatusResponse;
import software.amazon.spapi.models.invoicing.v0.GetShipmentDetailsResponse;
import software.amazon.spapi.models.invoicing.v0.SubmitInvoiceRequest;
import software.amazon.spapi.models.invoicing.v0.SubmitInvoiceResponse;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShipmentInvoiceApiTest {

   private static String endpoint = "http://localhost:3000";
   private static String authEndpoint = "http://localhost:3000/auth/o2/token";
   private static LWAAuthorizationCredentials credentials = LWAAuthorizationCredentials.builder()
        .clientId("clientId")
        .clientSecret("clientSecret")
        .refreshToken("refreshToken")
        .endpoint(authEndpoint)
        .build();

   private final ShipmentInvoiceApi api = new ShipmentInvoiceApi.Builder()
        .lwaAuthorizationCredentials(credentials)
        .endpoint(endpoint)
        .build();

    @Test
    public void getInvoiceStatusTest() throws Exception {
        instructBackendMock("getInvoiceStatus", "200");
        String shipmentId = "";

        ApiResponse<GetInvoiceStatusResponse> response = api.getInvoiceStatusWithHttpInfo(shipmentId);

        assertEquals(200, response.getStatusCode());
        assertValidResponsePayload(200, response.getData());
    }

    @Test
    public void getShipmentDetailsTest() throws Exception {
        instructBackendMock("getShipmentDetails", "200");
        String shipmentId = "";

        ApiResponse<GetShipmentDetailsResponse> response = api.getShipmentDetailsWithHttpInfo(shipmentId);

        assertEquals(200, response.getStatusCode());
        assertValidResponsePayload(200, response.getData());
    }

    @Test
    public void submitInvoiceTest() throws Exception {
        instructBackendMock("submitInvoice", "200");
        SubmitInvoiceRequest body = new SubmitInvoiceRequest();
        String shipmentId = "";

        ApiResponse<SubmitInvoiceResponse> response = api.submitInvoiceWithHttpInfo(body, shipmentId);

        assertEquals(200, response.getStatusCode());
        assertValidResponsePayload(200, response.getData());
    }


    private void instructBackendMock(String response, String code) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
              .uri(new URI(endpoint + "/response/" + response + "/code/" + code))
              .POST(HttpRequest.BodyPublishers.noBody())
              .build();

        HttpClient.newHttpClient().send(request, BodyHandlers.discarding());
    }

    private static void assertValidResponsePayload(int statusCode, Object body) {
        if(statusCode != 204) assertNotNull(body);
    }
}
