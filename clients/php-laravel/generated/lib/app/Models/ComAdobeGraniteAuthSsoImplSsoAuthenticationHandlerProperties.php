<?php
/**
 * ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
 */
namespace app\Models;

/**
 * ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
 */
class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {

    /** @var \app\Models\ConfigNodePropertyString $path */
    private $path;

    /** @var \app\Models\ConfigNodePropertyInteger $service_ranking */
    private $service_ranking;

    /** @var \app\Models\ConfigNodePropertyString $jaas_control_flag */
    private $jaas_control_flag;

    /** @var \app\Models\ConfigNodePropertyString $jaas_realm_name */
    private $jaas_realm_name;

    /** @var \app\Models\ConfigNodePropertyInteger $jaas_ranking */
    private $jaas_ranking;

    /** @var \app\Models\ConfigNodePropertyArray $headers */
    private $headers;

    /** @var \app\Models\ConfigNodePropertyArray $cookies */
    private $cookies;

    /** @var \app\Models\ConfigNodePropertyArray $parameters */
    private $parameters;

    /** @var \app\Models\ConfigNodePropertyArray $usermap */
    private $usermap;

    /** @var \app\Models\ConfigNodePropertyString $format */
    private $format;

    /** @var \app\Models\ConfigNodePropertyString $trusted_credentials_attribute */
    private $trusted_credentials_attribute;

}
