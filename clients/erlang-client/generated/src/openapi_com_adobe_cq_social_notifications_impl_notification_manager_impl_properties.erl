-module(openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties/0]).

-type openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties() ::
    #{ 'max_unread_notification_count' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'max_unread_notification_count' := MaxUnreadNotificationCount
        }) ->
    #{ 'max.unread.notification.count' => MaxUnreadNotificationCount
     }.
