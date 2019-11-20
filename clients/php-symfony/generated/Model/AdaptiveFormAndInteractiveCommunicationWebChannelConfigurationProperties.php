<?php
/**
 * AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties
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
 * Class representing the AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("showPlaceholder")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $showPlaceholder;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("maximumCacheEntries")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $maximumCacheEntries;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     * @SerializedName("af.scripting.compatversion")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     */
    protected $afScriptingCompatversion;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("makeFileNameUnique")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $makeFileNameUnique;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("generatingCompliantData")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $generatingCompliantData;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->showPlaceholder = isset($data['showPlaceholder']) ? $data['showPlaceholder'] : null;
        $this->maximumCacheEntries = isset($data['maximumCacheEntries']) ? $data['maximumCacheEntries'] : null;
        $this->afScriptingCompatversion = isset($data['afScriptingCompatversion']) ? $data['afScriptingCompatversion'] : null;
        $this->makeFileNameUnique = isset($data['makeFileNameUnique']) ? $data['makeFileNameUnique'] : null;
        $this->generatingCompliantData = isset($data['generatingCompliantData']) ? $data['generatingCompliantData'] : null;
    }

    /**
     * Gets showPlaceholder.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getShowPlaceholder()
    {
        return $this->showPlaceholder;
    }

    /**
     * Sets showPlaceholder.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $showPlaceholder
     *
     * @return $this
     */
    public function setShowPlaceholder(ConfigNodePropertyBoolean $showPlaceholder = null)
    {
        $this->showPlaceholder = $showPlaceholder;

        return $this;
    }

    /**
     * Gets maximumCacheEntries.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getMaximumCacheEntries()
    {
        return $this->maximumCacheEntries;
    }

    /**
     * Sets maximumCacheEntries.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $maximumCacheEntries
     *
     * @return $this
     */
    public function setMaximumCacheEntries(ConfigNodePropertyInteger $maximumCacheEntries = null)
    {
        $this->maximumCacheEntries = $maximumCacheEntries;

        return $this;
    }

    /**
     * Gets afScriptingCompatversion.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     */
    public function getAfScriptingCompatversion()
    {
        return $this->afScriptingCompatversion;
    }

    /**
     * Sets afScriptingCompatversion.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyDropDown|null $afScriptingCompatversion
     *
     * @return $this
     */
    public function setAfScriptingCompatversion(ConfigNodePropertyDropDown $afScriptingCompatversion = null)
    {
        $this->afScriptingCompatversion = $afScriptingCompatversion;

        return $this;
    }

    /**
     * Gets makeFileNameUnique.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getMakeFileNameUnique()
    {
        return $this->makeFileNameUnique;
    }

    /**
     * Sets makeFileNameUnique.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $makeFileNameUnique
     *
     * @return $this
     */
    public function setMakeFileNameUnique(ConfigNodePropertyBoolean $makeFileNameUnique = null)
    {
        $this->makeFileNameUnique = $makeFileNameUnique;

        return $this;
    }

    /**
     * Gets generatingCompliantData.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getGeneratingCompliantData()
    {
        return $this->generatingCompliantData;
    }

    /**
     * Sets generatingCompliantData.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $generatingCompliantData
     *
     * @return $this
     */
    public function setGeneratingCompliantData(ConfigNodePropertyBoolean $generatingCompliantData = null)
    {
        $this->generatingCompliantData = $generatingCompliantData;

        return $this;
    }
}

