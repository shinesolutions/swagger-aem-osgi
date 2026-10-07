-module(openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info/0]).

-export([openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info/1]).

-export_type([openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info/0]).

-type openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties:openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties() }
  ].


openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info() ->
    openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info([]).

openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties:openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

