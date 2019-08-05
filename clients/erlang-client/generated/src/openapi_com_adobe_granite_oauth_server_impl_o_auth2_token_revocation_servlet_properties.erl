-module(openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties/0]).

-type openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties() ::
    #{ 'oauth_token_revocation_active' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'oauth_token_revocation_active' := OauthTokenRevocationActive
        }) ->
    #{ 'oauth.token.revocation.active' => OauthTokenRevocationActive
     }.
