-module(openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties/0]).

-export([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties() ::
  [ {'oauth_cookie_login_timeout', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_cookie_max_age', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties() ->
    openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties([]).

openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties(Fields) ->
  Default = [ {'oauth.cookie.login.timeout', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.cookie.max.age', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

