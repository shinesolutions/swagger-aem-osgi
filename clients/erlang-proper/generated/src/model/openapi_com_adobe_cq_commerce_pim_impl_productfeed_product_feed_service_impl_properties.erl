-module(openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties/0]).

-export([openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties/0]).

-type openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties() ::
  [ {'Feed_generator_algorithm', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties() ->
    openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties([]).

openapi_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties(Fields) ->
  Default = [ {'Feed generator algorithm', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

