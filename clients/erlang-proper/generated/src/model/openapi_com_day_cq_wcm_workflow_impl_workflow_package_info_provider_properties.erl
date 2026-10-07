-module(openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties/0]).

-export([openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties/1]).

-export_type([openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties/0]).

-type openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties() ::
  [ {'workflowpackageinfoprovider_filter', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'workflowpackageinfoprovider_filter_rootpath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties() ->
    openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties([]).

openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties(Fields) ->
  Default = [ {'workflowpackageinfoprovider.filter', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'workflowpackageinfoprovider.filter.rootpath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

