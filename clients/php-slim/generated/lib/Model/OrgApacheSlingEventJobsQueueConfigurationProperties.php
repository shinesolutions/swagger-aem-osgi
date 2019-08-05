<?php
/**
 * OrgApacheSlingEventJobsQueueConfigurationProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheSlingEventJobsQueueConfigurationProperties
 */
class OrgApacheSlingEventJobsQueueConfigurationProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $queueName */
    private $queueName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $queueTopics */
    private $queueTopics;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $queueType */
    private $queueType;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $queuePriority */
    private $queuePriority;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $queueRetries */
    private $queueRetries;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $queueRetrydelay */
    private $queueRetrydelay;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyFloat $queueMaxparallel */
    private $queueMaxparallel;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $queueKeepJobs */
    private $queueKeepJobs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $queuePreferRunOnCreationInstance */
    private $queuePreferRunOnCreationInstance;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $queueThreadPoolSize */
    private $queueThreadPoolSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $serviceRanking */
    private $serviceRanking;

}
