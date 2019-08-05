-module(openapi_org_apache_felix_systemready_system_ready_monitor_info).

-export([encode/1]).

-export_type([openapi_org_apache_felix_systemready_system_ready_monitor_info/0]).

-type openapi_org_apache_felix_systemready_system_ready_monitor_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_felix_systemready_system_ready_monitor_properties:openapi_org_apache_felix_systemready_system_ready_monitor_properties()
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
