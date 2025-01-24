<?php
/**
 * AwdApiTest
 * PHP version 8.3
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * The Selling Partner API for Amazon Warehousing and Distribution
 *
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory.
 *
 * The version of the OpenAPI document: 2024-05-09
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.9.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Client\Test\Api;

use OpenAPI\Client\ApiException;
use OpenAPI\Client\Api\AwdApi;
use OpenAPI\Client\ObjectSerializer;

/**
 * AwdApiTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class AwdApiTest extends BaseTestCase
{
    private AwdApi $apiInstance;
    public function setUp(): void
    {
        parent::setUp();
        // Initialize parameter value specific to case
        $this->testHelper->setSpecificValue('AwdApi', $this->getName());
        $this->apiInstance = new AwdApi($this->config, null, null);
        // Change Time Format if it requires
        $specificTimeFormat = $this->testHelper->getDateTimeFormatForCase('AwdApi');
        if ($specificTimeFormat) {
            ObjectSerializer::setDateTimeFormat($specificTimeFormat);
        }
    }

    /**
     * Test case for getInboundShipment_200
     */
    public function testGetInboundShipment200()
    {
        try {
            // Skip test if it is in the skip list
            if ($this->testHelper->shouldSkipTest('testGetInboundShipment200', 'AwdApi')) {
                $this->assertTrue(true);
                return;
            }
            $jsonSchema = '{
  &quot;description&quot; : &quot;The 200 response for &#x60;getInboundShipment&#x60;.&quot;,
  &quot;headers&quot; : {
    &quot;x-amzn-RequestId&quot; : {
      &quot;description&quot; : &quot;Unique request reference identifier.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    },
    &quot;x-amzn-RateLimit-Limit&quot; : {
      &quot;description&quot; : &quot;Your rate limit (requests per second) for this operation.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    }
  },
  &quot;content&quot; : {
    &quot;application/json&quot; : {
      &quot;schema&quot; : {
        &quot;$ref&quot; : &quot;#/components/schemas/InboundShipment&quot;
      }
    }
  },
  &quot;x-amzn-api-sandbox&quot; : {
    &quot;static&quot; : [ {
      &quot;request&quot; : {
        &quot;parameters&quot; : {
          &quot;shipmentId&quot; : {
            &quot;value&quot; : &quot;TestShipmentId&quot;
          }
        }
      },
      &quot;response&quot; : {
        &quot;createdAt&quot; : &quot;2023-06-07T12:12:09.061Z&quot;,
        &quot;destinationAddress&quot; : {
          &quot;addressLine1&quot; : &quot;address_line_1&quot;,
          &quot;addressLine2&quot; : &quot;address_line_2&quot;,
          &quot;addressLine3&quot; : &quot;address_line_3&quot;,
          &quot;city&quot; : &quot;City1&quot;,
          &quot;countryCode&quot; : &quot;CC&quot;,
          &quot;district&quot; : &quot;District1&quot;,
          &quot;name&quot; : &quot;DestinationName&quot;,
          &quot;postalCode&quot; : &quot;123456&quot;,
          &quot;stateOrRegion&quot; : &quot;State1&quot;
        },
        &quot;orderId&quot; : &quot;TestOrderId&quot;,
        &quot;originAddress&quot; : {
          &quot;addressLine1&quot; : &quot;address_1&quot;,
          &quot;addressLine2&quot; : &quot;address_2&quot;,
          &quot;addressLine3&quot; : &quot;address_3&quot;,
          &quot;city&quot; : &quot;City1&quot;,
          &quot;countryCode&quot; : &quot;CC&quot;,
          &quot;district&quot; : &quot;District1&quot;,
          &quot;name&quot; : &quot;address_name&quot;,
          &quot;postalCode&quot; : &quot;123456&quot;,
          &quot;stateOrRegion&quot; : &quot;State1&quot;
        },
        &quot;receivedQuantity&quot; : [ {
          &quot;quantity&quot; : 0,
          &quot;unitOfMeasurement&quot; : &quot;CASES&quot;
        } ],
        &quot;shipmentContainerQuantities&quot; : [ {
          &quot;count&quot; : 2,
          &quot;distributionPackage&quot; : {
            &quot;contents&quot; : {
              &quot;packages&quot; : [ ],
              &quot;products&quot; : [ {
                &quot;quantity&quot; : 20,
                &quot;sku&quot; : &quot;testPen&quot;
              } ]
            },
            &quot;measurements&quot; : {
              &quot;dimensions&quot; : {
                &quot;height&quot; : 33.02,
                &quot;length&quot; : 45.72,
                &quot;unitOfMeasurement&quot; : &quot;CENTIMETERS&quot;,
                &quot;width&quot; : 15.24
              },
              &quot;weight&quot; : {
                &quot;unitOfMeasurement&quot; : &quot;KILOGRAMS&quot;,
                &quot;weight&quot; : 5.443104
              }
            },
            &quot;type&quot; : &quot;CASE&quot;
          }
        } ],
        &quot;shipmentId&quot; : &quot;TestShipmentId&quot;,
        &quot;shipmentStatus&quot; : &quot;CREATED&quot;,
        &quot;shipmentSkuQuantities&quot; : [ {
          &quot;sku&quot; : &quot;testPen&quot;,
          &quot;expectedQuantity&quot; : {
            &quot;quantity&quot; : 2,
            &quot;unitOfMeasurement&quot; : &quot;CASE&quot;
          },
          &quot;receivedQuantity&quot; : {
            &quot;quantity&quot; : 0,
            &quot;unitOfMeasurement&quot; : &quot;CASE&quot;
          }
        } ],
        &quot;updatedAt&quot; : &quot;2023-06-07T12:12:09.061Z&quot;
      }
    } ]
  }
}';
            $result = $this->testHelper->extractRequestAndResponse(
                $this->apiInstance,
                $jsonSchema,
                'getInboundShipment'
            );
            $requestParams = $result['requestParams'];
            $expectedResponse = $result['expectedResponse'];

            // Change Time Format if it requires
            $specificTimeFormat = $this->testHelper->getDateTimeFormatForCase('AwdApi');
            if ($specificTimeFormat) {
                ObjectSerializer::setDateTimeFormat($specificTimeFormat);
            }

            // Act: Call API
            list($response, $statusCode, $headers) =
                $this->apiInstance->getInboundShipmentWithHttpInfo(...array_values($requestParams));

            // Assert the response code
            $this->assertHttpStatusCode(200, $statusCode);

            // Handle different response codes
            $this->handleResponse($response, $statusCode, 200, $expectedResponse);
        } catch (ApiException $e) {
            $this->handleApiException($e, 200);
        } catch (\ReflectionException $e) {
            $this->fail("Reflection exception: " . $e->getMessage());
        }
    }
    /**
     * Test case for getInboundShipment_400
     */
    public function testGetInboundShipment400()
    {
        try {
            // Skip test if it is in the skip list
            if ($this->testHelper->shouldSkipTest('testGetInboundShipment400', 'AwdApi')) {
                $this->assertTrue(true);
                return;
            }
            $jsonSchema = '{
  &quot;description&quot; : &quot;Request has missing or invalid parameters and cannot be parsed.&quot;,
  &quot;headers&quot; : {
    &quot;x-amzn-RequestId&quot; : {
      &quot;description&quot; : &quot;Unique request reference identifier.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    },
    &quot;x-amzn-RateLimit-Limit&quot; : {
      &quot;description&quot; : &quot;Your rate limit (requests per second) for this operation.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    }
  },
  &quot;content&quot; : {
    &quot;application/json&quot; : {
      &quot;schema&quot; : {
        &quot;$ref&quot; : &quot;#/components/schemas/ErrorList&quot;
      }
    }
  },
  &quot;x-amzn-api-sandbox&quot; : {
    &quot;static&quot; : [ {
      &quot;request&quot; : {
        &quot;parameters&quot; : {
          &quot;shipmentId&quot; : {
            &quot;value&quot; : &quot; &quot;
          }
        }
      },
      &quot;response&quot; : {
        &quot;errors&quot; : [ {
          &quot;code&quot; : &quot;BAD_REQUEST&quot;,
          &quot;details&quot; : &quot;This exception is thrown when client inputs are invalid&quot;,
          &quot;message&quot; : &quot;ShipmentId should be present for this request&quot;
        } ]
      }
    } ]
  }
}';
            $result = $this->testHelper->extractRequestAndResponse(
                $this->apiInstance,
                $jsonSchema,
                'getInboundShipment'
            );
            $requestParams = $result['requestParams'];
            $expectedResponse = $result['expectedResponse'];

            // Change Time Format if it requires
            $specificTimeFormat = $this->testHelper->getDateTimeFormatForCase('AwdApi');
            if ($specificTimeFormat) {
                ObjectSerializer::setDateTimeFormat($specificTimeFormat);
            }

            // Act: Call API
            list($response, $statusCode, $headers) =
                $this->apiInstance->getInboundShipmentWithHttpInfo(...array_values($requestParams));

            // Assert the response code
            $this->assertHttpStatusCode(400, $statusCode);

            // Handle different response codes
            $this->handleResponse($response, $statusCode, 400, $expectedResponse);
        } catch (ApiException $e) {
            $this->handleApiException($e, 400);
        } catch (\ReflectionException $e) {
            $this->fail("Reflection exception: " . $e->getMessage());
        }
    }
    /**
     * Test case for getInboundShipment_403
     */
    public function testGetInboundShipment403()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for getInboundShipment_404
     */
    public function testGetInboundShipment404()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for getInboundShipment_413
     */
    public function testGetInboundShipment413()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for getInboundShipment_415
     */
    public function testGetInboundShipment415()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for getInboundShipment_429
     */
    public function testGetInboundShipment429()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for getInboundShipment_500
     */
    public function testGetInboundShipment500()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for getInboundShipment_503
     */
    public function testGetInboundShipment503()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInboundShipments_200
     */
    public function testListInboundShipments200()
    {
        try {
            // Skip test if it is in the skip list
            if ($this->testHelper->shouldSkipTest('testListInboundShipments200', 'AwdApi')) {
                $this->assertTrue(true);
                return;
            }
            $jsonSchema = '{
  &quot;description&quot; : &quot;The 200 response for &#x60;listInboundShipments&#x60;.&quot;,
  &quot;headers&quot; : {
    &quot;x-amzn-RequestId&quot; : {
      &quot;description&quot; : &quot;Unique request reference identifier.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    },
    &quot;x-amzn-RateLimit-Limit&quot; : {
      &quot;description&quot; : &quot;Your rate limit (requests per second) for this operation.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    }
  },
  &quot;content&quot; : {
    &quot;application/json&quot; : {
      &quot;schema&quot; : {
        &quot;$ref&quot; : &quot;#/components/schemas/ShipmentListing&quot;
      }
    }
  },
  &quot;x-amzn-api-sandbox&quot; : {
    &quot;static&quot; : [ {
      &quot;request&quot; : {
        &quot;parameters&quot; : { }
      },
      &quot;response&quot; : {
        &quot;shipments&quot; : [ {
          &quot;createdAt&quot; : &quot;2023-06-07T12:12:09.061Z&quot;,
          &quot;orderId&quot; : &quot;TestOrderId&quot;,
          &quot;shipmentId&quot; : &quot;TestShipmentId&quot;,
          &quot;shipmentStatus&quot; : &quot;CREATED&quot;,
          &quot;updatedAt&quot; : &quot;2023-06-07T12:12:09.061Z&quot;
        } ]
      }
    } ]
  }
}';
            $result = $this->testHelper->extractRequestAndResponse(
                $this->apiInstance,
                $jsonSchema,
                'listInboundShipments'
            );
            $requestParams = $result['requestParams'];
            $expectedResponse = $result['expectedResponse'];

            // Change Time Format if it requires
            $specificTimeFormat = $this->testHelper->getDateTimeFormatForCase('AwdApi');
            if ($specificTimeFormat) {
                ObjectSerializer::setDateTimeFormat($specificTimeFormat);
            }

            // Act: Call API
            list($response, $statusCode, $headers) =
                $this->apiInstance->listInboundShipmentsWithHttpInfo(...array_values($requestParams));

            // Assert the response code
            $this->assertHttpStatusCode(200, $statusCode);

            // Handle different response codes
            $this->handleResponse($response, $statusCode, 200, $expectedResponse);
        } catch (ApiException $e) {
            $this->handleApiException($e, 200);
        } catch (\ReflectionException $e) {
            $this->fail("Reflection exception: " . $e->getMessage());
        }
    }
    /**
     * Test case for listInboundShipments_400
     */
    public function testListInboundShipments400()
    {
        try {
            // Skip test if it is in the skip list
            if ($this->testHelper->shouldSkipTest('testListInboundShipments400', 'AwdApi')) {
                $this->assertTrue(true);
                return;
            }
            $jsonSchema = '{
  &quot;description&quot; : &quot;Request has missing or invalid parameters and cannot be parsed.&quot;,
  &quot;headers&quot; : {
    &quot;x-amzn-RequestId&quot; : {
      &quot;description&quot; : &quot;Unique request reference identifier.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    },
    &quot;x-amzn-RateLimit-Limit&quot; : {
      &quot;description&quot; : &quot;Your rate limit (requests per second) for this operation.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    }
  },
  &quot;content&quot; : {
    &quot;application/json&quot; : {
      &quot;schema&quot; : {
        &quot;$ref&quot; : &quot;#/components/schemas/ErrorList&quot;
      }
    }
  },
  &quot;x-amzn-api-sandbox&quot; : {
    &quot;static&quot; : [ {
      &quot;request&quot; : {
        &quot;parameters&quot; : {
          &quot;sortBy&quot; : {
            &quot;value&quot; : &quot;TEST&quot;
          }
        }
      },
      &quot;response&quot; : {
        &quot;errors&quot; : [ {
          &quot;code&quot; : &quot;BAD_REQUEST&quot;,
          &quot;details&quot; : &quot;This exception is thrown when client inputs are invalid&quot;,
          &quot;message&quot; : &quot;Invalid shipment sortable field received: TEST&quot;
        } ]
      }
    } ]
  }
}';
            $result = $this->testHelper->extractRequestAndResponse(
                $this->apiInstance,
                $jsonSchema,
                'listInboundShipments'
            );
            $requestParams = $result['requestParams'];
            $expectedResponse = $result['expectedResponse'];

            // Change Time Format if it requires
            $specificTimeFormat = $this->testHelper->getDateTimeFormatForCase('AwdApi');
            if ($specificTimeFormat) {
                ObjectSerializer::setDateTimeFormat($specificTimeFormat);
            }

            // Act: Call API
            list($response, $statusCode, $headers) =
                $this->apiInstance->listInboundShipmentsWithHttpInfo(...array_values($requestParams));

            // Assert the response code
            $this->assertHttpStatusCode(400, $statusCode);

            // Handle different response codes
            $this->handleResponse($response, $statusCode, 400, $expectedResponse);
        } catch (ApiException $e) {
            $this->handleApiException($e, 400);
        } catch (\ReflectionException $e) {
            $this->fail("Reflection exception: " . $e->getMessage());
        }
    }
    /**
     * Test case for listInboundShipments_403
     */
    public function testListInboundShipments403()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInboundShipments_404
     */
    public function testListInboundShipments404()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInboundShipments_413
     */
    public function testListInboundShipments413()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInboundShipments_415
     */
    public function testListInboundShipments415()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInboundShipments_429
     */
    public function testListInboundShipments429()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInboundShipments_500
     */
    public function testListInboundShipments500()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInboundShipments_503
     */
    public function testListInboundShipments503()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInventory_200
     */
    public function testListInventory200()
    {
        try {
            // Skip test if it is in the skip list
            if ($this->testHelper->shouldSkipTest('testListInventory200', 'AwdApi')) {
                $this->assertTrue(true);
                return;
            }
            $jsonSchema = '{
  &quot;description&quot; : &quot;The 200 response for &#x60;listInventory&#x60;.&quot;,
  &quot;headers&quot; : {
    &quot;x-amzn-RequestId&quot; : {
      &quot;description&quot; : &quot;Unique request reference identifier.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    },
    &quot;x-amzn-RateLimit-Limit&quot; : {
      &quot;description&quot; : &quot;Your rate limit (requests per second) for this operation.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    }
  },
  &quot;content&quot; : {
    &quot;application/json&quot; : {
      &quot;schema&quot; : {
        &quot;$ref&quot; : &quot;#/components/schemas/InventoryListing&quot;
      }
    }
  },
  &quot;x-amzn-api-sandbox&quot; : {
    &quot;static&quot; : [ {
      &quot;request&quot; : { },
      &quot;response&quot; : {
        &quot;inventory&quot; : [ {
          &quot;totalOnhandQuantity&quot; : 20,
          &quot;totalInboundQuantity&quot; : 10,
          &quot;sku&quot; : &quot;100TestSKU1Pen&quot;,
          &quot;inventoryDetails&quot; : {
            &quot;availableDistributableQuantity&quot; : 10,
            &quot;reservedDistributableQuantity&quot; : 10
          }
        }, {
          &quot;totalOnhandQuantity&quot; : 20,
          &quot;totalInboundQuantity&quot; : 5,
          &quot;sku&quot; : &quot;2U-BKEX-VW4D&quot;,
          &quot;inventoryDetails&quot; : {
            &quot;availableDistributableQuantity&quot; : 10,
            &quot;reservedDistributableQuantity&quot; : 10
          }
        } ]
      }
    } ]
  }
}';
            $result = $this->testHelper->extractRequestAndResponse(
                $this->apiInstance,
                $jsonSchema,
                'listInventory'
            );
            $requestParams = $result['requestParams'];
            $expectedResponse = $result['expectedResponse'];

            // Change Time Format if it requires
            $specificTimeFormat = $this->testHelper->getDateTimeFormatForCase('AwdApi');
            if ($specificTimeFormat) {
                ObjectSerializer::setDateTimeFormat($specificTimeFormat);
            }

            // Act: Call API
            list($response, $statusCode, $headers) =
                $this->apiInstance->listInventoryWithHttpInfo(...array_values($requestParams));

            // Assert the response code
            $this->assertHttpStatusCode(200, $statusCode);

            // Handle different response codes
            $this->handleResponse($response, $statusCode, 200, $expectedResponse);
        } catch (ApiException $e) {
            $this->handleApiException($e, 200);
        } catch (\ReflectionException $e) {
            $this->fail("Reflection exception: " . $e->getMessage());
        }
    }
    /**
     * Test case for listInventory_400
     */
    public function testListInventory400()
    {
        try {
            // Skip test if it is in the skip list
            if ($this->testHelper->shouldSkipTest('testListInventory400', 'AwdApi')) {
                $this->assertTrue(true);
                return;
            }
            $jsonSchema = '{
  &quot;description&quot; : &quot;Request has missing or invalid parameters and cannot be parsed.&quot;,
  &quot;headers&quot; : {
    &quot;x-amzn-RequestId&quot; : {
      &quot;description&quot; : &quot;Unique request reference identifier.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    },
    &quot;x-amzn-RateLimit-Limit&quot; : {
      &quot;description&quot; : &quot;Your rate limit (requests per second) for this operation.&quot;,
      &quot;schema&quot; : {
        &quot;type&quot; : &quot;string&quot;
      }
    }
  },
  &quot;content&quot; : {
    &quot;application/json&quot; : {
      &quot;schema&quot; : {
        &quot;$ref&quot; : &quot;#/components/schemas/ErrorList&quot;
      }
    }
  },
  &quot;x-amzn-api-sandbox&quot; : {
    &quot;static&quot; : [ {
      &quot;request&quot; : {
        &quot;parameters&quot; : {
          &quot;sortOrder&quot; : {
            &quot;value&quot; : &quot;UNKNOWN&quot;
          }
        }
      },
      &quot;response&quot; : {
        &quot;errors&quot; : [ {
          &quot;code&quot; : &quot;BAD_REQUEST&quot;,
          &quot;details&quot; : &quot;This exception is thrown when client inputs are invalid&quot;,
          &quot;message&quot; : &quot;Invalid value: UNKNOWN passed for sort order. Possible values are: [ASCENDING, DESCENDING]&quot;
        } ]
      }
    } ]
  }
}';
            $result = $this->testHelper->extractRequestAndResponse(
                $this->apiInstance,
                $jsonSchema,
                'listInventory'
            );
            $requestParams = $result['requestParams'];
            $expectedResponse = $result['expectedResponse'];

            // Change Time Format if it requires
            $specificTimeFormat = $this->testHelper->getDateTimeFormatForCase('AwdApi');
            if ($specificTimeFormat) {
                ObjectSerializer::setDateTimeFormat($specificTimeFormat);
            }

            // Act: Call API
            list($response, $statusCode, $headers) =
                $this->apiInstance->listInventoryWithHttpInfo(...array_values($requestParams));

            // Assert the response code
            $this->assertHttpStatusCode(400, $statusCode);

            // Handle different response codes
            $this->handleResponse($response, $statusCode, 400, $expectedResponse);
        } catch (ApiException $e) {
            $this->handleApiException($e, 400);
        } catch (\ReflectionException $e) {
            $this->fail("Reflection exception: " . $e->getMessage());
        }
    }
    /**
     * Test case for listInventory_403
     */
    public function testListInventory403()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInventory_404
     */
    public function testListInventory404()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInventory_413
     */
    public function testListInventory413()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInventory_415
     */
    public function testListInventory415()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInventory_429
     */
    public function testListInventory429()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInventory_500
     */
    public function testListInventory500()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
    /**
     * Test case for listInventory_503
     */
    public function testListInventory503()
    {
        // Skip this test
        $this->markTestSkipped('Skip test for this operation.');
    }
}
