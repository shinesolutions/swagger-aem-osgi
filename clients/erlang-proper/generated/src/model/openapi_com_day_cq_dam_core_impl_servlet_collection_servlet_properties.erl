-module(openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties() ::
  [ {'cq_dam_batch_collection_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_dam_batch_collection_maxcollections', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties(Fields) ->
  Default = [ {'cq.dam.batch.collection.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.dam.batch.collection.maxcollections', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

