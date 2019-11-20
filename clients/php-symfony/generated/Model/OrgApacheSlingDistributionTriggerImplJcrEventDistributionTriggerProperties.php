<?php
/**
 * OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
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
 * Class representing the OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("name")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $name;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("path")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $path;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("ignoredPathsPatterns")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $ignoredPathsPatterns;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("serviceName")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $serviceName;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("deep")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $deep;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->path = isset($data['path']) ? $data['path'] : null;
        $this->ignoredPathsPatterns = isset($data['ignoredPathsPatterns']) ? $data['ignoredPathsPatterns'] : null;
        $this->serviceName = isset($data['serviceName']) ? $data['serviceName'] : null;
        $this->deep = isset($data['deep']) ? $data['deep'] : null;
    }

    /**
     * Gets name.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $name
     *
     * @return $this
     */
    public function setName(ConfigNodePropertyString $name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets path.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getPath()
    {
        return $this->path;
    }

    /**
     * Sets path.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $path
     *
     * @return $this
     */
    public function setPath(ConfigNodePropertyString $path = null)
    {
        $this->path = $path;

        return $this;
    }

    /**
     * Gets ignoredPathsPatterns.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getIgnoredPathsPatterns()
    {
        return $this->ignoredPathsPatterns;
    }

    /**
     * Sets ignoredPathsPatterns.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $ignoredPathsPatterns
     *
     * @return $this
     */
    public function setIgnoredPathsPatterns(ConfigNodePropertyArray $ignoredPathsPatterns = null)
    {
        $this->ignoredPathsPatterns = $ignoredPathsPatterns;

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
     * Gets deep.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getDeep()
    {
        return $this->deep;
    }

    /**
     * Sets deep.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $deep
     *
     * @return $this
     */
    public function setDeep(ConfigNodePropertyBoolean $deep = null)
    {
        $this->deep = $deep;

        return $this;
    }
}

