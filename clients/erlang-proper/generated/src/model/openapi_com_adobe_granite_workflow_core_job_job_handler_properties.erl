-module(openapi_com_adobe_granite_workflow_core_job_job_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_job_job_handler_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_job_job_handler_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_job_job_handler_properties/0]).

-type openapi_com_adobe_granite_workflow_core_job_job_handler_properties() ::
  [ {'job_topics', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'allow_self_process_termination', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_workflow_core_job_job_handler_properties() ->
    openapi_com_adobe_granite_workflow_core_job_job_handler_properties([]).

openapi_com_adobe_granite_workflow_core_job_job_handler_properties(Fields) ->
  Default = [ {'job.topics', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'allow.self.process.termination', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

