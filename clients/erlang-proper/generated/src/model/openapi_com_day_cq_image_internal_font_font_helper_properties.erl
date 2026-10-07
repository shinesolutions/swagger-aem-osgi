-module(openapi_com_day_cq_image_internal_font_font_helper_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_image_internal_font_font_helper_properties/0]).

-export([openapi_com_day_cq_image_internal_font_font_helper_properties/1]).

-export_type([openapi_com_day_cq_image_internal_font_font_helper_properties/0]).

-type openapi_com_day_cq_image_internal_font_font_helper_properties() ::
  [ {'fontpath', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'oversamplingFactor', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_image_internal_font_font_helper_properties() ->
    openapi_com_day_cq_image_internal_font_font_helper_properties([]).

openapi_com_day_cq_image_internal_font_font_helper_properties(Fields) ->
  Default = [ {'fontpath', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'oversamplingFactor', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

