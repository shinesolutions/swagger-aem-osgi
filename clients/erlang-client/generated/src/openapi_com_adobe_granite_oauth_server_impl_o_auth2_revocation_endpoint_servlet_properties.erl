-module(openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties/0]).

-type openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties() ::
    #{ 'sling_servlet_paths' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_revocation_active' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'sling_servlet_paths' := SlingServletPaths,
          'oauth_revocation_active' := OauthRevocationActive
        }) ->
    #{ 'sling.servlet.paths' => SlingServletPaths,
       'oauth.revocation.active' => OauthRevocationActive
     }.
