-module(openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_info/0]).

-type openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties:openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties()
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
