-module(openapi_com_adobe_granite_workflow_purge_scheduler_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_purge_scheduler_info/0]).

-export([openapi_com_adobe_granite_workflow_purge_scheduler_info/1]).

-export_type([openapi_com_adobe_granite_workflow_purge_scheduler_info/0]).

-type openapi_com_adobe_granite_workflow_purge_scheduler_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_workflow_purge_scheduler_properties:openapi_com_adobe_granite_workflow_purge_scheduler_properties() }
  ].


openapi_com_adobe_granite_workflow_purge_scheduler_info() ->
    openapi_com_adobe_granite_workflow_purge_scheduler_info([]).

openapi_com_adobe_granite_workflow_purge_scheduler_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_workflow_purge_scheduler_properties:openapi_com_adobe_granite_workflow_purge_scheduler_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

