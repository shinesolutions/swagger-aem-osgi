-module(openapi_config_node_property_drop_down).

-export([encode/1]).

-export_type([openapi_config_node_property_drop_down/0]).

-type openapi_config_node_property_drop_down() ::
    #{ 'name' => binary(),
       'optional' => boolean(),
       'is_set' => boolean(),
       'type' => openapi_config_node_property_drop_down_type:openapi_config_node_property_drop_down_type(),
       'value' => maps:map(),
       'description' => binary()
     }.

encode(#{ 'name' := Name,
          'optional' := Optional,
          'is_set' := IsSet,
          'type' := Type,
          'value' := Value,
          'description' := Description
        }) ->
    #{ 'name' => Name,
       'optional' => Optional,
       'is_set' => IsSet,
       'type' => Type,
       'value' => Value,
       'description' => Description
     }.
