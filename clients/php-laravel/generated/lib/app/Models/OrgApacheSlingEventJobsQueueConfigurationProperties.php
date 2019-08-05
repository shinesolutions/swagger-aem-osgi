<?php
/**
 * OrgApacheSlingEventJobsQueueConfigurationProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingEventJobsQueueConfigurationProperties
 */
class OrgApacheSlingEventJobsQueueConfigurationProperties {

    /** @var \app\Models\ConfigNodePropertyString $queue_name */
    private $queue_name;

    /** @var \app\Models\ConfigNodePropertyArray $queue_topics */
    private $queue_topics;

    /** @var \app\Models\ConfigNodePropertyDropDown $queue_type */
    private $queue_type;

    /** @var \app\Models\ConfigNodePropertyDropDown $queue_priority */
    private $queue_priority;

    /** @var \app\Models\ConfigNodePropertyInteger $queue_retries */
    private $queue_retries;

    /** @var \app\Models\ConfigNodePropertyInteger $queue_retrydelay */
    private $queue_retrydelay;

    /** @var \app\Models\ConfigNodePropertyFloat $queue_maxparallel */
    private $queue_maxparallel;

    /** @var \app\Models\ConfigNodePropertyBoolean $queue_keep_jobs */
    private $queue_keep_jobs;

    /** @var \app\Models\ConfigNodePropertyBoolean $queue_prefer_run_on_creation_instance */
    private $queue_prefer_run_on_creation_instance;

    /** @var \app\Models\ConfigNodePropertyInteger $queue_thread_pool_size */
    private $queue_thread_pool_size;

    /** @var \app\Models\ConfigNodePropertyInteger $service_ranking */
    private $service_ranking;

}
