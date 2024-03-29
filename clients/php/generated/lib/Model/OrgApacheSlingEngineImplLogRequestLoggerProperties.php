<?php
/**
 * OrgApacheSlingEngineImplLogRequestLoggerProperties
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
 * OrgApacheSlingEngineImplLogRequestLoggerProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OrgApacheSlingEngineImplLogRequestLoggerProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'orgApacheSlingEngineImplLogRequestLoggerProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'request_log_output' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'request_log_outputtype' => '\OpenAPI\Client\Model\ConfigNodePropertyDropDown',
        'request_log_enabled' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean',
        'access_log_output' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'access_log_outputtype' => '\OpenAPI\Client\Model\ConfigNodePropertyDropDown',
        'access_log_enabled' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'request_log_output' => null,
        'request_log_outputtype' => null,
        'request_log_enabled' => null,
        'access_log_output' => null,
        'access_log_outputtype' => null,
        'access_log_enabled' => null
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
        'request_log_output' => 'request.log.output',
        'request_log_outputtype' => 'request.log.outputtype',
        'request_log_enabled' => 'request.log.enabled',
        'access_log_output' => 'access.log.output',
        'access_log_outputtype' => 'access.log.outputtype',
        'access_log_enabled' => 'access.log.enabled'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'request_log_output' => 'setRequestLogOutput',
        'request_log_outputtype' => 'setRequestLogOutputtype',
        'request_log_enabled' => 'setRequestLogEnabled',
        'access_log_output' => 'setAccessLogOutput',
        'access_log_outputtype' => 'setAccessLogOutputtype',
        'access_log_enabled' => 'setAccessLogEnabled'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'request_log_output' => 'getRequestLogOutput',
        'request_log_outputtype' => 'getRequestLogOutputtype',
        'request_log_enabled' => 'getRequestLogEnabled',
        'access_log_output' => 'getAccessLogOutput',
        'access_log_outputtype' => 'getAccessLogOutputtype',
        'access_log_enabled' => 'getAccessLogEnabled'
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
        $this->container['request_log_output'] = isset($data['request_log_output']) ? $data['request_log_output'] : null;
        $this->container['request_log_outputtype'] = isset($data['request_log_outputtype']) ? $data['request_log_outputtype'] : null;
        $this->container['request_log_enabled'] = isset($data['request_log_enabled']) ? $data['request_log_enabled'] : null;
        $this->container['access_log_output'] = isset($data['access_log_output']) ? $data['access_log_output'] : null;
        $this->container['access_log_outputtype'] = isset($data['access_log_outputtype']) ? $data['access_log_outputtype'] : null;
        $this->container['access_log_enabled'] = isset($data['access_log_enabled']) ? $data['access_log_enabled'] : null;
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
     * Gets request_log_output
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getRequestLogOutput()
    {
        return $this->container['request_log_output'];
    }

    /**
     * Sets request_log_output
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $request_log_output request_log_output
     *
     * @return $this
     */
    public function setRequestLogOutput($request_log_output)
    {
        $this->container['request_log_output'] = $request_log_output;

        return $this;
    }

    /**
     * Gets request_log_outputtype
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyDropDown|null
     */
    public function getRequestLogOutputtype()
    {
        return $this->container['request_log_outputtype'];
    }

    /**
     * Sets request_log_outputtype
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyDropDown|null $request_log_outputtype request_log_outputtype
     *
     * @return $this
     */
    public function setRequestLogOutputtype($request_log_outputtype)
    {
        $this->container['request_log_outputtype'] = $request_log_outputtype;

        return $this;
    }

    /**
     * Gets request_log_enabled
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getRequestLogEnabled()
    {
        return $this->container['request_log_enabled'];
    }

    /**
     * Sets request_log_enabled
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $request_log_enabled request_log_enabled
     *
     * @return $this
     */
    public function setRequestLogEnabled($request_log_enabled)
    {
        $this->container['request_log_enabled'] = $request_log_enabled;

        return $this;
    }

    /**
     * Gets access_log_output
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getAccessLogOutput()
    {
        return $this->container['access_log_output'];
    }

    /**
     * Sets access_log_output
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $access_log_output access_log_output
     *
     * @return $this
     */
    public function setAccessLogOutput($access_log_output)
    {
        $this->container['access_log_output'] = $access_log_output;

        return $this;
    }

    /**
     * Gets access_log_outputtype
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyDropDown|null
     */
    public function getAccessLogOutputtype()
    {
        return $this->container['access_log_outputtype'];
    }

    /**
     * Sets access_log_outputtype
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyDropDown|null $access_log_outputtype access_log_outputtype
     *
     * @return $this
     */
    public function setAccessLogOutputtype($access_log_outputtype)
    {
        $this->container['access_log_outputtype'] = $access_log_outputtype;

        return $this;
    }

    /**
     * Gets access_log_enabled
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getAccessLogEnabled()
    {
        return $this->container['access_log_enabled'];
    }

    /**
     * Sets access_log_enabled
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $access_log_enabled access_log_enabled
     *
     * @return $this
     */
    public function setAccessLogEnabled($access_log_enabled)
    {
        $this->container['access_log_enabled'] = $access_log_enabled;

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


