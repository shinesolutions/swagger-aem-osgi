-module(openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties/0]).

-export([openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties/1]).

-export_type([openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties/0]).

-type openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties() ::
  [ {'osgi_http_whiteboard_context_select', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'osgi_http_whiteboard_listener', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_sudo_cookie', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_sudo_parameter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_annonymous', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'sling_auth_requirements', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_auth_anonymous_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_auth_anonymous_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_http', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'auth_http_realm', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_uri_suffix', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties() ->
    openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties([]).

openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties(Fields) ->
  Default = [ {'osgi.http.whiteboard.context.select', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'osgi.http.whiteboard.listener', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.sudo.cookie', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.sudo.parameter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.annonymous', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'sling.auth.requirements', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.auth.anonymous.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.auth.anonymous.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.http', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'auth.http.realm', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.uri.suffix', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

