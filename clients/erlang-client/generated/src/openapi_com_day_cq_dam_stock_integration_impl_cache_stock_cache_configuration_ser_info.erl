-module(openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info/0]).

-type openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties:openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties()
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
