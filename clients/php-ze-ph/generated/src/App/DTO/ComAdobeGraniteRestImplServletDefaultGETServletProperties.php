<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeGraniteRestImplServletDefaultGETServletProperties
{
    /**
     * @DTA\Data(field="default.limit", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $default_limit;
    /**
     * @DTA\Data(field="use.absolute.uri", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $use_absolute_uri;
}
