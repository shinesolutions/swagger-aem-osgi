<?php
/**
 * ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
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
 * Class representing the ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("diffPath")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $diffPath;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("serviceName")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $serviceName;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("serviceUser.target")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $serviceUserTarget;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->diffPath = isset($data['diffPath']) ? $data['diffPath'] : null;
        $this->serviceName = isset($data['serviceName']) ? $data['serviceName'] : null;
        $this->serviceUserTarget = isset($data['serviceUserTarget']) ? $data['serviceUserTarget'] : null;
    }

    /**
     * Gets diffPath.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getDiffPath()
    {
        return $this->diffPath;
    }

    /**
     * Sets diffPath.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $diffPath
     *
     * @return $this
     */
    public function setDiffPath(ConfigNodePropertyString $diffPath = null)
    {
        $this->diffPath = $diffPath;

        return $this;
    }

    /**
     * Gets serviceName.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getServiceName()
    {
        return $this->serviceName;
    }

    /**
     * Sets serviceName.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $serviceName
     *
     * @return $this
     */
    public function setServiceName(ConfigNodePropertyString $serviceName = null)
    {
        $this->serviceName = $serviceName;

        return $this;
    }

    /**
     * Gets serviceUserTarget.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getServiceUserTarget()
    {
        return $this->serviceUserTarget;
    }

    /**
     * Sets serviceUserTarget.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $serviceUserTarget
     *
     * @return $this
     */
    public function setServiceUserTarget(ConfigNodePropertyString $serviceUserTarget = null)
    {
        $this->serviceUserTarget = $serviceUserTarget;

        return $this;
    }
}

