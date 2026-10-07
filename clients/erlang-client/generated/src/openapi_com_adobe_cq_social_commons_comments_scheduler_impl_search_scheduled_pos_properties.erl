-module(openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties() ::
    #{ 'enableScheduledPostsSearch' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'numberOfMinutes' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxSearchLimit' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'enableScheduledPostsSearch' := EnableScheduledPostsSearch,
          'numberOfMinutes' := NumberOfMinutes,
          'maxSearchLimit' := MaxSearchLimit
        }) ->
    #{ 'enableScheduledPostsSearch' => EnableScheduledPostsSearch,
       'numberOfMinutes' => NumberOfMinutes,
       'maxSearchLimit' => MaxSearchLimit
     }.
