-module(openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_info/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties:openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties()
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
