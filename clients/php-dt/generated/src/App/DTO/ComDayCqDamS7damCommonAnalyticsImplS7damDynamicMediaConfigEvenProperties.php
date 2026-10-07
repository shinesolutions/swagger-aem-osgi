<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
{
    /**
     * @DTA\Data(field="cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled = null;

}
