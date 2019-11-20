<?php
/**
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
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
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'comAdobeCqDamS7imagingImplPsPlatformServerServletProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cache_enable' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean',
        'cache_root_paths' => '\OpenAPI\Client\Model\ConfigNodePropertyArray',
        'cache_max_size' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cache_max_entries' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'cache_enable' => null,
        'cache_root_paths' => null,
        'cache_max_size' => null,
        'cache_max_entries' => null
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
        'cache_enable' => 'cache.enable',
        'cache_root_paths' => 'cache.rootPaths',
        'cache_max_size' => 'cache.maxSize',
        'cache_max_entries' => 'cache.maxEntries'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cache_enable' => 'setCacheEnable',
        'cache_root_paths' => 'setCacheRootPaths',
        'cache_max_size' => 'setCacheMaxSize',
        'cache_max_entries' => 'setCacheMaxEntries'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cache_enable' => 'getCacheEnable',
        'cache_root_paths' => 'getCacheRootPaths',
        'cache_max_size' => 'getCacheMaxSize',
        'cache_max_entries' => 'getCacheMaxEntries'
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
        $this->container['cache_enable'] = isset($data['cache_enable']) ? $data['cache_enable'] : null;
        $this->container['cache_root_paths'] = isset($data['cache_root_paths']) ? $data['cache_root_paths'] : null;
        $this->container['cache_max_size'] = isset($data['cache_max_size']) ? $data['cache_max_size'] : null;
        $this->container['cache_max_entries'] = isset($data['cache_max_entries']) ? $data['cache_max_entries'] : null;
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
     * Gets cache_enable
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getCacheEnable()
    {
        return $this->container['cache_enable'];
    }

    /**
     * Sets cache_enable
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $cache_enable cache_enable
     *
     * @return $this
     */
    public function setCacheEnable($cache_enable)
    {
        $this->container['cache_enable'] = $cache_enable;

        return $this;
    }

    /**
     * Gets cache_root_paths
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyArray|null
     */
    public function getCacheRootPaths()
    {
        return $this->container['cache_root_paths'];
    }

    /**
     * Sets cache_root_paths
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyArray|null $cache_root_paths cache_root_paths
     *
     * @return $this
     */
    public function setCacheRootPaths($cache_root_paths)
    {
        $this->container['cache_root_paths'] = $cache_root_paths;

        return $this;
    }

    /**
     * Gets cache_max_size
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCacheMaxSize()
    {
        return $this->container['cache_max_size'];
    }

    /**
     * Sets cache_max_size
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cache_max_size cache_max_size
     *
     * @return $this
     */
    public function setCacheMaxSize($cache_max_size)
    {
        $this->container['cache_max_size'] = $cache_max_size;

        return $this;
    }

    /**
     * Gets cache_max_entries
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCacheMaxEntries()
    {
        return $this->container['cache_max_entries'];
    }

    /**
     * Sets cache_max_entries
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cache_max_entries cache_max_entries
     *
     * @return $this
     */
    public function setCacheMaxEntries($cache_max_entries)
    {
        $this->container['cache_max_entries'] = $cache_max_entries;

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

