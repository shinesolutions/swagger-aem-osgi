<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
{
    /**
     * @DTA\Data(field="cq.dam.scene7.assetmimetypeservice.mapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_dam_scene7_assetmimetypeservice_mapping = null;

}
