-module(openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties() ::
  [ {'paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'excludedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties() ->
    openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties([]).

openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties(Fields) ->
  Default = [ {'paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'excludedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

