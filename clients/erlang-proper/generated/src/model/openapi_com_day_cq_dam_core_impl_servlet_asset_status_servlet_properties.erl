-module(openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties() ::
  [ {'cq_dam_batch_status_maxassets', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties(Fields) ->
  Default = [ {'cq.dam.batch.status.maxassets', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

