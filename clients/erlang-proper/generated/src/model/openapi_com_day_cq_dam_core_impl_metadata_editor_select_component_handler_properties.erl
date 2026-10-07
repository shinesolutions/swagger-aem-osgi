-module(openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties/0]).

-type openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties() ::
  [ {'granite_data', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties() ->
    openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties([]).

openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties(Fields) ->
  Default = [ {'granite:data', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

