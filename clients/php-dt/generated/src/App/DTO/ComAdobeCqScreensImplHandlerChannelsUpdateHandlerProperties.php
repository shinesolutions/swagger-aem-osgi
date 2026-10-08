<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
{
    /**
     * @DTA\Data(field="cq.pagesupdatehandler.imageresourcetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_pagesupdatehandler_imageresourcetypes = null;

    /**
     * @DTA\Data(field="cq.pagesupdatehandler.productresourcetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_pagesupdatehandler_productresourcetypes = null;

    /**
     * @DTA\Data(field="cq.pagesupdatehandler.videoresourcetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_pagesupdatehandler_videoresourcetypes = null;

    /**
     * @DTA\Data(field="cq.pagesupdatehandler.dynamicsequenceresourcetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_pagesupdatehandler_dynamicsequenceresourcetypes = null;

    /**
     * @DTA\Data(field="cq.pagesupdatehandler.previewmodepaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_pagesupdatehandler_previewmodepaths = null;

}
