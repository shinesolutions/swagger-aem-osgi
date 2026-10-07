-module(openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_info/0]).

-type openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties:openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties()
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
