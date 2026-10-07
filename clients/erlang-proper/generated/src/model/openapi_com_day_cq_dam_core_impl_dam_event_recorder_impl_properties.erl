-module(openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties() ::
  [ {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'event_queue_length', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'eventrecorder_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'eventrecorder_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'eventrecorder_eventtypes', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties() ->
    openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties([]).

openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties(Fields) ->
  Default = [ {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'event.queue.length', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'eventrecorder.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'eventrecorder.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'eventrecorder.eventtypes', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

