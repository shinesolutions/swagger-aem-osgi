<?php
/**
 * OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
 */
class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {

    /** @var \app\Models\ConfigNodePropertyString $hc_name */
    private $hc_name;

    /** @var \app\Models\ConfigNodePropertyArray $hc_tags */
    private $hc_tags;

    /** @var \app\Models\ConfigNodePropertyString $hc_mbean_name */
    private $hc_mbean_name;

    /** @var \app\Models\ConfigNodePropertyInteger $number_of_retries_allowed */
    private $number_of_retries_allowed;

}
