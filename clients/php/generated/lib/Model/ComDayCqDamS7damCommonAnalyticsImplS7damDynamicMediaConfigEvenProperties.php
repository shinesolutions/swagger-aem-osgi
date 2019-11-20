<?php
/**
 * ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
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
 * ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled' => null
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
        'cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled' => 'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled' => 'setCqDamS7damDynamicmediaconfigeventlistenerEnabled'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled' => 'getCqDamS7damDynamicmediaconfigeventlistenerEnabled'
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
        $this->container['cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled'] = isset($data['cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled']) ? $data['cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled'] : null;
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
     * Gets cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getCqDamS7damDynamicmediaconfigeventlistenerEnabled()
    {
        return $this->container['cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled'];
    }

    /**
     * Sets cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled
     *
     * @return $this
     */
    public function setCqDamS7damDynamicmediaconfigeventlistenerEnabled($cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled)
    {
        $this->container['cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled'] = $cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled;

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

