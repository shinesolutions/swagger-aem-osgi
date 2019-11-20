<?php
/**
 * ComAdobeGraniteFragsImplRandomFeatureProperties
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
 * Class representing the ComAdobeGraniteFragsImplRandomFeatureProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeGraniteFragsImplRandomFeatureProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("feature.name")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $featureName;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("feature.description")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $featureDescription;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("active.percentage")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $activePercentage;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("cookie.name")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $cookieName;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("cookie.maxAge")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $cookieMaxAge;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->featureName = isset($data['featureName']) ? $data['featureName'] : null;
        $this->featureDescription = isset($data['featureDescription']) ? $data['featureDescription'] : null;
        $this->activePercentage = isset($data['activePercentage']) ? $data['activePercentage'] : null;
        $this->cookieName = isset($data['cookieName']) ? $data['cookieName'] : null;
        $this->cookieMaxAge = isset($data['cookieMaxAge']) ? $data['cookieMaxAge'] : null;
    }

    /**
     * Gets featureName.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getFeatureName()
    {
        return $this->featureName;
    }

    /**
     * Sets featureName.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $featureName
     *
     * @return $this
     */
    public function setFeatureName(ConfigNodePropertyString $featureName = null)
    {
        $this->featureName = $featureName;

        return $this;
    }

    /**
     * Gets featureDescription.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getFeatureDescription()
    {
        return $this->featureDescription;
    }

    /**
     * Sets featureDescription.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $featureDescription
     *
     * @return $this
     */
    public function setFeatureDescription(ConfigNodePropertyString $featureDescription = null)
    {
        $this->featureDescription = $featureDescription;

        return $this;
    }

    /**
     * Gets activePercentage.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getActivePercentage()
    {
        return $this->activePercentage;
    }

    /**
     * Sets activePercentage.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $activePercentage
     *
     * @return $this
     */
    public function setActivePercentage(ConfigNodePropertyString $activePercentage = null)
    {
        $this->activePercentage = $activePercentage;

        return $this;
    }

    /**
     * Gets cookieName.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getCookieName()
    {
        return $this->cookieName;
    }

    /**
     * Sets cookieName.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $cookieName
     *
     * @return $this
     */
    public function setCookieName(ConfigNodePropertyString $cookieName = null)
    {
        $this->cookieName = $cookieName;

        return $this;
    }

    /**
     * Gets cookieMaxAge.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getCookieMaxAge()
    {
        return $this->cookieMaxAge;
    }

    /**
     * Sets cookieMaxAge.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $cookieMaxAge
     *
     * @return $this
     */
    public function setCookieMaxAge(ConfigNodePropertyInteger $cookieMaxAge = null)
    {
        $this->cookieMaxAge = $cookieMaxAge;

        return $this;
    }
}

