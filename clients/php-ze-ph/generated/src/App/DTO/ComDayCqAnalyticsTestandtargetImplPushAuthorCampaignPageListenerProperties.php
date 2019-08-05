<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
{
    /**
     * @DTA\Data(field="cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled;
}
