<?php
/**
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties
 */
class ComDayCqDamCoreImplDamEventPurgeServiceProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $schedulerExpression */
    private $schedulerExpression;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxSavedActivities */
    private $maxSavedActivities;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $saveInterval */
    private $saveInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $enableActivityPurge */
    private $enableActivityPurge;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $eventTypes */
    private $eventTypes;

}
