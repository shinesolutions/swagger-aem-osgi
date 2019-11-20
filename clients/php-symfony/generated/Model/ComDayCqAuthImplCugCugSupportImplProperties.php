<?php
/**
 * ComDayCqAuthImplCugCugSupportImplProperties
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
 * Class representing the ComDayCqAuthImplCugCugSupportImplProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComDayCqAuthImplCugCugSupportImplProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("cug.exempted.principals")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $cugExemptedPrincipals;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("cug.enabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $cugEnabled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("cug.principals.regex")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $cugPrincipalsRegex;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("cug.principals.replacement")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $cugPrincipalsReplacement;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->cugExemptedPrincipals = isset($data['cugExemptedPrincipals']) ? $data['cugExemptedPrincipals'] : null;
        $this->cugEnabled = isset($data['cugEnabled']) ? $data['cugEnabled'] : null;
        $this->cugPrincipalsRegex = isset($data['cugPrincipalsRegex']) ? $data['cugPrincipalsRegex'] : null;
        $this->cugPrincipalsReplacement = isset($data['cugPrincipalsReplacement']) ? $data['cugPrincipalsReplacement'] : null;
    }

    /**
     * Gets cugExemptedPrincipals.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getCugExemptedPrincipals()
    {
        return $this->cugExemptedPrincipals;
    }

    /**
     * Sets cugExemptedPrincipals.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $cugExemptedPrincipals
     *
     * @return $this
     */
    public function setCugExemptedPrincipals(ConfigNodePropertyArray $cugExemptedPrincipals = null)
    {
        $this->cugExemptedPrincipals = $cugExemptedPrincipals;

        return $this;
    }

    /**
     * Gets cugEnabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getCugEnabled()
    {
        return $this->cugEnabled;
    }

    /**
     * Sets cugEnabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $cugEnabled
     *
     * @return $this
     */
    public function setCugEnabled(ConfigNodePropertyBoolean $cugEnabled = null)
    {
        $this->cugEnabled = $cugEnabled;

        return $this;
    }

    /**
     * Gets cugPrincipalsRegex.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getCugPrincipalsRegex()
    {
        return $this->cugPrincipalsRegex;
    }

    /**
     * Sets cugPrincipalsRegex.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $cugPrincipalsRegex
     *
     * @return $this
     */
    public function setCugPrincipalsRegex(ConfigNodePropertyString $cugPrincipalsRegex = null)
    {
        $this->cugPrincipalsRegex = $cugPrincipalsRegex;

        return $this;
    }

    /**
     * Gets cugPrincipalsReplacement.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getCugPrincipalsReplacement()
    {
        return $this->cugPrincipalsReplacement;
    }

    /**
     * Sets cugPrincipalsReplacement.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $cugPrincipalsReplacement
     *
     * @return $this
     */
    public function setCugPrincipalsReplacement(ConfigNodePropertyString $cugPrincipalsReplacement = null)
    {
        $this->cugPrincipalsReplacement = $cugPrincipalsReplacement;

        return $this;
    }
}

