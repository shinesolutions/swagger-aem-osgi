-module(openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties/0]).

-export([openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties() ::
  [ {'adapter_condition', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'taskmanager_admingroups', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties() ->
    openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties([]).

openapi_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties(Fields) ->
  Default = [ {'adapter.condition', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'taskmanager.admingroups', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

