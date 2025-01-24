<?php
/**
 * StandardMultipleImageTextModuleTest
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
use OpenAPI\Client\Model\aplusContent\StandardMultipleImageTextModule;

/**
 * StandardMultipleImageTextModuleTest Class Doc Comment
 *
 * @category    Class
 * @description Standard images with text, presented one at a time. The user clicks on thumbnails to view each block.
 * @package     OpenAPI\Client
 */
class StandardMultipleImageTextModuleTest extends TestCase
{

    private StandardMultipleImageTextModule $model;

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->model = new StandardMultipleImageTextModule();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        unset($this->model);
    }

    /**
     * Test "StandardMultipleImageTextModule"
     */
    public function testStandardMultipleImageTextModule()
    {
        $this->assertInstanceOf(StandardMultipleImageTextModule::class, $this->model);
    }

    /**
     * Test attribute "blocks"
     */
    public function testPropertyBlocks()
    {
        $testValue = [];
        
        $this->model->setBlocks($testValue);
        $this->assertEquals($testValue, $this->model->getBlocks());
    }
}
