-module(openapi_com_adobe_cq_social_notifications_impl_mentions_router_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_notifications_impl_mentions_router_info/0]).

-type openapi_com_adobe_cq_social_notifications_impl_mentions_router_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_notifications_impl_mentions_router_properties:openapi_com_adobe_cq_social_notifications_impl_mentions_router_properties()
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
