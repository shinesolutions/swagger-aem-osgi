-module(openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties/0]).

-type openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties() ::
    #{ 'cq_commerce_promotion_root' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_commerce_promotion_root' := CqCommercePromotionRoot
        }) ->
    #{ 'cq.commerce.promotion.root' => CqCommercePromotionRoot
     }.
