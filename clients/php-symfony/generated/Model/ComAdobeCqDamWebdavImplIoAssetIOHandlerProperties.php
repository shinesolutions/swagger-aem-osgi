<?php
/**
 * ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties
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
 * Class representing the ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("service.ranking")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $serviceRanking;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("pathPrefix")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $pathPrefix;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("createVersion")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $createVersion;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->serviceRanking = isset($data['serviceRanking']) ? $data['serviceRanking'] : null;
        $this->pathPrefix = isset($data['pathPrefix']) ? $data['pathPrefix'] : null;
        $this->createVersion = isset($data['createVersion']) ? $data['createVersion'] : null;
    }

    /**
     * Gets serviceRanking.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getServiceRanking()
    {
        return $this->serviceRanking;
    }

    /**
     * Sets serviceRanking.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $serviceRanking
     *
     * @return $this
     */
    public function setServiceRanking(ConfigNodePropertyInteger $serviceRanking = null)
    {
        $this->serviceRanking = $serviceRanking;

        return $this;
    }

    /**
     * Gets pathPrefix.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getPathPrefix()
    {
        return $this->pathPrefix;
    }

    /**
     * Sets pathPrefix.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $pathPrefix
     *
     * @return $this
     */
    public function setPathPrefix(ConfigNodePropertyString $pathPrefix = null)
    {
        $this->pathPrefix = $pathPrefix;

        return $this;
    }

    /**
     * Gets createVersion.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getCreateVersion()
    {
        return $this->createVersion;
    }

    /**
     * Sets createVersion.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $createVersion
     *
     * @return $this
     */
    public function setCreateVersion(ConfigNodePropertyBoolean $createVersion = null)
    {
        $this->createVersion = $createVersion;

        return $this;
    }
}

