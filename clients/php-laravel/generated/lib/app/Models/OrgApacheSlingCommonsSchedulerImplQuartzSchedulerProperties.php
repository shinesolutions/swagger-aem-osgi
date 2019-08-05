<?php
/**
 * OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
 */
class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {

    /** @var \app\Models\ConfigNodePropertyString $pool_name */
    private $pool_name;

    /** @var \app\Models\ConfigNodePropertyArray $allowed_pool_names */
    private $allowed_pool_names;

    /** @var \app\Models\ConfigNodePropertyBoolean $scheduler_useleaderforsingle */
    private $scheduler_useleaderforsingle;

    /** @var \app\Models\ConfigNodePropertyArray $metrics_filters */
    private $metrics_filters;

    /** @var \app\Models\ConfigNodePropertyInteger $slow_threshold_millis */
    private $slow_threshold_millis;

}
