<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
{
    /**
     * @DTA\Data(field="search.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $search_pattern;
    /**
     * @DTA\Data(field="replace.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $replace_pattern;
}
