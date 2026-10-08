<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
{
    /**
     * @DTA\Data(field="cq.dam.scene7.damchangeeventlistener.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $cq_dam_scene7_damchangeeventlistener_enabled = null;

    /**
     * @DTA\Data(field="cq.dam.scene7.damchangeeventlistener.observed.paths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_dam_scene7_damchangeeventlistener_observed_paths = null;

}
