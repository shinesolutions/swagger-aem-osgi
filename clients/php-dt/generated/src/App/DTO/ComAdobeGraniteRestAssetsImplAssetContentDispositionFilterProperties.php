<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
{
    /**
     * @DTA\Data(field="mime.allowEmpty", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $mime_allow_empty = null;

    /**
     * @DTA\Data(field="mime.allowed", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $mime_allowed = null;

}
