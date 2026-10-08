-module(openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties/0]).

-type openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_http_nologin', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'auth_http_realm', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_default_loginpage', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_cred_form', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'auth_cred_utf8', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties() ->
    openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties([]).

openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.http.nologin', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'auth.http.realm', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.default.loginpage', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.cred.form', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'auth.cred.utf8', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

