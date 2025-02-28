<?php
/**
 * Item
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Selling Partner API for Catalog Items
 *
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * The version of the OpenAPI document: 2022-04-01
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.9.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace SpApi\Model\catalogItems\v2022_04_01;

use
ArrayAccess;
use SpApi\ObjectSerializer;
use SpApi\Model\ModelInterface;

/**
 * Item Class Doc Comment
 *
 * @category Class
 * @description An item in the Amazon catalog.
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class Item implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'Item';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static array $openAPITypes = [
             'asin' => 'string',
             'attributes' => 'array<string,mixed>',
             'classifications' => '\SpApi\Model\catalogItems\v2022_04_01\ItemBrowseClassificationsByMarketplace[]',
             'dimensions' => '\SpApi\Model\catalogItems\v2022_04_01\ItemDimensionsByMarketplace[]',
             'identifiers' => '\SpApi\Model\catalogItems\v2022_04_01\ItemIdentifiersByMarketplace[]',
             'images' => '\SpApi\Model\catalogItems\v2022_04_01\ItemImagesByMarketplace[]',
             'product_types' => '\SpApi\Model\catalogItems\v2022_04_01\ItemProductTypeByMarketplace[]',
             'relationships' => '\SpApi\Model\catalogItems\v2022_04_01\ItemRelationshipsByMarketplace[]',
             'sales_ranks' => '\SpApi\Model\catalogItems\v2022_04_01\ItemSalesRanksByMarketplace[]',
             'summaries' => '\SpApi\Model\catalogItems\v2022_04_01\ItemSummaryByMarketplace[]',
             'vendor_details' => '\SpApi\Model\catalogItems\v2022_04_01\ItemVendorDetailsByMarketplace[]'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static array $openAPIFormats = [
            'asin' => null,
            'attributes' => null,
            'classifications' => null,
            'dimensions' => null,
            'identifiers' => null,
            'images' => null,
            'product_types' => null,
            'relationships' => null,
            'sales_ranks' => null,
            'summaries' => null,
            'vendor_details' => null    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'asin' => false,
        'attributes' => true,
        'classifications' => true,
        'dimensions' => true,
        'identifiers' => true,
        'images' => true,
        'product_types' => true,
        'relationships' => true,
        'sales_ranks' => true,
        'summaries' => true,
        'vendor_details' => true
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes(): array
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats(): array
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static array $attributeMap = [
        'asin' => 'asin',
                'attributes' => 'attributes',
                'classifications' => 'classifications',
                'dimensions' => 'dimensions',
                'identifiers' => 'identifiers',
                'images' => 'images',
                'product_types' => 'productTypes',
                'relationships' => 'relationships',
                'sales_ranks' => 'salesRanks',
                'summaries' => 'summaries',
                'vendor_details' => 'vendorDetails'
        
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static array $setters = [
        'asin' => 'setAsin',
        'attributes' => 'setAttributes',
        'classifications' => 'setClassifications',
        'dimensions' => 'setDimensions',
        'identifiers' => 'setIdentifiers',
        'images' => 'setImages',
        'product_types' => 'setProductTypes',
        'relationships' => 'setRelationships',
        'sales_ranks' => 'setSalesRanks',
        'summaries' => 'setSummaries',
        'vendor_details' => 'setVendorDetails'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static array $getters = [
        'asin' => 'getAsin',
        'attributes' => 'getAttributes',
        'classifications' => 'getClassifications',
        'dimensions' => 'getDimensions',
        'identifiers' => 'getIdentifiers',
        'images' => 'getImages',
        'product_types' => 'getProductTypes',
        'relationships' => 'getRelationships',
        'sales_ranks' => 'getSalesRanks',
        'summaries' => 'getSummaries',
        'vendor_details' => 'getVendorDetails'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap(): array
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters(): array
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters(): array
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName(): string
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var array
     */
    protected array $container = [];

    /**
     * Constructor
     *
     * @param array|null $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(?array $data = null)
    {
        $this->setIfExists('asin', $data ?? [], null);
        $this->setIfExists('attributes', $data ?? [], null);
        $this->setIfExists('classifications', $data ?? [], null);
        $this->setIfExists('dimensions', $data ?? [], null);
        $this->setIfExists('identifiers', $data ?? [], null);
        $this->setIfExists('images', $data ?? [], null);
        $this->setIfExists('product_types', $data ?? [], null);
        $this->setIfExists('relationships', $data ?? [], null);
        $this->setIfExists('sales_ranks', $data ?? [], null);
        $this->setIfExists('summaries', $data ?? [], null);
        $this->setIfExists('vendor_details', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties(): array
    {
        $invalidProperties = [];

        if ($this->container['asin'] === null) {
            $invalidProperties[] = "'asin' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid(): bool
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets asin
     *
     * @return string
     */
    public function getAsin(): string
    {
        return $this->container['asin'];
    }

    /**
     * Sets asin
     *
     * @param string $asin Amazon Standard Identification Number (ASIN) is the unique identifier for an item in the Amazon catalog.
     *
     * @return self
     */
    public function setAsin(string $asin): self
    {
        if (is_null($asin)) {
            throw new \InvalidArgumentException('non-nullable asin cannot be null');
        }
        $this->container['asin'] = $asin;

        return $this;
    }

    /**
     * Gets attributes
     *
     * @return array<string,mixed>|null
     */
    public function getAttributes(): ?array
    {
        return $this->container['attributes'];
    }

    /**
     * Sets attributes
     *
     * @param array<string,mixed>|null $attributes A JSON object that contains structured item attribute data keyed by attribute name. Catalog item attributes conform to the related product type definitions available in the Selling Partner API for Product Type Definitions.
     *
     * @return self
     */
    public function setAttributes(?array $attributes): self
    {
        if (is_null($attributes)) {
            array_push($this->openAPINullablesSetToNull, 'attributes');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('attributes', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['attributes'] = $attributes;

        return $this;
    }

    /**
     * Gets classifications
     *
     * @return array|null
     */
    public function getClassifications(): ?array
    {
        return $this->container['classifications'];
    }

    /**
     * Sets classifications
     *
     * @param array|null $classifications Array of classifications (browse nodes) associated with the item in the Amazon catalog by Amazon marketplace.
     *
     * @return self
     */
    public function setClassifications(?array $classifications): self
    {
        if (is_null($classifications)) {
            array_push($this->openAPINullablesSetToNull, 'classifications');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('classifications', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['classifications'] = $classifications;

        return $this;
    }

    /**
     * Gets dimensions
     *
     * @return array|null
     */
    public function getDimensions(): ?array
    {
        return $this->container['dimensions'];
    }

    /**
     * Sets dimensions
     *
     * @param array|null $dimensions Array of dimensions associated with the item in the Amazon catalog by Amazon marketplace.
     *
     * @return self
     */
    public function setDimensions(?array $dimensions): self
    {
        if (is_null($dimensions)) {
            array_push($this->openAPINullablesSetToNull, 'dimensions');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('dimensions', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['dimensions'] = $dimensions;

        return $this;
    }

    /**
     * Gets identifiers
     *
     * @return array|null
     */
    public function getIdentifiers(): ?array
    {
        return $this->container['identifiers'];
    }

    /**
     * Sets identifiers
     *
     * @param array|null $identifiers Identifiers associated with the item in the Amazon catalog, such as UPC and EAN identifiers.
     *
     * @return self
     */
    public function setIdentifiers(?array $identifiers): self
    {
        if (is_null($identifiers)) {
            array_push($this->openAPINullablesSetToNull, 'identifiers');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('identifiers', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['identifiers'] = $identifiers;

        return $this;
    }

    /**
     * Gets images
     *
     * @return array|null
     */
    public function getImages(): ?array
    {
        return $this->container['images'];
    }

    /**
     * Sets images
     *
     * @param array|null $images Images for an item in the Amazon catalog.
     *
     * @return self
     */
    public function setImages(?array $images): self
    {
        if (is_null($images)) {
            array_push($this->openAPINullablesSetToNull, 'images');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('images', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['images'] = $images;

        return $this;
    }

    /**
     * Gets product_types
     *
     * @return array|null
     */
    public function getProductTypes(): ?array
    {
        return $this->container['product_types'];
    }

    /**
     * Sets product_types
     *
     * @param array|null $product_types Product types associated with the Amazon catalog item.
     *
     * @return self
     */
    public function setProductTypes(?array $product_types): self
    {
        if (is_null($product_types)) {
            array_push($this->openAPINullablesSetToNull, 'product_types');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('product_types', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['product_types'] = $product_types;

        return $this;
    }

    /**
     * Gets relationships
     *
     * @return array|null
     */
    public function getRelationships(): ?array
    {
        return $this->container['relationships'];
    }

    /**
     * Sets relationships
     *
     * @param array|null $relationships Relationships by marketplace for an Amazon catalog item (for example, variations).
     *
     * @return self
     */
    public function setRelationships(?array $relationships): self
    {
        if (is_null($relationships)) {
            array_push($this->openAPINullablesSetToNull, 'relationships');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('relationships', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['relationships'] = $relationships;

        return $this;
    }

    /**
     * Gets sales_ranks
     *
     * @return array|null
     */
    public function getSalesRanks(): ?array
    {
        return $this->container['sales_ranks'];
    }

    /**
     * Sets sales_ranks
     *
     * @param array|null $sales_ranks Sales ranks of an Amazon catalog item.
     *
     * @return self
     */
    public function setSalesRanks(?array $sales_ranks): self
    {
        if (is_null($sales_ranks)) {
            array_push($this->openAPINullablesSetToNull, 'sales_ranks');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('sales_ranks', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['sales_ranks'] = $sales_ranks;

        return $this;
    }

    /**
     * Gets summaries
     *
     * @return array|null
     */
    public function getSummaries(): ?array
    {
        return $this->container['summaries'];
    }

    /**
     * Sets summaries
     *
     * @param array|null $summaries Summary details of an Amazon catalog item.
     *
     * @return self
     */
    public function setSummaries(?array $summaries): self
    {
        if (is_null($summaries)) {
            array_push($this->openAPINullablesSetToNull, 'summaries');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('summaries', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['summaries'] = $summaries;

        return $this;
    }

    /**
     * Gets vendor_details
     *
     * @return array|null
     */
    public function getVendorDetails(): ?array
    {
        return $this->container['vendor_details'];
    }

    /**
     * Sets vendor_details
     *
     * @param array|null $vendor_details Vendor details associated with an Amazon catalog item. Vendor details are available to vendors only.
     *
     * @return self
     */
    public function setVendorDetails(?array $vendor_details): self
    {
        if (is_null($vendor_details)) {
            array_push($this->openAPINullablesSetToNull, 'vendor_details');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('vendor_details', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['vendor_details'] = $vendor_details;

        return $this;
    }


    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset): mixed
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, mixed $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize(): mixed
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue(): string
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


