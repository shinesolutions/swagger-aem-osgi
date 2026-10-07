-module(openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties:openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties()
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
