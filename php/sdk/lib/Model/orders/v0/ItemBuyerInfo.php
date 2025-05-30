<?php
/**
 * ItemBuyerInfo
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Selling Partner API for Orders
 *
 * Use the Orders Selling Partner API to programmatically retrieve order information. With this API, you can develop fast, flexible, and custom applications to manage order synchronization, perform order research, and create demand-based decision support tools.   _Note:_ For the JP, AU, and SG marketplaces, the Orders API supports orders from 2016 onward. For all other marketplaces, the Orders API supports orders for the last two years (orders older than this don't show up in the response).
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

namespace SpApi\Model\orders\v0;

use
ArrayAccess;
use SpApi\ObjectSerializer;
use SpApi\Model\ModelInterface;

/**
 * ItemBuyerInfo Class Doc Comment
 *
 * @category Class
 * @description A single item&#39;s buyer information.
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ItemBuyerInfo implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'ItemBuyerInfo';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static array $openAPITypes = [
             'buyer_customized_info' => '\SpApi\Model\orders\v0\BuyerCustomizedInfoDetail',
             'gift_wrap_price' => '\SpApi\Model\orders\v0\Money',
             'gift_wrap_tax' => '\SpApi\Model\orders\v0\Money',
             'gift_message_text' => 'string',
             'gift_wrap_level' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static array $openAPIFormats = [
            'buyer_customized_info' => null,
            'gift_wrap_price' => null,
            'gift_wrap_tax' => null,
            'gift_message_text' => null,
            'gift_wrap_level' => null    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'buyer_customized_info' => true,
        'gift_wrap_price' => true,
        'gift_wrap_tax' => true,
        'gift_message_text' => true,
        'gift_wrap_level' => true
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
        'buyer_customized_info' => 'BuyerCustomizedInfo',
                'gift_wrap_price' => 'GiftWrapPrice',
                'gift_wrap_tax' => 'GiftWrapTax',
                'gift_message_text' => 'GiftMessageText',
                'gift_wrap_level' => 'GiftWrapLevel'
        
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static array $setters = [
        'buyer_customized_info' => 'setBuyerCustomizedInfo',
        'gift_wrap_price' => 'setGiftWrapPrice',
        'gift_wrap_tax' => 'setGiftWrapTax',
        'gift_message_text' => 'setGiftMessageText',
        'gift_wrap_level' => 'setGiftWrapLevel'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static array $getters = [
        'buyer_customized_info' => 'getBuyerCustomizedInfo',
        'gift_wrap_price' => 'getGiftWrapPrice',
        'gift_wrap_tax' => 'getGiftWrapTax',
        'gift_message_text' => 'getGiftMessageText',
        'gift_wrap_level' => 'getGiftWrapLevel'
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
        $this->setIfExists('buyer_customized_info', $data ?? [], null);
        $this->setIfExists('gift_wrap_price', $data ?? [], null);
        $this->setIfExists('gift_wrap_tax', $data ?? [], null);
        $this->setIfExists('gift_message_text', $data ?? [], null);
        $this->setIfExists('gift_wrap_level', $data ?? [], null);
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
     * Gets buyer_customized_info
     *
     * @return \SpApi\Model\orders\v0\BuyerCustomizedInfoDetail|null
     */
    public function getBuyerCustomizedInfo(): ?\SpApi\Model\orders\v0\BuyerCustomizedInfoDetail
    {
        return $this->container['buyer_customized_info'];
    }

    /**
     * Sets buyer_customized_info
     *
     * @param \SpApi\Model\orders\v0\BuyerCustomizedInfoDetail|null $buyer_customized_info buyer_customized_info
     *
     * @return self
     */
    public function setBuyerCustomizedInfo(?\SpApi\Model\orders\v0\BuyerCustomizedInfoDetail $buyer_customized_info): self
    {
        if (is_null($buyer_customized_info)) {
            array_push($this->openAPINullablesSetToNull, 'buyer_customized_info');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('buyer_customized_info', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['buyer_customized_info'] = $buyer_customized_info;

        return $this;
    }

    /**
     * Gets gift_wrap_price
     *
     * @return \SpApi\Model\orders\v0\Money|null
     */
    public function getGiftWrapPrice(): ?\SpApi\Model\orders\v0\Money
    {
        return $this->container['gift_wrap_price'];
    }

    /**
     * Sets gift_wrap_price
     *
     * @param \SpApi\Model\orders\v0\Money|null $gift_wrap_price gift_wrap_price
     *
     * @return self
     */
    public function setGiftWrapPrice(?\SpApi\Model\orders\v0\Money $gift_wrap_price): self
    {
        if (is_null($gift_wrap_price)) {
            array_push($this->openAPINullablesSetToNull, 'gift_wrap_price');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gift_wrap_price', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['gift_wrap_price'] = $gift_wrap_price;

        return $this;
    }

    /**
     * Gets gift_wrap_tax
     *
     * @return \SpApi\Model\orders\v0\Money|null
     */
    public function getGiftWrapTax(): ?\SpApi\Model\orders\v0\Money
    {
        return $this->container['gift_wrap_tax'];
    }

    /**
     * Sets gift_wrap_tax
     *
     * @param \SpApi\Model\orders\v0\Money|null $gift_wrap_tax gift_wrap_tax
     *
     * @return self
     */
    public function setGiftWrapTax(?\SpApi\Model\orders\v0\Money $gift_wrap_tax): self
    {
        if (is_null($gift_wrap_tax)) {
            array_push($this->openAPINullablesSetToNull, 'gift_wrap_tax');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gift_wrap_tax', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['gift_wrap_tax'] = $gift_wrap_tax;

        return $this;
    }

    /**
     * Gets gift_message_text
     *
     * @return string|null
     */
    public function getGiftMessageText(): ?string
    {
        return $this->container['gift_message_text'];
    }

    /**
     * Sets gift_message_text
     *
     * @param string|null $gift_message_text A gift message provided by the buyer.  **Note**: This attribute is only available for MFN (fulfilled by seller) orders.
     *
     * @return self
     */
    public function setGiftMessageText(?string $gift_message_text): self
    {
        if (is_null($gift_message_text)) {
            array_push($this->openAPINullablesSetToNull, 'gift_message_text');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gift_message_text', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['gift_message_text'] = $gift_message_text;

        return $this;
    }

    /**
     * Gets gift_wrap_level
     *
     * @return string|null
     */
    public function getGiftWrapLevel(): ?string
    {
        return $this->container['gift_wrap_level'];
    }

    /**
     * Sets gift_wrap_level
     *
     * @param string|null $gift_wrap_level The gift wrap level specified by the buyer.
     *
     * @return self
     */
    public function setGiftWrapLevel(?string $gift_wrap_level): self
    {
        if (is_null($gift_wrap_level)) {
            array_push($this->openAPINullablesSetToNull, 'gift_wrap_level');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gift_wrap_level', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['gift_wrap_level'] = $gift_wrap_level;

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


