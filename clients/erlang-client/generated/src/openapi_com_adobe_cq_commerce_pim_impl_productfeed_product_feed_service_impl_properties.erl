-module(openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties/0]).

-type openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties() ::
    #{ 'Feed_generator_algorithm' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'Feed_generator_algorithm' := FeedGeneratorAlgorithm
        }) ->
    #{ 'Feed generator algorithm' => FeedGeneratorAlgorithm
     }.
