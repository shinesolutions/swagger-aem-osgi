-module(openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties/0]).

-export([openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties/0]).

-type openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties() ->
    openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties([]).

openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

