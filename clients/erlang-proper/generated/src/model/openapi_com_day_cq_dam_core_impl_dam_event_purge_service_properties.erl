-module(openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties/0]).

-type openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'maxSavedActivities', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'saveInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enableActivityPurge', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'eventTypes', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties() ->
    openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties([]).

openapi_com_day_cq_dam_core_impl_dam_event_purge_service_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'maxSavedActivities', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'saveInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enableActivityPurge', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'eventTypes', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

