<?php
/**
 * OrgApacheSlingHapiImplHApiUtilImplProperties
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
 * OrgApacheSlingHapiImplHApiUtilImplProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OrgApacheSlingHapiImplHApiUtilImplProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'orgApacheSlingHapiImplHApiUtilImplProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'org_apache_sling_hapi_tools_resourcetype' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'org_apache_sling_hapi_tools_collectionresourcetype' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'org_apache_sling_hapi_tools_searchpaths' => '\OpenAPI\Client\Model\ConfigNodePropertyArray',
        'org_apache_sling_hapi_tools_externalurl' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'org_apache_sling_hapi_tools_enabled' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'org_apache_sling_hapi_tools_resourcetype' => null,
        'org_apache_sling_hapi_tools_collectionresourcetype' => null,
        'org_apache_sling_hapi_tools_searchpaths' => null,
        'org_apache_sling_hapi_tools_externalurl' => null,
        'org_apache_sling_hapi_tools_enabled' => null
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
        'org_apache_sling_hapi_tools_resourcetype' => 'org.apache.sling.hapi.tools.resourcetype',
        'org_apache_sling_hapi_tools_collectionresourcetype' => 'org.apache.sling.hapi.tools.collectionresourcetype',
        'org_apache_sling_hapi_tools_searchpaths' => 'org.apache.sling.hapi.tools.searchpaths',
        'org_apache_sling_hapi_tools_externalurl' => 'org.apache.sling.hapi.tools.externalurl',
        'org_apache_sling_hapi_tools_enabled' => 'org.apache.sling.hapi.tools.enabled'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'org_apache_sling_hapi_tools_resourcetype' => 'setOrgApacheSlingHapiToolsResourcetype',
        'org_apache_sling_hapi_tools_collectionresourcetype' => 'setOrgApacheSlingHapiToolsCollectionresourcetype',
        'org_apache_sling_hapi_tools_searchpaths' => 'setOrgApacheSlingHapiToolsSearchpaths',
        'org_apache_sling_hapi_tools_externalurl' => 'setOrgApacheSlingHapiToolsExternalurl',
        'org_apache_sling_hapi_tools_enabled' => 'setOrgApacheSlingHapiToolsEnabled'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'org_apache_sling_hapi_tools_resourcetype' => 'getOrgApacheSlingHapiToolsResourcetype',
        'org_apache_sling_hapi_tools_collectionresourcetype' => 'getOrgApacheSlingHapiToolsCollectionresourcetype',
        'org_apache_sling_hapi_tools_searchpaths' => 'getOrgApacheSlingHapiToolsSearchpaths',
        'org_apache_sling_hapi_tools_externalurl' => 'getOrgApacheSlingHapiToolsExternalurl',
        'org_apache_sling_hapi_tools_enabled' => 'getOrgApacheSlingHapiToolsEnabled'
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
        $this->container['org_apache_sling_hapi_tools_resourcetype'] = isset($data['org_apache_sling_hapi_tools_resourcetype']) ? $data['org_apache_sling_hapi_tools_resourcetype'] : null;
        $this->container['org_apache_sling_hapi_tools_collectionresourcetype'] = isset($data['org_apache_sling_hapi_tools_collectionresourcetype']) ? $data['org_apache_sling_hapi_tools_collectionresourcetype'] : null;
        $this->container['org_apache_sling_hapi_tools_searchpaths'] = isset($data['org_apache_sling_hapi_tools_searchpaths']) ? $data['org_apache_sling_hapi_tools_searchpaths'] : null;
        $this->container['org_apache_sling_hapi_tools_externalurl'] = isset($data['org_apache_sling_hapi_tools_externalurl']) ? $data['org_apache_sling_hapi_tools_externalurl'] : null;
        $this->container['org_apache_sling_hapi_tools_enabled'] = isset($data['org_apache_sling_hapi_tools_enabled']) ? $data['org_apache_sling_hapi_tools_enabled'] : null;
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
     * Gets org_apache_sling_hapi_tools_resourcetype
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getOrgApacheSlingHapiToolsResourcetype()
    {
        return $this->container['org_apache_sling_hapi_tools_resourcetype'];
    }

    /**
     * Sets org_apache_sling_hapi_tools_resourcetype
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $org_apache_sling_hapi_tools_resourcetype org_apache_sling_hapi_tools_resourcetype
     *
     * @return $this
     */
    public function setOrgApacheSlingHapiToolsResourcetype($org_apache_sling_hapi_tools_resourcetype)
    {
        $this->container['org_apache_sling_hapi_tools_resourcetype'] = $org_apache_sling_hapi_tools_resourcetype;

        return $this;
    }

    /**
     * Gets org_apache_sling_hapi_tools_collectionresourcetype
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getOrgApacheSlingHapiToolsCollectionresourcetype()
    {
        return $this->container['org_apache_sling_hapi_tools_collectionresourcetype'];
    }

    /**
     * Sets org_apache_sling_hapi_tools_collectionresourcetype
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $org_apache_sling_hapi_tools_collectionresourcetype org_apache_sling_hapi_tools_collectionresourcetype
     *
     * @return $this
     */
    public function setOrgApacheSlingHapiToolsCollectionresourcetype($org_apache_sling_hapi_tools_collectionresourcetype)
    {
        $this->container['org_apache_sling_hapi_tools_collectionresourcetype'] = $org_apache_sling_hapi_tools_collectionresourcetype;

        return $this;
    }

    /**
     * Gets org_apache_sling_hapi_tools_searchpaths
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyArray|null
     */
    public function getOrgApacheSlingHapiToolsSearchpaths()
    {
        return $this->container['org_apache_sling_hapi_tools_searchpaths'];
    }

    /**
     * Sets org_apache_sling_hapi_tools_searchpaths
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyArray|null $org_apache_sling_hapi_tools_searchpaths org_apache_sling_hapi_tools_searchpaths
     *
     * @return $this
     */
    public function setOrgApacheSlingHapiToolsSearchpaths($org_apache_sling_hapi_tools_searchpaths)
    {
        $this->container['org_apache_sling_hapi_tools_searchpaths'] = $org_apache_sling_hapi_tools_searchpaths;

        return $this;
    }

    /**
     * Gets org_apache_sling_hapi_tools_externalurl
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getOrgApacheSlingHapiToolsExternalurl()
    {
        return $this->container['org_apache_sling_hapi_tools_externalurl'];
    }

    /**
     * Sets org_apache_sling_hapi_tools_externalurl
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $org_apache_sling_hapi_tools_externalurl org_apache_sling_hapi_tools_externalurl
     *
     * @return $this
     */
    public function setOrgApacheSlingHapiToolsExternalurl($org_apache_sling_hapi_tools_externalurl)
    {
        $this->container['org_apache_sling_hapi_tools_externalurl'] = $org_apache_sling_hapi_tools_externalurl;

        return $this;
    }

    /**
     * Gets org_apache_sling_hapi_tools_enabled
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getOrgApacheSlingHapiToolsEnabled()
    {
        return $this->container['org_apache_sling_hapi_tools_enabled'];
    }

    /**
     * Sets org_apache_sling_hapi_tools_enabled
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $org_apache_sling_hapi_tools_enabled org_apache_sling_hapi_tools_enabled
     *
     * @return $this
     */
    public function setOrgApacheSlingHapiToolsEnabled($org_apache_sling_hapi_tools_enabled)
    {
        $this->container['org_apache_sling_hapi_tools_enabled'] = $org_apache_sling_hapi_tools_enabled;

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

