-module(openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties() ::
  [ {'dam_showexpired', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'dam_showhidden', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'tagTitleSearch', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'guessTotal', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dam_expiryProperty', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties() ->
    openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties([]).

openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties(Fields) ->
  Default = [ {'dam.showexpired', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'dam.showhidden', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'tagTitleSearch', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'guessTotal', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dam.expiryProperty', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

