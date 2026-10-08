<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
{
    /**
     * @DTA\Data(field="cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled = null;

}
