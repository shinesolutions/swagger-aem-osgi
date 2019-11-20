<?php
/**
 * ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
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
 * Class representing the ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("path")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $path;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     * @SerializedName("token.required.attr")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     */
    protected $tokenRequiredAttr;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("token.alternate.url")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $tokenAlternateUrl;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("token.encapsulated")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $tokenEncapsulated;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("skip.token.refresh")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $skipTokenRefresh;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->path = isset($data['path']) ? $data['path'] : null;
        $this->tokenRequiredAttr = isset($data['tokenRequiredAttr']) ? $data['tokenRequiredAttr'] : null;
        $this->tokenAlternateUrl = isset($data['tokenAlternateUrl']) ? $data['tokenAlternateUrl'] : null;
        $this->tokenEncapsulated = isset($data['tokenEncapsulated']) ? $data['tokenEncapsulated'] : null;
        $this->skipTokenRefresh = isset($data['skipTokenRefresh']) ? $data['skipTokenRefresh'] : null;
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
     * Gets tokenRequiredAttr.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     */
    public function getTokenRequiredAttr()
    {
        return $this->tokenRequiredAttr;
    }

    /**
     * Sets tokenRequiredAttr.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyDropDown|null $tokenRequiredAttr
     *
     * @return $this
     */
    public function setTokenRequiredAttr(ConfigNodePropertyDropDown $tokenRequiredAttr = null)
    {
        $this->tokenRequiredAttr = $tokenRequiredAttr;

        return $this;
    }

    /**
     * Gets tokenAlternateUrl.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getTokenAlternateUrl()
    {
        return $this->tokenAlternateUrl;
    }

    /**
     * Sets tokenAlternateUrl.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $tokenAlternateUrl
     *
     * @return $this
     */
    public function setTokenAlternateUrl(ConfigNodePropertyString $tokenAlternateUrl = null)
    {
        $this->tokenAlternateUrl = $tokenAlternateUrl;

        return $this;
    }

    /**
     * Gets tokenEncapsulated.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getTokenEncapsulated()
    {
        return $this->tokenEncapsulated;
    }

    /**
     * Sets tokenEncapsulated.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $tokenEncapsulated
     *
     * @return $this
     */
    public function setTokenEncapsulated(ConfigNodePropertyBoolean $tokenEncapsulated = null)
    {
        $this->tokenEncapsulated = $tokenEncapsulated;

        return $this;
    }

    /**
     * Gets skipTokenRefresh.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getSkipTokenRefresh()
    {
        return $this->skipTokenRefresh;
    }

    /**
     * Sets skipTokenRefresh.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $skipTokenRefresh
     *
     * @return $this
     */
    public function setSkipTokenRefresh(ConfigNodePropertyArray $skipTokenRefresh = null)
    {
        $this->skipTokenRefresh = $skipTokenRefresh;

        return $this;
    }
}

