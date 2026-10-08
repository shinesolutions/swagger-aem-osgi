-module(openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties() ::
  [ {'xmp_propagate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'xmp_excludes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties() ->
    openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties([]).

openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties(Fields) ->
  Default = [ {'xmp.propagate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'xmp.excludes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

