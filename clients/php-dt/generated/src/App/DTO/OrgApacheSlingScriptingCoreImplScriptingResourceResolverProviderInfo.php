<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo
{
    /**
     * @DTA\Data(field="pid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pid = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="properties", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::class})
     */
    public ?\App\DTO\OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties $properties = null;

}
