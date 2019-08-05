-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties() ::
    #{ 'ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'ranking' := Ranking,
          'enable' := Enable
        }) ->
    #{ 'ranking' => Ranking,
       'enable' => Enable
     }.
