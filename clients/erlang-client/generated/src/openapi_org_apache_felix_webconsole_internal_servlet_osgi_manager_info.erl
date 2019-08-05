-module(openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info).

-export([encode/1]).

-export_type([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info/0]).

-type openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties:openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties()
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
