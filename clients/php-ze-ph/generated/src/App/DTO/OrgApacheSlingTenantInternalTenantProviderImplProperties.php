<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheSlingTenantInternalTenantProviderImplProperties
{
    /**
     * @DTA\Data(field="tenant.root", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $tenant_root;
    /**
     * @DTA\Data(field="tenant.path.matcher", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $tenant_path_matcher;
}
