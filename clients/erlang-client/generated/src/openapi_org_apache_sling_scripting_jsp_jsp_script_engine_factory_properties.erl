-module(openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties/0]).

-type openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties() ::
    #{ 'jasper_compilerTargetVM' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jasper_compilerSourceVM' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jasper_classdebuginfo' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'jasper_enablePooling' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'jasper_ieClassId' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jasper_genStringAsCharArray' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'jasper_keepgenerated' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'jasper_mappedfile' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'jasper_trimSpaces' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'jasper_displaySourceFragments' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'default_is_session' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'jasper_compilerTargetVM' := JasperCompilerTargetVM,
          'jasper_compilerSourceVM' := JasperCompilerSourceVM,
          'jasper_classdebuginfo' := JasperClassdebuginfo,
          'jasper_enablePooling' := JasperEnablePooling,
          'jasper_ieClassId' := JasperIeClassId,
          'jasper_genStringAsCharArray' := JasperGenStringAsCharArray,
          'jasper_keepgenerated' := JasperKeepgenerated,
          'jasper_mappedfile' := JasperMappedfile,
          'jasper_trimSpaces' := JasperTrimSpaces,
          'jasper_displaySourceFragments' := JasperDisplaySourceFragments,
          'default_is_session' := DefaultIsSession
        }) ->
    #{ 'jasper.compilerTargetVM' => JasperCompilerTargetVM,
       'jasper.compilerSourceVM' => JasperCompilerSourceVM,
       'jasper.classdebuginfo' => JasperClassdebuginfo,
       'jasper.enablePooling' => JasperEnablePooling,
       'jasper.ieClassId' => JasperIeClassId,
       'jasper.genStringAsCharArray' => JasperGenStringAsCharArray,
       'jasper.keepgenerated' => JasperKeepgenerated,
       'jasper.mappedfile' => JasperMappedfile,
       'jasper.trimSpaces' => JasperTrimSpaces,
       'jasper.displaySourceFragments' => JasperDisplaySourceFragments,
       'default.is.session' => DefaultIsSession
     }.
