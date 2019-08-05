<?php
/**
 * ComDayCommonsHttpclientProperties
 */
namespace app\Models;

/**
 * ComDayCommonsHttpclientProperties
 */
class ComDayCommonsHttpclientProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $proxy_enabled */
    private $proxy_enabled;

    /** @var \app\Models\ConfigNodePropertyString $proxy_host */
    private $proxy_host;

    /** @var \app\Models\ConfigNodePropertyString $proxy_user */
    private $proxy_user;

    /** @var \app\Models\ConfigNodePropertyString $proxy_password */
    private $proxy_password;

    /** @var \app\Models\ConfigNodePropertyString $proxy_ntlm_host */
    private $proxy_ntlm_host;

    /** @var \app\Models\ConfigNodePropertyString $proxy_ntlm_domain */
    private $proxy_ntlm_domain;

    /** @var \app\Models\ConfigNodePropertyArray $proxy_exceptions */
    private $proxy_exceptions;

}
