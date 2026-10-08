-module(openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties/0]).

-export([openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties/1]).

-export_type([openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties/0]).

-type openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties() ::
  [ {'sling_servlet_selectors', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'ecmaSuport', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties() ->
    openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties([]).

openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.selectors', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'ecmaSuport', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

