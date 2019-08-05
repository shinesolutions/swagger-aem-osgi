-module(openapi_messaging_user_component_factory_properties).

-export([encode/1]).

-export_type([openapi_messaging_user_component_factory_properties/0]).

-type openapi_messaging_user_component_factory_properties() ::
    #{ 'priority' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'priority' := Priority
        }) ->
    #{ 'priority' => Priority
     }.
