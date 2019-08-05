-module(openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties/0]).

-type openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties() ::
    #{ 'cache_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cache_rootPaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cache_maxSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_maxEntries' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cache_enable' := CacheEnable,
          'cache_rootPaths' := CacheRootPaths,
          'cache_maxSize' := CacheMaxSize,
          'cache_maxEntries' := CacheMaxEntries
        }) ->
    #{ 'cache.enable' => CacheEnable,
       'cache.rootPaths' => CacheRootPaths,
       'cache.maxSize' => CacheMaxSize,
       'cache.maxEntries' => CacheMaxEntries
     }.
