-module(openapi_com_day_cq_notification_impl_notification_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_notification_impl_notification_service_impl_properties/0]).

-type openapi_com_day_cq_notification_impl_notification_service_impl_properties() ::
    #{ 'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'event_filter' := EventFilter
        }) ->
    #{ 'event.filter' => EventFilter
     }.
