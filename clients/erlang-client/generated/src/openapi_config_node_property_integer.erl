-module(openapi_config_node_property_integer).

-export([encode/1]).

-export_type([openapi_config_node_property_integer/0]).

-type openapi_config_node_property_integer() ::
    #{ 'name' => binary(),
       'optional' => boolean(),
       'is_set' => boolean(),
       'type' => integer(),
       'value' => integer(),
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
