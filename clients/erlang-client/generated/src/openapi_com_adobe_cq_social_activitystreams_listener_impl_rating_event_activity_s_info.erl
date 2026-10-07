-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_info/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties:openapi_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
