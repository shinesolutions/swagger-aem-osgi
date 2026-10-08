-module(openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties() ::
  [ {'maxItems', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxPathDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties(Fields) ->
  Default = [ {'maxItems', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxPathDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

