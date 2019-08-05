-module(openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scheduler_concurrent' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression,
          'scheduler_concurrent' := SchedulerConcurrent
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression,
       'scheduler.concurrent' => SchedulerConcurrent
     }.
