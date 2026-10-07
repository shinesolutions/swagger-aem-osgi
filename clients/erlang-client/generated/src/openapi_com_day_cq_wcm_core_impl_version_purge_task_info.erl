-module(openapi_com_day_cq_wcm_core_impl_version_purge_task_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_version_purge_task_info/0]).

-type openapi_com_day_cq_wcm_core_impl_version_purge_task_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_core_impl_version_purge_task_properties:openapi_com_day_cq_wcm_core_impl_version_purge_task_properties()
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
