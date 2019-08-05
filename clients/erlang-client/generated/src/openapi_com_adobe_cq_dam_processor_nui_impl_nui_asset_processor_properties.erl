-module(openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties/0]).

-type openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties() ::
    #{ 'nuiEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'nuiServiceUrl' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'nuiApiKey' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'nuiEnabled' := NuiEnabled,
          'nuiServiceUrl' := NuiServiceUrl,
          'nuiApiKey' := NuiApiKey
        }) ->
    #{ 'nuiEnabled' => NuiEnabled,
       'nuiServiceUrl' => NuiServiceUrl,
       'nuiApiKey' => NuiApiKey
     }.
