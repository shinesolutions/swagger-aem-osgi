<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties
{
    /**
     * @DTA\Data(field="omnisearch.suggestion.requiretext.min", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $omnisearch_suggestion_requiretext_min = null;

    /**
     * @DTA\Data(field="omnisearch.suggestion.spellcheck.require", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $omnisearch_suggestion_spellcheck_require = null;

}
