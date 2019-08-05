<?php
/**
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
 */
namespace app\Models;

/**
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
 */
class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {

    /** @var \app\Models\ConfigNodePropertyInteger $scheduler_period */
    private $scheduler_period;

    /** @var \app\Models\ConfigNodePropertyBoolean $scheduler_concurrent */
    private $scheduler_concurrent;

    /** @var \app\Models\ConfigNodePropertyInteger $good_link_test_interval */
    private $good_link_test_interval;

    /** @var \app\Models\ConfigNodePropertyInteger $bad_link_test_interval */
    private $bad_link_test_interval;

    /** @var \app\Models\ConfigNodePropertyInteger $link_unused_interval */
    private $link_unused_interval;

    /** @var \app\Models\ConfigNodePropertyInteger $connection_timeout */
    private $connection_timeout;

}
