-module(openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties/0]).

-type openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties() ::
    #{ 'org_apache_sling_scripting_javascript_rhino_optLevel' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'org_apache_sling_scripting_javascript_rhino_optLevel' := OrgApacheSlingScriptingJavascriptRhinoOptLevel
        }) ->
    #{ 'org.apache.sling.scripting.javascript.rhino.optLevel' => OrgApacheSlingScriptingJavascriptRhinoOptLevel
     }.
