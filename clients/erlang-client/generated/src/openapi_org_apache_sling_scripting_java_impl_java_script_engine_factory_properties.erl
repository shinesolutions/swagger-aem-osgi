-module(openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties/0]).

-type openapi_org_apache_sling_scripting_java_impl_java_script_engine_factory_properties() ::
    #{ 'java_classdebuginfo' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'java_javaEncoding' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'java_compilerSourceVM' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'java_compilerTargetVM' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'java_classdebuginfo' := JavaClassdebuginfo,
          'java_javaEncoding' := JavaJavaEncoding,
          'java_compilerSourceVM' := JavaCompilerSourceVM,
          'java_compilerTargetVM' := JavaCompilerTargetVM
        }) ->
    #{ 'java.classdebuginfo' => JavaClassdebuginfo,
       'java.javaEncoding' => JavaJavaEncoding,
       'java.compilerSourceVM' => JavaCompilerSourceVM,
       'java.compilerTargetVM' => JavaCompilerTargetVM
     }.
