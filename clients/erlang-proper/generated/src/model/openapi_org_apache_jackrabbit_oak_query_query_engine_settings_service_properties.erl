-module(openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties() ::
  [ {'queryLimitInMemory', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queryLimitReads', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queryFailTraversal', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'fastQuerySize', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties() ->
    openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties([]).

openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties(Fields) ->
  Default = [ {'queryLimitInMemory', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queryLimitReads', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queryFailTraversal', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'fastQuerySize', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

