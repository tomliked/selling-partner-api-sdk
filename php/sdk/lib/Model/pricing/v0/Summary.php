<?php
/**
 * Summary
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Selling Partner API for Pricing
 *
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
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

namespace OpenAPI\Client\Model\pricing\v0;

use
ArrayAccess;
use OpenAPI\Client\ObjectSerializer;
use OpenAPI\Client\Model\ModelInterface;

/**
 * Summary Class Doc Comment
 *
 * @category Class
 * @description Contains price information about the product, including the LowestPrices and BuyBoxPrices, the ListPrice, the SuggestedLowerPricePlusShipping, and NumberOfOffers and NumberOfBuyBoxEligibleOffers.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class Summary implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'Summary';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static array $openAPITypes = [
             'total_offer_count' => 'int',
             'number_of_offers' => '\OpenAPI\Client\Model\pricing\v0\OfferCountType[]',
             'lowest_prices' => '\OpenAPI\Client\Model\pricing\v0\LowestPriceType[]',
             'buy_box_prices' => '\OpenAPI\Client\Model\pricing\v0\BuyBoxPriceType[]',
             'list_price' => '\OpenAPI\Client\Model\pricing\v0\MoneyType',
             'competitive_price_threshold' => '\OpenAPI\Client\Model\pricing\v0\MoneyType',
             'suggested_lower_price_plus_shipping' => '\OpenAPI\Client\Model\pricing\v0\MoneyType',
             'sales_rankings' => '\OpenAPI\Client\Model\pricing\v0\SalesRankType[]',
             'buy_box_eligible_offers' => '\OpenAPI\Client\Model\pricing\v0\OfferCountType[]',
             'offers_available_time' => '\DateTime'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static array $openAPIFormats = [
            'total_offer_count' => 'int32',
            'number_of_offers' => null,
            'lowest_prices' => null,
            'buy_box_prices' => null,
            'list_price' => null,
            'competitive_price_threshold' => null,
            'suggested_lower_price_plus_shipping' => null,
            'sales_rankings' => null,
            'buy_box_eligible_offers' => null,
            'offers_available_time' => 'date-time'    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'total_offer_count' => false,
        'number_of_offers' => true,
        'lowest_prices' => true,
        'buy_box_prices' => true,
        'list_price' => true,
        'competitive_price_threshold' => true,
        'suggested_lower_price_plus_shipping' => true,
        'sales_rankings' => true,
        'buy_box_eligible_offers' => true,
        'offers_available_time' => true
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
        'total_offer_count' => 'TotalOfferCount',
                'number_of_offers' => 'NumberOfOffers',
                'lowest_prices' => 'LowestPrices',
                'buy_box_prices' => 'BuyBoxPrices',
                'list_price' => 'ListPrice',
                'competitive_price_threshold' => 'CompetitivePriceThreshold',
                'suggested_lower_price_plus_shipping' => 'SuggestedLowerPricePlusShipping',
                'sales_rankings' => 'SalesRankings',
                'buy_box_eligible_offers' => 'BuyBoxEligibleOffers',
                'offers_available_time' => 'OffersAvailableTime'
        
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static array $setters = [
        'total_offer_count' => 'setTotalOfferCount',
        'number_of_offers' => 'setNumberOfOffers',
        'lowest_prices' => 'setLowestPrices',
        'buy_box_prices' => 'setBuyBoxPrices',
        'list_price' => 'setListPrice',
        'competitive_price_threshold' => 'setCompetitivePriceThreshold',
        'suggested_lower_price_plus_shipping' => 'setSuggestedLowerPricePlusShipping',
        'sales_rankings' => 'setSalesRankings',
        'buy_box_eligible_offers' => 'setBuyBoxEligibleOffers',
        'offers_available_time' => 'setOffersAvailableTime'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static array $getters = [
        'total_offer_count' => 'getTotalOfferCount',
        'number_of_offers' => 'getNumberOfOffers',
        'lowest_prices' => 'getLowestPrices',
        'buy_box_prices' => 'getBuyBoxPrices',
        'list_price' => 'getListPrice',
        'competitive_price_threshold' => 'getCompetitivePriceThreshold',
        'suggested_lower_price_plus_shipping' => 'getSuggestedLowerPricePlusShipping',
        'sales_rankings' => 'getSalesRankings',
        'buy_box_eligible_offers' => 'getBuyBoxEligibleOffers',
        'offers_available_time' => 'getOffersAvailableTime'
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
        $this->setIfExists('total_offer_count', $data ?? [], null);
        $this->setIfExists('number_of_offers', $data ?? [], null);
        $this->setIfExists('lowest_prices', $data ?? [], null);
        $this->setIfExists('buy_box_prices', $data ?? [], null);
        $this->setIfExists('list_price', $data ?? [], null);
        $this->setIfExists('competitive_price_threshold', $data ?? [], null);
        $this->setIfExists('suggested_lower_price_plus_shipping', $data ?? [], null);
        $this->setIfExists('sales_rankings', $data ?? [], null);
        $this->setIfExists('buy_box_eligible_offers', $data ?? [], null);
        $this->setIfExists('offers_available_time', $data ?? [], null);
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

        if ($this->container['total_offer_count'] === null) {
            $invalidProperties[] = "'total_offer_count' can't be null";
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
     * Gets total_offer_count
     *
     * @return int
     */
    public function getTotalOfferCount(): int
    {
        return $this->container['total_offer_count'];
    }

    /**
     * Sets total_offer_count
     *
     * @param int $total_offer_count The number of unique offers contained in NumberOfOffers.
     *
     * @return self
     */
    public function setTotalOfferCount(int $total_offer_count): self
    {
        if (is_null($total_offer_count)) {
            throw new \InvalidArgumentException('non-nullable total_offer_count cannot be null');
        }
        $this->container['total_offer_count'] = $total_offer_count;

        return $this;
    }

    /**
     * Gets number_of_offers
     *
     * @return array|null
     */
    public function getNumberOfOffers(): ?array
    {
        return $this->container['number_of_offers'];
    }

    /**
     * Sets number_of_offers
     *
     * @param array|null $number_of_offers number_of_offers
     *
     * @return self
     */
    public function setNumberOfOffers(?array $number_of_offers): self
    {
        if (is_null($number_of_offers)) {
            array_push($this->openAPINullablesSetToNull, 'number_of_offers');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('number_of_offers', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['number_of_offers'] = $number_of_offers;

        return $this;
    }

    /**
     * Gets lowest_prices
     *
     * @return array|null
     */
    public function getLowestPrices(): ?array
    {
        return $this->container['lowest_prices'];
    }

    /**
     * Sets lowest_prices
     *
     * @param array|null $lowest_prices lowest_prices
     *
     * @return self
     */
    public function setLowestPrices(?array $lowest_prices): self
    {
        if (is_null($lowest_prices)) {
            array_push($this->openAPINullablesSetToNull, 'lowest_prices');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('lowest_prices', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['lowest_prices'] = $lowest_prices;

        return $this;
    }

    /**
     * Gets buy_box_prices
     *
     * @return array|null
     */
    public function getBuyBoxPrices(): ?array
    {
        return $this->container['buy_box_prices'];
    }

    /**
     * Sets buy_box_prices
     *
     * @param array|null $buy_box_prices buy_box_prices
     *
     * @return self
     */
    public function setBuyBoxPrices(?array $buy_box_prices): self
    {
        if (is_null($buy_box_prices)) {
            array_push($this->openAPINullablesSetToNull, 'buy_box_prices');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('buy_box_prices', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['buy_box_prices'] = $buy_box_prices;

        return $this;
    }

    /**
     * Gets list_price
     *
     * @return \OpenAPI\Client\Model\pricing\v0\MoneyType|null
     */
    public function getListPrice(): ?\OpenAPI\Client\Model\pricing\v0\MoneyType
    {
        return $this->container['list_price'];
    }

    /**
     * Sets list_price
     *
     * @param \OpenAPI\Client\Model\pricing\v0\MoneyType|null $list_price list_price
     *
     * @return self
     */
    public function setListPrice(?\OpenAPI\Client\Model\pricing\v0\MoneyType $list_price): self
    {
        if (is_null($list_price)) {
            array_push($this->openAPINullablesSetToNull, 'list_price');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('list_price', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['list_price'] = $list_price;

        return $this;
    }

    /**
     * Gets competitive_price_threshold
     *
     * @return \OpenAPI\Client\Model\pricing\v0\MoneyType|null
     */
    public function getCompetitivePriceThreshold(): ?\OpenAPI\Client\Model\pricing\v0\MoneyType
    {
        return $this->container['competitive_price_threshold'];
    }

    /**
     * Sets competitive_price_threshold
     *
     * @param \OpenAPI\Client\Model\pricing\v0\MoneyType|null $competitive_price_threshold competitive_price_threshold
     *
     * @return self
     */
    public function setCompetitivePriceThreshold(?\OpenAPI\Client\Model\pricing\v0\MoneyType $competitive_price_threshold): self
    {
        if (is_null($competitive_price_threshold)) {
            array_push($this->openAPINullablesSetToNull, 'competitive_price_threshold');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('competitive_price_threshold', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['competitive_price_threshold'] = $competitive_price_threshold;

        return $this;
    }

    /**
     * Gets suggested_lower_price_plus_shipping
     *
     * @return \OpenAPI\Client\Model\pricing\v0\MoneyType|null
     */
    public function getSuggestedLowerPricePlusShipping(): ?\OpenAPI\Client\Model\pricing\v0\MoneyType
    {
        return $this->container['suggested_lower_price_plus_shipping'];
    }

    /**
     * Sets suggested_lower_price_plus_shipping
     *
     * @param \OpenAPI\Client\Model\pricing\v0\MoneyType|null $suggested_lower_price_plus_shipping suggested_lower_price_plus_shipping
     *
     * @return self
     */
    public function setSuggestedLowerPricePlusShipping(?\OpenAPI\Client\Model\pricing\v0\MoneyType $suggested_lower_price_plus_shipping): self
    {
        if (is_null($suggested_lower_price_plus_shipping)) {
            array_push($this->openAPINullablesSetToNull, 'suggested_lower_price_plus_shipping');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('suggested_lower_price_plus_shipping', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['suggested_lower_price_plus_shipping'] = $suggested_lower_price_plus_shipping;

        return $this;
    }

    /**
     * Gets sales_rankings
     *
     * @return array|null
     */
    public function getSalesRankings(): ?array
    {
        return $this->container['sales_rankings'];
    }

    /**
     * Sets sales_rankings
     *
     * @param array|null $sales_rankings A list of sales rank information for the item, by category.
     *
     * @return self
     */
    public function setSalesRankings(?array $sales_rankings): self
    {
        if (is_null($sales_rankings)) {
            array_push($this->openAPINullablesSetToNull, 'sales_rankings');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('sales_rankings', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['sales_rankings'] = $sales_rankings;

        return $this;
    }

    /**
     * Gets buy_box_eligible_offers
     *
     * @return array|null
     */
    public function getBuyBoxEligibleOffers(): ?array
    {
        return $this->container['buy_box_eligible_offers'];
    }

    /**
     * Sets buy_box_eligible_offers
     *
     * @param array|null $buy_box_eligible_offers buy_box_eligible_offers
     *
     * @return self
     */
    public function setBuyBoxEligibleOffers(?array $buy_box_eligible_offers): self
    {
        if (is_null($buy_box_eligible_offers)) {
            array_push($this->openAPINullablesSetToNull, 'buy_box_eligible_offers');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('buy_box_eligible_offers', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['buy_box_eligible_offers'] = $buy_box_eligible_offers;

        return $this;
    }

    /**
     * Gets offers_available_time
     *
     * @return \DateTime|null
     */
    public function getOffersAvailableTime(): ?\DateTime
    {
        return $this->container['offers_available_time'];
    }

    /**
     * Sets offers_available_time
     *
     * @param \DateTime|null $offers_available_time When the status is ActiveButTooSoonForProcessing, this is the time when the offers will be available for processing.
     *
     * @return self
     */
    public function setOffersAvailableTime(?\DateTime $offers_available_time): self
    {
        if (is_null($offers_available_time)) {
            array_push($this->openAPINullablesSetToNull, 'offers_available_time');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('offers_available_time', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['offers_available_time'] = $offers_available_time;

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


