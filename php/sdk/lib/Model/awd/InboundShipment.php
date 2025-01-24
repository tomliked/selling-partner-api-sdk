<?php
/**
 * InboundShipment
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * The Selling Partner API for Amazon Warehousing and Distribution
 *
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory.
 *
 * The version of the OpenAPI document: 2024-05-09
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.9.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model\awd;

use
ArrayAccess;
use OpenAPI\Client\ObjectSerializer;
use OpenAPI\Client\Model\ModelInterface;

/**
 * InboundShipment Class Doc Comment
 *
 * @category Class
 * @description Represents an AWD inbound shipment.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class InboundShipment implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'InboundShipment';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static array $openAPITypes = [
             'carrier_code' => '\OpenAPI\Client\Model\awd\CarrierCode',
             'created_at' => '\DateTime',
             'destination_address' => '\OpenAPI\Client\Model\awd\Address',
             'external_reference_id' => 'string',
             'order_id' => 'string',
             'origin_address' => '\OpenAPI\Client\Model\awd\Address',
             'received_quantity' => '\OpenAPI\Client\Model\awd\InventoryQuantity[]',
             'ship_by' => '\DateTime',
             'shipment_container_quantities' => '\OpenAPI\Client\Model\awd\DistributionPackageQuantity[]',
             'shipment_id' => 'string',
             'shipment_sku_quantities' => '\OpenAPI\Client\Model\awd\SkuQuantity[]',
             'shipment_status' => '\OpenAPI\Client\Model\awd\InboundShipmentStatus',
             'tracking_id' => 'string',
             'updated_at' => '\DateTime',
             'warehouse_reference_id' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static array $openAPIFormats = [
            'carrier_code' => null,
            'created_at' => 'date-time',
            'destination_address' => null,
            'external_reference_id' => null,
            'order_id' => null,
            'origin_address' => null,
            'received_quantity' => null,
            'ship_by' => 'date-time',
            'shipment_container_quantities' => null,
            'shipment_id' => null,
            'shipment_sku_quantities' => null,
            'shipment_status' => null,
            'tracking_id' => null,
            'updated_at' => 'date-time',
            'warehouse_reference_id' => null    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'carrier_code' => true,
        'created_at' => true,
        'destination_address' => false,
        'external_reference_id' => true,
        'order_id' => false,
        'origin_address' => false,
        'received_quantity' => true,
        'ship_by' => true,
        'shipment_container_quantities' => false,
        'shipment_id' => false,
        'shipment_sku_quantities' => true,
        'shipment_status' => false,
        'tracking_id' => true,
        'updated_at' => true,
        'warehouse_reference_id' => true
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
        'carrier_code' => 'carrierCode',
                'created_at' => 'createdAt',
                'destination_address' => 'destinationAddress',
                'external_reference_id' => 'externalReferenceId',
                'order_id' => 'orderId',
                'origin_address' => 'originAddress',
                'received_quantity' => 'receivedQuantity',
                'ship_by' => 'shipBy',
                'shipment_container_quantities' => 'shipmentContainerQuantities',
                'shipment_id' => 'shipmentId',
                'shipment_sku_quantities' => 'shipmentSkuQuantities',
                'shipment_status' => 'shipmentStatus',
                'tracking_id' => 'trackingId',
                'updated_at' => 'updatedAt',
                'warehouse_reference_id' => 'warehouseReferenceId'
        
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static array $setters = [
        'carrier_code' => 'setCarrierCode',
        'created_at' => 'setCreatedAt',
        'destination_address' => 'setDestinationAddress',
        'external_reference_id' => 'setExternalReferenceId',
        'order_id' => 'setOrderId',
        'origin_address' => 'setOriginAddress',
        'received_quantity' => 'setReceivedQuantity',
        'ship_by' => 'setShipBy',
        'shipment_container_quantities' => 'setShipmentContainerQuantities',
        'shipment_id' => 'setShipmentId',
        'shipment_sku_quantities' => 'setShipmentSkuQuantities',
        'shipment_status' => 'setShipmentStatus',
        'tracking_id' => 'setTrackingId',
        'updated_at' => 'setUpdatedAt',
        'warehouse_reference_id' => 'setWarehouseReferenceId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static array $getters = [
        'carrier_code' => 'getCarrierCode',
        'created_at' => 'getCreatedAt',
        'destination_address' => 'getDestinationAddress',
        'external_reference_id' => 'getExternalReferenceId',
        'order_id' => 'getOrderId',
        'origin_address' => 'getOriginAddress',
        'received_quantity' => 'getReceivedQuantity',
        'ship_by' => 'getShipBy',
        'shipment_container_quantities' => 'getShipmentContainerQuantities',
        'shipment_id' => 'getShipmentId',
        'shipment_sku_quantities' => 'getShipmentSkuQuantities',
        'shipment_status' => 'getShipmentStatus',
        'tracking_id' => 'getTrackingId',
        'updated_at' => 'getUpdatedAt',
        'warehouse_reference_id' => 'getWarehouseReferenceId'
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
        $this->setIfExists('carrier_code', $data ?? [], null);
        $this->setIfExists('created_at', $data ?? [], null);
        $this->setIfExists('destination_address', $data ?? [], null);
        $this->setIfExists('external_reference_id', $data ?? [], null);
        $this->setIfExists('order_id', $data ?? [], null);
        $this->setIfExists('origin_address', $data ?? [], null);
        $this->setIfExists('received_quantity', $data ?? [], null);
        $this->setIfExists('ship_by', $data ?? [], null);
        $this->setIfExists('shipment_container_quantities', $data ?? [], null);
        $this->setIfExists('shipment_id', $data ?? [], null);
        $this->setIfExists('shipment_sku_quantities', $data ?? [], null);
        $this->setIfExists('shipment_status', $data ?? [], null);
        $this->setIfExists('tracking_id', $data ?? [], null);
        $this->setIfExists('updated_at', $data ?? [], null);
        $this->setIfExists('warehouse_reference_id', $data ?? [], null);
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

        if ($this->container['destination_address'] === null) {
            $invalidProperties[] = "'destination_address' can't be null";
        }
        if ($this->container['order_id'] === null) {
            $invalidProperties[] = "'order_id' can't be null";
        }
        if ((mb_strlen($this->container['order_id']) < 1)) {
            $invalidProperties[] = "invalid value for 'order_id', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['origin_address'] === null) {
            $invalidProperties[] = "'origin_address' can't be null";
        }
        if ($this->container['shipment_container_quantities'] === null) {
            $invalidProperties[] = "'shipment_container_quantities' can't be null";
        }
        if ($this->container['shipment_id'] === null) {
            $invalidProperties[] = "'shipment_id' can't be null";
        }
        if ((mb_strlen($this->container['shipment_id']) < 1)) {
            $invalidProperties[] = "invalid value for 'shipment_id', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['shipment_status'] === null) {
            $invalidProperties[] = "'shipment_status' can't be null";
        }
        if (!is_null($this->container['tracking_id']) && (mb_strlen($this->container['tracking_id']) < 1)) {
            $invalidProperties[] = "invalid value for 'tracking_id', the character length must be bigger than or equal to 1.";
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
     * Gets carrier_code
     *
     * @return \OpenAPI\Client\Model\awd\CarrierCode|null
     */
    public function getCarrierCode(): ?\OpenAPI\Client\Model\awd\CarrierCode
    {
        return $this->container['carrier_code'];
    }

    /**
     * Sets carrier_code
     *
     * @param \OpenAPI\Client\Model\awd\CarrierCode|null $carrier_code carrier_code
     *
     * @return self
     */
    public function setCarrierCode(?\OpenAPI\Client\Model\awd\CarrierCode $carrier_code): self
    {
        if (is_null($carrier_code)) {
            array_push($this->openAPINullablesSetToNull, 'carrier_code');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('carrier_code', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['carrier_code'] = $carrier_code;

        return $this;
    }

    /**
     * Gets created_at
     *
     * @return \DateTime|null
     */
    public function getCreatedAt(): ?\DateTime
    {
        return $this->container['created_at'];
    }

    /**
     * Sets created_at
     *
     * @param \DateTime|null $created_at Timestamp when the shipment was created. The date is returned in <a href='https://developer-docs.amazon.com/sp-api/docs/iso-8601'>ISO 8601</a> format.
     *
     * @return self
     */
    public function setCreatedAt(?\DateTime $created_at): self
    {
        if (is_null($created_at)) {
            array_push($this->openAPINullablesSetToNull, 'created_at');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('created_at', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['created_at'] = $created_at;

        return $this;
    }

    /**
     * Gets destination_address
     *
     * @return \OpenAPI\Client\Model\awd\Address
     */
    public function getDestinationAddress(): \OpenAPI\Client\Model\awd\Address
    {
        return $this->container['destination_address'];
    }

    /**
     * Sets destination_address
     *
     * @param \OpenAPI\Client\Model\awd\Address $destination_address destination_address
     *
     * @return self
     */
    public function setDestinationAddress(\OpenAPI\Client\Model\awd\Address $destination_address): self
    {
        if (is_null($destination_address)) {
            throw new \InvalidArgumentException('non-nullable destination_address cannot be null');
        }
        $this->container['destination_address'] = $destination_address;

        return $this;
    }

    /**
     * Gets external_reference_id
     *
     * @return string|null
     */
    public function getExternalReferenceId(): ?string
    {
        return $this->container['external_reference_id'];
    }

    /**
     * Sets external_reference_id
     *
     * @param string|null $external_reference_id Client-provided reference ID that can correlate this shipment to client resources. For example, to map this shipment to an internal bookkeeping order record.
     *
     * @return self
     */
    public function setExternalReferenceId(?string $external_reference_id): self
    {
        if (is_null($external_reference_id)) {
            array_push($this->openAPINullablesSetToNull, 'external_reference_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('external_reference_id', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['external_reference_id'] = $external_reference_id;

        return $this;
    }

    /**
     * Gets order_id
     *
     * @return string
     */
    public function getOrderId(): string
    {
        return $this->container['order_id'];
    }

    /**
     * Sets order_id
     *
     * @param string $order_id The AWD inbound order ID that this inbound shipment belongs to.
     *
     * @return self
     */
    public function setOrderId(string $order_id): self
    {
        if (is_null($order_id)) {
            throw new \InvalidArgumentException('non-nullable order_id cannot be null');
        }

        if ((mb_strlen($order_id) < 1)) {
            throw new \InvalidArgumentException('invalid length for $order_id when calling InboundShipment., must be bigger than or equal to 1.');
        }

        $this->container['order_id'] = $order_id;

        return $this;
    }

    /**
     * Gets origin_address
     *
     * @return \OpenAPI\Client\Model\awd\Address
     */
    public function getOriginAddress(): \OpenAPI\Client\Model\awd\Address
    {
        return $this->container['origin_address'];
    }

    /**
     * Sets origin_address
     *
     * @param \OpenAPI\Client\Model\awd\Address $origin_address origin_address
     *
     * @return self
     */
    public function setOriginAddress(\OpenAPI\Client\Model\awd\Address $origin_address): self
    {
        if (is_null($origin_address)) {
            throw new \InvalidArgumentException('non-nullable origin_address cannot be null');
        }
        $this->container['origin_address'] = $origin_address;

        return $this;
    }

    /**
     * Gets received_quantity
     *
     * @return array|null
     */
    public function getReceivedQuantity(): ?array
    {
        return $this->container['received_quantity'];
    }

    /**
     * Sets received_quantity
     *
     * @param array|null $received_quantity Quantity received (at the receiving end) as part of this shipment.
     *
     * @return self
     */
    public function setReceivedQuantity(?array $received_quantity): self
    {
        if (is_null($received_quantity)) {
            array_push($this->openAPINullablesSetToNull, 'received_quantity');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('received_quantity', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['received_quantity'] = $received_quantity;

        return $this;
    }

    /**
     * Gets ship_by
     *
     * @return \DateTime|null
     */
    public function getShipBy(): ?\DateTime
    {
        return $this->container['ship_by'];
    }

    /**
     * Sets ship_by
     *
     * @param \DateTime|null $ship_by Timestamp when the shipment will be shipped.
     *
     * @return self
     */
    public function setShipBy(?\DateTime $ship_by): self
    {
        if (is_null($ship_by)) {
            array_push($this->openAPINullablesSetToNull, 'ship_by');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('ship_by', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['ship_by'] = $ship_by;

        return $this;
    }

    /**
     * Gets shipment_container_quantities
     *
     * @return array
     */
    public function getShipmentContainerQuantities(): array
    {
        return $this->container['shipment_container_quantities'];
    }

    /**
     * Sets shipment_container_quantities
     *
     * @param array $shipment_container_quantities Packages that are part of this shipment.
     *
     * @return self
     */
    public function setShipmentContainerQuantities(array $shipment_container_quantities): self
    {
        if (is_null($shipment_container_quantities)) {
            throw new \InvalidArgumentException('non-nullable shipment_container_quantities cannot be null');
        }
        $this->container['shipment_container_quantities'] = $shipment_container_quantities;

        return $this;
    }

    /**
     * Gets shipment_id
     *
     * @return string
     */
    public function getShipmentId(): string
    {
        return $this->container['shipment_id'];
    }

    /**
     * Sets shipment_id
     *
     * @param string $shipment_id Unique shipment ID.
     *
     * @return self
     */
    public function setShipmentId(string $shipment_id): self
    {
        if (is_null($shipment_id)) {
            throw new \InvalidArgumentException('non-nullable shipment_id cannot be null');
        }

        if ((mb_strlen($shipment_id) < 1)) {
            throw new \InvalidArgumentException('invalid length for $shipment_id when calling InboundShipment., must be bigger than or equal to 1.');
        }

        $this->container['shipment_id'] = $shipment_id;

        return $this;
    }

    /**
     * Gets shipment_sku_quantities
     *
     * @return array|null
     */
    public function getShipmentSkuQuantities(): ?array
    {
        return $this->container['shipment_sku_quantities'];
    }

    /**
     * Sets shipment_sku_quantities
     *
     * @param array|null $shipment_sku_quantities Quantity details at SKU level for the shipment. This attribute will only appear if the skuQuantities parameter in the request is set to SHOW.
     *
     * @return self
     */
    public function setShipmentSkuQuantities(?array $shipment_sku_quantities): self
    {
        if (is_null($shipment_sku_quantities)) {
            array_push($this->openAPINullablesSetToNull, 'shipment_sku_quantities');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('shipment_sku_quantities', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['shipment_sku_quantities'] = $shipment_sku_quantities;

        return $this;
    }

    /**
     * Gets shipment_status
     *
     * @return string
     */
    public function getShipmentStatus(): string
    {
        return $this->container['shipment_status'];
    }

    /**
     * Sets shipment_status
     *
     * @param string $shipment_status shipment_status
     *
     * @return self
     */
    public function setShipmentStatus(string $shipment_status): self
    {
        if (is_null($shipment_status)) {
            throw new \InvalidArgumentException('non-nullable shipment_status cannot be null');
        }
        $this->container['shipment_status'] = $shipment_status;

        return $this;
    }

    /**
     * Gets tracking_id
     *
     * @return string|null
     */
    public function getTrackingId(): ?string
    {
        return $this->container['tracking_id'];
    }

    /**
     * Sets tracking_id
     *
     * @param string|null $tracking_id Carrier-unique tracking ID for this shipment.
     *
     * @return self
     */
    public function setTrackingId(?string $tracking_id): self
    {
        if (is_null($tracking_id)) {
            array_push($this->openAPINullablesSetToNull, 'tracking_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tracking_id', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        if (!is_null($tracking_id) && (mb_strlen($tracking_id) < 1)) {
            throw new \InvalidArgumentException('invalid length for $tracking_id when calling InboundShipment., must be bigger than or equal to 1.');
        }

        $this->container['tracking_id'] = $tracking_id;

        return $this;
    }

    /**
     * Gets updated_at
     *
     * @return \DateTime|null
     */
    public function getUpdatedAt(): ?\DateTime
    {
        return $this->container['updated_at'];
    }

    /**
     * Sets updated_at
     *
     * @param \DateTime|null $updated_at Timestamp when the shipment was updated. The date is returned in <a href='https://developer-docs.amazon.com/sp-api/docs/iso-8601'>ISO 8601</a> format.
     *
     * @return self
     */
    public function setUpdatedAt(?\DateTime $updated_at): self
    {
        if (is_null($updated_at)) {
            array_push($this->openAPINullablesSetToNull, 'updated_at');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('updated_at', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['updated_at'] = $updated_at;

        return $this;
    }

    /**
     * Gets warehouse_reference_id
     *
     * @return string|null
     */
    public function getWarehouseReferenceId(): ?string
    {
        return $this->container['warehouse_reference_id'];
    }

    /**
     * Sets warehouse_reference_id
     *
     * @param string|null $warehouse_reference_id An AWD-provided reference ID that you can use to interact with the warehouse. For example, a carrier appointment booking.
     *
     * @return self
     */
    public function setWarehouseReferenceId(?string $warehouse_reference_id): self
    {
        if (is_null($warehouse_reference_id)) {
            array_push($this->openAPINullablesSetToNull, 'warehouse_reference_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('warehouse_reference_id', $nullablesSetToNull);
            if ($index !== false) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['warehouse_reference_id'] = $warehouse_reference_id;

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


