-module(openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info/0]).

-type openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties:openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties()
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
