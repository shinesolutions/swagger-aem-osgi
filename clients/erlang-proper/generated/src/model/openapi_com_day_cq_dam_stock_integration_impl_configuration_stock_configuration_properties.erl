-module(openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties/0]).

-export([openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties/1]).

-export_type([openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties/0]).

-type openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'locale', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'imsConfig', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties() ->
    openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties([]).

openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'locale', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'imsConfig', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

