-module(openapi_com_adobe_granite_httpcache_file_file_cache_store_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_httpcache_file_file_cache_store_properties/0]).

-export([openapi_com_adobe_granite_httpcache_file_file_cache_store_properties/1]).

-export_type([openapi_com_adobe_granite_httpcache_file_file_cache_store_properties/0]).

-type openapi_com_adobe_granite_httpcache_file_file_cache_store_properties() ::
  [ {'com_adobe_granite_httpcache_file_documentRoot', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_granite_httpcache_file_includeHost', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_httpcache_file_file_cache_store_properties() ->
    openapi_com_adobe_granite_httpcache_file_file_cache_store_properties([]).

openapi_com_adobe_granite_httpcache_file_file_cache_store_properties(Fields) ->
  Default = [ {'com.adobe.granite.httpcache.file.documentRoot', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.granite.httpcache.file.includeHost', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

