-module(openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties/0]).

-export([openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties/0]).

-type openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties() ::
  [ {'batch_commit_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties() ->
    openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties([]).

openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties(Fields) ->
  Default = [ {'batch.commit.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

