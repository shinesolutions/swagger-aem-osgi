<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqDamCoreImplUnzipUnzipConfigProperties
{
    /**
     * @DTA\Data(field="cq.dam.config.unzip.maxuncompressedsize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_config_unzip_maxuncompressedsize = null;

    /**
     * @DTA\Data(field="cq.dam.config.unzip.encoding", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_dam_config_unzip_encoding = null;

}
