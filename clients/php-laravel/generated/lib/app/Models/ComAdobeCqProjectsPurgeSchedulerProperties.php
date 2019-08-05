<?php
/**
 * ComAdobeCqProjectsPurgeSchedulerProperties
 */
namespace app\Models;

/**
 * ComAdobeCqProjectsPurgeSchedulerProperties
 */
class ComAdobeCqProjectsPurgeSchedulerProperties {

    /** @var \app\Models\ConfigNodePropertyString $scheduledpurge_name */
    private $scheduledpurge_name;

    /** @var \app\Models\ConfigNodePropertyBoolean $scheduledpurge_purge_active */
    private $scheduledpurge_purge_active;

    /** @var \app\Models\ConfigNodePropertyArray $scheduledpurge_templates */
    private $scheduledpurge_templates;

    /** @var \app\Models\ConfigNodePropertyBoolean $scheduledpurge_purge_groups */
    private $scheduledpurge_purge_groups;

    /** @var \app\Models\ConfigNodePropertyBoolean $scheduledpurge_purge_assets */
    private $scheduledpurge_purge_assets;

    /** @var \app\Models\ConfigNodePropertyBoolean $scheduledpurge_terminate_running_workflows */
    private $scheduledpurge_terminate_running_workflows;

    /** @var \app\Models\ConfigNodePropertyInteger $scheduledpurge_daysold */
    private $scheduledpurge_daysold;

    /** @var \app\Models\ConfigNodePropertyInteger $scheduledpurge_save_threshold */
    private $scheduledpurge_save_threshold;

}
