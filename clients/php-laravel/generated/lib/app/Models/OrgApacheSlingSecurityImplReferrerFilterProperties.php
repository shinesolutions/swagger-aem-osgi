<?php
/**
 * OrgApacheSlingSecurityImplReferrerFilterProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingSecurityImplReferrerFilterProperties
 */
class OrgApacheSlingSecurityImplReferrerFilterProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $allow_empty */
    private $allow_empty;

    /** @var \app\Models\ConfigNodePropertyArray $allow_hosts */
    private $allow_hosts;

    /** @var \app\Models\ConfigNodePropertyArray $allow_hosts_regexp */
    private $allow_hosts_regexp;

    /** @var \app\Models\ConfigNodePropertyArray $filter_methods */
    private $filter_methods;

    /** @var \app\Models\ConfigNodePropertyArray $exclude_agents_regexp */
    private $exclude_agents_regexp;

}
