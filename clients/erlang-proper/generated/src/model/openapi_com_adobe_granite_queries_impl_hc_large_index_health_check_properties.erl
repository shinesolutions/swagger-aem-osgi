-module(openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties/0]).

-export([openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties/0]).

-type openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties() ::
  [ {'large_index_critical_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'large_index_warn_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties() ->
    openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties([]).

openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties(Fields) ->
  Default = [ {'large.index.critical.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'large.index.warn.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

