<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamScene7ImplScene7UploadServiceImplProperties
{
    /**
     * @DTA\Data(field="cq.dam.scene7.uploadservice.activejobtimeout.label", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_scene7_uploadservice_activejobtimeout_label;
    /**
     * @DTA\Data(field="cq.dam.scene7.uploadservice.connectionmaxperroute.label", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_scene7_uploadservice_connectionmaxperroute_label;
}
