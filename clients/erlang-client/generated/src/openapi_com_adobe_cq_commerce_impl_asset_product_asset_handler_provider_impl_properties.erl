-module(openapi_com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl_properties/0]).

-type openapi_com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl_properties() ::
    #{ 'cq_commerce_asset_handler_fallback' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_commerce_asset_handler_fallback' := CqCommerceAssetHandlerFallback
        }) ->
    #{ 'cq.commerce.asset.handler.fallback' => CqCommerceAssetHandlerFallback
     }.
