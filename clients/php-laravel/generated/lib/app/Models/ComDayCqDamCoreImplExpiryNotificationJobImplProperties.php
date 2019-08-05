<?php
/**
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties
 */
namespace app\Models;

/**
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties
 */
class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $cq_dam_expiry_notification_scheduler_istimebased */
    private $cq_dam_expiry_notification_scheduler_istimebased;

    /** @var \app\Models\ConfigNodePropertyString $cq_dam_expiry_notification_scheduler_timebased_rule */
    private $cq_dam_expiry_notification_scheduler_timebased_rule;

    /** @var \app\Models\ConfigNodePropertyInteger $cq_dam_expiry_notification_scheduler_period_rule */
    private $cq_dam_expiry_notification_scheduler_period_rule;

    /** @var \app\Models\ConfigNodePropertyBoolean $send_email */
    private $send_email;

    /** @var \app\Models\ConfigNodePropertyInteger $asset_expired_limit */
    private $asset_expired_limit;

    /** @var \app\Models\ConfigNodePropertyInteger $prior_notification_seconds */
    private $prior_notification_seconds;

    /** @var \app\Models\ConfigNodePropertyString $cq_dam_expiry_notification_url_protocol */
    private $cq_dam_expiry_notification_url_protocol;

}
