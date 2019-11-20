<?php
/**
 * OrgApacheSlingEngineImplSlingMainServletProperties
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
 * OrgApacheSlingEngineImplSlingMainServletProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OrgApacheSlingEngineImplSlingMainServletProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'orgApacheSlingEngineImplSlingMainServletProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'sling_max_calls' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'sling_max_inclusions' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'sling_trace_allow' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean',
        'sling_max_record_requests' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'sling_store_pattern_requests' => '\OpenAPI\Client\Model\ConfigNodePropertyArray',
        'sling_serverinfo' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'sling_additional_response_headers' => '\OpenAPI\Client\Model\ConfigNodePropertyArray'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'sling_max_calls' => null,
        'sling_max_inclusions' => null,
        'sling_trace_allow' => null,
        'sling_max_record_requests' => null,
        'sling_store_pattern_requests' => null,
        'sling_serverinfo' => null,
        'sling_additional_response_headers' => null
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
        'sling_max_calls' => 'sling.max.calls',
        'sling_max_inclusions' => 'sling.max.inclusions',
        'sling_trace_allow' => 'sling.trace.allow',
        'sling_max_record_requests' => 'sling.max.record.requests',
        'sling_store_pattern_requests' => 'sling.store.pattern.requests',
        'sling_serverinfo' => 'sling.serverinfo',
        'sling_additional_response_headers' => 'sling.additional.response.headers'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'sling_max_calls' => 'setSlingMaxCalls',
        'sling_max_inclusions' => 'setSlingMaxInclusions',
        'sling_trace_allow' => 'setSlingTraceAllow',
        'sling_max_record_requests' => 'setSlingMaxRecordRequests',
        'sling_store_pattern_requests' => 'setSlingStorePatternRequests',
        'sling_serverinfo' => 'setSlingServerinfo',
        'sling_additional_response_headers' => 'setSlingAdditionalResponseHeaders'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'sling_max_calls' => 'getSlingMaxCalls',
        'sling_max_inclusions' => 'getSlingMaxInclusions',
        'sling_trace_allow' => 'getSlingTraceAllow',
        'sling_max_record_requests' => 'getSlingMaxRecordRequests',
        'sling_store_pattern_requests' => 'getSlingStorePatternRequests',
        'sling_serverinfo' => 'getSlingServerinfo',
        'sling_additional_response_headers' => 'getSlingAdditionalResponseHeaders'
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
        $this->container['sling_max_calls'] = isset($data['sling_max_calls']) ? $data['sling_max_calls'] : null;
        $this->container['sling_max_inclusions'] = isset($data['sling_max_inclusions']) ? $data['sling_max_inclusions'] : null;
        $this->container['sling_trace_allow'] = isset($data['sling_trace_allow']) ? $data['sling_trace_allow'] : null;
        $this->container['sling_max_record_requests'] = isset($data['sling_max_record_requests']) ? $data['sling_max_record_requests'] : null;
        $this->container['sling_store_pattern_requests'] = isset($data['sling_store_pattern_requests']) ? $data['sling_store_pattern_requests'] : null;
        $this->container['sling_serverinfo'] = isset($data['sling_serverinfo']) ? $data['sling_serverinfo'] : null;
        $this->container['sling_additional_response_headers'] = isset($data['sling_additional_response_headers']) ? $data['sling_additional_response_headers'] : null;
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
     * Gets sling_max_calls
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getSlingMaxCalls()
    {
        return $this->container['sling_max_calls'];
    }

    /**
     * Sets sling_max_calls
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $sling_max_calls sling_max_calls
     *
     * @return $this
     */
    public function setSlingMaxCalls($sling_max_calls)
    {
        $this->container['sling_max_calls'] = $sling_max_calls;

        return $this;
    }

    /**
     * Gets sling_max_inclusions
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getSlingMaxInclusions()
    {
        return $this->container['sling_max_inclusions'];
    }

    /**
     * Sets sling_max_inclusions
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $sling_max_inclusions sling_max_inclusions
     *
     * @return $this
     */
    public function setSlingMaxInclusions($sling_max_inclusions)
    {
        $this->container['sling_max_inclusions'] = $sling_max_inclusions;

        return $this;
    }

    /**
     * Gets sling_trace_allow
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getSlingTraceAllow()
    {
        return $this->container['sling_trace_allow'];
    }

    /**
     * Sets sling_trace_allow
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $sling_trace_allow sling_trace_allow
     *
     * @return $this
     */
    public function setSlingTraceAllow($sling_trace_allow)
    {
        $this->container['sling_trace_allow'] = $sling_trace_allow;

        return $this;
    }

    /**
     * Gets sling_max_record_requests
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getSlingMaxRecordRequests()
    {
        return $this->container['sling_max_record_requests'];
    }

    /**
     * Sets sling_max_record_requests
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $sling_max_record_requests sling_max_record_requests
     *
     * @return $this
     */
    public function setSlingMaxRecordRequests($sling_max_record_requests)
    {
        $this->container['sling_max_record_requests'] = $sling_max_record_requests;

        return $this;
    }

    /**
     * Gets sling_store_pattern_requests
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyArray|null
     */
    public function getSlingStorePatternRequests()
    {
        return $this->container['sling_store_pattern_requests'];
    }

    /**
     * Sets sling_store_pattern_requests
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyArray|null $sling_store_pattern_requests sling_store_pattern_requests
     *
     * @return $this
     */
    public function setSlingStorePatternRequests($sling_store_pattern_requests)
    {
        $this->container['sling_store_pattern_requests'] = $sling_store_pattern_requests;

        return $this;
    }

    /**
     * Gets sling_serverinfo
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getSlingServerinfo()
    {
        return $this->container['sling_serverinfo'];
    }

    /**
     * Sets sling_serverinfo
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $sling_serverinfo sling_serverinfo
     *
     * @return $this
     */
    public function setSlingServerinfo($sling_serverinfo)
    {
        $this->container['sling_serverinfo'] = $sling_serverinfo;

        return $this;
    }

    /**
     * Gets sling_additional_response_headers
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyArray|null
     */
    public function getSlingAdditionalResponseHeaders()
    {
        return $this->container['sling_additional_response_headers'];
    }

    /**
     * Sets sling_additional_response_headers
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyArray|null $sling_additional_response_headers sling_additional_response_headers
     *
     * @return $this
     */
    public function setSlingAdditionalResponseHeaders($sling_additional_response_headers)
    {
        $this->container['sling_additional_response_headers'] = $sling_additional_response_headers;

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

