<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties
{
    /**
     * @DTA\Data(field="org.apache.sling.scripting.javascript.rhino.optLevel", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger|null
     */
    public $org_apache_sling_scripting_javascript_rhino_opt_level;

}
