<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
{
    /**
     * @DTA\Data(field="liverelationshipmgr.relationsconfig.default", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $liverelationshipmgr_relationsconfig_default;
}
