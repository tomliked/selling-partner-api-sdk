<?php
/**
 * ContentTypeTest
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
use OpenAPI\Client\Model\aplusContent\ContentType;

/**
 * ContentTypeTest Class Doc Comment
 *
 * @category    Class
 * @description The A+ Content document type.
 * @package     OpenAPI\Client
 */
class ContentTypeTest extends TestCase
{

    private ContentType $model;

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->model = new ContentType();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        unset($this->model);
    }

    /**
     * Test "ContentType"
     */
    public function testContentType()
    {
        $this->assertInstanceOf(ContentType::class, $this->model);
    }
}
