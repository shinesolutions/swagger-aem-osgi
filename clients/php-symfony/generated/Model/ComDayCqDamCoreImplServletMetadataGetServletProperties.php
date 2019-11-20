<?php
/**
 * ComDayCqDamCoreImplServletMetadataGetServletProperties
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
 * Class representing the ComDayCqDamCoreImplServletMetadataGetServletProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComDayCqDamCoreImplServletMetadataGetServletProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("sling.servlet.resourceTypes")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $slingServletResourceTypes;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("sling.servlet.methods")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $slingServletMethods;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("sling.servlet.extensions")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $slingServletExtensions;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("sling.servlet.selectors")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $slingServletSelectors;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->slingServletResourceTypes = isset($data['slingServletResourceTypes']) ? $data['slingServletResourceTypes'] : null;
        $this->slingServletMethods = isset($data['slingServletMethods']) ? $data['slingServletMethods'] : null;
        $this->slingServletExtensions = isset($data['slingServletExtensions']) ? $data['slingServletExtensions'] : null;
        $this->slingServletSelectors = isset($data['slingServletSelectors']) ? $data['slingServletSelectors'] : null;
    }

    /**
     * Gets slingServletResourceTypes.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSlingServletResourceTypes()
    {
        return $this->slingServletResourceTypes;
    }

    /**
     * Sets slingServletResourceTypes.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $slingServletResourceTypes
     *
     * @return $this
     */
    public function setSlingServletResourceTypes(ConfigNodePropertyString $slingServletResourceTypes = null)
    {
        $this->slingServletResourceTypes = $slingServletResourceTypes;

        return $this;
    }

    /**
     * Gets slingServletMethods.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSlingServletMethods()
    {
        return $this->slingServletMethods;
    }

    /**
     * Sets slingServletMethods.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $slingServletMethods
     *
     * @return $this
     */
    public function setSlingServletMethods(ConfigNodePropertyString $slingServletMethods = null)
    {
        $this->slingServletMethods = $slingServletMethods;

        return $this;
    }

    /**
     * Gets slingServletExtensions.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSlingServletExtensions()
    {
        return $this->slingServletExtensions;
    }

    /**
     * Sets slingServletExtensions.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $slingServletExtensions
     *
     * @return $this
     */
    public function setSlingServletExtensions(ConfigNodePropertyString $slingServletExtensions = null)
    {
        $this->slingServletExtensions = $slingServletExtensions;

        return $this;
    }

    /**
     * Gets slingServletSelectors.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSlingServletSelectors()
    {
        return $this->slingServletSelectors;
    }

    /**
     * Sets slingServletSelectors.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $slingServletSelectors
     *
     * @return $this
     */
    public function setSlingServletSelectors(ConfigNodePropertyString $slingServletSelectors = null)
    {
        $this->slingServletSelectors = $slingServletSelectors;

        return $this;
    }
}

