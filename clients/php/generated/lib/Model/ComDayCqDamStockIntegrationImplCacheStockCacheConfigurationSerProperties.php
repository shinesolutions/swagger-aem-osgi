<?php
/**
 * ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 3.2.1-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'get_cache_expiration_unit' => '\OpenAPI\Client\Model\ConfigNodePropertyDropDown',
        'get_cache_expiration_value' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'get_cache_expiration_unit' => null,
        'get_cache_expiration_value' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'get_cache_expiration_unit' => 'getCacheExpirationUnit',
        'get_cache_expiration_value' => 'getCacheExpirationValue'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'get_cache_expiration_unit' => 'setGetCacheExpirationUnit',
        'get_cache_expiration_value' => 'setGetCacheExpirationValue'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'get_cache_expiration_unit' => 'getGetCacheExpirationUnit',
        'get_cache_expiration_value' => 'getGetCacheExpirationValue'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['get_cache_expiration_unit'] = isset($data['get_cache_expiration_unit']) ? $data['get_cache_expiration_unit'] : null;
        $this->container['get_cache_expiration_value'] = isset($data['get_cache_expiration_value']) ? $data['get_cache_expiration_value'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
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
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets get_cache_expiration_unit
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyDropDown|null
     */
    public function getGetCacheExpirationUnit()
    {
        return $this->container['get_cache_expiration_unit'];
    }

    /**
     * Sets get_cache_expiration_unit
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyDropDown|null $get_cache_expiration_unit get_cache_expiration_unit
     *
     * @return $this
     */
    public function setGetCacheExpirationUnit($get_cache_expiration_unit)
    {
        $this->container['get_cache_expiration_unit'] = $get_cache_expiration_unit;

        return $this;
    }

    /**
     * Gets get_cache_expiration_value
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getGetCacheExpirationValue()
    {
        return $this->container['get_cache_expiration_value'];
    }

    /**
     * Sets get_cache_expiration_value
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $get_cache_expiration_value get_cache_expiration_value
     *
     * @return $this
     */
    public function setGetCacheExpirationValue($get_cache_expiration_value)
    {
        $this->container['get_cache_expiration_value'] = $get_cache_expiration_value;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
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
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
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
}

