-module(openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties/0]).

-export([openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties/1]).

-export_type([openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties/0]).

-type openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties() ::
  [ {'maxWidth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxHeight', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties() ->
    openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties([]).

openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties(Fields) ->
  Default = [ {'maxWidth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxHeight', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

