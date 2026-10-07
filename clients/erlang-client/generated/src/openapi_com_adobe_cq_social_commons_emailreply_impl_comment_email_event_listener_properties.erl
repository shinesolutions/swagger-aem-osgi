-module(openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties() ::
    #{ 'event_topics' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'event_topics' := EventTopics
        }) ->
    #{ 'event.topics' => EventTopics
     }.
