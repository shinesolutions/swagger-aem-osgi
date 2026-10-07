-module(openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties() ::
    #{ 'cq_dam_detect_asset_mime_from_content' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_dam_detect_asset_mime_from_content' := CqDamDetectAssetMimeFromContent
        }) ->
    #{ 'cq.dam.detect.asset.mime.from.content' => CqDamDetectAssetMimeFromContent
     }.
