<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
{
    /**
     * @DTA\Data(field="dim.default.mode", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @var \App\DTO\ConfigNodePropertyDropDown
     */
    public $dim_default_mode;
    /**
     * @DTA\Data(field="dim.appcache.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $dim_appcache_enabled;
}
