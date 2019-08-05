-module(openapi_com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'path' := Path
        }) ->
    #{ 'path' => Path
     }.
