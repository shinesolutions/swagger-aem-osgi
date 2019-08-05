<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmCoreWCMRequestFilterProperties
{
    /**
     * @DTA\Data(field="wcmfilter.mode", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @var \App\DTO\ConfigNodePropertyDropDown
     */
    public $wcmfilter_mode;
}
