-module(openapi_com_adobe_granite_auth_oauth_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_provider_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_provider_properties() ::
    #{ 'oauth_config_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_client_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_client_secret' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_scope' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'oauth_config_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_create_users' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_userid_property' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'force_strict_username_matching' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_encode_userids' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_hash_userids' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_callBackUrl' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_access_token_persist' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_access_token_persist_cookie' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_csrf_state_protection' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_redirect_request_params' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'oauth_config_siblings_allow' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'oauth_config_id' := OauthConfigId,
          'oauth_client_id' := OauthClientId,
          'oauth_client_secret' := OauthClientSecret,
          'oauth_scope' := OauthScope,
          'oauth_config_provider_id' := OauthConfigProviderId,
          'oauth_create_users' := OauthCreateUsers,
          'oauth_userid_property' := OauthUseridProperty,
          'force_strict_username_matching' := ForceStrictUsernameMatching,
          'oauth_encode_userids' := OauthEncodeUserids,
          'oauth_hash_userids' := OauthHashUserids,
          'oauth_callBackUrl' := OauthCallBackUrl,
          'oauth_access_token_persist' := OauthAccessTokenPersist,
          'oauth_access_token_persist_cookie' := OauthAccessTokenPersistCookie,
          'oauth_csrf_state_protection' := OauthCsrfStateProtection,
          'oauth_redirect_request_params' := OauthRedirectRequestParams,
          'oauth_config_siblings_allow' := OauthConfigSiblingsAllow
        }) ->
    #{ 'oauth.config.id' => OauthConfigId,
       'oauth.client.id' => OauthClientId,
       'oauth.client.secret' => OauthClientSecret,
       'oauth.scope' => OauthScope,
       'oauth.config.provider.id' => OauthConfigProviderId,
       'oauth.create.users' => OauthCreateUsers,
       'oauth.userid.property' => OauthUseridProperty,
       'force.strict.username.matching' => ForceStrictUsernameMatching,
       'oauth.encode.userids' => OauthEncodeUserids,
       'oauth.hash.userids' => OauthHashUserids,
       'oauth.callBackUrl' => OauthCallBackUrl,
       'oauth.access.token.persist' => OauthAccessTokenPersist,
       'oauth.access.token.persist.cookie' => OauthAccessTokenPersistCookie,
       'oauth.csrf.state.protection' => OauthCsrfStateProtection,
       'oauth.redirect.request.params' => OauthRedirectRequestParams,
       'oauth.config.siblings.allow' => OauthConfigSiblingsAllow
     }.
