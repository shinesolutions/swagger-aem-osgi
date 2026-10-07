-module(openapi_com_day_cq_replication_impl_replicator_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_replicator_impl_properties/0]).

-export([openapi_com_day_cq_replication_impl_replicator_impl_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_replicator_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_replicator_impl_properties() ::
  [ {'distribute_events', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_replication_impl_replicator_impl_properties() ->
    openapi_com_day_cq_replication_impl_replicator_impl_properties([]).

openapi_com_day_cq_replication_impl_replicator_impl_properties(Fields) ->
  Default = [ {'distribute_events', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

