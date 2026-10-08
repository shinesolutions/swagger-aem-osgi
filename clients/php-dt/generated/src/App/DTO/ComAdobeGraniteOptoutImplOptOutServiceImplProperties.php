<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteOptoutImplOptOutServiceImplProperties
{
    /**
     * @DTA\Data(field="optout.cookies", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $optout_cookies = null;

    /**
     * @DTA\Data(field="optout.headers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $optout_headers = null;

    /**
     * @DTA\Data(field="optout.whitelist.cookies", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $optout_whitelist_cookies = null;

}
