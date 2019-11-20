<?php
/**
 * OrgApacheSlingAuthCoreImplLogoutServletProperties
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
 * Class representing the OrgApacheSlingAuthCoreImplLogoutServletProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class OrgApacheSlingAuthCoreImplLogoutServletProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("sling.servlet.methods")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $slingServletMethods;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("sling.servlet.paths")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $slingServletPaths;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->slingServletMethods = isset($data['slingServletMethods']) ? $data['slingServletMethods'] : null;
        $this->slingServletPaths = isset($data['slingServletPaths']) ? $data['slingServletPaths'] : null;
    }

    /**
     * Gets slingServletMethods.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getSlingServletMethods()
    {
        return $this->slingServletMethods;
    }

    /**
     * Sets slingServletMethods.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $slingServletMethods
     *
     * @return $this
     */
    public function setSlingServletMethods(ConfigNodePropertyArray $slingServletMethods = null)
    {
        $this->slingServletMethods = $slingServletMethods;

        return $this;
    }

    /**
     * Gets slingServletPaths.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSlingServletPaths()
    {
        return $this->slingServletPaths;
    }

    /**
     * Sets slingServletPaths.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $slingServletPaths
     *
     * @return $this
     */
    public function setSlingServletPaths(ConfigNodePropertyString $slingServletPaths = null)
    {
        $this->slingServletPaths = $slingServletPaths;

        return $this;
    }
}

