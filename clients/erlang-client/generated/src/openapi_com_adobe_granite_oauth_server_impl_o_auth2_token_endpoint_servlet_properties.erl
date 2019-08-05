-module(openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties/0]).

-type openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties() ::
    #{ 'oauth_issuer' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_access_token_expires_in' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'osgi_http_whiteboard_servlet_pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'osgi_http_whiteboard_context_select' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'oauth_issuer' := OauthIssuer,
          'oauth_access_token_expires_in' := OauthAccessTokenExpiresIn,
          'osgi_http_whiteboard_servlet_pattern' := OsgiHttpWhiteboardServletPattern,
          'osgi_http_whiteboard_context_select' := OsgiHttpWhiteboardContextSelect
        }) ->
    #{ 'oauth.issuer' => OauthIssuer,
       'oauth.access.token.expires.in' => OauthAccessTokenExpiresIn,
       'osgi.http.whiteboard.servlet.pattern' => OsgiHttpWhiteboardServletPattern,
       'osgi.http.whiteboard.context.select' => OsgiHttpWhiteboardContextSelect
     }.
