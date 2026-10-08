-module(openapi_config_node_property_drop_down_type).

-export([encode/1]).

-export_type([openapi_config_node_property_drop_down_type/0]).

-type openapi_config_node_property_drop_down_type() ::
    #{ 'labels' => openapi_any_type:openapi_any_type(),
       'values' => openapi_any_type:openapi_any_type()
     }.

encode(#{ 'labels' := Labels,
          'values' := Values
        }) ->
    #{ 'labels' => Labels,
       'values' => Values
     }.
