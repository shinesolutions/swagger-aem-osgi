-module(openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties() ::
    #{ 'cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled' := CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
        }) ->
    #{ 'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled' => CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
     }.
