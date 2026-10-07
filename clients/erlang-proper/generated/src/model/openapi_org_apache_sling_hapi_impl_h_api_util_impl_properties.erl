-module(openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties/0]).

-export([openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties/1]).

-export_type([openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties/0]).

-type openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties() ::
  [ {'org_apache_sling_hapi_tools_resourcetype', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_hapi_tools_collectionresourcetype', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_hapi_tools_searchpaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_sling_hapi_tools_externalurl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_hapi_tools_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties() ->
    openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties([]).

openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties(Fields) ->
  Default = [ {'org.apache.sling.hapi.tools.resourcetype', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.hapi.tools.collectionresourcetype', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.hapi.tools.searchpaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.sling.hapi.tools.externalurl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.hapi.tools.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

