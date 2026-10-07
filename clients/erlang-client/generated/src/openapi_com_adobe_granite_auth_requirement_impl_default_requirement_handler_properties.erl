-module(openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties/0]).

-type openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties() ::
    #{ 'supportedPaths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'supportedPaths' := SupportedPaths
        }) ->
    #{ 'supportedPaths' => SupportedPaths
     }.
