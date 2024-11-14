/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.SellingPartnerAPI.api;

import com.amazon.SellingPartnerAPI.ApiException;
import com.amazon.SellingPartnerAPI.models.CreateContainerLabelRequest;
import com.amazon.SellingPartnerAPI.models.CreateContainerLabelResponse;
import com.amazon.SellingPartnerAPI.models.ErrorList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for CreateContainerLabelApi
*/
@Ignore
public class CreateContainerLabelApiTest {

private final CreateContainerLabelApi api = new CreateContainerLabelApi();

/**
* 
*
* Creates container (pallet) label for provided shipment package association
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createContainerLabelTest() throws ApiException, LWAException {
    CreateContainerLabelRequest body = null;
CreateContainerLabelResponse response = api.createContainerLabel(body);

// TODO: test validations
}
}