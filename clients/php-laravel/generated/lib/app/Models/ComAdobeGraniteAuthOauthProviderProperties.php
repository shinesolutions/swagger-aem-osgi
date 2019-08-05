<?php
/**
 * ComAdobeGraniteAuthOauthProviderProperties
 */
namespace app\Models;

/**
 * ComAdobeGraniteAuthOauthProviderProperties
 */
class ComAdobeGraniteAuthOauthProviderProperties {

    /** @var \app\Models\ConfigNodePropertyString $oauth_config_id */
    private $oauth_config_id;

    /** @var \app\Models\ConfigNodePropertyString $oauth_client_id */
    private $oauth_client_id;

    /** @var \app\Models\ConfigNodePropertyString $oauth_client_secret */
    private $oauth_client_secret;

    /** @var \app\Models\ConfigNodePropertyArray $oauth_scope */
    private $oauth_scope;

    /** @var \app\Models\ConfigNodePropertyString $oauth_config_provider_id */
    private $oauth_config_provider_id;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_create_users */
    private $oauth_create_users;

    /** @var \app\Models\ConfigNodePropertyString $oauth_userid_property */
    private $oauth_userid_property;

    /** @var \app\Models\ConfigNodePropertyBoolean $force_strict_username_matching */
    private $force_strict_username_matching;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_encode_userids */
    private $oauth_encode_userids;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_hash_userids */
    private $oauth_hash_userids;

    /** @var \app\Models\ConfigNodePropertyString $oauth_call_back_url */
    private $oauth_call_back_url;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_access_token_persist */
    private $oauth_access_token_persist;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_access_token_persist_cookie */
    private $oauth_access_token_persist_cookie;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_csrf_state_protection */
    private $oauth_csrf_state_protection;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_redirect_request_params */
    private $oauth_redirect_request_params;

    /** @var \app\Models\ConfigNodePropertyBoolean $oauth_config_siblings_allow */
    private $oauth_config_siblings_allow;

}
