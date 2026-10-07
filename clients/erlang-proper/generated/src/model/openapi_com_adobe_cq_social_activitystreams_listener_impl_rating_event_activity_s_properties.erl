-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties/0]).

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties() ::
  [ {'ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties() ->
    openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties([]).

openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties(Fields) ->
  Default = [ {'ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

