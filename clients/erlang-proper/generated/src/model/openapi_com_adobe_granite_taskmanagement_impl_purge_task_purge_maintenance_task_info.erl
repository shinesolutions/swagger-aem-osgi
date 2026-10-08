-module(openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info/0]).

-export([openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties:openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties() }
  ].


openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info() ->
    openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info([]).

openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties:openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

