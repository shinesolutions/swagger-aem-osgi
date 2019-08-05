-module(openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_info/0]).

-type openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties:openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties()
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
