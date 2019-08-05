<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeGraniteInfocollectorInfoCollectorProperties
{
    /**
     * @DTA\Data(field="granite.infocollector.includeThreadDumps", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $granite_infocollector_include_thread_dumps;
    /**
     * @DTA\Data(field="granite.infocollector.includeHeapDump", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $granite_infocollector_include_heap_dump;
}
