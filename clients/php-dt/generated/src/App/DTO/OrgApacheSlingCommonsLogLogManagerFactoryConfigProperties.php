<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
{
    /**
     * @DTA\Data(field="org.apache.sling.commons.log.level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     */
    public ?\App\DTO\ConfigNodePropertyDropDown $org_apache_sling_commons_log_level = null;

    /**
     * @DTA\Data(field="org.apache.sling.commons.log.file", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $org_apache_sling_commons_log_file = null;

    /**
     * @DTA\Data(field="org.apache.sling.commons.log.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $org_apache_sling_commons_log_pattern = null;

    /**
     * @DTA\Data(field="org.apache.sling.commons.log.names", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $org_apache_sling_commons_log_names = null;

    /**
     * @DTA\Data(field="org.apache.sling.commons.log.additiv", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $org_apache_sling_commons_log_additiv = null;

}
