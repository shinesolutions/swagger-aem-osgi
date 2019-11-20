<?php
/**
 * ComAdobeCqCommercePimImplPageEventListenerProperties
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
 * Class representing the ComAdobeCqCommercePimImplPageEventListenerProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeCqCommercePimImplPageEventListenerProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("cq.commerce.pageeventlistener.enabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $cqCommercePageeventlistenerEnabled;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->cqCommercePageeventlistenerEnabled = isset($data['cqCommercePageeventlistenerEnabled']) ? $data['cqCommercePageeventlistenerEnabled'] : null;
    }

    /**
     * Gets cqCommercePageeventlistenerEnabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getCqCommercePageeventlistenerEnabled()
    {
        return $this->cqCommercePageeventlistenerEnabled;
    }

    /**
     * Sets cqCommercePageeventlistenerEnabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $cqCommercePageeventlistenerEnabled
     *
     * @return $this
     */
    public function setCqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean $cqCommercePageeventlistenerEnabled = null)
    {
        $this->cqCommercePageeventlistenerEnabled = $cqCommercePageeventlistenerEnabled;

        return $this;
    }
}

