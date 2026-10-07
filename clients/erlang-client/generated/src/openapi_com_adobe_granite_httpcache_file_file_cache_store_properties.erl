-module(openapi_com_adobe_granite_httpcache_file_file_cache_store_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_httpcache_file_file_cache_store_properties/0]).

-type openapi_com_adobe_granite_httpcache_file_file_cache_store_properties() ::
    #{ 'com_adobe_granite_httpcache_file_documentRoot' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_granite_httpcache_file_includeHost' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'com_adobe_granite_httpcache_file_documentRoot' := ComAdobeGraniteHttpcacheFileDocumentRoot,
          'com_adobe_granite_httpcache_file_includeHost' := ComAdobeGraniteHttpcacheFileIncludeHost
        }) ->
    #{ 'com.adobe.granite.httpcache.file.documentRoot' => ComAdobeGraniteHttpcacheFileDocumentRoot,
       'com.adobe.granite.httpcache.file.includeHost' => ComAdobeGraniteHttpcacheFileIncludeHost
     }.
