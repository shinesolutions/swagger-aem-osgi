-module(openapi_config_node_property_boolean).

-export([encode/1]).

-export_type([openapi_config_node_property_boolean/0]).

-type openapi_config_node_property_boolean() ::
    #{ 'name' => binary(),
       'optional' => boolean(),
       'is_set' => boolean(),
       'type' => integer(),
       'value' => boolean(),
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
