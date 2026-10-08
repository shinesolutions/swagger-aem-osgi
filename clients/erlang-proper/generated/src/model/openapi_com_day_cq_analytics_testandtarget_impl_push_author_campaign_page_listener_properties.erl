-module(openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties/0]).

-export([openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties() ::
  [ {'cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties() ->
    openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties([]).

openapi_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties(Fields) ->
  Default = [ {'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

