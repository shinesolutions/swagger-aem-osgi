-module(openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties/0]).

-export([openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties/1]).

-export_type([openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties/0]).

-type openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties() ::
  [ {'disabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties() ->
    openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties([]).

openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties(Fields) ->
  Default = [ {'disabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

