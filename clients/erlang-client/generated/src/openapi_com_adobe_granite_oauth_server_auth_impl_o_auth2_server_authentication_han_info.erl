-module(openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info/0]).

-type openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties:openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties()
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
