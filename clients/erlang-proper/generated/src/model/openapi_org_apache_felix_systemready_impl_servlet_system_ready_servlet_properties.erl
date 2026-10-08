-module(openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties/0]).

-export([openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties/1]).

-export_type([openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties/0]).

-type openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties() ::
  [ {'osgi_http_whiteboard_servlet_pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'osgi_http_whiteboard_context_select', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties() ->
    openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties([]).

openapi_org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties(Fields) ->
  Default = [ {'osgi.http.whiteboard.servlet.pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'osgi.http.whiteboard.context.select', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

