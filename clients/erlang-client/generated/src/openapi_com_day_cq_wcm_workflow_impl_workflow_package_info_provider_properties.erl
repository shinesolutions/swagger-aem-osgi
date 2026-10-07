-module(openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties/0]).

-type openapi_com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties() ::
    #{ 'workflowpackageinfoprovider_filter' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'workflowpackageinfoprovider_filter_rootpath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'workflowpackageinfoprovider_filter' := WorkflowpackageinfoproviderFilter,
          'workflowpackageinfoprovider_filter_rootpath' := WorkflowpackageinfoproviderFilterRootpath
        }) ->
    #{ 'workflowpackageinfoprovider.filter' => WorkflowpackageinfoproviderFilter,
       'workflowpackageinfoprovider.filter.rootpath' => WorkflowpackageinfoproviderFilterRootpath
     }.
