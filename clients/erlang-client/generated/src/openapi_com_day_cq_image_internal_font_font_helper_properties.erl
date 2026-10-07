-module(openapi_com_day_cq_image_internal_font_font_helper_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_image_internal_font_font_helper_properties/0]).

-type openapi_com_day_cq_image_internal_font_font_helper_properties() ::
    #{ 'fontpath' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'oversamplingFactor' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'fontpath' := Fontpath,
          'oversamplingFactor' := OversamplingFactor
        }) ->
    #{ 'fontpath' => Fontpath,
       'oversamplingFactor' => OversamplingFactor
     }.
