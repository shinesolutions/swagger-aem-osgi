-module(openapi_com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener_properties() ::
    #{ 'cq_analytics_testandtarget_deleteauthoractivitylistener_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_analytics_testandtarget_deleteauthoractivitylistener_enabled' := CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled
        }) ->
    #{ 'cq.analytics.testandtarget.deleteauthoractivitylistener.enabled' => CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled
     }.
