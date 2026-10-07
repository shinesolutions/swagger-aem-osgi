-module(openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties/0]).

-export([openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties/1]).

-export_type([openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties/0]).

-type openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'Duration_for_Temporary_Storage', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'Duration_for_Anonymous_Storage', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties() ->
    openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties([]).

openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'Duration for Temporary Storage', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'Duration for Anonymous Storage', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

