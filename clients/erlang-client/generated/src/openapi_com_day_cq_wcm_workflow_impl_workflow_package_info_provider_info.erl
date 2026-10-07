-module(openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_info/0]).

-type openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties:openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties()
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
