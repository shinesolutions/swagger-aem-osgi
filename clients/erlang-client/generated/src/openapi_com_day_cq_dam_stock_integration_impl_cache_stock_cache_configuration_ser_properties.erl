-module(openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties/0]).

-type openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties() ::
    #{ 'getCacheExpirationUnit' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'getCacheExpirationValue' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'getCacheExpirationUnit' := GetCacheExpirationUnit,
          'getCacheExpirationValue' := GetCacheExpirationValue
        }) ->
    #{ 'getCacheExpirationUnit' => GetCacheExpirationUnit,
       'getCacheExpirationValue' => GetCacheExpirationValue
     }.
