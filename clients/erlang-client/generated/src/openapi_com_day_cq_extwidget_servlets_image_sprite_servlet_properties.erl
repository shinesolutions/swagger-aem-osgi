-module(openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties/0]).

-type openapi_com_day_cq_extwidget_servlets_image_sprite_servlet_properties() ::
    #{ 'maxWidth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxHeight' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'maxWidth' := MaxWidth,
          'maxHeight' := MaxHeight
        }) ->
    #{ 'maxWidth' => MaxWidth,
       'maxHeight' => MaxHeight
     }.
