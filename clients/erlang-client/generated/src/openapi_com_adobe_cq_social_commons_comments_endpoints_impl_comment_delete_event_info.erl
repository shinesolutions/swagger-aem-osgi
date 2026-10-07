-module(openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_info/0]).

-type openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties:openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties()
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
