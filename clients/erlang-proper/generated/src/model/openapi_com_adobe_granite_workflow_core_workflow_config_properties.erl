-module(openapi_com_adobe_granite_workflow_core_workflow_config_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_workflow_config_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_workflow_config_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_workflow_config_properties/0]).

-type openapi_com_adobe_granite_workflow_core_workflow_config_properties() ::
  [ {'cq_workflow_config_workflow_packages_root_path', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_workflow_config_workflow_process_legacy_mode', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_workflow_config_allow_locking', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_workflow_core_workflow_config_properties() ->
    openapi_com_adobe_granite_workflow_core_workflow_config_properties([]).

openapi_com_adobe_granite_workflow_core_workflow_config_properties(Fields) ->
  Default = [ {'cq.workflow.config.workflow.packages.root.path', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.workflow.config.workflow.process.legacy.mode', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.workflow.config.allow.locking', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

