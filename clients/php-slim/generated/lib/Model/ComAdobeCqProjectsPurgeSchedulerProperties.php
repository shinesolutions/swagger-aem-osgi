<?php
/**
 * ComAdobeCqProjectsPurgeSchedulerProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeCqProjectsPurgeSchedulerProperties
 */
class ComAdobeCqProjectsPurgeSchedulerProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $scheduledpurgeName */
    private $scheduledpurgeName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $scheduledpurgePurgeActive */
    private $scheduledpurgePurgeActive;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $scheduledpurgeTemplates */
    private $scheduledpurgeTemplates;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $scheduledpurgePurgeGroups */
    private $scheduledpurgePurgeGroups;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $scheduledpurgePurgeAssets */
    private $scheduledpurgePurgeAssets;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $scheduledpurgeTerminateRunningWorkflows */
    private $scheduledpurgeTerminateRunningWorkflows;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $scheduledpurgeDaysold */
    private $scheduledpurgeDaysold;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $scheduledpurgeSaveThreshold */
    private $scheduledpurgeSaveThreshold;

}
