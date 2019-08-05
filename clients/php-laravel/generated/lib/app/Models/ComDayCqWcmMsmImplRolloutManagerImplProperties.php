<?php
/**
 * ComDayCqWcmMsmImplRolloutManagerImplProperties
 */
namespace app\Models;

/**
 * ComDayCqWcmMsmImplRolloutManagerImplProperties
 */
class ComDayCqWcmMsmImplRolloutManagerImplProperties {

    /** @var \app\Models\ConfigNodePropertyString $event_filter */
    private $event_filter;

    /** @var \app\Models\ConfigNodePropertyArray $rolloutmgr_excludedprops_default */
    private $rolloutmgr_excludedprops_default;

    /** @var \app\Models\ConfigNodePropertyArray $rolloutmgr_excludedparagraphprops_default */
    private $rolloutmgr_excludedparagraphprops_default;

    /** @var \app\Models\ConfigNodePropertyArray $rolloutmgr_excludednodetypes_default */
    private $rolloutmgr_excludednodetypes_default;

    /** @var \app\Models\ConfigNodePropertyInteger $rolloutmgr_threadpool_maxsize */
    private $rolloutmgr_threadpool_maxsize;

    /** @var \app\Models\ConfigNodePropertyInteger $rolloutmgr_threadpool_maxshutdowntime */
    private $rolloutmgr_threadpool_maxshutdowntime;

    /** @var \app\Models\ConfigNodePropertyDropDown $rolloutmgr_threadpool_priority */
    private $rolloutmgr_threadpool_priority;

    /** @var \app\Models\ConfigNodePropertyInteger $rolloutmgr_commit_size */
    private $rolloutmgr_commit_size;

    /** @var \app\Models\ConfigNodePropertyBoolean $rolloutmgr_conflicthandling_enabled */
    private $rolloutmgr_conflicthandling_enabled;

}
