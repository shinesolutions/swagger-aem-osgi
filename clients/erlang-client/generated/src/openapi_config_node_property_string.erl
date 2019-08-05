-module(openapi_config_node_property_string).

-export([encode/1]).

-export_type([openapi_config_node_property_string/0]).

-type openapi_config_node_property_string() ::
    #{ 'name' => binary(),
       'optional' => boolean(),
       'is_set' => boolean(),
       'type' => integer(),
       'value' => binary(),
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
