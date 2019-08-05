<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmScriptingImplBVPManagerProperties
{
    /**
     * @DTA\Data(field="com.day.cq.wcm.scripting.bvp.script.engines", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $com_day_cq_wcm_scripting_bvp_script_engines;
}
