-module(openapi_com_adobe_cq_commerce_impl_asset_video_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_commerce_impl_asset_video_handler_properties/0]).

-type openapi_com_adobe_cq_commerce_impl_asset_video_handler_properties() ::
    #{ 'cq_commerce_asset_handler_active' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_commerce_asset_handler_name' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_commerce_asset_handler_active' := CqCommerceAssetHandlerActive,
          'cq_commerce_asset_handler_name' := CqCommerceAssetHandlerName
        }) ->
    #{ 'cq.commerce.asset.handler.active' => CqCommerceAssetHandlerActive,
       'cq.commerce.asset.handler.name' => CqCommerceAssetHandlerName
     }.
