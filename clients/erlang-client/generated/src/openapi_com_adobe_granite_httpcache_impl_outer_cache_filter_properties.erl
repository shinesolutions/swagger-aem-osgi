-module(openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties/0]).

-type openapi_com_adobe_granite_httpcache_impl_outer_cache_filter_properties() ::
    #{ 'com_adobe_granite_httpcache_url_paths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'com_adobe_granite_httpcache_url_paths' := ComAdobeGraniteHttpcacheUrlPaths
        }) ->
    #{ 'com.adobe.granite.httpcache.url.paths' => ComAdobeGraniteHttpcacheUrlPaths
     }.
