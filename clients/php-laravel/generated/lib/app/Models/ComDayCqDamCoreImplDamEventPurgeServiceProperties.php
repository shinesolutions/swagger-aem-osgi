<?php
/**
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties
 */
namespace app\Models;

/**
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties
 */
class ComDayCqDamCoreImplDamEventPurgeServiceProperties {

    /** @var \app\Models\ConfigNodePropertyString $scheduler_expression */
    private $scheduler_expression;

    /** @var \app\Models\ConfigNodePropertyInteger $max_saved_activities */
    private $max_saved_activities;

    /** @var \app\Models\ConfigNodePropertyInteger $save_interval */
    private $save_interval;

    /** @var \app\Models\ConfigNodePropertyBoolean $enable_activity_purge */
    private $enable_activity_purge;

    /** @var \app\Models\ConfigNodePropertyDropDown $event_types */
    private $event_types;

}
