<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
{
    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.scheduler.istimebased", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $cq_dam_missingmetadata_notification_scheduler_istimebased = null;

    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.scheduler.timebased.rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_dam_missingmetadata_notification_scheduler_timebased_rule = null;

    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.scheduler.period.rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_missingmetadata_notification_scheduler_period_rule = null;

    /**
     * @DTA\Data(field="cq.dam.missingmetadata.notification.recipient", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_dam_missingmetadata_notification_recipient = null;

}
