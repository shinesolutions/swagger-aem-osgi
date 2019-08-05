<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties
{
    /**
     * @DTA\Data(field="whitelist.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $whitelist_name;
    /**
     * @DTA\Data(field="whitelist.bundles", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $whitelist_bundles;
}
