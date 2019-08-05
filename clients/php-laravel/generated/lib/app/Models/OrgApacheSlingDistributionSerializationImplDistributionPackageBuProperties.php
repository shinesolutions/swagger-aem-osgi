<?php
/**
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
 */
class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {

    /** @var \app\Models\ConfigNodePropertyString $name */
    private $name;

    /** @var \app\Models\ConfigNodePropertyDropDown $type */
    private $type;

    /** @var \app\Models\ConfigNodePropertyString $format_target */
    private $format_target;

    /** @var \app\Models\ConfigNodePropertyString $temp_fs_folder */
    private $temp_fs_folder;

    /** @var \app\Models\ConfigNodePropertyInteger $file_threshold */
    private $file_threshold;

    /** @var \app\Models\ConfigNodePropertyDropDown $memory_unit */
    private $memory_unit;

    /** @var \app\Models\ConfigNodePropertyBoolean $use_off_heap_memory */
    private $use_off_heap_memory;

    /** @var \app\Models\ConfigNodePropertyDropDown $digest_algorithm */
    private $digest_algorithm;

    /** @var \app\Models\ConfigNodePropertyInteger $monitoring_queue_size */
    private $monitoring_queue_size;

    /** @var \app\Models\ConfigNodePropertyInteger $cleanup_delay */
    private $cleanup_delay;

    /** @var \app\Models\ConfigNodePropertyArray $package_filters */
    private $package_filters;

    /** @var \app\Models\ConfigNodePropertyArray $property_filters */
    private $property_filters;

}
