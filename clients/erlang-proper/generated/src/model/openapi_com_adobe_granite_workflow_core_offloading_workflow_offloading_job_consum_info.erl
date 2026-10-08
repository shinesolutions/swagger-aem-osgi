-module(openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info/0]).

-export([openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info/1]).

-export_type([openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info/0]).

-type openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties:openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties() }
  ].


openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info() ->
    openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info([]).

openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties:openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

