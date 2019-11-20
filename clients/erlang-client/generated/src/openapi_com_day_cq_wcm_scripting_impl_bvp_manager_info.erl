-module(openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info/0]).

-type openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties:openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties()
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