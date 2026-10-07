-module(openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties() ::
  [ {'cq_dam_batch_metadata_asset_default', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_dam_batch_metadata_collection_default', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_dam_batch_metadata_maxresources', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties(Fields) ->
  Default = [ {'cq.dam.batch.metadata.asset.default', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.dam.batch.metadata.collection.default', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.dam.batch.metadata.maxresources', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

