<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrgApacheSlingHapiImplHApiUtilImplProperties
{
    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.resourcetype", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $org_apache_sling_hapi_tools_resourcetype = null;

    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.collectionresourcetype", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $org_apache_sling_hapi_tools_collectionresourcetype = null;

    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.searchpaths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $org_apache_sling_hapi_tools_searchpaths = null;

    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.externalurl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $org_apache_sling_hapi_tools_externalurl = null;

    /**
     * @DTA\Data(field="org.apache.sling.hapi.tools.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $org_apache_sling_hapi_tools_enabled = null;

}
