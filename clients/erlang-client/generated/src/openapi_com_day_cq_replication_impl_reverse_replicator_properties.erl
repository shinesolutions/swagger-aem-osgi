-module(openapi_com_day_cq_replication_impl_reverse_replicator_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_reverse_replicator_properties/0]).

-type openapi_com_day_cq_replication_impl_reverse_replicator_properties() ::
    #{ 'scheduler_period' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'scheduler_period' := SchedulerPeriod
        }) ->
    #{ 'scheduler.period' => SchedulerPeriod
     }.
