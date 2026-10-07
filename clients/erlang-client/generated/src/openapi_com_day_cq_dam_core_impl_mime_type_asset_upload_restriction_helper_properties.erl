-module(openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties/0]).

-type openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties() ::
    #{ 'cq_dam_allow_all_mime' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_dam_allowed_asset_mimes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_dam_allow_all_mime' := CqDamAllowAllMime,
          'cq_dam_allowed_asset_mimes' := CqDamAllowedAssetMimes
        }) ->
    #{ 'cq.dam.allow.all.mime' => CqDamAllowAllMime,
       'cq.dam.allowed.asset.mimes' => CqDamAllowedAssetMimes
     }.
