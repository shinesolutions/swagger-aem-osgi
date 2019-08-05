-module(openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties/0]).

-type openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression
     }.
