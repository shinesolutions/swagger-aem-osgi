-module(openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties/0]).

-type openapi_com_adobe_cq_social_scoring_impl_scoring_event_listener_properties() ::
    #{ 'event_topics' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'event_topics' := EventTopics,
          'event_filter' := EventFilter
        }) ->
    #{ 'event.topics' => EventTopics,
       'event.filter' => EventFilter
     }.
