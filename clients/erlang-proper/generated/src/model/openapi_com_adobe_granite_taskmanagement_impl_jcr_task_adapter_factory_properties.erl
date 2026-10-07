-module(openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties/0]).

-export([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties() ::
  [ {'adapter_condition', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties() ->
    openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties([]).

openapi_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties(Fields) ->
  Default = [ {'adapter.condition', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

