-module(openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties() ::
  [ {'asyncConfigs', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'leaseTimeOutMinutes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'failingIndexTimeoutSeconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'errorWarnIntervalSeconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties(Fields) ->
  Default = [ {'asyncConfigs', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'leaseTimeOutMinutes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'failingIndexTimeoutSeconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'errorWarnIntervalSeconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

