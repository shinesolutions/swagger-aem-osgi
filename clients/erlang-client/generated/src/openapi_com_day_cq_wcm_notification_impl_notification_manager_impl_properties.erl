-module(openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties() ::
    #{ 'event_topics' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'event_topics' := EventTopics
        }) ->
    #{ 'event.topics' => EventTopics
     }.
