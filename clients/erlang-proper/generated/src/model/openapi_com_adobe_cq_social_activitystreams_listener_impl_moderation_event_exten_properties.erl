-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties/0]).

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties() ::
  [ {'accepted', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ranked', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties() ->
    openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties([]).

openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties(Fields) ->
  Default = [ {'accepted', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ranked', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

