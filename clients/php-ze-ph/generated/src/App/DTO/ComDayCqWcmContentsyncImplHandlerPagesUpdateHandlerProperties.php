<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
{
    /**
     * @DTA\Data(field="cq.pagesupdatehandler.imageresourcetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_pagesupdatehandler_imageresourcetypes;
}
