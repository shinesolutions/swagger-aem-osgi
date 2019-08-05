<?php
/**
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties
 */
namespace app\Models;

/**
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties
 */
class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {

    /** @var \app\Models\ConfigNodePropertyString $name */
    private $name;

    /** @var \app\Models\ConfigNodePropertyString $auth_token_provider_title */
    private $auth_token_provider_title;

    /** @var \app\Models\ConfigNodePropertyArray $auth_token_provider_default_claims */
    private $auth_token_provider_default_claims;

    /** @var \app\Models\ConfigNodePropertyString $auth_token_provider_endpoint */
    private $auth_token_provider_endpoint;

    /** @var \app\Models\ConfigNodePropertyString $auth_access_token_request */
    private $auth_access_token_request;

    /** @var \app\Models\ConfigNodePropertyString $auth_token_provider_keypair_alias */
    private $auth_token_provider_keypair_alias;

    /** @var \app\Models\ConfigNodePropertyInteger $auth_token_provider_conn_timeout */
    private $auth_token_provider_conn_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $auth_token_provider_so_timeout */
    private $auth_token_provider_so_timeout;

    /** @var \app\Models\ConfigNodePropertyString $auth_token_provider_client_id */
    private $auth_token_provider_client_id;

    /** @var \app\Models\ConfigNodePropertyString $auth_token_provider_scope */
    private $auth_token_provider_scope;

    /** @var \app\Models\ConfigNodePropertyBoolean $auth_token_provider_reuse_access_token */
    private $auth_token_provider_reuse_access_token;

    /** @var \app\Models\ConfigNodePropertyBoolean $auth_token_provider_relaxed_ssl */
    private $auth_token_provider_relaxed_ssl;

    /** @var \app\Models\ConfigNodePropertyString $token_request_customizer_type */
    private $token_request_customizer_type;

    /** @var \app\Models\ConfigNodePropertyString $auth_token_validator_type */
    private $auth_token_validator_type;

}
