<?php
/**
 * ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
 */
namespace app\Models;

/**
 * ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
 */
class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {

    /** @var \app\Models\ConfigNodePropertyInteger $scheduler_period */
    private $scheduler_period;

    /** @var \app\Models\ConfigNodePropertyBoolean $scheduler_concurrent */
    private $scheduler_concurrent;

    /** @var \app\Models\ConfigNodePropertyInteger $service_bad_link_tolerance_interval */
    private $service_bad_link_tolerance_interval;

    /** @var \app\Models\ConfigNodePropertyArray $service_check_override_patterns */
    private $service_check_override_patterns;

    /** @var \app\Models\ConfigNodePropertyBoolean $service_cache_broken_internal_links */
    private $service_cache_broken_internal_links;

    /** @var \app\Models\ConfigNodePropertyArray $service_special_link_prefix */
    private $service_special_link_prefix;

    /** @var \app\Models\ConfigNodePropertyArray $service_special_link_patterns */
    private $service_special_link_patterns;

}
