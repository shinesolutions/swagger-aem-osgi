-module(openapi_analytics_component_query_cache_service_info).

-export([encode/1]).

-export_type([openapi_analytics_component_query_cache_service_info/0]).

-type openapi_analytics_component_query_cache_service_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_analytics_component_query_cache_service_properties:openapi_analytics_component_query_cache_service_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
