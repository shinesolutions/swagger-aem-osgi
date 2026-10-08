-module(openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties/0]).

-export([openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties() ::
  [ {'cq_dam_scene7_damchangeeventlistener_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_dam_scene7_damchangeeventlistener_observed_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties() ->
    openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties([]).

openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties(Fields) ->
  Default = [ {'cq.dam.scene7.damchangeeventlistener.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.dam.scene7.damchangeeventlistener.observed.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

