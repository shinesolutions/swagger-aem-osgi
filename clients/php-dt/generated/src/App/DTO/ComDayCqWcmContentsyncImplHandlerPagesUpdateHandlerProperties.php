<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
{
    /**
     * @DTA\Data(field="cq.pagesupdatehandler.imageresourcetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_pagesupdatehandler_imageresourcetypes = null;

}
