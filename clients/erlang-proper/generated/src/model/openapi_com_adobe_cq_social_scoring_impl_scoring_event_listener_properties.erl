-module(openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties/0]).

-export([openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties/1]).

-export_type([openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties/0]).

-type openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties() ::
  [ {'event_topics', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties() ->
    openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties([]).

openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties(Fields) ->
  Default = [ {'event.topics', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

