<?php
/**
 * OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
 */
class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {

    /** @var \app\Models\ConfigNodePropertyString $name */
    private $name;

    /** @var \app\Models\ConfigNodePropertyString $title */
    private $title;

    /** @var \app\Models\ConfigNodePropertyString $details */
    private $details;

    /** @var \app\Models\ConfigNodePropertyBoolean $enabled */
    private $enabled;

    /** @var \app\Models\ConfigNodePropertyString $service_name */
    private $service_name;

    /** @var \app\Models\ConfigNodePropertyDropDown $log_level */
    private $log_level;

    /** @var \app\Models\ConfigNodePropertyBoolean $queue_processing_enabled */
    private $queue_processing_enabled;

    /** @var \app\Models\ConfigNodePropertyArray $passive_queues */
    private $passive_queues;

    /** @var \app\Models\ConfigNodePropertyArray $package_exporter_endpoints */
    private $package_exporter_endpoints;

    /** @var \app\Models\ConfigNodePropertyArray $package_importer_endpoints */
    private $package_importer_endpoints;

    /** @var \app\Models\ConfigNodePropertyDropDown $retry_strategy */
    private $retry_strategy;

    /** @var \app\Models\ConfigNodePropertyInteger $retry_attempts */
    private $retry_attempts;

    /** @var \app\Models\ConfigNodePropertyInteger $pull_items */
    private $pull_items;

    /** @var \app\Models\ConfigNodePropertyInteger $http_conn_timeout */
    private $http_conn_timeout;

    /** @var \app\Models\ConfigNodePropertyString $request_authorization_strategy_target */
    private $request_authorization_strategy_target;

    /** @var \app\Models\ConfigNodePropertyString $transport_secret_provider_target */
    private $transport_secret_provider_target;

    /** @var \app\Models\ConfigNodePropertyString $package_builder_target */
    private $package_builder_target;

    /** @var \app\Models\ConfigNodePropertyString $triggers_target */
    private $triggers_target;

}
