-module(openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties/0]).

-export([openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties/1]).

-export_type([openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties/0]).

-type openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties() ::
  [ {'jasper_compilerTargetVM', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jasper_compilerSourceVM', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jasper_classdebuginfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'jasper_enablePooling', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'jasper_ieClassId', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jasper_genStringAsCharArray', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'jasper_keepgenerated', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'jasper_mappedfile', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'jasper_trimSpaces', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'jasper_displaySourceFragments', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'default_is_session', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties() ->
    openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties([]).

openapi_org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties(Fields) ->
  Default = [ {'jasper.compilerTargetVM', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jasper.compilerSourceVM', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jasper.classdebuginfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'jasper.enablePooling', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'jasper.ieClassId', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jasper.genStringAsCharArray', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'jasper.keepgenerated', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'jasper.mappedfile', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'jasper.trimSpaces', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'jasper.displaySourceFragments', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'default.is.session', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

