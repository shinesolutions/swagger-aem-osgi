-module(openapi_org_apache_felix_systemready_impl_servlet_system_alive_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_systemready_impl_servlet_system_alive_servlet_properties/0]).

-type openapi_org_apache_felix_systemready_impl_servlet_system_alive_servlet_properties() ::
    #{ 'osgi_http_whiteboard_servlet_pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'osgi_http_whiteboard_context_select' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'osgi_http_whiteboard_servlet_pattern' := OsgiHttpWhiteboardServletPattern,
          'osgi_http_whiteboard_context_select' := OsgiHttpWhiteboardContextSelect
        }) ->
    #{ 'osgi.http.whiteboard.servlet.pattern' => OsgiHttpWhiteboardServletPattern,
       'osgi.http.whiteboard.context.select' => OsgiHttpWhiteboardContextSelect
     }.
