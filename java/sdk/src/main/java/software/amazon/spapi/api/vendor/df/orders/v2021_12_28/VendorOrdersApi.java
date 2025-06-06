/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package software.amazon.spapi.api.vendor.df.orders.v2021_12_28;

import software.amazon.spapi.ApiCallback;
import software.amazon.spapi.ApiClient;
import software.amazon.spapi.ApiException;
import software.amazon.spapi.ApiResponse;
import software.amazon.spapi.Configuration;
import software.amazon.spapi.Pair;
import software.amazon.spapi.ProgressRequestBody;
import software.amazon.spapi.ProgressResponseBody;
import software.amazon.spapi.StringUtil;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import software.amazon.spapi.models.vendor.df.orders.v2021_12_28.ErrorList;
import org.threeten.bp.OffsetDateTime;
import software.amazon.spapi.models.vendor.df.orders.v2021_12_28.Order;
import software.amazon.spapi.models.vendor.df.orders.v2021_12_28.OrderList;
import software.amazon.spapi.models.vendor.df.orders.v2021_12_28.SubmitAcknowledgementRequest;
import software.amazon.spapi.models.vendor.df.orders.v2021_12_28.TransactionId;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCache;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCacheImpl;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.RateLimitConfiguration;
import com.amazon.SellingPartnerAPIAA.LWAException;

public class VendorOrdersApi {
    private ApiClient apiClient;

    VendorOrdersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VendorOrdersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOrder
     * @param purchaseOrderNumber The order identifier for the purchase order that you want. Formatting Notes: alpha-numeric code. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public okhttp3.Call getOrderCall(String purchaseOrderNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vendor/directFulfillment/orders/2021-12-28/purchaseOrders/{purchaseOrderNumber}"
            .replaceAll("\\{" + "purchaseOrderNumber" + "\\}", apiClient.escapeString(purchaseOrderNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOrderValidateBeforeCall(String purchaseOrderNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        // verify the required parameter 'purchaseOrderNumber' is set
        if (purchaseOrderNumber == null) {
            throw new ApiException("Missing the required parameter 'purchaseOrderNumber' when calling getOrder(Async)");
        }

        okhttp3.Call call = getOrderCall(purchaseOrderNumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns purchase order information for the purchaseOrderNumber that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param purchaseOrderNumber The order identifier for the purchase order that you want. Formatting Notes: alpha-numeric code. (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public Order getOrder(String purchaseOrderNumber) throws ApiException,LWAException {
        ApiResponse<Order> resp = getOrderWithHttpInfo(purchaseOrderNumber);
        return resp.getData();
    }

    /**
     * 
     * Returns purchase order information for the purchaseOrderNumber that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param purchaseOrderNumber The order identifier for the purchase order that you want. Formatting Notes: alpha-numeric code. (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<Order> getOrderWithHttpInfo(String purchaseOrderNumber) throws ApiException,LWAException {
        okhttp3.Call call = getOrderValidateBeforeCall(purchaseOrderNumber, null, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns purchase order information for the purchaseOrderNumber that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param purchaseOrderNumber The order identifier for the purchase order that you want. Formatting Notes: alpha-numeric code. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public okhttp3.Call getOrderAsync(String purchaseOrderNumber, final ApiCallback<Order> callback) throws ApiException, LWAException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getOrderValidateBeforeCall(purchaseOrderNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOrders
     * @param createdAfter Purchase orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Purchase orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouse identifier for the fulfillment warehouse. If not specified, the result will contain orders for all warehouses. (optional)
     * @param status Returns only the purchase orders that match the specified status. If not specified, the result will contain orders that match any status. (optional)
     * @param limit The limit to the number of purchase orders returned. (optional)
     * @param sortOrder Sort the list in ascending or descending order by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @param includeDetails When true, returns the complete purchase order details. Otherwise, only purchase order numbers are returned. (optional, default to true)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public okhttp3.Call getOrdersCall(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, String status, Long limit, String sortOrder, String nextToken, String includeDetails, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vendor/directFulfillment/orders/2021-12-28/purchaseOrders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shipFromPartyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("shipFromPartyId", shipFromPartyId));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (createdAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAfter", createdAfter));
        if (createdBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdBefore", createdBefore));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
        if (nextToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nextToken", nextToken));
        if (includeDetails != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("includeDetails", includeDetails));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "pagination", "orders"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOrdersValidateBeforeCall(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, String status, Long limit, String sortOrder, String nextToken, String includeDetails, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        // verify the required parameter 'createdAfter' is set
        if (createdAfter == null) {
            throw new ApiException("Missing the required parameter 'createdAfter' when calling getOrders(Async)");
        }
        // verify the required parameter 'createdBefore' is set
        if (createdBefore == null) {
            throw new ApiException("Missing the required parameter 'createdBefore' when calling getOrders(Async)");
        }

        okhttp3.Call call = getOrdersCall(createdAfter, createdBefore, shipFromPartyId, status, limit, sortOrder, nextToken, includeDetails, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns a list of purchase orders created during the time frame that you specify. You define the time frame using the createdAfter and createdBefore parameters. You must use both parameters. You can choose to get only the purchase order numbers by setting the includeDetails parameter to false. In that case, the operation returns a list of purchase order numbers. You can then call the getOrder operation to return the details of a specific order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param createdAfter Purchase orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Purchase orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouse identifier for the fulfillment warehouse. If not specified, the result will contain orders for all warehouses. (optional)
     * @param status Returns only the purchase orders that match the specified status. If not specified, the result will contain orders that match any status. (optional)
     * @param limit The limit to the number of purchase orders returned. (optional)
     * @param sortOrder Sort the list in ascending or descending order by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @param includeDetails When true, returns the complete purchase order details. Otherwise, only purchase order numbers are returned. (optional, default to true)
     * @return OrderList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public OrderList getOrders(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, String status, Long limit, String sortOrder, String nextToken, String includeDetails) throws ApiException,LWAException {
        ApiResponse<OrderList> resp = getOrdersWithHttpInfo(createdAfter, createdBefore, shipFromPartyId, status, limit, sortOrder, nextToken, includeDetails);
        return resp.getData();
    }

    /**
     * 
     * Returns a list of purchase orders created during the time frame that you specify. You define the time frame using the createdAfter and createdBefore parameters. You must use both parameters. You can choose to get only the purchase order numbers by setting the includeDetails parameter to false. In that case, the operation returns a list of purchase order numbers. You can then call the getOrder operation to return the details of a specific order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param createdAfter Purchase orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Purchase orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouse identifier for the fulfillment warehouse. If not specified, the result will contain orders for all warehouses. (optional)
     * @param status Returns only the purchase orders that match the specified status. If not specified, the result will contain orders that match any status. (optional)
     * @param limit The limit to the number of purchase orders returned. (optional)
     * @param sortOrder Sort the list in ascending or descending order by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @param includeDetails When true, returns the complete purchase order details. Otherwise, only purchase order numbers are returned. (optional, default to true)
     * @return ApiResponse&lt;OrderList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<OrderList> getOrdersWithHttpInfo(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, String status, Long limit, String sortOrder, String nextToken, String includeDetails) throws ApiException,LWAException {
        okhttp3.Call call = getOrdersValidateBeforeCall(createdAfter, createdBefore, shipFromPartyId, status, limit, sortOrder, nextToken, includeDetails, null, null);
        Type localVarReturnType = new TypeToken<OrderList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of purchase orders created during the time frame that you specify. You define the time frame using the createdAfter and createdBefore parameters. You must use both parameters. You can choose to get only the purchase order numbers by setting the includeDetails parameter to false. In that case, the operation returns a list of purchase order numbers. You can then call the getOrder operation to return the details of a specific order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param createdAfter Purchase orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Purchase orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouse identifier for the fulfillment warehouse. If not specified, the result will contain orders for all warehouses. (optional)
     * @param status Returns only the purchase orders that match the specified status. If not specified, the result will contain orders that match any status. (optional)
     * @param limit The limit to the number of purchase orders returned. (optional)
     * @param sortOrder Sort the list in ascending or descending order by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @param includeDetails When true, returns the complete purchase order details. Otherwise, only purchase order numbers are returned. (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public okhttp3.Call getOrdersAsync(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, String status, Long limit, String sortOrder, String nextToken, String includeDetails, final ApiCallback<OrderList> callback) throws ApiException, LWAException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getOrdersValidateBeforeCall(createdAfter, createdBefore, shipFromPartyId, status, limit, sortOrder, nextToken, includeDetails, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrderList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for submitAcknowledgement
     * @param body The request body containing the acknowledgement to an order (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public okhttp3.Call submitAcknowledgementCall(SubmitAcknowledgementRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/vendor/directFulfillment/orders/2021-12-28/acknowledgements";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitAcknowledgementValidateBeforeCall(SubmitAcknowledgementRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitAcknowledgement(Async)");
        }

        okhttp3.Call call = submitAcknowledgementCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Submits acknowledgements for one or more purchase orders.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param body The request body containing the acknowledgement to an order (required)
     * @return TransactionId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public TransactionId submitAcknowledgement(SubmitAcknowledgementRequest body) throws ApiException,LWAException {
        ApiResponse<TransactionId> resp = submitAcknowledgementWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 
     * Submits acknowledgements for one or more purchase orders.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param body The request body containing the acknowledgement to an order (required)
     * @return ApiResponse&lt;TransactionId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<TransactionId> submitAcknowledgementWithHttpInfo(SubmitAcknowledgementRequest body) throws ApiException,LWAException {
        okhttp3.Call call = submitAcknowledgementValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<TransactionId>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Submits acknowledgements for one or more purchase orders.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param body The request body containing the acknowledgement to an order (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public okhttp3.Call submitAcknowledgementAsync(SubmitAcknowledgementRequest body, final ApiCallback<TransactionId> callback) throws ApiException, LWAException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = submitAcknowledgementValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionId>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
        private RateLimitConfiguration rateLimitConfiguration;


        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        
        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }
		
	   public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }

        public Builder rateLimitConfigurationOnRequests(RateLimitConfiguration rateLimitConfiguration){
            this.rateLimitConfiguration = rateLimitConfiguration;
            return this;
        }
        
        public Builder disableRateLimitOnRequests() {
            this.rateLimitConfiguration = null;
            return this;
        }

        public VendorOrdersApi build() {
            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }

            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }
            
            LWAAuthorizationSigner lwaAuthorizationSigner = null;            
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            }
            else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();                  
                 }
                 lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials,lwaAccessTokenCache);
            }

            return new VendorOrdersApi(new ApiClient()
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint)
                .setRateLimiter(rateLimitConfiguration));
        }
    }
}
