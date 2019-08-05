-module(openapi_config_node_property_array).

-export([encode/1]).

-export_type([openapi_config_node_property_array/0]).

-type openapi_config_node_property_array() ::
    #{ 'name' => binary(),
       'optional' => boolean(),
       'is_set' => boolean(),
       'type' => integer(),
       'values' => list(),
       'description' => binary()
     }.

encode(#{ 'name' := Name,
          'optional' := Optional,
          'is_set' := IsSet,
          'type' := Type,
          'values' := Values,
          'description' := Description
        }) ->
    #{ 'name' => Name,
       'optional' => Optional,
       'is_set' => IsSet,
       'type' => Type,
       'values' => Values,
       'description' => Description
     }.
