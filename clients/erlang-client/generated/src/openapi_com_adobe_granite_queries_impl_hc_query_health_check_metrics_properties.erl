-module(openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties/0]).

-type openapi_com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties() ::
    #{ 'getPeriod' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'getPeriod' := GetPeriod
        }) ->
    #{ 'getPeriod' => GetPeriod
     }.
