-module(openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_info/0]).

-type openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties:openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
