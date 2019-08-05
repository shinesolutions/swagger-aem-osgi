-module(openapi_com_adobe_granite_compatrouter_impl_routing_config_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_compatrouter_impl_routing_config_properties/0]).

-type openapi_com_adobe_granite_compatrouter_impl_routing_config_properties() ::
    #{ 'id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'compatPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'newPath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'id' := Id,
          'compatPath' := CompatPath,
          'newPath' := NewPath
        }) ->
    #{ 'id' => Id,
       'compatPath' => CompatPath,
       'newPath' => NewPath
     }.
