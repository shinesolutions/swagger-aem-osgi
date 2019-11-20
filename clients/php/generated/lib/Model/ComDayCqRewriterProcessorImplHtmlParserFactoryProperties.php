<?php
/**
 * ComDayCqRewriterProcessorImplHtmlParserFactoryProperties
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
 * ComDayCqRewriterProcessorImplHtmlParserFactoryProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'comDayCqRewriterProcessorImplHtmlParserFactoryProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'htmlparser_process_tags' => '\OpenAPI\Client\Model\ConfigNodePropertyArray',
        'htmlparser_preserve_camel_case' => '\OpenAPI\Client\Model\ConfigNodePropertyBoolean'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'htmlparser_process_tags' => null,
        'htmlparser_preserve_camel_case' => null
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
        'htmlparser_process_tags' => 'htmlparser.processTags',
        'htmlparser_preserve_camel_case' => 'htmlparser.preserveCamelCase'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'htmlparser_process_tags' => 'setHtmlparserProcessTags',
        'htmlparser_preserve_camel_case' => 'setHtmlparserPreserveCamelCase'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'htmlparser_process_tags' => 'getHtmlparserProcessTags',
        'htmlparser_preserve_camel_case' => 'getHtmlparserPreserveCamelCase'
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
        $this->container['htmlparser_process_tags'] = isset($data['htmlparser_process_tags']) ? $data['htmlparser_process_tags'] : null;
        $this->container['htmlparser_preserve_camel_case'] = isset($data['htmlparser_preserve_camel_case']) ? $data['htmlparser_preserve_camel_case'] : null;
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
     * Gets htmlparser_process_tags
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyArray|null
     */
    public function getHtmlparserProcessTags()
    {
        return $this->container['htmlparser_process_tags'];
    }

    /**
     * Sets htmlparser_process_tags
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyArray|null $htmlparser_process_tags htmlparser_process_tags
     *
     * @return $this
     */
    public function setHtmlparserProcessTags($htmlparser_process_tags)
    {
        $this->container['htmlparser_process_tags'] = $htmlparser_process_tags;

        return $this;
    }

    /**
     * Gets htmlparser_preserve_camel_case
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null
     */
    public function getHtmlparserPreserveCamelCase()
    {
        return $this->container['htmlparser_preserve_camel_case'];
    }

    /**
     * Sets htmlparser_preserve_camel_case
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyBoolean|null $htmlparser_preserve_camel_case htmlparser_preserve_camel_case
     *
     * @return $this
     */
    public function setHtmlparserPreserveCamelCase($htmlparser_preserve_camel_case)
    {
        $this->container['htmlparser_preserve_camel_case'] = $htmlparser_preserve_camel_case;

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

