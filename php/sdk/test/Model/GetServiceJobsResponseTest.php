<?php
/**
 * GetServiceJobsResponseTest
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
use OpenAPI\Client\Model\services\GetServiceJobsResponse;

/**
 * GetServiceJobsResponseTest Class Doc Comment
 *
 * @category    Class
 * @description Response schema for the &#x60;getServiceJobs&#x60; operation.
 * @package     OpenAPI\Client
 */
class GetServiceJobsResponseTest extends TestCase
{

    private GetServiceJobsResponse $model;

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->model = new GetServiceJobsResponse();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        unset($this->model);
    }

    /**
     * Test "GetServiceJobsResponse"
     */
    public function testGetServiceJobsResponse()
    {
        $this->assertInstanceOf(GetServiceJobsResponse::class, $this->model);
    }

    /**
     * Test attribute "payload"
     */
    public function testPropertyPayload()
    {
        
        $testValue = new \OpenAPI\Client\Model\services\JobListing();
        
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
