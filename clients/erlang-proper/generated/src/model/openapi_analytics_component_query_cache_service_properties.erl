-module(openapi_analytics_component_query_cache_service_properties).

-include("openapi.hrl").

-export([openapi_analytics_component_query_cache_service_properties/0]).

-export([openapi_analytics_component_query_cache_service_properties/1]).

-export_type([openapi_analytics_component_query_cache_service_properties/0]).

-type openapi_analytics_component_query_cache_service_properties() ::
  [ {'cq_analytics_component_query_cache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_analytics_component_query_cache_service_properties() ->
    openapi_analytics_component_query_cache_service_properties([]).

openapi_analytics_component_query_cache_service_properties(Fields) ->
  Default = [ {'cq.analytics.component.query.cache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

