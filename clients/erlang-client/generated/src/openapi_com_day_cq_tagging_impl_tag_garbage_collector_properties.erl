-module(openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties/0]).

-type openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression
     }.
