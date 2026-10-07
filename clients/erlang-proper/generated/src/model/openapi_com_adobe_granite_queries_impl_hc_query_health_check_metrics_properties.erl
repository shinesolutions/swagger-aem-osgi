-module(openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties/0]).

-export([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties/0]).

-type openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties() ::
  [ {'getPeriod', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties() ->
    openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties([]).

openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties(Fields) ->
  Default = [ {'getPeriod', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

