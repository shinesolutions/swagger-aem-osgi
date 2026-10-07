-module(openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties/0]).

-type openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'job_purge_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'job_purge_max_jobs' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression,
          'job_purge_threshold' := JobPurgeThreshold,
          'job_purge_max_jobs' := JobPurgeMaxJobs
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression,
       'job.purge.threshold' => JobPurgeThreshold,
       'job.purge.max.jobs' => JobPurgeMaxJobs
     }.
