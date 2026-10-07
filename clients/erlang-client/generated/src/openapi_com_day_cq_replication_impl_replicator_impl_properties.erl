-module(openapi_com_day_cq_replication_impl_replicator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_replicator_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_replicator_impl_properties() ::
    #{ 'distribute_events' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'distribute_events' := DistributeEvents
        }) ->
    #{ 'distribute_events' => DistributeEvents
     }.
