-module(openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties/0]).

-type openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties() ::
  [ {'job_topics', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties() ->
    openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties([]).

openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties(Fields) ->
  Default = [ {'job.topics', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

