-module(openapi_config_node_property_drop_down_type).

-export([encode/1]).

-export_type([openapi_config_node_property_drop_down_type/0]).

-type openapi_config_node_property_drop_down_type() ::
    #{ 'labels' => maps:map(),
       'values' => maps:map()
     }.

encode(#{ 'labels' := Labels,
          'values' := Values
        }) ->
    #{ 'labels' => Labels,
       'values' => Values
     }.
