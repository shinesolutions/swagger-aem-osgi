<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
{
    /**
     * @DTA\Data(field="includedPaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $included_paths;
    /**
     * @DTA\Data(field="enableAsyncObserver", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $enable_async_observer;
    /**
     * @DTA\Data(field="observerQueueSize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $observer_queue_size;
}
