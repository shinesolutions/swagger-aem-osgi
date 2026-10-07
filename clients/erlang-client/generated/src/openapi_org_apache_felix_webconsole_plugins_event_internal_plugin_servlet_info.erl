-module(openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_info).

-export([encode/1]).

-export_type([openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_info/0]).

-type openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties:openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties()
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
