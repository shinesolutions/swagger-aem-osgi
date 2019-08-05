<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties
{
    /**
     * @DTA\Data(field="inbox.impl.typeprovider.registrypaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $inbox_impl_typeprovider_registrypaths;
    /**
     * @DTA\Data(field="inbox.impl.typeprovider.legacypaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $inbox_impl_typeprovider_legacypaths;
    /**
     * @DTA\Data(field="inbox.impl.typeprovider.defaulturl.failureitem", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $inbox_impl_typeprovider_defaulturl_failureitem;
    /**
     * @DTA\Data(field="inbox.impl.typeprovider.defaulturl.workitem", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $inbox_impl_typeprovider_defaulturl_workitem;
    /**
     * @DTA\Data(field="inbox.impl.typeprovider.defaulturl.task", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $inbox_impl_typeprovider_defaulturl_task;
}
