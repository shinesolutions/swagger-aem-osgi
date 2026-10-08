-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties/0]).

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties() ::
  [ {'event_topics', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties() ->
    openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties([]).

openapi_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties(Fields) ->
  Default = [ {'event.topics', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

