<?php
/**
 * ItemRelationshipsByMarketplaceTest
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

namespace SpApi\Test\Model;

use PHPUnit\Framework\TestCase;
use SpApi\Model\catalogItems\v2022_04_01\ItemRelationshipsByMarketplace;

/**
 * ItemRelationshipsByMarketplaceTest Class Doc Comment
 *
 * @category    Class
 * @description Relationship details for the Amazon catalog item for the specified Amazon &#x60;marketplaceId&#x60;.
 * @package     SpApi
 */
class ItemRelationshipsByMarketplaceTest extends TestCase
{

    private ItemRelationshipsByMarketplace $model;

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->model = new ItemRelationshipsByMarketplace();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        unset($this->model);
    }

    /**
     * Test "ItemRelationshipsByMarketplace"
     */
    public function testItemRelationshipsByMarketplace()
    {
        $this->assertInstanceOf(ItemRelationshipsByMarketplace::class, $this->model);
    }

    /**
     * Test attribute "marketplace_id"
     */
    public function testPropertyMarketplaceId()
    {
        $testValue = 'test';
        
        $this->model->setMarketplaceId($testValue);
        $this->assertEquals($testValue, $this->model->getMarketplaceId());
    }

    /**
     * Test attribute "relationships"
     */
    public function testPropertyRelationships()
    {
        $testValue = [];
        
        $this->model->setRelationships($testValue);
        $this->assertEquals($testValue, $this->model->getRelationships());
    }
}
