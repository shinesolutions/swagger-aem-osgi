-module(openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties/0]).

-export([openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties/1]).

-export_type([openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties/0]).

-type openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties() ::
  [ {'java_classdebuginfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'java_javaEncoding', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'java_compilerSourceVM', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'java_compilerTargetVM', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties() ->
    openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties([]).

openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties(Fields) ->
  Default = [ {'java.classdebuginfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'java.javaEncoding', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'java.compilerSourceVM', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'java.compilerTargetVM', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

