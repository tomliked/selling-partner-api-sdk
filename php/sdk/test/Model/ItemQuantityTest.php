<?php
/**
 * ItemQuantityTest
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
use OpenAPI\Client\Model\vendor\df\payments\ItemQuantity;

/**
 * ItemQuantityTest Class Doc Comment
 *
 * @category    Class
 * @description Details of item quantity.
 * @package     OpenAPI\Client
 */
class ItemQuantityTest extends TestCase
{

    private ItemQuantity $model;

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->model = new ItemQuantity();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        unset($this->model);
    }

    /**
     * Test "ItemQuantity"
     */
    public function testItemQuantity()
    {
        $this->assertInstanceOf(ItemQuantity::class, $this->model);
    }

    /**
     * Test attribute "amount"
     */
    public function testPropertyAmount()
    {
        $testValue = 123;
        
        $this->model->setAmount($testValue);
        $this->assertEquals($testValue, $this->model->getAmount());
    }

    /**
     * Test attribute "unit_of_measure"
     */
    public function testPropertyUnitOfMeasure()
    {
        $testValue = 'test';
        
        $this->model->setUnitOfMeasure($testValue);
        $this->assertEquals($testValue, $this->model->getUnitOfMeasure());
    }
}
