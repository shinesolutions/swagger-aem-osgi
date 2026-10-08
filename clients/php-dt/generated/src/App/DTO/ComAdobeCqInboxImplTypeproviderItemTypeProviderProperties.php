<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties
{
    /**
     * @DTA\Data(field="inbox.impl.typeprovider.registrypaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $inbox_impl_typeprovider_registrypaths = null;

    /**
     * @DTA\Data(field="inbox.impl.typeprovider.legacypaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $inbox_impl_typeprovider_legacypaths = null;

    /**
     * @DTA\Data(field="inbox.impl.typeprovider.defaulturl.failureitem", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $inbox_impl_typeprovider_defaulturl_failureitem = null;

    /**
     * @DTA\Data(field="inbox.impl.typeprovider.defaulturl.workitem", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $inbox_impl_typeprovider_defaulturl_workitem = null;

    /**
     * @DTA\Data(field="inbox.impl.typeprovider.defaulturl.task", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $inbox_impl_typeprovider_defaulturl_task = null;

}
