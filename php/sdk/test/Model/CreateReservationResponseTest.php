<?php
/**
 * CreateReservationResponseTest
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
use OpenAPI\Client\Model\services\CreateReservationResponse;

/**
 * CreateReservationResponseTest Class Doc Comment
 *
 * @category    Class
 * @description Response schema for the &#x60;createReservation&#x60; operation.
 * @package     OpenAPI\Client
 */
class CreateReservationResponseTest extends TestCase
{

    private CreateReservationResponse $model;

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->model = new CreateReservationResponse();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        unset($this->model);
    }

    /**
     * Test "CreateReservationResponse"
     */
    public function testCreateReservationResponse()
    {
        $this->assertInstanceOf(CreateReservationResponse::class, $this->model);
    }

    /**
     * Test attribute "payload"
     */
    public function testPropertyPayload()
    {
        
        $testValue = new \OpenAPI\Client\Model\services\CreateReservationRecord();
        
        $this->model->setPayload($testValue);
        $this->assertEquals($testValue, $this->model->getPayload());
    }

    /**
     * Test attribute "errors"
     */
    public function testPropertyErrors()
    {
        $testValue = [];
        
        $this->model->setErrors($testValue);
        $this->assertEquals($testValue, $this->model->getErrors());
    }
}
