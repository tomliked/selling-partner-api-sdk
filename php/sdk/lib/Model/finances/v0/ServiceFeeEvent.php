<?php
/**
 * ServiceFeeEvent
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Selling Partner API for Finances
 *
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * The version of the OpenAPI document: v0
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.9.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace SpApi\Model\finances\v0;

use
ArrayAccess;
use SpApi\ObjectSerializer;
use SpApi\Model\ModelInterface;

/**
 * ServiceFeeEvent Class Doc Comment
 *
 * @category Class
 * @description A service fee on the seller&#39;s account.
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ServiceFeeEvent implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'ServiceFeeEvent';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static array $openAPITypes = [
             'amazon_order_id' => 'string',
             'fee_reason' => 'string',
             'fee_list' => '\SpApi\Model\finances\v0\FeeComponent[]',
             'seller_sku' => 'string',
             'fn_sku' => 'string',
             'fee_description' => 'string',
             'asin' => 'string',
             'store_name' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static array $openAPIFormats = [
            'amazon_order_id' => null,
            'fee_reason' => null,
            'fee_list' => null,
            'seller_sku' => null,
            'fn_sku' => null,
            'fee_description' => null,
            'asin' => null,
            'store_name' => null    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'amazon_order_id' => true,
        'fee_reason' => true,
        'fee_list' => true,
        'seller_sku' => true,
        'fn_sku' => true,
        'fee_description' => true,
        'asin' => true,
        'store_name' => true
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
        'amazon_order_id' => 'AmazonOrderId',
                'fee_reason' => 'FeeReason',
                'fee_list' => 'FeeList',
                'seller_sku' => 'SellerSKU',
                'fn_sku' => 'FnSKU',
                'fee_description' => 'FeeDescription',
                'asin' => 'ASIN',
                'store_name' => 'StoreName'
        
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static array $setters = [
        'amazon_order_id' => 'setAmazonOrderId',
        'fee_reason' => 'setFeeReason',
        'fee_list' => 'setFeeList',
        'seller_sku' => 'setSellerSku',
        'fn_sku' => 'setFnSku',
        'fee_description' => 'setFeeDescription',
        'asin' => 'setAsin',
        'store_name' => 'setStoreName'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static array $getters = [
        'amazon_order_id' => 'getAmazonOrderId',
        'fee_reason' => 'getFeeReason',
        'fee_list' => 'getFeeList',
        'seller_sku' => 'getSellerSku',
        'fn_sku' => 'getFnSku',
        'fee_description' => 'getFeeDescription',
        'asin' => 'getAsin',
        'store_name' => 'getStoreName'
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
        $this->setIfExists('amazon_order_id', $data ?? [], null);
        $this->setIfExists('fee_reason', $data ?? [], null);
        $this->setIfExists('fee_list', $data ?? [], null);
        $this->setIfExists('seller_sku', $data ?? [], null);
        $this->setIfExists('fn_sku', $data ?? [], null);
        $this->setIfExists('fee_description', $data ?? [], null);
        $this->setIfExists('asin', $data ?? [], null);
        $this->setIfExists('store_name', $data ?? [], null);
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
     * Gets amazon_order_id
     *
     * @return string|null
     */
    public function getAmazonOrderId(): ?string
    {
        return $this->container['amazon_order_id'];
    }

    /**
     * Sets amazon_order_id
     *
     * @param string|null $amazon_order_id An Amazon-defined identifier for an order.
     *
     * @return self
     */
    public function setAmazonOrderId(?string $amazon_order_id): self
    {
        if (is_null($amazon_order_id)) {
            array_push($this->openAPINullablesSetToNull, 'amazon_order_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amazon_order_id', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['amazon_order_id'] = $amazon_order_id;

        return $this;
    }

    /**
     * Gets fee_reason
     *
     * @return string|null
     */
    public function getFeeReason(): ?string
    {
        return $this->container['fee_reason'];
    }

    /**
     * Sets fee_reason
     *
     * @param string|null $fee_reason A short description of the service fee reason.
     *
     * @return self
     */
    public function setFeeReason(?string $fee_reason): self
    {
        if (is_null($fee_reason)) {
            array_push($this->openAPINullablesSetToNull, 'fee_reason');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_reason', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['fee_reason'] = $fee_reason;

        return $this;
    }

    /**
     * Gets fee_list
     *
     * @return array|null
     */
    public function getFeeList(): ?array
    {
        return $this->container['fee_list'];
    }

    /**
     * Sets fee_list
     *
     * @param array|null $fee_list A list of fee component information.
     *
     * @return self
     */
    public function setFeeList(?array $fee_list): self
    {
        if (is_null($fee_list)) {
            array_push($this->openAPINullablesSetToNull, 'fee_list');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_list', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['fee_list'] = $fee_list;

        return $this;
    }

    /**
     * Gets seller_sku
     *
     * @return string|null
     */
    public function getSellerSku(): ?string
    {
        return $this->container['seller_sku'];
    }

    /**
     * Sets seller_sku
     *
     * @param string|null $seller_sku The seller SKU of the item. The seller SKU is qualified by the seller's seller ID, which is included with every call to the Selling Partner API.
     *
     * @return self
     */
    public function setSellerSku(?string $seller_sku): self
    {
        if (is_null($seller_sku)) {
            array_push($this->openAPINullablesSetToNull, 'seller_sku');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('seller_sku', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['seller_sku'] = $seller_sku;

        return $this;
    }

    /**
     * Gets fn_sku
     *
     * @return string|null
     */
    public function getFnSku(): ?string
    {
        return $this->container['fn_sku'];
    }

    /**
     * Sets fn_sku
     *
     * @param string|null $fn_sku A unique identifier assigned by Amazon to products stored in and fulfilled from an Amazon fulfillment center.
     *
     * @return self
     */
    public function setFnSku(?string $fn_sku): self
    {
        if (is_null($fn_sku)) {
            array_push($this->openAPINullablesSetToNull, 'fn_sku');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fn_sku', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['fn_sku'] = $fn_sku;

        return $this;
    }

    /**
     * Gets fee_description
     *
     * @return string|null
     */
    public function getFeeDescription(): ?string
    {
        return $this->container['fee_description'];
    }

    /**
     * Sets fee_description
     *
     * @param string|null $fee_description A short description of the service fee event.
     *
     * @return self
     */
    public function setFeeDescription(?string $fee_description): self
    {
        if (is_null($fee_description)) {
            array_push($this->openAPINullablesSetToNull, 'fee_description');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_description', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['fee_description'] = $fee_description;

        return $this;
    }

    /**
     * Gets asin
     *
     * @return string|null
     */
    public function getAsin(): ?string
    {
        return $this->container['asin'];
    }

    /**
     * Sets asin
     *
     * @param string|null $asin The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return self
     */
    public function setAsin(?string $asin): self
    {
        if (is_null($asin)) {
            array_push($this->openAPINullablesSetToNull, 'asin');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('asin', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['asin'] = $asin;

        return $this;
    }

    /**
     * Gets store_name
     *
     * @return string|null
     */
    public function getStoreName(): ?string
    {
        return $this->container['store_name'];
    }

    /**
     * Sets store_name
     *
     * @param string|null $store_name The name of the store where the event occurred.
     *
     * @return self
     */
    public function setStoreName(?string $store_name): self
    {
        if (is_null($store_name)) {
            array_push($this->openAPINullablesSetToNull, 'store_name');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('store_name', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['store_name'] = $store_name;

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


