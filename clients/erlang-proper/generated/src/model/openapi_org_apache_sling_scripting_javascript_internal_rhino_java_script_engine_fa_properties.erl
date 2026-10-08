-module(openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties/0]).

-export([openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties/1]).

-export_type([openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties/0]).

-type openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties() ::
  [ {'org_apache_sling_scripting_javascript_rhino_optLevel', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties() ->
    openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties([]).

openapi_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties(Fields) ->
  Default = [ {'org.apache.sling.scripting.javascript.rhino.optLevel', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

