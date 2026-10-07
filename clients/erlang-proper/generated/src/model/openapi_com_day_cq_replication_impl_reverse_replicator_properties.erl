-module(openapi_com_day_cq_replication_impl_reverse_replicator_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_reverse_replicator_properties/0]).

-export([openapi_com_day_cq_replication_impl_reverse_replicator_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_reverse_replicator_properties/0]).

-type openapi_com_day_cq_replication_impl_reverse_replicator_properties() ::
  [ {'scheduler_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_replication_impl_reverse_replicator_properties() ->
    openapi_com_day_cq_replication_impl_reverse_replicator_properties([]).

openapi_com_day_cq_replication_impl_reverse_replicator_properties(Fields) ->
  Default = [ {'scheduler.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

