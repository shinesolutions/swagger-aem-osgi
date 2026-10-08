-module(openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info/0]).

-export([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info/0]).

-type openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties:openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties() }
  ].


openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info() ->
    openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info([]).

openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties:openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

