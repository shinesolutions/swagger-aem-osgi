<?php
/**
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
 */
class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {

    /** @var \app\Models\ConfigNodePropertyString $name */
    private $name;

    /** @var \app\Models\ConfigNodePropertyInteger $min_pool_size */
    private $min_pool_size;

    /** @var \app\Models\ConfigNodePropertyInteger $max_pool_size */
    private $max_pool_size;

    /** @var \app\Models\ConfigNodePropertyInteger $queue_size */
    private $queue_size;

    /** @var \app\Models\ConfigNodePropertyInteger $max_thread_age */
    private $max_thread_age;

    /** @var \app\Models\ConfigNodePropertyInteger $keep_alive_time */
    private $keep_alive_time;

    /** @var \app\Models\ConfigNodePropertyDropDown $block_policy */
    private $block_policy;

    /** @var \app\Models\ConfigNodePropertyBoolean $shutdown_graceful */
    private $shutdown_graceful;

    /** @var \app\Models\ConfigNodePropertyBoolean $daemon */
    private $daemon;

    /** @var \app\Models\ConfigNodePropertyInteger $shutdown_wait_time */
    private $shutdown_wait_time;

    /** @var \app\Models\ConfigNodePropertyDropDown $priority */
    private $priority;

}
