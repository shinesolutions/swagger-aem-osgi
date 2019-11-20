<?php
/**
 * ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
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
 * Class representing the ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("createPreviewEnabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $createPreviewEnabled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("updatePreviewEnabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $updatePreviewEnabled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("queueSize")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $queueSize;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("folderPreviewRenditionRegex")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $folderPreviewRenditionRegex;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->createPreviewEnabled = isset($data['createPreviewEnabled']) ? $data['createPreviewEnabled'] : null;
        $this->updatePreviewEnabled = isset($data['updatePreviewEnabled']) ? $data['updatePreviewEnabled'] : null;
        $this->queueSize = isset($data['queueSize']) ? $data['queueSize'] : null;
        $this->folderPreviewRenditionRegex = isset($data['folderPreviewRenditionRegex']) ? $data['folderPreviewRenditionRegex'] : null;
    }

    /**
     * Gets createPreviewEnabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getCreatePreviewEnabled()
    {
        return $this->createPreviewEnabled;
    }

    /**
     * Sets createPreviewEnabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $createPreviewEnabled
     *
     * @return $this
     */
    public function setCreatePreviewEnabled(ConfigNodePropertyBoolean $createPreviewEnabled = null)
    {
        $this->createPreviewEnabled = $createPreviewEnabled;

        return $this;
    }

    /**
     * Gets updatePreviewEnabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getUpdatePreviewEnabled()
    {
        return $this->updatePreviewEnabled;
    }

    /**
     * Sets updatePreviewEnabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $updatePreviewEnabled
     *
     * @return $this
     */
    public function setUpdatePreviewEnabled(ConfigNodePropertyBoolean $updatePreviewEnabled = null)
    {
        $this->updatePreviewEnabled = $updatePreviewEnabled;

        return $this;
    }

    /**
     * Gets queueSize.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getQueueSize()
    {
        return $this->queueSize;
    }

    /**
     * Sets queueSize.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $queueSize
     *
     * @return $this
     */
    public function setQueueSize(ConfigNodePropertyInteger $queueSize = null)
    {
        $this->queueSize = $queueSize;

        return $this;
    }

    /**
     * Gets folderPreviewRenditionRegex.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getFolderPreviewRenditionRegex()
    {
        return $this->folderPreviewRenditionRegex;
    }

    /**
     * Sets folderPreviewRenditionRegex.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $folderPreviewRenditionRegex
     *
     * @return $this
     */
    public function setFolderPreviewRenditionRegex(ConfigNodePropertyString $folderPreviewRenditionRegex = null)
    {
        $this->folderPreviewRenditionRegex = $folderPreviewRenditionRegex;

        return $this;
    }
}

