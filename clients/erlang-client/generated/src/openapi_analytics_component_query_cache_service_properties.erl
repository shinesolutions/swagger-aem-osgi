-module(openapi_analytics_component_query_cache_service_properties).

-export([encode/1]).

-export_type([openapi_analytics_component_query_cache_service_properties/0]).

-type openapi_analytics_component_query_cache_service_properties() ::
    #{ 'cq_analytics_component_query_cache_size' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_analytics_component_query_cache_size' := CqAnalyticsComponentQueryCacheSize
        }) ->
    #{ 'cq.analytics.component.query.cache.size' => CqAnalyticsComponentQueryCacheSize
     }.
