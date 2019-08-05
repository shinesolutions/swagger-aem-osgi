-module(openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties() ::
    #{ 'cq_dam_scene7_assetmimetypeservice_mapping' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_dam_scene7_assetmimetypeservice_mapping' := CqDamScene7AssetmimetypeserviceMapping
        }) ->
    #{ 'cq.dam.scene7.assetmimetypeservice.mapping' => CqDamScene7AssetmimetypeserviceMapping
     }.
