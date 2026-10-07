<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
{
    /**
     * @DTA\Data(field="org.apache.sling.scripting.sightly.js.bindings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $org_apache_sling_scripting_sightly_js_bindings = null;

}
