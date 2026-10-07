-module(openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties() ::
    #{ 'adapter_condition' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'adapter_condition' := AdapterCondition
        }) ->
    #{ 'adapter.condition' => AdapterCondition
     }.
