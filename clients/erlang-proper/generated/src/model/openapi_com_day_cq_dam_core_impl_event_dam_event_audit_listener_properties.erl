-module(openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties/0]).

-type openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties() ::
  [ {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties() ->
    openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties([]).

openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties(Fields) ->
  Default = [ {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

