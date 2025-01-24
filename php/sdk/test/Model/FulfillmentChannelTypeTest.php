<?php
/**
 * FulfillmentChannelTypeTest
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

namespace OpenAPI\Client\Test\Model;

use PHPUnit\Framework\TestCase;
use OpenAPI\Client\Model\pricing\v0\FulfillmentChannelType;

/**
 * FulfillmentChannelTypeTest Class Doc Comment
 *
 * @category    Class
 * @description Indicates whether the item is fulfilled by Amazon or by the seller (merchant).
 * @package     OpenAPI\Client
 */
class FulfillmentChannelTypeTest extends TestCase
{

    private FulfillmentChannelType $model;

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->model = new FulfillmentChannelType();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        unset($this->model);
    }

    /**
     * Test "FulfillmentChannelType"
     */
    public function testFulfillmentChannelType()
    {
        $this->assertInstanceOf(FulfillmentChannelType::class, $this->model);
    }
}
