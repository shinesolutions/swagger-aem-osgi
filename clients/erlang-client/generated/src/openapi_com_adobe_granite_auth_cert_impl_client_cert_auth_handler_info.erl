-module(openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_info/0]).

-type openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties:openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties()
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
