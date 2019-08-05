-module(openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties() ::
    #{ 'adapter_condition' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'taskmanager_admingroups' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'adapter_condition' := AdapterCondition,
          'taskmanager_admingroups' := TaskmanagerAdmingroups
        }) ->
    #{ 'adapter.condition' => AdapterCondition,
       'taskmanager.admingroups' => TaskmanagerAdmingroups
     }.
