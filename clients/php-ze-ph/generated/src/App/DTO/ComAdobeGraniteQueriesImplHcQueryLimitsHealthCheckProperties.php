<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties
{
    /**
     * @DTA\Data(field="hc.tags", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $hc_tags;
}
