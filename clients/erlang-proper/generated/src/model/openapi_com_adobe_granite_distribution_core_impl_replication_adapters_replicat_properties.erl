-module(openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties() ::
  [ {'providerName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'forward_requests', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties() ->
    openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties([]).

openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties(Fields) ->
  Default = [ {'providerName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'forward.requests', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

