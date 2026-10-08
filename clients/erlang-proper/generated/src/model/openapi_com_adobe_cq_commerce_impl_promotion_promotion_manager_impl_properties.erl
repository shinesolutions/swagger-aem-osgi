-module(openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties/0]).

-export([openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties/1]).

-export_type([openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties/0]).

-type openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties() ::
  [ {'cq_commerce_promotion_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties() ->
    openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties([]).

openapi_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties(Fields) ->
  Default = [ {'cq.commerce.promotion.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

