<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
{
    /**
     * @DTA\Data(field="org.apache.sling.commons.log.level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @var \App\DTO\ConfigNodePropertyDropDown
     */
    public $org_apache_sling_commons_log_level;
    /**
     * @DTA\Data(field="org.apache.sling.commons.log.file", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $org_apache_sling_commons_log_file;
    /**
     * @DTA\Data(field="org.apache.sling.commons.log.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $org_apache_sling_commons_log_pattern;
    /**
     * @DTA\Data(field="org.apache.sling.commons.log.names", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $org_apache_sling_commons_log_names;
    /**
     * @DTA\Data(field="org.apache.sling.commons.log.additiv", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $org_apache_sling_commons_log_additiv;
}
