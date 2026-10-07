-module(openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties/0]).

-type openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties() ::
  [ {'mimetype', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties() ->
    openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties([]).

openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties(Fields) ->
  Default = [ {'mimetype', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

