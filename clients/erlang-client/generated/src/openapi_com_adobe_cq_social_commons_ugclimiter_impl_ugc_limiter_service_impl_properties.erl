-module(openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties/0]).

-type openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties() ::
    #{ 'event_topics' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'verbs' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'event_topics' := EventTopics,
          'event_filter' := EventFilter,
          'verbs' := Verbs
        }) ->
    #{ 'event.topics' => EventTopics,
       'event.filter' => EventFilter,
       'verbs' => Verbs
     }.
