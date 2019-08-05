-module(openapi_com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job_properties/0]).

-type openapi_com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression
     }.
