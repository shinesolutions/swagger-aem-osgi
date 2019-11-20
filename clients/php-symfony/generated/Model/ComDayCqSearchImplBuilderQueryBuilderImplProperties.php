<?php
/**
 * ComDayCqSearchImplBuilderQueryBuilderImplProperties
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the ComDayCqSearchImplBuilderQueryBuilderImplProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComDayCqSearchImplBuilderQueryBuilderImplProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("excerpt.properties")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $excerptProperties;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("cache.max.entries")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $cacheMaxEntries;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("cache.entry.lifetime")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $cacheEntryLifetime;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("xpath.union")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $xpathUnion;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->excerptProperties = isset($data['excerptProperties']) ? $data['excerptProperties'] : null;
        $this->cacheMaxEntries = isset($data['cacheMaxEntries']) ? $data['cacheMaxEntries'] : null;
        $this->cacheEntryLifetime = isset($data['cacheEntryLifetime']) ? $data['cacheEntryLifetime'] : null;
        $this->xpathUnion = isset($data['xpathUnion']) ? $data['xpathUnion'] : null;
    }

    /**
     * Gets excerptProperties.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getExcerptProperties()
    {
        return $this->excerptProperties;
    }

    /**
     * Sets excerptProperties.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $excerptProperties
     *
     * @return $this
     */
    public function setExcerptProperties(ConfigNodePropertyArray $excerptProperties = null)
    {
        $this->excerptProperties = $excerptProperties;

        return $this;
    }

    /**
     * Gets cacheMaxEntries.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getCacheMaxEntries()
    {
        return $this->cacheMaxEntries;
    }

    /**
     * Sets cacheMaxEntries.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $cacheMaxEntries
     *
     * @return $this
     */
    public function setCacheMaxEntries(ConfigNodePropertyInteger $cacheMaxEntries = null)
    {
        $this->cacheMaxEntries = $cacheMaxEntries;

        return $this;
    }

    /**
     * Gets cacheEntryLifetime.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getCacheEntryLifetime()
    {
        return $this->cacheEntryLifetime;
    }

    /**
     * Sets cacheEntryLifetime.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $cacheEntryLifetime
     *
     * @return $this
     */
    public function setCacheEntryLifetime(ConfigNodePropertyInteger $cacheEntryLifetime = null)
    {
        $this->cacheEntryLifetime = $cacheEntryLifetime;

        return $this;
    }

    /**
     * Gets xpathUnion.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getXpathUnion()
    {
        return $this->xpathUnion;
    }

    /**
     * Sets xpathUnion.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $xpathUnion
     *
     * @return $this
     */
    public function setXpathUnion(ConfigNodePropertyBoolean $xpathUnion = null)
    {
        $this->xpathUnion = $xpathUnion;

        return $this;
    }
}

