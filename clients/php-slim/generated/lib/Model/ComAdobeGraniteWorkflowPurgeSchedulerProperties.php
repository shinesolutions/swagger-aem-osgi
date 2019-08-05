<?php
/**
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties
 */
class ComAdobeGraniteWorkflowPurgeSchedulerProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $scheduledpurgeName */
    private $scheduledpurgeName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $scheduledpurgeWorkflowStatus */
    private $scheduledpurgeWorkflowStatus;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $scheduledpurgeModelIds */
    private $scheduledpurgeModelIds;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $scheduledpurgeDaysold */
    private $scheduledpurgeDaysold;

}
