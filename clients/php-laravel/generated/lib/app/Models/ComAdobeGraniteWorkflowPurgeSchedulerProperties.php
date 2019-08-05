<?php
/**
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties
 */
namespace app\Models;

/**
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties
 */
class ComAdobeGraniteWorkflowPurgeSchedulerProperties {

    /** @var \app\Models\ConfigNodePropertyString $scheduledpurge_name */
    private $scheduledpurge_name;

    /** @var \app\Models\ConfigNodePropertyDropDown $scheduledpurge_workflow_status */
    private $scheduledpurge_workflow_status;

    /** @var \app\Models\ConfigNodePropertyArray $scheduledpurge_model_ids */
    private $scheduledpurge_model_ids;

    /** @var \app\Models\ConfigNodePropertyInteger $scheduledpurge_daysold */
    private $scheduledpurge_daysold;

}
