-module(openapi_com_adobe_granite_httpcache_file_file_cache_store_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_httpcache_file_file_cache_store_info/0]).

-type openapi_com_adobe_granite_httpcache_file_file_cache_store_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_httpcache_file_file_cache_store_properties:openapi_com_adobe_granite_httpcache_file_file_cache_store_properties()
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
