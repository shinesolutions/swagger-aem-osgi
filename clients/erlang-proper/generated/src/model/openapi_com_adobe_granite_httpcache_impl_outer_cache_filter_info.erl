-module(openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info/0]).

-export([openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info/1]).

-export_type([openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info/0]).

-type openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties:openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties() }
  ].


openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info() ->
    openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info([]).

openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties:openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

