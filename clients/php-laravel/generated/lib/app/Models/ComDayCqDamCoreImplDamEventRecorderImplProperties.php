<?php
/**
 * ComDayCqDamCoreImplDamEventRecorderImplProperties
 */
namespace app\Models;

/**
 * ComDayCqDamCoreImplDamEventRecorderImplProperties
 */
class ComDayCqDamCoreImplDamEventRecorderImplProperties {

    /** @var \app\Models\ConfigNodePropertyString $event_filter */
    private $event_filter;

    /** @var \app\Models\ConfigNodePropertyInteger $event_queue_length */
    private $event_queue_length;

    /** @var \app\Models\ConfigNodePropertyBoolean $eventrecorder_enabled */
    private $eventrecorder_enabled;

    /** @var \app\Models\ConfigNodePropertyArray $eventrecorder_blacklist */
    private $eventrecorder_blacklist;

    /** @var \app\Models\ConfigNodePropertyDropDown $eventrecorder_eventtypes */
    private $eventrecorder_eventtypes;

}
