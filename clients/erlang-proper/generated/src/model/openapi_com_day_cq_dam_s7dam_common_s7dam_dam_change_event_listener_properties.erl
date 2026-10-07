-module(openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties/0]).

-export([openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties() ::
  [ {'cq_dam_s7dam_damchangeeventlistener_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties() ->
    openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties([]).

openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties(Fields) ->
  Default = [ {'cq.dam.s7dam.damchangeeventlistener.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

