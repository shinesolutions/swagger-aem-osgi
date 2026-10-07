<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqWcmScriptingImplBVPManagerProperties
{
    /**
     * @DTA\Data(field="com.day.cq.wcm.scripting.bvp.script.engines", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $com_day_cq_wcm_scripting_bvp_script_engines = null;

}
