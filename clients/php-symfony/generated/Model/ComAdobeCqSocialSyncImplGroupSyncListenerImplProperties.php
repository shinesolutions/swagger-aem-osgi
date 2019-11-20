<?php
/**
 * ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties
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
 * Class representing the ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("nodetypes")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $nodetypes;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("ignorableprops")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $ignorableprops;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("ignorablenodes")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $ignorablenodes;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("enabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $enabled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("distfolders")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $distfolders;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->nodetypes = isset($data['nodetypes']) ? $data['nodetypes'] : null;
        $this->ignorableprops = isset($data['ignorableprops']) ? $data['ignorableprops'] : null;
        $this->ignorablenodes = isset($data['ignorablenodes']) ? $data['ignorablenodes'] : null;
        $this->enabled = isset($data['enabled']) ? $data['enabled'] : null;
        $this->distfolders = isset($data['distfolders']) ? $data['distfolders'] : null;
    }

    /**
     * Gets nodetypes.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getNodetypes()
    {
        return $this->nodetypes;
    }

    /**
     * Sets nodetypes.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $nodetypes
     *
     * @return $this
     */
    public function setNodetypes(ConfigNodePropertyArray $nodetypes = null)
    {
        $this->nodetypes = $nodetypes;

        return $this;
    }

    /**
     * Gets ignorableprops.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getIgnorableprops()
    {
        return $this->ignorableprops;
    }

    /**
     * Sets ignorableprops.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $ignorableprops
     *
     * @return $this
     */
    public function setIgnorableprops(ConfigNodePropertyArray $ignorableprops = null)
    {
        $this->ignorableprops = $ignorableprops;

        return $this;
    }

    /**
     * Gets ignorablenodes.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getIgnorablenodes()
    {
        return $this->ignorablenodes;
    }

    /**
     * Sets ignorablenodes.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $ignorablenodes
     *
     * @return $this
     */
    public function setIgnorablenodes(ConfigNodePropertyString $ignorablenodes = null)
    {
        $this->ignorablenodes = $ignorablenodes;

        return $this;
    }

    /**
     * Gets enabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getEnabled()
    {
        return $this->enabled;
    }

    /**
     * Sets enabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $enabled
     *
     * @return $this
     */
    public function setEnabled(ConfigNodePropertyBoolean $enabled = null)
    {
        $this->enabled = $enabled;

        return $this;
    }

    /**
     * Gets distfolders.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getDistfolders()
    {
        return $this->distfolders;
    }

    /**
     * Sets distfolders.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $distfolders
     *
     * @return $this
     */
    public function setDistfolders(ConfigNodePropertyString $distfolders = null)
    {
        $this->distfolders = $distfolders;

        return $this;
    }
}

