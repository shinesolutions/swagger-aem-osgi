-module(openapi_com_day_cq_reporting_impl_cache_cache_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_reporting_impl_cache_cache_impl_properties/0]).

-export([openapi_com_day_cq_reporting_impl_cache_cache_impl_properties/1]).

-export_type([openapi_com_day_cq_reporting_impl_cache_cache_impl_properties/0]).

-type openapi_com_day_cq_reporting_impl_cache_cache_impl_properties() ::
  [ {'repcache_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'repcache_ttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'repcache_max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_reporting_impl_cache_cache_impl_properties() ->
    openapi_com_day_cq_reporting_impl_cache_cache_impl_properties([]).

openapi_com_day_cq_reporting_impl_cache_cache_impl_properties(Fields) ->
  Default = [ {'repcache.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'repcache.ttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'repcache.max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

