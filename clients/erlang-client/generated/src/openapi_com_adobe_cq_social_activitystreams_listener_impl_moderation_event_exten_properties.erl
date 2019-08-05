-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties() ::
    #{ 'accepted' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ranked' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'accepted' := Accepted,
          'ranked' := Ranked
        }) ->
    #{ 'accepted' => Accepted,
       'ranked' => Ranked
     }.
