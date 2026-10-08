-module(openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties/0]).

-export([openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties/1]).

-export_type([openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties/0]).

-type openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties() ::
  [ {'com_adobe_granite_httpcache_url_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties() ->
    openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties([]).

openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties(Fields) ->
  Default = [ {'com.adobe.granite.httpcache.url.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

