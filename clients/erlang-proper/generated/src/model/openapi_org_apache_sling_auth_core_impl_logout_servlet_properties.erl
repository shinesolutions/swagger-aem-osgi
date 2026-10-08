-module(openapi_org_apache_sling_auth_core_impl_logout_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_auth_core_impl_logout_servlet_properties/0]).

-export([openapi_org_apache_sling_auth_core_impl_logout_servlet_properties/1]).

-export_type([openapi_org_apache_sling_auth_core_impl_logout_servlet_properties/0]).

-type openapi_org_apache_sling_auth_core_impl_logout_servlet_properties() ::
  [ {'sling_servlet_methods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_servlet_paths', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_auth_core_impl_logout_servlet_properties() ->
    openapi_org_apache_sling_auth_core_impl_logout_servlet_properties([]).

openapi_org_apache_sling_auth_core_impl_logout_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.methods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.servlet.paths', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

