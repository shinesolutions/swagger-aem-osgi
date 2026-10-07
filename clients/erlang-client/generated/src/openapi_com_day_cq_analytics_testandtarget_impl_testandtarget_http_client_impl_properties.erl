-module(openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties() ::
    #{ 'cq_analytics_testandtarget_api_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_analytics_testandtarget_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_analytics_testandtarget_sockettimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_analytics_testandtarget_recommendations_url_replace' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_analytics_testandtarget_recommendations_url_replacewith' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_analytics_testandtarget_api_url' := CqAnalyticsTestandtargetApiUrl,
          'cq_analytics_testandtarget_timeout' := CqAnalyticsTestandtargetTimeout,
          'cq_analytics_testandtarget_sockettimeout' := CqAnalyticsTestandtargetSockettimeout,
          'cq_analytics_testandtarget_recommendations_url_replace' := CqAnalyticsTestandtargetRecommendationsUrlReplace,
          'cq_analytics_testandtarget_recommendations_url_replacewith' := CqAnalyticsTestandtargetRecommendationsUrlReplacewith
        }) ->
    #{ 'cq.analytics.testandtarget.api.url' => CqAnalyticsTestandtargetApiUrl,
       'cq.analytics.testandtarget.timeout' => CqAnalyticsTestandtargetTimeout,
       'cq.analytics.testandtarget.sockettimeout' => CqAnalyticsTestandtargetSockettimeout,
       'cq.analytics.testandtarget.recommendations.url.replace' => CqAnalyticsTestandtargetRecommendationsUrlReplace,
       'cq.analytics.testandtarget.recommendations.url.replacewith' => CqAnalyticsTestandtargetRecommendationsUrlReplacewith
     }.
