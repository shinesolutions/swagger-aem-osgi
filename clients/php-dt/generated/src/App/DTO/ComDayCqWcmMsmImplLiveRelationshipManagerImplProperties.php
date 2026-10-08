<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
{
    /**
     * @DTA\Data(field="liverelationshipmgr.relationsconfig.default", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $liverelationshipmgr_relationsconfig_default = null;

}
