-module(openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties/0]).

-export([openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties/0]).

-type openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties() ::
  [ {'oauth_issuer', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_access_token_expires_in', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'osgi_http_whiteboard_servlet_pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'osgi_http_whiteboard_context_select', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties() ->
    openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties([]).

openapi_com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties(Fields) ->
  Default = [ {'oauth.issuer', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.access.token.expires.in', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'osgi.http.whiteboard.servlet.pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'osgi.http.whiteboard.context.select', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

