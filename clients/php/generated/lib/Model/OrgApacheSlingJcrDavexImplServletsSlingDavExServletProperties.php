<?php
/**
 * OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
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
 * OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'alias' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'dav_create_absolute_uri' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean',
        'dav_protectedhandlers' => '\OpenAPI\Client\Model\ConfigNodePropertyString'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'alias' => null,
        'dav_create_absolute_uri' => null,
        'dav_protectedhandlers' => null
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
        'alias' => 'alias',
        'dav_create_absolute_uri' => 'dav.create-absolute-uri',
        'dav_protectedhandlers' => 'dav.protectedhandlers'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'alias' => 'setAlias',
        'dav_create_absolute_uri' => 'setDavCreateAbsoluteUri',
        'dav_protectedhandlers' => 'setDavProtectedhandlers'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'alias' => 'getAlias',
        'dav_create_absolute_uri' => 'getDavCreateAbsoluteUri',
        'dav_protectedhandlers' => 'getDavProtectedhandlers'
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
        $this->container['alias'] = isset($data['alias']) ? $data['alias'] : null;
        $this->container['dav_create_absolute_uri'] = isset($data['dav_create_absolute_uri']) ? $data['dav_create_absolute_uri'] : null;
        $this->container['dav_protectedhandlers'] = isset($data['dav_protectedhandlers']) ? $data['dav_protectedhandlers'] : null;
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
     * Gets alias
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getAlias()
    {
        return $this->container['alias'];
    }

    /**
     * Sets alias
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $alias alias
     *
     * @return $this
     */
    public function setAlias($alias)
    {
        $this->container['alias'] = $alias;

        return $this;
    }

    /**
     * Gets dav_create_absolute_uri
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getDavCreateAbsoluteUri()
    {
        return $this->container['dav_create_absolute_uri'];
    }

    /**
     * Sets dav_create_absolute_uri
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $dav_create_absolute_uri dav_create_absolute_uri
     *
     * @return $this
     */
    public function setDavCreateAbsoluteUri($dav_create_absolute_uri)
    {
        $this->container['dav_create_absolute_uri'] = $dav_create_absolute_uri;

        return $this;
    }

    /**
     * Gets dav_protectedhandlers
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getDavProtectedhandlers()
    {
        return $this->container['dav_protectedhandlers'];
    }

    /**
     * Sets dav_protectedhandlers
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $dav_protectedhandlers dav_protectedhandlers
     *
     * @return $this
     */
    public function setDavProtectedhandlers($dav_protectedhandlers)
    {
        $this->container['dav_protectedhandlers'] = $dav_protectedhandlers;

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

