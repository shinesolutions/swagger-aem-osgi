-module(openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties:openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties()
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
