<?php
/**
 * OrgApacheHttpProxyconfiguratorProperties
 */
namespace app\Models;

/**
 * OrgApacheHttpProxyconfiguratorProperties
 */
class OrgApacheHttpProxyconfiguratorProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $proxy_enabled */
    private $proxy_enabled;

    /** @var \app\Models\ConfigNodePropertyString $proxy_host */
    private $proxy_host;

    /** @var \app\Models\ConfigNodePropertyInteger $proxy_port */
    private $proxy_port;

    /** @var \app\Models\ConfigNodePropertyString $proxy_user */
    private $proxy_user;

    /** @var \app\Models\ConfigNodePropertyString $proxy_password */
    private $proxy_password;

    /** @var \app\Models\ConfigNodePropertyArray $proxy_exceptions */
    private $proxy_exceptions;

}
