<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
{
    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.scheduler.istimebased", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $cq_dam_missingmetadata_notification_scheduler_istimebased;
    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.scheduler.timebased.rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_missingmetadata_notification_scheduler_timebased_rule;
    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.scheduler.period.rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_missingmetadata_notification_scheduler_period_rule;
    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.recipient", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_missingmetadata_notification_recipient;
}
