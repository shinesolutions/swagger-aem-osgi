<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamCommonsHandlerStandardImageHandlerProperties
{
    /**
     * @DTA\Data(field="large_file_threshold", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $large_file_threshold;
    /**
     * @DTA\Data(field="large_comment_threshold", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $large_comment_threshold;
    /**
     * @DTA\Data(field="cq.dam.enable.ext.meta.extraction", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $cq_dam_enable_ext_meta_extraction;
}
