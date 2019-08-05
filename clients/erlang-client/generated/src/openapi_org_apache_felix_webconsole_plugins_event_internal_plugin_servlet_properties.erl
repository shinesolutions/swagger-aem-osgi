-module(openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties/0]).

-type openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties() ::
    #{ 'max_size' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'max_size' := MaxSize
        }) ->
    #{ 'max.size' => MaxSize
     }.
