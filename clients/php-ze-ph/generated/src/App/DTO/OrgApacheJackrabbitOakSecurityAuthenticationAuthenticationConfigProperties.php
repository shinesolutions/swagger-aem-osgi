<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
{
    /**
     * @DTA\Data(field="org.apache.jackrabbit.oak.authentication.appName", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $org_apache_jackrabbit_oak_authentication_app_name;
    /**
     * @DTA\Data(field="org.apache.jackrabbit.oak.authentication.configSpiName", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $org_apache_jackrabbit_oak_authentication_config_spi_name;
}
