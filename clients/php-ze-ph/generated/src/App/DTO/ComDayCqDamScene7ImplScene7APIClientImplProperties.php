<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamScene7ImplScene7APIClientImplProperties
{
    /**
     * @DTA\Data(field="cq.dam.scene7.apiclient.recordsperpage.nofilter.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_scene7_apiclient_recordsperpage_nofilter_name;
    /**
     * @DTA\Data(field="cq.dam.scene7.apiclient.recordsperpage.withfilter.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_scene7_apiclient_recordsperpage_withfilter_name;
}
