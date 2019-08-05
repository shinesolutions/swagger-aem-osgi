<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
{
    /**
     * @DTA\Data(field="fontList", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $font_list;
}
