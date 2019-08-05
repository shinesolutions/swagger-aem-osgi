<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
{
    /**
     * @DTA\Data(field="cq.dam.scene7.configurationeventlistener.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $cq_dam_scene7_configurationeventlistener_enabled;
}
