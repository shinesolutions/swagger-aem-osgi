-module(openapi_com_day_cq_dam_core_impl_asset_move_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_asset_move_listener_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_asset_move_listener_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_asset_move_listener_properties/0]).

-type openapi_com_day_cq_dam_core_impl_asset_move_listener_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_asset_move_listener_properties() ->
    openapi_com_day_cq_dam_core_impl_asset_move_listener_properties([]).

openapi_com_day_cq_dam_core_impl_asset_move_listener_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

