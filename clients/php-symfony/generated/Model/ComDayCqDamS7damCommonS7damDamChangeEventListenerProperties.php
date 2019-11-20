<?php
/**
 * ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
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
 * Class representing the ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("cq.dam.s7dam.damchangeeventlistener.enabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $cqDamS7damDamchangeeventlistenerEnabled;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->cqDamS7damDamchangeeventlistenerEnabled = isset($data['cqDamS7damDamchangeeventlistenerEnabled']) ? $data['cqDamS7damDamchangeeventlistenerEnabled'] : null;
    }

    /**
     * Gets cqDamS7damDamchangeeventlistenerEnabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getCqDamS7damDamchangeeventlistenerEnabled()
    {
        return $this->cqDamS7damDamchangeeventlistenerEnabled;
    }

    /**
     * Sets cqDamS7damDamchangeeventlistenerEnabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $cqDamS7damDamchangeeventlistenerEnabled
     *
     * @return $this
     */
    public function setCqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean $cqDamS7damDamchangeeventlistenerEnabled = null)
    {
        $this->cqDamS7damDamchangeeventlistenerEnabled = $cqDamS7damDamchangeeventlistenerEnabled;

        return $this;
    }
}

