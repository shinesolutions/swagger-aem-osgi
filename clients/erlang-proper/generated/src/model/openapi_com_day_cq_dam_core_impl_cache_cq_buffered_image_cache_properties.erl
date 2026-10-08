-module(openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties/0]).

-type openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties() ::
  [ {'cq_dam_image_cache_max_memory', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_image_cache_max_age', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_image_cache_max_dimension', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties() ->
    openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties([]).

openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties(Fields) ->
  Default = [ {'cq.dam.image.cache.max.memory', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.image.cache.max.age', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.image.cache.max.dimension', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

