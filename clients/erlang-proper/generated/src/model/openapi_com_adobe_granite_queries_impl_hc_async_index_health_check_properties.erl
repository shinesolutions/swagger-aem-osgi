-module(openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties/0]).

-export([openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties/0]).

-type openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties() ::
  [ {'indexing_critical_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'indexing_warn_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties() ->
    openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties([]).

openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties(Fields) ->
  Default = [ {'indexing.critical.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'indexing.warn.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

