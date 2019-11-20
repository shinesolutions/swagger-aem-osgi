<?php
/**
 * ComDayCqDamInddProcessINDDMediaExtractProcessProperties
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
 * Class representing the ComDayCqDamInddProcessINDDMediaExtractProcessProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComDayCqDamInddProcessINDDMediaExtractProcessProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("process.label")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $processLabel;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("cq.dam.indd.pages.regex")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $cqDamInddPagesRegex;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("ids.job.decoupled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $idsJobDecoupled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("ids.job.workflow.model")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $idsJobWorkflowModel;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->processLabel = isset($data['processLabel']) ? $data['processLabel'] : null;
        $this->cqDamInddPagesRegex = isset($data['cqDamInddPagesRegex']) ? $data['cqDamInddPagesRegex'] : null;
        $this->idsJobDecoupled = isset($data['idsJobDecoupled']) ? $data['idsJobDecoupled'] : null;
        $this->idsJobWorkflowModel = isset($data['idsJobWorkflowModel']) ? $data['idsJobWorkflowModel'] : null;
    }

    /**
     * Gets processLabel.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getProcessLabel()
    {
        return $this->processLabel;
    }

    /**
     * Sets processLabel.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $processLabel
     *
     * @return $this
     */
    public function setProcessLabel(ConfigNodePropertyString $processLabel = null)
    {
        $this->processLabel = $processLabel;

        return $this;
    }

    /**
     * Gets cqDamInddPagesRegex.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getCqDamInddPagesRegex()
    {
        return $this->cqDamInddPagesRegex;
    }

    /**
     * Sets cqDamInddPagesRegex.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $cqDamInddPagesRegex
     *
     * @return $this
     */
    public function setCqDamInddPagesRegex(ConfigNodePropertyString $cqDamInddPagesRegex = null)
    {
        $this->cqDamInddPagesRegex = $cqDamInddPagesRegex;

        return $this;
    }

    /**
     * Gets idsJobDecoupled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getIdsJobDecoupled()
    {
        return $this->idsJobDecoupled;
    }

    /**
     * Sets idsJobDecoupled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $idsJobDecoupled
     *
     * @return $this
     */
    public function setIdsJobDecoupled(ConfigNodePropertyBoolean $idsJobDecoupled = null)
    {
        $this->idsJobDecoupled = $idsJobDecoupled;

        return $this;
    }

    /**
     * Gets idsJobWorkflowModel.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getIdsJobWorkflowModel()
    {
        return $this->idsJobWorkflowModel;
    }

    /**
     * Sets idsJobWorkflowModel.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $idsJobWorkflowModel
     *
     * @return $this
     */
    public function setIdsJobWorkflowModel(ConfigNodePropertyString $idsJobWorkflowModel = null)
    {
        $this->idsJobWorkflowModel = $idsJobWorkflowModel;

        return $this;
    }
}

