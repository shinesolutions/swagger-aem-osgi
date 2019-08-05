-module(openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties() ::
    #{ 'oauth_cookie_login_timeout' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_cookie_max_age' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'oauth_cookie_login_timeout' := OauthCookieLoginTimeout,
          'oauth_cookie_max_age' := OauthCookieMaxAge
        }) ->
    #{ 'oauth.cookie.login.timeout' => OauthCookieLoginTimeout,
       'oauth.cookie.max.age' => OauthCookieMaxAge
     }.
