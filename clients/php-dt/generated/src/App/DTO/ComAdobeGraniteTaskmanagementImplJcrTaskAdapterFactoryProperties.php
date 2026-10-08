<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties
{
    /**
     * @DTA\Data(field="adapter.condition", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $adapter_condition = null;

}
