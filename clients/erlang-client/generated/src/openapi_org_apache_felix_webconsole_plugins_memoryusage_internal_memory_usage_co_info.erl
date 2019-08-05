-module(openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_info).

-export([encode/1]).

-export_type([openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_info/0]).

-type openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties:openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties()
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
