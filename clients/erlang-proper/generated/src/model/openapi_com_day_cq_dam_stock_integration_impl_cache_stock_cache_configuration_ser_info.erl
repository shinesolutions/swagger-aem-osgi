-module(openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info/0]).

-export([openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info/1]).

-export_type([openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info/0]).

-type openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties:openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties() }
  ].


openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info() ->
    openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info([]).

openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties:openapi_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

