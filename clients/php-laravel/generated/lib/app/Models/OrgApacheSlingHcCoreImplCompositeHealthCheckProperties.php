<?php
/**
 * OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
 */
class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {

    /** @var \app\Models\ConfigNodePropertyString $hc_name */
    private $hc_name;

    /** @var \app\Models\ConfigNodePropertyArray $hc_tags */
    private $hc_tags;

    /** @var \app\Models\ConfigNodePropertyString $hc_mbean_name */
    private $hc_mbean_name;

    /** @var \app\Models\ConfigNodePropertyArray $filter_tags */
    private $filter_tags;

    /** @var \app\Models\ConfigNodePropertyBoolean $filter_combine_tags_with_or */
    private $filter_combine_tags_with_or;

}
