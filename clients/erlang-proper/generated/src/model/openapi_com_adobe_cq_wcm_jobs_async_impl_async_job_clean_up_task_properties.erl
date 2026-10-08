-module(openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties/0]).

-export([openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties/1]).

-export_type([openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties/0]).

-type openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'job_purge_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'job_purge_max_jobs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties() ->
    openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties([]).

openapi_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'job.purge.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'job.purge.max.jobs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

