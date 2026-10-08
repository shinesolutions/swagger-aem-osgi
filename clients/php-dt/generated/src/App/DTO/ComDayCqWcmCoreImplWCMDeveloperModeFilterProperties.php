<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
{
    /**
     * @DTA\Data(field="wcmdevmodefilter.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $wcmdevmodefilter_enabled = null;

}
