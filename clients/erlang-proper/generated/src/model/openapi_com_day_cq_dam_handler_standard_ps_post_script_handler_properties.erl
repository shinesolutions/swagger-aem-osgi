-module(openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties/0]).

-export([openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties/1]).

-export_type([openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties/0]).

-type openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties() ::
  [ {'raster_annotation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties() ->
    openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties([]).

openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties(Fields) ->
  Default = [ {'raster.annotation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

