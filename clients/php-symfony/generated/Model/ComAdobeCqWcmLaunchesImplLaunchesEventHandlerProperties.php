<?php
/**
 * ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
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
 * Class representing the ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("event.filter")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $eventFilter;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("launches.eventhandler.threadpool.maxsize")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $launchesEventhandlerThreadpoolMaxsize;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     * @SerializedName("launches.eventhandler.threadpool.priority")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     */
    protected $launchesEventhandlerThreadpoolPriority;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("launches.eventhandler.updatelastmodification")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $launchesEventhandlerUpdatelastmodification;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->eventFilter = isset($data['eventFilter']) ? $data['eventFilter'] : null;
        $this->launchesEventhandlerThreadpoolMaxsize = isset($data['launchesEventhandlerThreadpoolMaxsize']) ? $data['launchesEventhandlerThreadpoolMaxsize'] : null;
        $this->launchesEventhandlerThreadpoolPriority = isset($data['launchesEventhandlerThreadpoolPriority']) ? $data['launchesEventhandlerThreadpoolPriority'] : null;
        $this->launchesEventhandlerUpdatelastmodification = isset($data['launchesEventhandlerUpdatelastmodification']) ? $data['launchesEventhandlerUpdatelastmodification'] : null;
    }

    /**
     * Gets eventFilter.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getEventFilter()
    {
        return $this->eventFilter;
    }

    /**
     * Sets eventFilter.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $eventFilter
     *
     * @return $this
     */
    public function setEventFilter(ConfigNodePropertyString $eventFilter = null)
    {
        $this->eventFilter = $eventFilter;

        return $this;
    }

    /**
     * Gets launchesEventhandlerThreadpoolMaxsize.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getLaunchesEventhandlerThreadpoolMaxsize()
    {
        return $this->launchesEventhandlerThreadpoolMaxsize;
    }

    /**
     * Sets launchesEventhandlerThreadpoolMaxsize.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $launchesEventhandlerThreadpoolMaxsize
     *
     * @return $this
     */
    public function setLaunchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger $launchesEventhandlerThreadpoolMaxsize = null)
    {
        $this->launchesEventhandlerThreadpoolMaxsize = $launchesEventhandlerThreadpoolMaxsize;

        return $this;
    }

    /**
     * Gets launchesEventhandlerThreadpoolPriority.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     */
    public function getLaunchesEventhandlerThreadpoolPriority()
    {
        return $this->launchesEventhandlerThreadpoolPriority;
    }

    /**
     * Sets launchesEventhandlerThreadpoolPriority.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyDropDown|null $launchesEventhandlerThreadpoolPriority
     *
     * @return $this
     */
    public function setLaunchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown $launchesEventhandlerThreadpoolPriority = null)
    {
        $this->launchesEventhandlerThreadpoolPriority = $launchesEventhandlerThreadpoolPriority;

        return $this;
    }

    /**
     * Gets launchesEventhandlerUpdatelastmodification.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getLaunchesEventhandlerUpdatelastmodification()
    {
        return $this->launchesEventhandlerUpdatelastmodification;
    }

    /**
     * Sets launchesEventhandlerUpdatelastmodification.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $launchesEventhandlerUpdatelastmodification
     *
     * @return $this
     */
    public function setLaunchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean $launchesEventhandlerUpdatelastmodification = null)
    {
        $this->launchesEventhandlerUpdatelastmodification = $launchesEventhandlerUpdatelastmodification;

        return $this;
    }
}

