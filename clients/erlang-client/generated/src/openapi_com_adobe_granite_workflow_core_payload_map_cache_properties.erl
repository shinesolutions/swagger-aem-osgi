-module(openapi_com_adobe_granite_workflow_core_payload_map_cache_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_payload_map_cache_properties/0]).

-type openapi_com_adobe_granite_workflow_core_payload_map_cache_properties() ::
    #{ 'getSystemWorkflowModels' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'getPackageRootPath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'getSystemWorkflowModels' := GetSystemWorkflowModels,
          'getPackageRootPath' := GetPackageRootPath
        }) ->
    #{ 'getSystemWorkflowModels' => GetSystemWorkflowModels,
       'getPackageRootPath' => GetPackageRootPath
     }.
