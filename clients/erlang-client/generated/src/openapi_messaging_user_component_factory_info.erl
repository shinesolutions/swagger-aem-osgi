-module(openapi_messaging_user_component_factory_info).

-export([encode/1]).

-export_type([openapi_messaging_user_component_factory_info/0]).

-type openapi_messaging_user_component_factory_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_messaging_user_component_factory_properties:openapi_messaging_user_component_factory_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
