<?php
/**
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
 */
namespace app\Models;

/**
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
 */
class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $enabled */
    private $enabled;

    /** @var \app\Models\ConfigNodePropertyInteger $interval_seconds */
    private $interval_seconds;

    /** @var \app\Models\ConfigNodePropertyInteger $commits_per_interval_threshold */
    private $commits_per_interval_threshold;

    /** @var \app\Models\ConfigNodePropertyInteger $max_location_length */
    private $max_location_length;

    /** @var \app\Models\ConfigNodePropertyInteger $max_details_shown */
    private $max_details_shown;

    /** @var \app\Models\ConfigNodePropertyInteger $min_details_percentage */
    private $min_details_percentage;

    /** @var \app\Models\ConfigNodePropertyArray $thread_matchers */
    private $thread_matchers;

    /** @var \app\Models\ConfigNodePropertyInteger $max_greedy_depth */
    private $max_greedy_depth;

    /** @var \app\Models\ConfigNodePropertyString $greedy_stack_matchers */
    private $greedy_stack_matchers;

    /** @var \app\Models\ConfigNodePropertyArray $stack_filters */
    private $stack_filters;

    /** @var \app\Models\ConfigNodePropertyArray $stack_matchers */
    private $stack_matchers;

    /** @var \app\Models\ConfigNodePropertyArray $stack_categorizers */
    private $stack_categorizers;

    /** @var \app\Models\ConfigNodePropertyArray $stack_shorteners */
    private $stack_shorteners;

}
