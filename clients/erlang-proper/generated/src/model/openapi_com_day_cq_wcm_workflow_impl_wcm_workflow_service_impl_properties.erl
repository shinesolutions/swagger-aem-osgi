-module(openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties/0]).

-export([openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties/0]).

-type openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties() ::
  [ {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'minThreadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxThreadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_wcm_workflow_terminate_on_activate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_wcm_worklfow_terminate_exclusion_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties() ->
    openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties([]).

openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties(Fields) ->
  Default = [ {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'minThreadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxThreadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.wcm.workflow.terminate.on.activate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.wcm.worklfow.terminate.exclusion.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

