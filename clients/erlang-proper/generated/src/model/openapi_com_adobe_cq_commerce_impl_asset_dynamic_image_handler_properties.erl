-module(openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties/0]).

-export([openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties/1]).

-export_type([openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties/0]).

-type openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties() ::
  [ {'cq_commerce_asset_handler_active', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_commerce_asset_handler_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties() ->
    openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties([]).

openapi_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties(Fields) ->
  Default = [ {'cq.commerce.asset.handler.active', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.commerce.asset.handler.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

