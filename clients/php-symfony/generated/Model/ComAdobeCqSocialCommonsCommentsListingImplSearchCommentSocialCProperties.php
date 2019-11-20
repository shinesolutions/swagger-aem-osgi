<?php
/**
 * ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
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
 * Class representing the ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("numUserLimit")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $numUserLimit;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->numUserLimit = isset($data['numUserLimit']) ? $data['numUserLimit'] : null;
    }

    /**
     * Gets numUserLimit.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getNumUserLimit()
    {
        return $this->numUserLimit;
    }

    /**
     * Sets numUserLimit.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $numUserLimit
     *
     * @return $this
     */
    public function setNumUserLimit(ConfigNodePropertyInteger $numUserLimit = null)
    {
        $this->numUserLimit = $numUserLimit;

        return $this;
    }
}

