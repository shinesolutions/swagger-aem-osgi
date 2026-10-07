-module(openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info/0]).

-type openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties:openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties()
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
