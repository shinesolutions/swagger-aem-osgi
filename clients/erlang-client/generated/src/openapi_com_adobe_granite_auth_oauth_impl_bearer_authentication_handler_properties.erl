-module(openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_clientIds_allowed' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'auth_bearer_sync_ims' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'auth_tokenRequestParameter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_bearer_configid' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_jwt_support' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'path' := Path,
          'oauth_clientIds_allowed' := OauthClientIdsAllowed,
          'auth_bearer_sync_ims' := AuthBearerSyncIms,
          'auth_tokenRequestParameter' := AuthTokenRequestParameter,
          'oauth_bearer_configid' := OauthBearerConfigid,
          'oauth_jwt_support' := OauthJwtSupport
        }) ->
    #{ 'path' => Path,
       'oauth.clientIds.allowed' => OauthClientIdsAllowed,
       'auth.bearer.sync.ims' => AuthBearerSyncIms,
       'auth.tokenRequestParameter' => AuthTokenRequestParameter,
       'oauth.bearer.configid' => OauthBearerConfigid,
       'oauth.jwt.support' => OauthJwtSupport
     }.
