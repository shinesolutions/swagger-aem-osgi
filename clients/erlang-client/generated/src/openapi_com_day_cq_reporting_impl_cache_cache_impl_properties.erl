-module(openapi_com_day_cq_reporting_impl_cache_cache_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_reporting_impl_cache_cache_impl_properties/0]).

-type openapi_com_day_cq_reporting_impl_cache_cache_impl_properties() ::
    #{ 'repcache_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'repcache_ttl' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'repcache_max' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'repcache_enable' := RepcacheEnable,
          'repcache_ttl' := RepcacheTtl,
          'repcache_max' := RepcacheMax
        }) ->
    #{ 'repcache.enable' => RepcacheEnable,
       'repcache.ttl' => RepcacheTtl,
       'repcache.max' => RepcacheMax
     }.
