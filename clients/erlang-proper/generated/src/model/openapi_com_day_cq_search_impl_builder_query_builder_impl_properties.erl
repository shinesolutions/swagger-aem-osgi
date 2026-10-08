-module(openapi_com_day_cq_search_impl_builder_query_builder_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_search_impl_builder_query_builder_impl_properties/0]).

-export([openapi_com_day_cq_search_impl_builder_query_builder_impl_properties/1]).

-export_type([openapi_com_day_cq_search_impl_builder_query_builder_impl_properties/0]).

-type openapi_com_day_cq_search_impl_builder_query_builder_impl_properties() ::
  [ {'excerpt_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cache_max_entries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cache_entry_lifetime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'xpath_union', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_search_impl_builder_query_builder_impl_properties() ->
    openapi_com_day_cq_search_impl_builder_query_builder_impl_properties([]).

openapi_com_day_cq_search_impl_builder_query_builder_impl_properties(Fields) ->
  Default = [ {'excerpt.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cache.max.entries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cache.entry.lifetime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'xpath.union', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

