<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheSlingHapiImplHApiUtilImplProperties
{
    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.resourcetype", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $org_apache_sling_hapi_tools_resourcetype;
    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.collectionresourcetype", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $org_apache_sling_hapi_tools_collectionresourcetype;
    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.searchpaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $org_apache_sling_hapi_tools_searchpaths;
    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.externalurl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $org_apache_sling_hapi_tools_externalurl;
    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $org_apache_sling_hapi_tools_enabled;
}
