<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
{
    /**
     * @DTA\Data(field="cq.dam.adhoc.asset.share.prezip.maxcontentsize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_adhoc_asset_share_prezip_maxcontentsize;
}
