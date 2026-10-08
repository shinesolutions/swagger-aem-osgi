<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties
{
    /**
     * @DTA\Data(field="cq.commerce.asset.handler.active", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $cq_commerce_asset_handler_active = null;

    /**
     * @DTA\Data(field="cq.commerce.asset.handler.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_commerce_asset_handler_name = null;

}
